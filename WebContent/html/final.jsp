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
</head>
<body>
<body id="body">

<img src="I:\New folder (2)\j2ee_software_777mb\logo1.jpg"  height="120px" width="170px"/>
 <% HttpSession hs=request.getSession();
if (hs.getAttribute("info")!=null)
{
	ArrayList ar=new ArrayList();
	ar=(ArrayList) hs.getAttribute("info");
	int i,it; 
	int sum=0; %>
	<table border="1" align="center">
            <tr>   
            <td>Item </td><td> Price</td> <td>quantity</td> <td>Dsize</td> <td>Color</td> <td>Image</td>  
            </tr>
		<%  for(i=0;i<ar.size();i++)
	{
		ItemBeen fi=(ItemBeen)ar.get(i);%>
		
		 <tr>
		  <td><%=fi.getItem() %></td>
		  <td><%=fi.getPrice() %></td>
		  <td><%=fi.getQuantity()%></td>
		  <td><%=fi.getDsize() %></td>
		  <td><%=fi.getColor() %></td>
		  <td> <img src="<%=fi.getImage() %>" height="80px" width="80px"></img></td>
		 </tr>
		<tr>
		<td> 
        <% int total=Integer.parseInt(fi.getQuantity()) * Integer.parseInt(fi.getPrice());
         sum=sum+total; %>
        total price: <%=sum %>
        </td>
        </tr>

<% }%>

<%} %>

</table>

</body>
</html>