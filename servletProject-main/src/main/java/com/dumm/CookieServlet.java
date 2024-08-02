package com.dumm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String n = request.getParameter("userName");
            
            
//            out.print("Welcome " + n);
            Cookie ck = new Cookie("uname", n);
            ck.setComment("this is stupd user");
            
            response.addCookie(ck);//adding cookie in the response  
                        
            //creating submit button  
            response.sendRedirect("login.html");
        } catch (Exception e) {
            System.out.println(e);
        }

	        
//	        if ("create".equalsIgnoreCase(action)) {
//	            createCookie(response);
//	            response.getWriter().println("<h2>Cookie Created</h2>");
//	        } else if ("read".equalsIgnoreCase(action)) {
//	            readCookie(request, response);
//	        } else if ("delete".equalsIgnoreCase(action)) {
//	            deleteCookie(request, response);
//	            response.getWriter().println("<h2>Cookie Deleted</h2>");
//	        } else {
//	            response.getWriter().println("<h2>No valid action specified. Use 'action=create', 'action=read' or 'action=delete'</h2>");
//	        }
	 }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            Cookie ck[] = request.getCookies();
            
            out.print("Hello " + ck[0].getValue());
            out.print("Comment " + ck[0].getComment());
            out.print(request.getParameter("username")+" " +request.getParameter("password"));
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

	}

	    private void createCookie(HttpServletResponse response) {
	        Cookie cookie = new Cookie("user", "John Doe");
	        //String cookieValue = URLEncoder.encode("John Doe", "UTF-8"); // URL-encode the cookie value 
	        cookie.setMaxAge(60 * 60); // 1 hour
	        response.addCookie(cookie);
	    }

	    private void readCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
	        Cookie[] cookies = request.getCookies();
	        if (cookies != null) {
	            for (Cookie cookie : cookies) {
	                if ("user".equals(cookie.getName())) {
	                    response.getWriter().println("<h2>Found Cookie: " + cookie.getName() + " = " + cookie.getValue() + "</h2>");
	                    return;
	                }
	            }
	        }
	        response.getWriter().println("<h2>No Cookie Found</h2>");
	    }

		private void deleteCookie(HttpServletRequest request, HttpServletResponse response) {
		    Cookie[] cookies = request.getCookies();
		    if (cookies != null) {
		        for (Cookie cookie : cookies) {
		            if ("user".equals(cookie.getName())) {
		                cookie.setMaxAge(0); // delete cookie
		                response.addCookie(cookie);
		            }
		        }
		    }
		}


}
