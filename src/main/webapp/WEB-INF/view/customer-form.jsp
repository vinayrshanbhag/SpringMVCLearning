<%@ taglib prefix="form" uri= "http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Form</title>
 <style>
   .error{
       color:red
       }
 </style>
</head>
<body>
 <i>Fill out the form. Asterisk(*) means it is required.</i>
  <form:form action = "processForm" modelAttribute="customer">
  	FirstName: <form:input path="firstName"/>
  	<br><br>
  	LastName(*): <form:input path="lastName"/>
  	<br><br>
    <form:errors path = "lastName" cssClass="error"></form:errors>
  	<br><br>
  	No. of Free passes: <form:input path= "freePasses"/>
  	<br><br>
  	<form:errors path = "freePasses" cssClass="error"></form:errors>  
  	<br><br>
  	Postal Code: <form:input path ="postalCode"/>
  	<br><br>
  	<form:errors path = "postalCode" cssClass="error"></form:errors>
  	<br><br>
  	CourseCode: <form:input path ="courseCode"/>
  	<br><br>
  	<form:errors path = "courseCode" cssClass="error"></form:errors>
  	<br><br>
  	<input type="submit" value ="Submit"/>
  	
  
  
  </form:form>

</body>
</html>