package jp.co.techmatrix.store.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * レジ用カテゴリ
 * @author sakai
 *
 */
@Entity(name = "ORDERLINE")
public class OrderLine implements Serializable{
	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = -5419419606005277429L;
	
	@Id
	private int id;

	@OneToOne
	private Book book;
	
	private int count;
	
	private Date date;

	@ManyToOne
	private User user;
	
	/**
	 * 引数なしのコンストラクタ
	 */
	public OrderLine(){
		super();
	}
	
	/**
	 * 引数ありのコンストラクタ
	 * @param id
	 * @param book
	 * @param count
	 */
	public OrderLine(int id, Book book, int count, Date date){
		this.id = id;
		this.book = book;
		this.count = count;
		this.date = date;
	}
	
	/**
	 * idの取得
	 * @return
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * idの設定
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * どの本を購入するか取得する
	 * @return
	 */
	public Book getBook(){
		return this.book;
	}

	/**
	 * どの本を購入するか設定する
	 * @param book
	 */
	public void setBook(Book book){
		this.book = book;
	}

	/**
	 * 何冊本を買うか取得する
	 * @return
	 */
	public int getCount(){
		return this.count;
	}

	/**
	 * 何冊本を買うか設定する
	 * @param count
	 */
	public void setCount(int count){
		this.count = count;
	}
	
	/**
	 * 購入日時を表示します。
	 * @return
	 */
	public Date getDate(){
		return this.date;
	}
	
	/**
	 * 購入日時を設定します。
	 * @param date
	 */
	public void setDate(Date date){
		this.date = date;
	}
	
	/**
	 * ユーザー返却します。
	 * @return
	 */
	public User getUser(){
		return this.user;
	}

	/**
	 * ユーザーをセットします。
	 * @param user
	 */
	public void setUser(User user){
		this.user = user;
	}
}
