package com.dumm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {		
		response.sendRedirect("index.html");
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("firstName");
		String middle = req.getParameter("middleName");
		String last = req.getParameter("lastName");
		String ssn = req.getParameter("ssn");
		String age = req.getParameter("age");
		String city = req.getParameter("city");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<HTML>");
        pw.println("<HEAD>");
        pw.println("</HEAD>");
        pw.println("<BODY>");

        pw.println(name);
        pw.println(middle);
        pw.println(last);
        pw.println(age);
        pw.println(ssn);
        pw.println(city);
        
        pw.println("</BODY>");
        pw.println("</HTML>");
	}

}
