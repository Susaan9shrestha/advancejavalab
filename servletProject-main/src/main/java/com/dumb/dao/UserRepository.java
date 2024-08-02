package com.dumb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
	  DabaseOperation dabaseOperation;
	  public UserRepository() {
		  this.dabaseOperation = dabaseOperation;
	  }
	  public static boolean authenticateUser(String username, String password, Connection conn) {
	        boolean isAuthenticated = false;
    		String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try {
            	PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, username);
                stmt.setString(2, password);
                try (ResultSet rs = stmt.executeQuery()) {
                    isAuthenticated = rs.next();
                }catch(SQLException e) {
                	e.printStackTrace();
                }
            } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return isAuthenticated;
	    }

}
