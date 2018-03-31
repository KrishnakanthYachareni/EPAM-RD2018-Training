<jsp:directive.page isELIgnored="false" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL AutoParking Report</title>
</head>
<body>
	<sql:setDataSource var="mysqlDatbase" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://127.0.0.1:3306/autoparking" user="root"
		password="root" />

	<sql:query var="lotList" dataSource="${mysqlDatbase}">
        SELECT * FROM autoparkingtranscation;
    </sql:query>
	<div align="center">
		<h2>Parking Lot Report</h2>
		<table border="1" cellpadding="5">
			<caption></caption>
			<tr>
				<th>ID</th>
				<th>Parking Slot Number</th>
				<th>Vehicle Registration Number</th>
				<th>Park Time</th>
				<th>Unpark Time</th>
			</tr>
			<c:forEach var="vehicle" items="${lotList.rows}">
				<tr>
					<td><c:out value="${vehicle.id}" /></td>
					<td><c:out value="${vehicle.slotNumber}" /></td>
					<td><c:out value="${vehicle.registrationNumber}" /></td>
					<td><c:out value="${vehicle.parkTime}" /></td>
					<td><c:out value="${vehicle.unparkTime}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>