package jp.co.techmatrix.store.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Publisherテーブル
 * @author uchida
 *
 */
@Entity(name = "PUBLISHER")
public class Publisher implements Serializable{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 5131128936584649460L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "NAME", nullable = false, length = 30)
	private String name;
	
	@OneToMany(mappedBy = "publisher", targetEntity = Book.class, cascade = CascadeType.ALL)
	private List<Book> books;
	
	/**
	 * コンストラクタ
	 */
	public Publisher(){
		super();
	}
	
	/**
	 * 引数ありのコンストラクタ
	 * @param id
	 * @param name
	 */
	public Publisher(int id, String name){
		this.id = id;
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
