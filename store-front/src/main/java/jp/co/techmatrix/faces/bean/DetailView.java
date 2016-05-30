package jp.co.techmatrix.faces.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import jp.co.techmatrix.store.services.soap.Book;
import jp.co.techmatrix.store.services.soap.OrderLine;

/**
 * detail.xhtmlと紐づけられたManagedBean 
 * 
 * @author kosugi
 *
 */
@Named
@SessionScoped
public class DetailView implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = 9020521565208616151L;

	private Book book;

	private int count;

	@Inject
	private HeaderView headerView;
	
	@Inject
	private CartView cartView;

	/**
	 * 選択した本を返却します。
	 * @return
	 */
	public Book getBook(){
		return this.book;
	}

	/**
	 * 選択した本を設定します。
	 * @param book
	 */
	public void setBook(Book book){
		this.book = book;
	}

	/**
	 * 選択した本の冊数を取得します。
	 * @return
	 */
	public int getCount(){
		return this.count;
	}

	/**
	 * 選択した本の冊数を設定します。
	 * @param count
	 */
	public void setCount(int count){
		this.count = count;
	}

	/**
	 * カートに入れるを押下した際の画面遷移
	 * @return
	 */
	public String cart(){
		// 0冊の場合
		if(this.count == 0){
			// 自分自身を再度呼び出す
			return null;
		}

		// 注文を作成する
		OrderLine orderLine = new OrderLine();
		
		// 本を設定
		orderLine.setBook(this.book);

		// 冊数を設定
		orderLine.setCount(this.count);

		// 日にちの設定
		Calendar calendar = Calendar.getInstance();
		
		// XMLGregorianCalendarの生成
		DatatypeFactory factory = null;
		try{
			factory = DatatypeFactory.newInstance();
		}catch(DatatypeConfigurationException e){
			e.printStackTrace();
		}
		XMLGregorianCalendar xmlGregorianCalendar = factory.newXMLGregorianCalendar();
		xmlGregorianCalendar.setYear(calendar.get(Calendar.YEAR));
		xmlGregorianCalendar.setMonth(calendar.get(Calendar.MONTH));
		xmlGregorianCalendar.setDay(calendar.get(Calendar.DAY_OF_MONTH));
		xmlGregorianCalendar.setHour(calendar.get(Calendar.HOUR));
		xmlGregorianCalendar.setMinute(calendar.get(Calendar.MINUTE));
		
		orderLine.setDate(xmlGregorianCalendar);

		// 購入数は初期化しておく
		this.count = 0;

		// 次の遷移画面にオーダーを追加する
		this.headerView.addOrder(orderLine);
		
		// CartViewにも入れておく
		this.cartView.setOrderLine(orderLine);

		// cart.xhtmlに遷移する
		return "cart.xhtml";
	}
}
