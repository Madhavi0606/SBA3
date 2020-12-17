<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %><html>
	<head>
	 	<title>Beneficiaries page</title>
	</head>
<body>
	<h1><center>IBS bank</center></h1>
	<jsp:include page="beneficiary_form_page.jsp"/>
		<form:form action="/addBnf" method="POST" modelAttribute="addBnf" class="form">
	
	<table>
			<tr><td> Beneficiary Name</td> 
			<td><em><input type="text" name="Beneficiary name" required />
			</em></td>
			
			<tr><td>Bank Name</td> 
			<td><em><select Bank Name = "">
					<option>Kotak Bank</option>
					<option>State Bank of India</option>
					<option>HDFC Bank</option>
               		<option>ICICI Bank</option>
					</select>	
				</em></td>
			</tr>
		
			<tr><td>IFSC Code</td> 
			<td><em><input type="text" name="IFSC Code" required /></em></td>
			</tr>
			
			<tr><td>Account Number</td> 
			<td><em><input type="text" name="Account Number" required /></em></td>
			</tr>
			
			<tr><td>Account Type</td> 
			<td><em>
			<input type="radio" class="radio" name="Account Type" value="Savings" id="Savings" />
            <label for="Savings">Savings</label>
            <input type="radio" class="radio" name="Account Type" value="Current" id="Current" />
       		<label for="Current">Current</label>
			</em></td>
			</tr>
			
			<tr><td>Mobile Number</td> 
			<td><em><input type="text" name="Mobile Number" required /></em></td>
			</tr>
			
			<tr><td>
			<br>
			</td>
			</tr>
			
</table>
			<button type="save" class="savebtn">Save</button>  
			<button type="cancel" class="cancelbtn"> Cancel</button>
			</form:form>
			
</body>
</html>