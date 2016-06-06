package jp.co.techmatrix.store.services;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.lang.reflect.Field;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.services.rest.CartResource;

public class AbstractCartTest{
	
	private static AbstractCart target;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		target = new CartResource();
		
		Class<AbstractCart> c = AbstractCart.class;
		Field f = c.getDeclaredField("em");
		f.setAccessible(true);
				
		// EMF
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore_test");
		
		EntityManager em = emf.createEntityManager();
		
		f.set(target, em);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}

	@Before
	public void setUp() throws Exception{
	}

	@After
	public void tearDown() throws Exception{
	}

	@Test
	public void test(){
		Book book = target.getItemById(1);
		
		// harmcast構文
		assertThat(book.getId(), is(equalTo(1)));
		assertThat(book.getTitle(), is(equalTo("Java EE 7徹底入門 標準Javaフレームワークによる高信頼性Webシステムの構築")));
		assertThat(book.getIsbn(), is(equalTo("4798140929")));
	}

}
