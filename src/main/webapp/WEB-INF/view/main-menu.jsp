<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>

<html>

<head>
<%-- <link href="<c:url value="/resources/css/my-test.css" />" rel="stylesheet"> --%>
	

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/my-test.css">
	
<script src="${pageContext.request.contextPath}/resources/js/simple-test.js" /></script>

</head>



<body>
	<h2>Welcome to the main menu</h2>

</body>

<a href="showForm">Show Form</a> <br></br>
<a href="student/showForm">Show Student Form</a><br><br>
<a href="customer/showForm">Show Customer Form</a>

</html>