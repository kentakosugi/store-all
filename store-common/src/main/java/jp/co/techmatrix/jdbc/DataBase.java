package jp.co.techmatrix.jdbc;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * データベースへアクセスするためのクラスです。
 * 
 * @author kosugi
 *
 */
public class DataBase implements Closeable{
	
	public static final String USER = "root";
	public static final String PASSWORD = "admin";
	
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
	public static final String DATABASE = "bookstore";
	
	private Connection con = null;

	/**
	 * コンストラクタ
	 * JDBCドライバの読み込みに失敗するとエラーになることがあります。
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public DataBase() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		super();
		
		// JDBCドライバの読み込み
		Class.forName(DRIVER_NAME).newInstance();
	}
	
	/**
	 * タイトルから本の一覧を検索します。
	 * SQL文に失敗するとnullを返却します。
	 * @param title
	 * @return
	 */
	public List<String> getItemByTitle(String title){
		List<String> ret = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			// statementの追加
			stmt = this.con.createStatement();
			
			// SQL分の組み立て
			rs = stmt.executeQuery("SELECT * FROM BOOK WHERE TITLE LIKE '%" + title + "%'");
			
			while(rs.next()){
				// 検索された本のタイトルをすべてListに追加
				ret.add(rs.getString("TITLE"));
			}
		}catch(SQLException e){
			e.printStackTrace();
			ret = null;
		}
		finally{
			// ResultSetのクローズ
//			if(rs != null){
//				try{
//					rs.close();
//				}catch(SQLException e){
//					e.printStackTrace();
//				}
//			}
			
			// Statementのクローズ
//			if(stmt != null){
//				try{
//					stmt.close();
//				}catch(SQLException e){
//					e.printStackTrace();
//				}
//			}
		}
		
		return ret;
	}
	
	/**
	 * IDで本を検索します。
	 * @param id
	 * @return
	 */
	public List<String> getItemById(String id){
		List<String> ret = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			// statementの追加
			stmt = this.con.createStatement();
			
			// SQL分の組み立て
			rs = stmt.executeQuery("SELECT * FROM BOOK WHERE ID = " + id);
			
			while(rs.next()){
				// 検索された本のタイトルをすべてListに追加
				ret.add(rs.getString("TITLE"));
			}
		}catch(SQLException e){
			e.printStackTrace();
			ret = null;
		}
		finally{
			// ResultSetのクローズ
			if(rs != null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			
			// Statementのクローズ
			if(stmt != null){
				try{
					stmt.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
		return ret;
	}
	
	/**
	 * Connectionを取得します。
	 * @return
	 * @throws SQLException 
	 */
	public Connection getConnection() throws SQLException{
		// 既にコネクションが張られている場合は対象のオブジェクトを返す。
		if(this.con != null){
			return null;
		}
		this.con = DriverManager.getConnection(JDBC_URL + DATABASE, USER, PASSWORD);
		
		return this.con;
	}

	/**
	 * close()
	 */
	@Override
	public void close() throws IOException{
		if(this.con != null){
			try{
				this.con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
