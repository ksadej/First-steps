<%-- 
    Document   : EmployeeAdd.jsp
    Created on : 2020-05-03, 21:02:49
    Author     : Krzysiek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
    </head>
    <body>
        <div id="add">
        <h1> Add Employee </h1>
       <form action="<%=request.getContextPath()%>/welcome" method="post">
            <table>
                <tr>
                    <td> Employee Name: </td>
                    <td><input type="text" name="ename"></td>
                </tr>
                <tr>
                    <td> Employee Last name: </td>
                    <td><input type="text" name="lname"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="addEmployee" value="Add"></td>
                    
                </tr>
            </table>
        </form>
        </div>        
    </body>
</html>
