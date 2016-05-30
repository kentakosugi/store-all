package jp.co.techmatrix.store.services;

import java.util.List;

import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.model.OrderLine;
import jp.co.techmatrix.store.model.User;

/**
 * カート情報を外部に公開するAPIのインターフェース。
 * JAX-RS/JAX-WS/EJBの大元となる。
 * 
 * @author kosugi
 *
 */
public interface CartInterface{
	/**
	 * 引数のtitleを利用して、本を検索します。
	 * @param title 本を検索
	 * @return
	 */
	public List<Book> getItemByTitle(String title);
	
	/**
	 * 引数のidを指定してアイテムを検索します。
	 * @param id
	 * @return
	 */
	public Book getItemById(int id);
	
	/**
	 * 指定した本を追加します。
	 * @param book
	 */
	public void addNewBook(Book book);
	
	/**
	 * 指定した本を削除します。
	 * @param id
	 */
	public void deleteBook(int id);
	
	/**
	 * ログインします。
	 * @param user
	 * @return
	 */
	public String login(User user);
	
	/**
	 * 指定したユーザーidに関係するレジをすべて取得します。
	 * @param id
	 * @return
	 */
	public List<OrderLine> getAllRegister(int id);
	
	/**
	 * レジにアイテムを追加します。
	 * @param user ログインユーザー
	 * @param register 追加したいアイテム
	 * @return
	 */
	public void addRegister(List<OrderLine> orderLine);
	
	/**
	 * レジからアイテムを削除します。
	 * @param id 指定した本のID
	 * @return 削除した本の一覧を返却します。
	 */
	public List<OrderLine> removeRegister(User user, int id);
}
