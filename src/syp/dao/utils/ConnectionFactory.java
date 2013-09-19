package syp.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import syp.utils.Util;

public class ConnectionFactory {
	
	private String DB_URL;
	private String USERNAME;
	private String PASSWORD;
	
	public ConnectionFactory(){
		DB_URL = Util.readProperty("db.url", "jdbc:mysql://192.168.0.10:3306/predict?");
		USERNAME = Util.readProperty("db.username", "root");
		PASSWORD = Util.readProperty("db.password", "aluno");
	}
	
	public Connection getConnection(){
		
		try {
			return DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
