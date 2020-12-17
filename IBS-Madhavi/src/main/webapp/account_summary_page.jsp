<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Account Summary Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<jsp:include page="Logout_page.jsp"/>
	<h2>Quick Links</h2>
<div id="navigation">
    <ul>
    <li><a href="account_statement_page.jsp">Account Statement</a></li>
    <li><a href="account_transaction_page.jsp">Fund Transfer</a></li>
    <li><a href="beneficiary_form_page.jsp">Beneficiaries</a></li>
    <li><a href="bill_payments.jsp">Bill Payments</a></li>
    </ul>
  
  
  <h2><center>Account Summary</h2>
   <table style="float:top;width:400px; margin:0 auto;">
	
		<tr><td>
					<tr><td>Account Number:</td><td> <input type="text" name="accountNumber"/></td></tr>
					<tr><td>Account Name:</td><td> <input type="text" name="accountName"/></td></tr>
					<tr><td>Account Type:</td><td>
					<select name = "">
					<option>Savings</option>
					<option>Current</option>
					</select>	
					</td></tr>
					<tr><td>Balance:</td><td> <input type="text" name="balance"/></td></tr>
					
	</table>   
</div>


	
</body>
</html>