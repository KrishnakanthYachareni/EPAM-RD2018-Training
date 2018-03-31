
<%@page import="org.autopaking.model.bean.ParkingLotBean"%>
<%@page import="org.autoparking.service.ParkingLotDTO"%>
<html>
<body>
	<center>
		<h2>Autoparking Report in JSON Format</h2>
		<%
		    ParkingLotDTO parkingLotDTO = new ParkingLotDTO();
		    out.print("[");
		    for (ParkingLotBean parkingLot : parkingLotDTO.getParkingLotReport()) {
		        out.print(parkingLot);
		        out.print("</br>");
		    }
		    out.print("]");
		%>
	</center>
</body>
</html>
