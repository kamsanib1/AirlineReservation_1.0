<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style="color:green">${msg }</p>
<form method="post" action="/AirlineReservation_1.0/submituserdata">
	first name:<input type="text" name="fname"/><br/>
	last name:<input type="text" name="lname"/><br/>
	username:<input type="text" name="username"/><br/>
	password:<input type="text" name="password"/><br/>
	email id:<input type="text" name="mailid"/><br/>
	<input type="submit" value="sign up"/>
	
</form>
<a href="/AirlineReservation_1.0/login"> login </a>
<a href="/AirlineReservation_1.0/admin_login">admin</a>
</body>
</html>