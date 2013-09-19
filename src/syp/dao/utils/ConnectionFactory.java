package syp.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private String DB_URL = "jdbc:mysql://192.168.0.10:3306/predict?";
	private String USERNAME = "root";
	private String PASSWORD = "aluno";
	
	public ConnectionFactory(){
		//TODO:		
	}
	
	public Connection getConnection(){
		
		try {
			return DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
