package jp.co.techmatrix.faces.producer;

import java.util.logging.Logger;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import jp.co.techmatrix.store.services.soap.Cart;
import jp.co.techmatrix.store.services.soap.Cart_Service;

/**
 * WebサービスでアクセスするためのProducer
 * 
 * @author kosugi
 *
 */
@Dependent
public class CartProducer{
	@Inject
	private Logger logger;
	
	/**
	 * Cartを提供するポイント
	 * @return
	 */
	@Produces
	public Cart getProxy(){
		// Cartを生成する
		Cart cart = new Cart_Service().getCartPort();
		
		// ログ出力
		this.logger.info("getProxy(){} = " + cart.toString());
		return cart;
	}
}
