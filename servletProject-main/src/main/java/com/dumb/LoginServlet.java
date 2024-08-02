package com.dumb;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.connector.Response;

import com.dumb.dao.DabaseOperation;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/login.html");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//established connection with database
		Connection con=null; 
		try {
			con = DabaseOperation.dbConnect();
		}catch(SQLException e ){
			e.printStackTrace();
		}
		
		//prepare statement
		String qry = "SELECT * FROM users";
		
		try {
			PreparedStatement preSta = con.prepareStatement(qry);
			ResultSet rs = (ResultSet) preSta.executeQuery();
			 
			
			if(rs.next()) {
				System.out.println(rs.getString(1));
				if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
					int interest = 6565;
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					request.setAttribute("interest",interest);
					request.getRequestDispatcher("dashboard.jsp").forward(request,response);
				}else
					response.sendRedirect("login.html");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
