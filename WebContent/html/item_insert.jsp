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
<form action="http://localhost:8080/sincart/item_insert" method="post">
<div class="div1"></div>
<div class="div2">
<div class="div21"></div>
<div class="div22">
<table align="center">
<h2 align="center"> Item Inserted</h2>
<br>
<tr>
<td>Table_Name:<input type="text" name="tn"></td>
</tr>

<tr>
<td>Item_Name: <input type="text" name="in"></td>
</tr>
<tr>
<td>Image: <input type="file" name="im"></td>
</tr>
<tr>
<td>Price: <input type="text" name="pr"></td>
</tr>
<tr>
<td>Quantity: <input type="text" name="qu"></td>
</tr>
<tr>
<td>Size: <input type="text" name="ds"></td>
</tr>
<tr>
<td>Color: <input type="text" name="cl"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="BUY"></td>
</tr>

</table>
</div>
<div class="div23"></div>
</div>
<div class="div3"></div>
</form>
</body>

</body>
</html>