<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>autoparking login..</title>
</head>
<body>
	<center>
		<h2>EPAM Systems Auto Parking Application</h2>
		<form action="RegistrationServlet" method="post">
			<label>Username:</label> <input type="text" name="username"><br>
			<label>Password :</label> <input type="password" name="password"><br>
			<label>ParkingLot :</label> <input type="text" name="lot"><br>
			<input type="submit" value="Register">
		</form>
		Already Register? Login <a href="index.jsp">Here</a>
	</center>
</body>
</html>