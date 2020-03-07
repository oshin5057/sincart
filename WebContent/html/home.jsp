<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="home.css">
<script type="text/javascript">
var image1 = new Image()
image1.src ="Myntra1.jpg"
var image2 = new Image()
image2.src = "Myntra3.jpg"
var image3 =new Image()
image3.src ="Myntra7.jpg"
var image4 =new Image()
image4.src ="Myntra8.jpg"

</script>

</head>
<body id="body">
<form action="http://localhost:8080/sincart/home" method="post">
<div class="div1">
<img src="I:\New folder (2)\j2ee_software_777mb\logo1.jpg" float="left" height="120px" width="170px"/>


<i>
<h1 align="center" ><b>ONLINE SHOPPING</b></h1></i>
</div>
<div class="div2">
<div class="div21"></div>
<div class="div22">




<img src="Myntra1.jpg" width="400" height="280" name="slide" /></p>
<script type="text/javascript">
        var step=1;
        function slideit()
        {
            document.images.slide.src = eval("image"+step+".src");
            if(step<=3)
                step++;
            else
                step=1;
            setTimeout("slideit()",2500);
        }
        slideit();
</script>


</div>
<div class="div23">
<table><h2>SIGN IN</h2>
<tr>
<td> User name: <input type="text" name="un"></td>
</tr>
<tr>
<td> Password: <input type="password" name="pw"></td>
</tr>
<tr>
<td><input type="submit" name="login" value="Login">
<input type="reset" name="reset" value="Reset"><br></td>
</tr>
<tr>
<td> <a href="register.jsp"><b> New User</b></a></td>
</tr>
</table>
</div>
</div>
<div class="div3">
<marquee onmouseover="stop()" onmouseout="start()" direction="left" height="130" width="1350">
<img src="I:\New folder (2)\j2ee_software_777mb\myntra1.jpg"/>
<img src="I:\New folder (2)\j2ee_software_777mb\Myntra3.jpg"/>
 </marquee>
</div>

</form>
</body>
</html>