<%-- 
    Document   : index
    Created on : 2019-06-17, 22:12:21
    Author     : Krzysiek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <form action="Controller" method="POST">
            <table align="center">
                <tr>
                    <th align="right">UserName:</th>
                    <td><input type="text" name="txtusername"></td>
                </tr>
                <tr>
                    <th align="right">Password:</th>
                    <td><input type="password" name="txtpassword"></td>
                </tr> 
                <tr>
                    <td colspan="2" align="right">
                        <input type="submit" value="Log In" class="btn">
                    </td>                   
                </tr>               
            </table>    
        </form>
    </body>
</html>
