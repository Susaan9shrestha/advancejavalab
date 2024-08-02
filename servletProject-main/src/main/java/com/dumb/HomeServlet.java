package com.dumb;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();		
		//pw.print("<h1>Greeting servlet</h1>");
		
		String responseMsg = "";
        String fName = req.getParameter("firstName");
        String mName = req.getParameter("middleName");
        String lName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String ssn = req.getParameter("ssn");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String country = req.getParameter("country");
        
        pw.println("<HTML>");
        pw.println("<HEAD>");
        pw.println("</HEAD>");
        pw.println("<BODY>");

        pw.println(fName);
        pw.println(mName);
        pw.println(lName);
        pw.println(age);
        pw.println(ssn);
        pw.println(city);
        pw.println(state);
        pw.println(country);
        
        pw.println("</BODY>");
        pw.println("</HTML>");    

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
