<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %><html>
	<head>
	 	<title>Registration Form</title>
	 	<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
<body>
	<jsp:include page="menu.jsp"/>
		<form:form action="/transfer" method="POST" modelAttribute="transfer" class="form">
	
	<table>
	<h3>Fund Transfers</h3>
			<tr><td>
				Payment From </td>
				<td><input type="textbox" name="fromAccount" required /></td>
			</tr>
			<tr><td>
				Payment To</td>
				<td><input type="textbox" name="toAccount" required /></td>
			</tr>
			<tr><td>
				Amount</td>
				<td><input type="textbox" name="amount" min="1" max="100000" step="1" required /></td>
			</tr>
			<tr><td>AccountType</td> 
			<td>
      	<div class="AccountType">
        <input type="radio" class="radio" name="AccountType" value="savings" id="savings" />
        <label for="savings">Savings</label>
        <input type="radio" class="radio" name="AccountType" value="current" id="current" />
        <label for="current">Current</label>
      </div>
    </td>
			</tr>
			<tr><td>
				Remarks </td>
				<td><input type="text" name="Remarks" /></td>
			</tr>
	</table>
	
	<button>Transfer Amount</button> 
	<button>Cancel</button>
	</form:form>
</body>
</html>