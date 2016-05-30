package jp.co.techmatrix.faces.bean;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.techmatrix.store.services.soap.Book;

/**
 * result.xhtmlと紐づけられたMangedBean
 * 
 * @author kosugi
 *
 */
@Named
@SessionScoped
public class ResultView implements Serializable{
	/**
	 * SerailUID
	 */
	private static final long serialVersionUID = -3828862302185402061L;
	
	@Inject
	private Logger logger;
	
	private List<Book> books;
	
	private Book book;
	
	@Inject
	private DetailView detailView;
	
	/**
	 * 検索した本の一覧を取得します。
	 * @return 検索した本の一覧
	 */
	public List<Book> getBooks(){
		this.logger.info("getBooks() = " + this.books);
		return books;
	}

	/**
	 * 検索した本の一覧を設定します。
	 * @param books 検索した本の一覧
	 */
	public void setBooks(List<Book> books){
		this.logger.info("getBooks(" + this.books + ")");
		this.books = books;
	}

	/**
	 * 選択した本を取得します。
	 * @return 選択した本
	 */
	public Book getBook(){
		this.logger.info("getBook() = " + this.book);
		return this.book;
	}

	/**
	 * 選択した本の一覧を設定します。
	 * @param book 選択した本
	 */
	public void setBook(Book book){
		this.logger.info("getBook(" + book + ")");
		this.book = book;
	}
	
	/**
	 * 詳細画面へ遷移します。
	 * @return "detail.xhtml"
	 */
	public String detail(){
		this.logger.info("detail() = \"detail.xhtml\"");
		this.detailView.setBook(this.book);
		return "detail.xhtml";
	}
}
