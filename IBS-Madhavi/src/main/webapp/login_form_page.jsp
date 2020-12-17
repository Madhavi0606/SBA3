<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	 	<title>IBS Login</title>
	 	<link rel="stylesheet" type="text/css" href="styles.css">
	</head>
<body>
	<jsp:include page="menu.jsp"/>
	
	 	<form:form action="/login" method="POST" modelAttribute="login" class="form">
 
    <table>

			<tr>
				<td>UserName</td>
				<td><input type="text" placeholder="Enter Username"  name="username" required  /></td>
				
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" placeholder="Enter Password" name="password"	required/></td>
			</tr>
			
			<!-- <tr><td>Role Name</td> 
			<td><em><select name = "">
					<option>Service Provider</option>
					<option>Customer</option>
					</select>	
				</em></td>
			</tr> -->
			
		</table>
	
			<button type="submit">Login</button>  
			<button type="button" class="cancelbtn"> Cancel</button>
			 <a href="#"> Forgot password? </a>	
		</form:form>   
</body>
</html>