package jp.co.techmatrix.faces.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.techmatrix.store.services.soap.OrderLine;

/**
 * cart.xhtmlと関連づけられたManagedBean
 * 
 * @author kosugi
 *
 */
@Named
@SessionScoped
public class CartView implements Serializable{
	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = -4406456926499293100L;
	
	private OrderLine orderLine;
	
	@Inject
	private HeaderView headerView;

	/**
	 * 注文を取得します。
	 * @return
	 */
	public OrderLine getOrderLine(){
		return this.orderLine;
	}

	/**
	 * 注文を設定します。
	 * @param orderLine
	 */
	public void setOrderLine(OrderLine orderLine){
		this.orderLine = orderLine;
	}
	
	/**
	 * ショッピングを続ける
	 * @return "index.xhtml"
	 */
	public String shopping(){
		// cartViewの中身は空にしておく。
		this.orderLine = null;
		return "index.xhtml";
	}

	/**
	 * 購入手続きを続ける
	 * @return
	 */
	public String register(){
		// ログインされていなければログイン処理に進む。
		if(this.headerView.getUser() == null){
			return "login.xhtml";
		}
		
		this.orderLine = null;
		return "register.xhtml";
	}
	
	/**
	 * このオーダーの金額を返却する。
	 * @return
	 */
	public double total(){
		// 直接本ページを呼び出された場合はnullが格納されている。
		if(this.orderLine == null){
			return 0;
		}
		
		return (this.orderLine.getBook().getPrice() * this.orderLine.getCount());
	}
}
