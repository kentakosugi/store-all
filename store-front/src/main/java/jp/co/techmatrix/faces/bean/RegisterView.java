package jp.co.techmatrix.faces.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.techmatrix.store.services.soap.OrderLine;

/**
 * register.xhtmlと関連づけられたManagedBean
 * 
 * @author kosugi
 *
 */
@Named
@SessionScoped
public class RegisterView implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = -2785247448391091396L;

	private String id;

	private String password;

	@Inject
	private HeaderView headerView;

	@Inject
	private SuccessView successView;

	/**
	 * EMAILの取得
	 * @return
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * EMAILの設定
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
	 * 購入処理
	 * @return
	 */
	public String success(){
		List<OrderLine> orders = headerView.getOrders();
		this.successView.setOrders(orders);
		
		headerView.setOrders(new ArrayList<OrderLine>());
		
		return "success.xhtml";
	}
}
