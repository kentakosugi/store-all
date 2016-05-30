package jp.co.techmatrix.store.model;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Authorをテストするためのクラスです。
 * @author kosugi
 *
 */
public class AuthorTest{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
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
	public void testGetId001(){
		Author author = new Author();
		author.setId(1);
		
		// harmcast構文
		assertThat(author.getId(), is(equalTo(1)));
	}
	
	@Test
	public void testGetId002(){
		Author author = new Author();
		author.setId(0);
		
		// harmcast構文
		assertThat(author.getId(), is(equalTo(0)));
	}
	
	@Test
	public void testSetId001(){
		Author author = new Author();
		author.setId(-1);
		
		// harmcast構文
		assertThat(author.getId(), is(equalTo(-1)));
	}

	@Test
	public void testGetIsbn(){
	}

	@Test
	public void testSetIsbn(){
	}

	@Test
	public void testGetName(){
	}

	@Test
	public void testSetName(){
	}

}
