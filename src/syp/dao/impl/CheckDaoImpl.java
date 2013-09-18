package syp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import syp.dao.utils.ConnectionFactory;



public class CheckDaoImpl {
	private Connection connection;
	
	private void openConnection(){
		//
		this.connection = new ConnectionFactory().getConnection();		
	}
	
	public CheckDaoImpl(){
		this.openConnection();
	}
	
	public List<User> listaUser(){
		
		if(connection == null)this.openConnection();

		String sql = "SELECT * FROM Users";

		List<User> Users = new ArrayList<User>();

		PreparedStatement pstmt = null;
		try {			
			pstmt = this.connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()){
				User user = new User();
				user.setLoginName(rs.getString("LoginName"));
				user.setScreenName(rs.getString("ScreenName"));
				user.setEmail(rs.getString("Email"));
				Users.add(user);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				this.connection.close();
			} catch (Exception e) {}			
		}

		return Users;		
	}
	
public User consultaUser(String loginName){
		
		if(connection == null)this.openConnection();

		String sql = "SELECT * FROM Users WHERE LoginName = ?";

		User user = null;

		PreparedStatement pstmt = null;
		try {			
			pstmt = this.connection.prepareStatement(sql);
			pstmt.setString(1, loginName);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				user = new User();
				user.setLoginName(rs.getString("LoginName"));
				user.setScreenName(rs.getString("ScreenName"));
				user.setEmail(rs.getString("Email"));			
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				this.connection.close();
			} catch (Exception e) {}			
		}
		return user;
	}
}
