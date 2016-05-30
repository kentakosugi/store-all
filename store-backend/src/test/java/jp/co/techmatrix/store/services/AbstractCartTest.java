package jp.co.techmatrix.store.services;

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
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}

	@Before
	public void setUp() throws Exception{
		// EMF
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore_test");
		
		EntityManager em = emf.createEntityManager();
		List<Book> books = target.getItemByTitle("java");
	}

	@After
	public void tearDown() throws Exception{
	}

	@Test
	public void test(){
		
	}

}
