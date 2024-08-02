<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.util.ArrayList, java.util.List, com.dumb.model.Book" %>
    
<%-- <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Info</title>
</head>
<body>
    <h1>User Information</h1>
    <p>Name: ${book.name}</p>
    <p>Author: ${book.author}</p>
    <p>price: ${book.price}</p>
    <p>publication: ${book.author}</p>
</body>
</html> --%>
<%
    // Creating a list of Book objects
    List<Book> bookList = new ArrayList<>();
    bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 5677, "pearson"));
    bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 1234, "lotus"));
    bookList.add(new Book("1984", "George Orwell", 950, "pearson"));

    // Set the list of books as a request attribute
    request.setAttribute("books", bookList);
%>



<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Book List</h1>
    <table>
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>price</th>
                <th>publication</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.name}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>                   
                    <td>${book.publication}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>