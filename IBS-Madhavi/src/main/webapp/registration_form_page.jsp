<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %><html>
	<head>
	 	<title>Registration Form</title>
	 	<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
<body>
	<jsp:include page="menu.jsp"/>
	<form:form action="/register" method="POST" modelAttribute="register" class="form">
	
	<table>
			<tr><td>Full Name</td> 
			<td><em><input type="text" name="name" required />
			</em></td>
			</tr>
			<tr><td>Date Of Birth</td> 
			<td><em><input type="date" name="dob" required /></em></td>
			</tr>
			<tr><td>Gender</td> 
			<td>
      <div class="Gender">
        <input type="radio" class="radio" name="Gender" value="male" id="male" />
        <label for="male">Male</label>
        <input type="radio" class="radio" name="Gender" value="Female" id="Female" />
        <label for="female">Female</label>
        <input type="radio" class="radio" name="Gender" value="Other" id="Other" />
        <label for="Other">Other</label>
      </div>
    	</td></tr>
			<tr><td>Email Id</td> 
			<td><em><input type="text" name="emailId" required /></em></td>
			</tr>
			<tr><td>Mobile Num </td> 
			<td><em><input type="text" name="mobileNum" required /></em></td>
			</tr>
			<tr><td>Address</td> 
			<td><em><input type="text" name="address" required /></em></td>
			</tr>
			<tr><td>City</td> 
			<td><em><input type="text" name="city" required /></em></td>
			</tr>
			<tr><td>PinCode</td> 
			<td><em><input type="text" name="pinCode" required /></em></td>
			</tr>
			<tr><td>Role Name</td> 
			<td><em><select name = "">
					<option>Service Provider</option>
					<option>Customer</option>
					</select>	
				</em></td>
			</tr>
			<tr><td>Account Type</td> 
			<td><em>
			<input type="checkbox" id="Savings Account" name="Savings Account" >
 			 <label for="Savings Account">Savings Account</label>
  			<input type="checkbox" id="Recurring Deposit Account" name="Recurring Deposit Account">
  			<label for="Recurring Deposit Account">Recurring Deposit</label>
  			<input type="checkbox" id="Fixed Deposit Account" name="Fixed Deposit Account">
  			<label for="Fixed Deposit Account">Fixed Deposit</label>
					</em></td>
			</tr>
			<tr><td>KYC Document</td> 
			<td><em><input type="file" name="KYCIdentityProof" required /></em></td>
			</tr>
			<button>Submit</button>
</table>

</form:form>
</body>
</html>