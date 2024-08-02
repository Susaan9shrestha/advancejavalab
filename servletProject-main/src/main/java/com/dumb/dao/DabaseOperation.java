package com.dumb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DabaseOperation {

	public static Connection dbConnect() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
		String user="root";
		String password="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return DriverManager.getConnection(url, user, password);
	}
	
	

}
