package jp.co.techmatrix.faces.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.techmatrix.store.services.soap.Cart;
import jp.co.techmatrix.store.services.soap.OrderLine;
import jp.co.techmatrix.store.services.soap.User;

/**
 * header.xhtmlと紐づけられたManagedBean
 * 
 * @author kosugi
 *
 */
@Named
@SessionScoped
public class HeaderView implements Serializable{
	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = 3745986973926362239L;
	
	@Inject
	private Cart proxy;
	
	private String title;
	
	@Inject
	private ResultView resultView;
	
	private List<OrderLine> orders = new ArrayList<>();
	
	private OrderLine orderLine;
	
	private User user;
	
	private String id;
	
	private String password;
	
	private boolean cart = false;

	/**
	 * titleの取得
	 * @return
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 * titleの設定
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * カートに入っているオーダーをすべて取得する
	 * @return
	 */
	public List<OrderLine> getOrders(){
		return this.orders;
	}

	/**
	 * カートにオーダーを入れる
	 * @param orders
	 */
	public void setOrders(List<OrderLine> orders){
		this.orders = orders;
	}
	
	/**
	 * オーダーを追加する
	 * @param orderLine
	 */
	public void addOrder(OrderLine orderLine){
		this.orders.add(orderLine);
	}
	
	/**
	 * ユーザーを返却する
	 * @return
	 */
	public User getUser(){
		return this.user;
	}
	
	/**
	 * ユーザーの設定をする。
	 * @param user
	 */
	public void setUser(User user){
		this.user = user;
	}
	
	/**
	 * オーダーの設定
	 * @param orderLine
	 */
	public void setOrderLine(OrderLine orderLine){
		this.orderLine = orderLine;
	}
	
	/**
	 * オーダーの取得
	 * @return
	 */
	public OrderLine getOrderLine(){
		return this.orderLine;
	}
	
	/**
	 * IDの取得	
	 * @return
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * idの設定
	 * @param id
	 */
	public void setId(String id){
		this.id = id;
	}

	/**
	 * パスワードの取得
	 * @return
	 */
	public String getPassword(){
		return this.password;
	}

	/**
	 * パスワードの設定
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}
	
	/**
	 * カート画面からの遷移？
	 * @return
	 */
	public boolean getCart(){
		return this.cart;
	}

	/**
	 * カート画面からの繊維を設定する
	 * @param isCart
	 */
	public void setCart(boolean cart){
		this.cart = cart;
	}

	/**
	 * オーダーを削除する
	 * @param orderLine
	 */
	public String removeOrder(){
		if(this.orderLine == null){
			return null;
		}
		
		for(Iterator<OrderLine> iterator = orders.iterator(); iterator.hasNext();){
			OrderLine tmp = iterator.next();
			
			// 本のIDが異なる場合
			if(this.orderLine.getBook().getId() != tmp.getBook().getId()){
				continue;
			}
			
			// 本の購入日時が異なる場合
			if(this.orderLine.getCount() != tmp.getCount()){
				continue;
			}
			
			// 購入日時が異なる場合
			if(!this.orderLine.getDate().equals(tmp.getDate())){
				continue;
			}
			
			// 削除する
			iterator.remove();
		}
		
		return "index.xhtml";
	}

	/**
	 * 本の検索を実施する
	 */
	public String search(){
		this.resultView.setBooks(this.proxy.getItemByTitleOperation(this.title));
		return "result.xhtml";
	}
	
	/**
	 * 購入手続きに移る。
	 * @return
	 */
	public String register(){
		return "register.xhtml";
	}
	
	/**
	 * カートのトータル金額を返却します。
	 * @return
	 */
	public double total(){
		double result = 0;
		for(Iterator<OrderLine> iterator = orders.iterator(); iterator.hasNext();){
			OrderLine orderLine = iterator.next();
			result += (orderLine.getBook().getPrice() * orderLine.getCount());
		}
		
		return result;
	}

	/**
	 * ログイン処理
	 * @return
	 */
	public String login(){
		// ログインに失敗した場合
		if(this.id == null || this.password == null){
			return "error.xhtml";
		}

		FacesContext context = FacesContext.getCurrentInstance();

		User user = new User();
		user.setId(this.id);
		user.setPassword(this.password);
		
		this.user = user;
		
		// メッセージ出力
		context.addMessage(null, new FacesMessage(user.getId() + "さんのログインに成功しました。", ""));

		if(this.cart){
			this.cart = false;
			return "register.xhtml";
		}
		else{
			return "index.xhtml";	
		}
	}
	
	/**
	 * 画面遷移
	 * @return
	 */
	public String headerLogin(){
		return "login.xhtml";
	}
}
