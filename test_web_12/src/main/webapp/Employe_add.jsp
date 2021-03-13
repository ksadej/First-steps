<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<title>CRUD Operators with Hibernate</title>
</head>
<body>

	<h3>Add Employe</h3>
	${msg }
	<form method="post" action="${pageContext.request.contextPath }/add">
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>Name</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Las name</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>

</body>
</html>