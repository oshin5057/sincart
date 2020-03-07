<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<body id="body">
<form action="http://localhost:8080/sincart/register" method="post">
<div class="div1"></div>
<div class="div2">
<div class="div21"></div>
<div class="div22">
<table align="center">
<h2 align="center"> SIGN UP</h2>
<br>
<tr>
<td>NAME: <input type="text" name="na"></td>
</tr>
<tr>
<td>E-mail: <input type="text" name="em"></td>
</tr>
<tr>
<td>Gender: <input type="radio" name="rd" value="Male">Male
<input type="radio" name="rd" value="Female">Female</td>
</tr>
<tr>
<td>D.O.B: <input type="date" name="date"></td>
</tr>
<tr>
<td>Mobile no. :<input type="text" name="mo"></td>
</tr>
<tr>
<td>Password:<input type="password" name="pw"></td></tr>
<tr>
<td><input type="submit" name="submit" value="Create My Account"></td>
</tr>
</table>
</div>
<div class="div23"></div>
</div>
<div class="div3"></div>
</form>
</body>
</html>