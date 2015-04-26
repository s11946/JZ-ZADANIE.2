<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebPage - register</title>
</head>
<body>
<form method="post" action="registerServlet">
<table>
<tr>
<td>Username: </td>
<td><input type="text" name="username"></td>
</tr>

<tr>
<td>Password: </td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td>Confirm password: </td>
<td><input type="password" name="confirmPassword"></td>
</tr>

<tr>
<td>Email: </td>
<td><input type="email" name="email"></td>
</tr>
</table>
<input type="submit" value="submit">
</form>
</body>
</html>