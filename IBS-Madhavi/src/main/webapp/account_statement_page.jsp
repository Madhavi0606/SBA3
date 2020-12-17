<html>
	<head>
	 	<title>Statement Form</title>
	 	<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
	<jsp:include page="menu.jsp"/>
	<h3>Account Statement</h3>
	<table >
			
			<tr><td>From Date</td> 
			<td><em><input type="date" name="fromdt" required /></em></td>
			</tr>
			<tr><td>To Date</td> 
			<td><em><input type="date" name="todt" required /></em></td>
			</tr>
			
</table>

<button>Submit</button>
</html>
