package jp.co.techmatrix.store.services;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.lang.reflect.Field;

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

/**
 * JPAを通したAbstractCartのテスト
 * 
 * @author kosugi
 *
 */
public class AbstractCartTest{
	
	private static AbstractCart target;
	
	private static EntityManagerFactory EMF = null;
	private static EntityManager EM = null;

	/**
	 * テスト前の準備
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		target = new CartResource();
		
		Class<AbstractCart> c = AbstractCart.class;
		Field f = c.getDeclaredField("em");
		f.setAccessible(true);
				
		// EMF
		EMF = Persistence.createEntityManagerFactory("bookstore_test");
		
		EM = EMF.createEntityManager();
		
		f.set(target, EM);
	}

	/**
	 * テスト後の処理
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		try{
			EM.close();
		}catch(Exception e1){
			e1.printStackTrace();
		}
		
		try{
			EMF.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception{
	}

	@After
	public void tearDown() throws Exception{
	}

	@Test
	public void test001(){
		Book book = target.getItemById(1);
		
		// harmcast構文
		assertThat(book.getId(), is(equalTo(1)));
		assertThat(book.getTitle(), is(equalTo("Java EE 7徹底入門 標準Javaフレームワークによる高信頼性Webシステムの構築")));
		assertThat(book.getIsbn(), is(equalTo("4798140929")));
		assertThat(book.getStock(), is(equalTo(30)));
		assertThat(book.getDescription(), is(equalTo("Javaによる業務システム開発向けの標準仕様であるJava EE。本書は、フレームワークとしての基盤機能が一層充実したJava EE 7の基本と実践的な開発方法を学ぶための書籍です。Javaの基本文法を身につけた方を対象に、プレゼンテーション層の開発機能JSFやビジネスロジック層の開発機能CDI/EJB、データアクセス層の開発機能JPAなど、業務システム開発時に必要不可欠な機能群の使い方や活用方法を、具体的なサンプルを交えて詳しく解説します。Java EE 7で追加されたWebサービスやバッチ処理の機能についてもカバーしています。これからJava EE開発を始める方、Java EEの機能をもっと使いこなしたい方など、業務システム開発に携わるJavaエンジニアにおすすめの一冊です。")));
	}
	
	@Test
	public void test002(){
		Book book = target.getItemById(2);
		
		// harmcast構文
		assertThat(book.getId(), is(equalTo(2)));
		assertThat(book.getTitle(), is(equalTo("EFFECTIVE JAVA 第2版 (The Java Series)")));
		assertThat(book.getIsbn(), is(equalTo("4621066056")));
		assertThat(book.getStock(), is(equalTo(20)));
	}
	
	@Test
	public void test003(){
		Book book = target.getItemById(3);
		
		// harmcast構文
		assertThat(book.getId(), is(equalTo(3)));
		assertThat(book.getTitle(), is(equalTo("JavaによるRESTfulシステム構築")));
		assertThat(book.getIsbn(), is(equalTo("4873114675")));
		assertThat(book.getStock(), is(equalTo(1)));
	}
	
}
