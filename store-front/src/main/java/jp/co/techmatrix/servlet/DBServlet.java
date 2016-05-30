package jp.co.techmatrix.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.techmatrix.jdbc.DataBase;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DBServlet(){
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		DataBase database = null;
		
		res.setCharacterEncoding("UTF-8");
		
		// ResponseWriterの取得
		PrintWriter out = res.getWriter();
		
		try{
			database = new DataBase();
			
			List<String> ret = database.getItemByTitle(req.getParameter("title"));
			
			for(Iterator<String> iter = ret.iterator(); iter.hasNext();){
				String title = (String)iter.next();
				
				out.println("<h1>" + title + "</h1>");
			}
			
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		this.doGet(req, res);
	}

}
