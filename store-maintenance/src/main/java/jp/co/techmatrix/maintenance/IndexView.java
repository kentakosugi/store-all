package jp.co.techmatrix.maintenance;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import jp.co.techmatrix.jdbc.DataBase;

/**
 * index.xhtmlに紐づけられたManagedBean
 * 
 * @author kosugi
 *
 */
@Named
@RequestScoped
public class IndexView implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = 8770604408436903683L;
	
	/**
	 * init
	 */
	public void init(){
		// DataBaseを開く
		DataBase db = null;
		Connection con = null;
		
		try{
			// 
			db = new DataBase();
			con = db.getConnection();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
