<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Confimation page</title>
</head>
<body>

  Student is confirmed ${student.firstName} ${student.lastName} from ${student.country}
  <br><br>
  Favourite language is ${student.favouriteLanguage}
  <ul>
    <c:forEach var = "temp" items ="${student.operatingSystems}">
       <li>${temp}</li>
     </c:forEach>
  
  
  </ul>
  
</body>
</html>