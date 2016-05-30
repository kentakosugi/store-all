package jp.co.techmatrix.faces.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import jp.co.techmatrix.store.services.soap.OrderLine;

/**
 * success.xhtmlと関連づけられたManagedBean
 * 
 * @author kosugi
 *
 */
@Named
@RequestScoped
public class SuccessView implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = 1222700479120785288L;
	
	private List<OrderLine> orders;

	/**
	 * オーダーの取得
	 * @return
	 */
	public List<OrderLine> getOrders(){
		return this.orders;
	}

	/**
	 * オーダーの設定
	 * @param orders
	 */
	public void setOrders(List<OrderLine> orders){
		this.orders = orders;
	}
	
}
