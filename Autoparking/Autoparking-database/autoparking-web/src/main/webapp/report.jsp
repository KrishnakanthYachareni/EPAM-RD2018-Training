<jsp:directive.page isELIgnored="false" />
<%@page import="org.autoparking.dao.parkinglot.VehicleDAOFactory"%>
<%@page import="org.autoparking.model.Vehicle"%>
<%@page import="java.util.Set"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>parking report</title>
</head>
<body>
	<h2>EPAM Systems Auto Parking Application</h2>
	<%
	    Set<Vehicle> vehicles = VehicleDAOFactory.create().getALLVehicles();
	    pageContext.setAttribute("vehicles", vehicles, pageContext.SESSION_SCOPE);
	%>
	<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>RegistrationID</th>
			<th>Slot Number</th>
			<th>In Time</th>
			<th>Out Time</th>
			<th>Creation Time</th>
			<th>Updation Time</th>
		</tr>
		<c:forEach var="vehicle" items="${vehicles}">
			<tr>
				<td><c:out value="${vehicle.getId()}" /></td>
				<td><c:out value="${vehicle.getRegistrationID()}" /></td>
				<td><c:out value="${vehicle.getSoltNumber()}" /></td>
				<td><c:out value="${vehicle.getParkTime()}" /></td>
				<td><c:out value="${vehicle.getUnparkTime()}" /></td>
				<td><c:out value="${vehicle.getCreatedTime()}" /></td>
				<td><c:out value="${vehicle.getUpdatedTime()}" /></td>
			</tr>
		</c:forEach>
	</table>
	<center><a href="home.jsp"><h3>GoBack</h3></a></center>
</body>
</html>