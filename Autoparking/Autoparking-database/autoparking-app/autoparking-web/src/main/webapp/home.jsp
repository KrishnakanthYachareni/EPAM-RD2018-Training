<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>autoparking home..</title>
</head>
<body>
	<center>
		<h2>EPAM Systems Auto Parking Application</h2>
		<form action="ParkingManager" method="post">
			<label>Vehicle Num:</label> <input type="text" name="regnum" required><br>
			<label>Command :</label> <select name="command">
				<option value="park">PARK</option>
				<option value="unpark">UNPARK</option>
			</select> <input type="submit" value="Save">
		</form>
		<a href="report.jsp"><h3>ParkingLot Report</h3></a>
	</center>
</body>
</html>