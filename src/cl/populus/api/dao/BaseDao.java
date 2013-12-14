package cl.populus.api.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


//cgajardo: singleton para la conexion a base de datos;
public class BaseDao {
	
	private Connection con;
	
	public Connection getConnection(){
		
		if(con != null) return con;
		
		try {
			Context envContext = new InitialContext();
			DataSource ds = (DataSource)envContext.lookup("java:/comp/env/jdbc/populus");
			con = ds.getConnection();
			return con;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
