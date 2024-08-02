<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%! 
    // Add necessary imports
    import java.sql.*;
    import com.dumb.dao.DabaseOperation;

%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <c:choose>
        <c:when test="${param.username != null && param.password != null}">
        <%
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                boolean loginSuccess = false;
                Connection con = null;

                try {
                    con = DabaseOperation.dbConnect();
                    String qry = "SELECT * FROM users WHERE username = "+username+" AND password = "+password;
                    PreparedStatement preSta = con.prepareStatement(qry);
                    preSta.setString(1, username);
                    preSta.setString(2, password);
                    ResultSet rs = preSta.executeQuery();

                    if (rs.next()) {
                        HttpSession sess = request.getSession();
                        sess.setAttribute("username", username);
                        loginSuccess = true;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (con != null) {
                        try {
                            con.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }

                if (loginSuccess) {
                    response.sendRedirect("dashboard.jsp");
                } else {
                    response.sendRedirect("login.jsp?error=true");
                }
            %>
        </c:when>
        <c:otherwise>
            <c:if test="${param.error != null}">
                <p style="color:red;">Invalid username or password. Please try again.</p>
            </c:if>
            <form action="login.jsp" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
                <br>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
                <br>
                <button type="submit">Login</button>
            </form>
        </c:otherwise>
    </c:choose>
</body>
</html> --%>