package jp.co.techmatrix.store.services;

import java.util.Iterator;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jp.co.techmatrix.store.model.Author;
import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.model.Publisher;
import jp.co.techmatrix.store.model.OrderLine;
import jp.co.techmatrix.store.model.User;

/**
 * EJB/REST/SOAPの大元
 * 
 * @author suzuki
 *
 */
@Named
@RequestScoped
public abstract class AbstractCart implements CartInterface{
	/**
	 * EntityManager
	 */
	@PersistenceContext(unitName = "bookstore")
	private EntityManager em;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Book> getItemByTitle(String title){
		// JPQLを使用してアイテムを検索
		return this.em.createNamedQuery(Book.SELECT_ALL_BOOKS_WHERE_TITLE)
				.setParameter("title", "%" + title + "%").getResultList();
	}
	
	@Override
	public Book getItemById(int id){
		return this.em.find(Book.class, id);
	}
	
	@Override
	public void addNewBook(Book book){
		boolean isMerge = false;
		Publisher publisher = book.getPublisher();
		List<Author> authors = book.getAuthors();
		
		// publisherやauthorがすでに存在している場合はmerge
		if(this.em.find(Publisher.class, publisher.getId()) != null){
			isMerge = true;
		}
		else{
			for(Iterator<Author> iterator = authors.iterator(); iterator.hasNext();){
				Author author = iterator.next();
				if(this.em.find(Author.class, author.getId()) != null){
					isMerge = true;
					break;
				}
			}
		}
		
		if(isMerge){
			// merge
			this.em.merge(book);
		}
		else{
			// persist
			this.em.persist(book);
		}
		
	}
	
	@Override
	public void deleteBook(int id){
		// 検索
		Book book = this.em.find(Book.class, id);
		
		// 削除
		this.em.remove(book);
	}

	@Override
	public void addRegister(List<OrderLine> orderLine){
		for(Iterator<OrderLine> iterator = orderLine.iterator(); iterator.hasNext();){
			OrderLine order = iterator.next();
			this.em.persist(order);
		}
	}

	@Override
	public List<OrderLine> removeRegister(User user, int id){
		// TODO Auto-generated method stub
		return null;
	}
}
