<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList, java.util.List, com.dumb.model.Book" %>

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
    <title>List of Books</title>
</head>
<body>
    <h2>List of Books</h2>
    <table border="1">
        <tr>
            <th>Title</th>
            <th>Author</th>
            <th>ISBN</th>
            <th>Publisher</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.isbn}</td>
                <td>${book.publisher}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
