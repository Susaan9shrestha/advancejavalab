<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
    <%-- <%@ taglib uri="http://jakarta.ee/jstl/core" prefix="c" %> --%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="stylesheet.css">
</head>
<body>
    <div class="container">
        <div class="sidebar">
        	<h2>Dashboard</h2>
            <p>Welcome, <c:out value="${sessionScope.username}" /></p>
            <p>Session username: <%= session.getAttribute("username") %></p>
            <p>Interest is : <%= request.getAttribute("interest") %></p>
            
           <%--  <h3> <%= getGreeting("James Bond") %>  <hr/> --%> <!-- <this is expression> -->
            
            <ul>
            <h2>Dashboard</h2>
             <ul>
                <li><a href="#" data-page="listUsers.html">Users</a>
                    <ul>
                        <li><a href="#" data-page="listUsers.html">List Users</a></li>
                        <li><a href="#" data-page="addUser.html">Add User</a></li>
                    </ul>
                </li>
                <li><a href="#" data-page="listBooks.html">Books</a>
                    <ul>
                        <li><a href="#" data-page="listBook.jsp">List Books</a></li>
                        <li><a href="#" data-page="addBook.html">Add Book</a></li>
                    </ul>
                </li>
                <li><a href="#" data-page="bookissue.html">Issue Book</a>
                    <ul>
                        <li><a href="#" data-page="listBook.jsp">List Book Issue</a></li>
                        <li><a href="#" data-page="bookissue.html">Borrow Book</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="main-content" id="main-content">
            <!-- The content for each page will be loaded here based on the link clicked -->
        </div>
    </div>
    <script src="script.js"></script>
</body>
</html>
