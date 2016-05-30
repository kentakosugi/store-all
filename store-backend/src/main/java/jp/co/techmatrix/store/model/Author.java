package jp.co.techmatrix.store.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Authorテーブル
 * 
 * @author suzuki
 *
 */
@Entity(name = "AUTHOR")
public class Author implements Serializable{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 7940130353281568918L;

	/**
	 * primary key
	 * ID列
	 */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	/**
	 * ISBN列
	 */
	@Column(name = "ISBN", nullable = false, length = 10)
	@XmlTransient
	private String isbn;
	
	/**
	 * NAME列
	 */
	@Column(name = "NAME", nullable = false, length = 35)
	private String name;
	
	/**
	 * 引数なしのコンストラクタ
	 */
	public Author(){
		super();
	}
	
	/**
	 * コンストラクタ
	 * @param id
	 * @param isbn
	 * @param name
	 */
	public Author(int id, String isbn, String name){
		this.id = id;
		this.isbn = isbn;
		this.name = name;
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
	 * isbnの取得
	 * @return
	 */
	public String getIsbn(){
		return this.isbn;
	}

	/**
	 * isbnの設定
	 * @param isbn
	 */
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	/**
	 * nameの取得
	 * @return
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * nameの設定
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
}
