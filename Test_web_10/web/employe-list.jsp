<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
 <center>
 
 </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Last name</th>

            </tr>
            <c:forEach var="emp" items="${employeList}">
                <tr>
                    <td><c:out value="${emp.id}" /></td>
                    <td><c:out value="${emp.ename}" /></td>
                    <td><c:out value="${emp.lname}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div> 
</body>
</html>