<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <c:choose>
        <c:when test="${param.username != null && param.password != null}">
            <sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver" 
                url = "jdbc:mysql://localhost:3306/librarymanagementsystem"
				user="root"
				password=""/>

            <sql:query dataSource="${ds}" var="result">
                SELECT * FROM users WHERE username = ? AND password = ?
                <sql:param value="${param.username}" />
                <sql:param value="${param.password}" />
            </sql:query>

            <c:choose>
                <c:when test="${not empty result.rows}">
                    <%
                        HttpSession sess = request.getSession();
                        sess.setAttribute("username", request.getParameter("username"));
                        response.sendRedirect("dashboard.jsp");
                    %>
                </c:when>
                <c:otherwise>
                    <c:redirect url="login.html" />
                </c:otherwise>
            </c:choose>
        </c:when>
        <c:otherwise>
            <c:if test="${param.error != null}">
                <p style="color:red;">Invalid username or password. Please try again.</p>
            </c:if>
            		<%
                        response.sendRedirect("login.html");
                    %>
        </c:otherwise>
    </c:choose>
</body>
</html>
