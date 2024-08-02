package com.dumb.include;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		HttpSession session = request.getSession();	
		String username = request.getParameter("username");
		session.setAttribute("user",username);
		
        response.getWriter().println("<h1>This is MainServlet</h1>");
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/IncludeServlet");
        dispatcher.include(request, response);
        
        response.getWriter().println("<h3>Back to MainServlet after including IncludeServlet</h3>");
        
	}



}
