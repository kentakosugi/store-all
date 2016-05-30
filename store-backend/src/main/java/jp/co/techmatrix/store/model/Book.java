package jp.co.techmatrix.store.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Bookテーブル
 * 
 * @author kosugi
 *
 */
@Entity(name = "BOOK")
@NamedQueries({@NamedQuery(name = Book.SELECT_ALL_BOOKS, query = "SELECT b FROM BOOK b"),
		@NamedQuery(name = Book.SELECT_ALL_BOOKS_WHERE_TITLE, query = "SELECT b FROM BOOK b WHERE UPPER(b.title) LIKE UPPER(:title)")})
@XmlRootElement(name = "book")
public class Book implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = -7245079456630135891L;

	/**
	 * すべての本を検索するためのJPQL
	 */
	public static final String SELECT_ALL_BOOKS = "SELECT_ALL_BOOK";

	/**
	 * タイトルで本を検索するためのJPQL
	 */
	public static final String SELECT_ALL_BOOKS_WHERE_TITLE = "SELECT_ALL_BOOK_WHERE_TITLE";

	/**
	 * 主キー
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private int id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumns(@JoinColumn(nullable = false, name = "isbn", referencedColumnName = "isbn"))
	private List<Author> authors;

	@Column(name = "ISBN", nullable = false, length = 10)
	private String isbn;

	@Column(name = "TITLE", nullable = false, length = 200)
	private String title;

	private Publisher publisher;

	@Temporal(TemporalType.DATE)
	@Column(name = "YEAR", nullable = false)
	private Date year;

	@Column(name = "STOCK", nullable = false)
	private int stock;

	@Column(name = "PRICE", nullable = false)
	private double price;

	@Lob @Column(name = "DESCRIPTION", length = 2048)
	private String description;

	/**
	 * コンストラクタ
	 */
	public Book(){
		super();
	}

	/**
	 * 引数ありのコンストラクタ
	 * @param id
	 * @param isbn
	 * @param title
	 * @param publisher
	 * @param year
	 * @param stock
	 * @param price
	 * @param description
	 */
	public Book(int id, String isbn, String title, Publisher publisher, Date year, int stock, double price,
			String description){
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		this.stock = stock;
		this.price = price;
		this.description = description;
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
	 * authorの取得
	 * @return
	 */
	@JsonDeserialize(as = ArrayList.class, contentAs = Author.class)
	@XmlElementWrapper(name = "authors")
	@XmlElement(name = "authors")
	public List<Author> getAuthors(){
		return this.authors;
	}

	/**
	 * authorの設定
	 * @param authors
	 */
	public void setAuthors(List<Author> authors){
		this.authors = authors;
	}

	/**
	 * isbnの取得
	 * @return
	 */
	@XmlElement(name = "isbn")
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
	 * titleの取得
	 * @return
	 */
	@XmlElement(name = "title")
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
	 * publisherの取得
	 * @return
	 */
	@XmlElement(name = "publisher")
	public Publisher getPublisher(){
		return this.publisher;
	}

	/**
	 * publisherの設定
	 * @param publisher
	 */
	public void setPublisher(Publisher publisher){
		this.publisher = publisher;
	}

	/**
	 * yearの取得
	 * @return
	 */
	@XmlElement(name = "year")
	public Date getYear(){
		return this.year;
	}

	/**
	 * yearの設定
	 * @param year
	 */
	public void setYear(Date year){
		this.year = year;
	}

	/**
	 * stockの設定
	 * @return
	 */
	@XmlElement(name = "stock")
	public int getStock(){
		return this.stock;
	}

	/**
	 * stockの設定
	 * @param stock
	 */
	public void setStock(int stock){
		this.stock = stock;
	}

	/**
	 * priceの取得
	 * @return
	 */
	@XmlElement(name = "price")
	public double getPrice(){
		return this.price;
	}

	/**
	 * priceの設定
	 * @param price
	 */
	public void setPrice(double price){
		this.price = price;
	}

	/**
	 * descriptionの取得
	 * @return
	 */
	@XmlElement(name = "description")
	public String getDescription(){
		return this.description;
	}

	/**
	 * descriptionの設定
	 * @param description
	 */
	public void setDescription(String description){
		this.description = description;
	}
}
