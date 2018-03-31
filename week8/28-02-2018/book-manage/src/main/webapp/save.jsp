<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Saving book</title>
</head>
<body>
	<%
	    String bookName = request.getParameter("book");
	    if (!bookName.isEmpty()) {
	        out.print(bookName + " : is Saved");
	    } else {
	        out.print("No book is saved");
	    }
	%>
	<form action="index.jsp">
		<input type="Submit" value="Back">
	</form>
</body>
</html>