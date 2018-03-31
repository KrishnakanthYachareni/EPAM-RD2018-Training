<%@page import="com.epam.parking.bean.RegistrationValidator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	    String registationNumber = request.getParameter("regnum");
	    RegistrationValidator regValidator = new RegistrationValidator();
	    regValidator.registrationNumValidator(registationNumber);
	    out.print(registationNumber + " Vehcile IS added success fully.");
	%>
</body>
</html>