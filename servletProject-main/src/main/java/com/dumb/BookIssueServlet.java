package com.dumb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dumb.model.Book;

public class BookIssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BookIssueServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		Book book = new Book("Angel and Demons","Dan Brown",689,"Pearson");
//		request.setAttribute("book",book);
//		request.getRequestDispatcher("listBook.jsp").forward(request,response);
//		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald",5677, "pearson"));
		bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 1234,"lotus"));
		bookList.add(new Book("1984", "George Orwell",950, "pearson"));

        // Set the list of books as a request attribute
        request.setAttribute("books", bookList);

        // Forward the request to the JSP page
        request.getRequestDispatcher("listBook.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
