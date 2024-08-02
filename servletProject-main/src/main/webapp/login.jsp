<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <c:choose>
        <c:when test="${param.username != null && param.password != null}">
            <%
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                if ("admin".equals(username) && "admin".equals(password)) {
                    HttpSession ses = request.getSession();
                    ses.setAttribute("username", username);
                    response.sendRedirect("dashboard.jsp");
                }
            %>
        </c:when>
        <c:otherwise>
            <%
                 response.sendRedirect("login.jsp");
            %>
        </c:otherwise>
    </c:choose>
</body>
</html>
