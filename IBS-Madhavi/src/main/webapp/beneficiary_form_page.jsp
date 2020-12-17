<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %><html>
<head>
<jsp:include page="menu.jsp"/>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<nav>
	<hr />
		<a href=add_beneficiary_page.jsp>Add new beneficiary</a>
		<br>
		<a href=viewlist_beneficiary.jsp>View list of beneficiaries</a>
		<br>
		<a href=delete_beneficiary.jsp>Delete beneficiaries</a>
	<hr />
</nav>
</body>
</html>