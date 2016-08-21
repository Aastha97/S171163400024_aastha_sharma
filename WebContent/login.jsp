<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
</head>
<body>
	
	<h3 align="center">LOGIN PAGE</h3>
	<nav>
  			<a href="homepage.jsp">Home</a> ||
  			<a href="login.jsp" target="_blank">Login</a> ||
  			<a href="register.jsp" target="_blank">Register</a> ||
     </nav><br>
     
     <form action="loginservlet" method="post">
     <%
			if(request.getAttribute("error")!= null)
			{
				out.println("<font style=color:red; background-color: yellow>" + request.getAttribute("error").toString() + "</font>");
			}
	%>
     
     Name:  <input type="text" name="name" placeholder="enter the name" size="20"></input><br><br>
     Password: <input type="password" name="pass" placeholder="password" size="20"></input><br><br>
     <input type="submit" name="login" value="Login"></input>
     </form>
     
       
       
</body>
</html>