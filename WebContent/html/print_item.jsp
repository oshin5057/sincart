<%@page import="com.been.ItemBeen"%>
<%@page import="java.util.ArrayList"%>
<%@page session="true"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="print.css">
</head>
<body id="body">

<form action="http://localhost:8080/sincart/item" method="post">

<img src="I:\New folder (2)\j2ee_software_777mb\logo1.jpg"  height="120px" width="170px"/>
 <% HttpSession hs=request.getSession();
if (hs.getAttribute("info")!=null)
{
	ArrayList ar=new ArrayList();
	ar=(ArrayList) hs.getAttribute("info");
	int i,it; %>
	<table border="1" align="center">
            <tr>   
            <td>Item </td><td> Price</td> <td>Quantity</td> <td>Dsize</td> <td>Color</td> <td>Image</td>  
            </tr>
		<%  for(i=0;i<ar.size();i++)
	{
		ItemBeen fi=(ItemBeen)ar.get(i);%>
		
		 <tr>
		  <td><%=fi.getItem() %><input type="hidden" name="in<%=i%>" value="<%=fi.getItem() %>" ></td>
		  <td><%=fi.getPrice() %><input type="hidden" name="ip<%=i%>" value="<%=fi.getPrice() %>" ></td>
		  <td><%=fi.getQuantity() %></td>
		  <td><%=fi.getDsize() %><input type="hidden" name="id<%=i%>" value="<%=fi.getDsize() %>" ></td>
		  <td><%=fi.getColor() %><input type="hidden" name="ic<%=i%>" value="<%=fi.getColor() %>" ></td>
		  <td> <img src="<%=fi.getImage() %>" height="80px" width="80px"></img><input type="hidden" name="im<%=i%>" value="<%=fi.getImage() %>" ></td>
		 
		 
		 <td><input type="checkbox" name="cb<%=i%>" value="cb"></td>
		 <td>
		 Quantity <select name=s<%=i%>>
		 <% it = Integer.parseInt(fi.getQuantity()); %>
		 <% for(int j=0;j<= it;j++) {%>
		 <option value="<%=j %>"><%=j %></option>
		 <%} %>
		 </select> 
		 </tr>
		  
<% }
%>		
<input type="hidden" name="tic" value="<%=ar.size()%>" >
<% }%>
<tr>

		  <td><input type="submit" name="submit" value="Buy"></td>
		  </tr>
</table>
</form>
</body>
</html>