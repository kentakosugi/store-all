package jp.co.techmatrix.store.services.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.model.OrderLine;
import jp.co.techmatrix.store.model.User;
import jp.co.techmatrix.store.services.AbstractCart;

/**
 * RESTサービス
 *  + /cart/getbooks?title=&lt;title&gt;<br />
 *  + /cart/get/book?id=&lt;id&gt;<br />
 *  + /cart/add/book<br />
 *  + /cart/delete/book?id=&lt;id&gt;
 * @author kosugi
 *
 */
@Named
@RequestScoped
@Produces(value = MediaType.APPLICATION_JSON + ";charset=UTF-8;")
@Path("/cart")
@Api(value = "/cart", produces = MediaType.APPLICATION_JSON + ";charset=UTF-8;")
public class CartResource extends AbstractCart{
	@GET
	@Path("/get/books")
	@ApiOperation(value = "指定したタイトルで本を検索します。", response = Book.class, responseContainer = "List")
	@Override
	public List<Book> getItemByTitle(@QueryParam("title") String title){
		return super.getItemByTitle(title);
	}

	@GET
	@Path("/get/book")
	@ApiOperation(value = "指定したidで本を検索します。", response = Book.class)
	@Override
	public Book getItemById(@QueryParam("id") int id){
		return super.getItemById(id);
	}

	@PUT
	@Path("/add/book")
	@ApiOperation(value = "指定した本を追加します。")
	@Override
	@Transactional
	public void addNewBook(Book book){
		super.addNewBook(book);
	}

	@DELETE
	@Path("/delete/book")
	@ApiOperation(value = "指定した本を削除します。")
	@Override
	public void deleteBook(@QueryParam("id") int id){
		super.deleteBook(id);
	}
	
	@Override
	public List<OrderLine> getAllRegister(int id){
		return null;
	}

	@PUT
	@ApiOperation(value = "指定したカートを追加します。")
	@Path("/add/register")
	@Override
	public void addRegister(List<OrderLine> register){
		super.addRegister(register);
	}

	@DELETE
	@Path("/delete/register")
	@Override
	public List<OrderLine> removeRegister(User user, @QueryParam("id") int id){
		return super.removeRegister(user, id);
	}

	@Override
	public String login(User user){
		return "";
	}
}
