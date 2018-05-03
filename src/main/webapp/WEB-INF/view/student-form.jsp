<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Form</title>
</head>
<body>
   <form:form action= "processForm" modelAttribute= "student">
   First Name: <form:input path="firstName"/>
   
   <br><br>
   
   Last Name: <form:input path= "lastName"/>
   
   
   <br><br>
   <form:select path= "country">
     <%-- <form:option value="Brazil" label="Brazil"/>
     <form:option value="France" label="France"/>
     <form:option value="Germany" label="Germany"/>
     <form:option value="India" label="India"/> --%>
     
  <%--    <form:options items = "${student.countryOptions}"/> --%>
      <form:options items = "${countryOptions}"/>
       </form:select>
    <br></br>
    Favourite Language:   
   <%--  Java  <form:radiobutton path="favouriteLanguage" value ="Java"/>
    C# <form:radiobutton path="favouriteLanguage" value ="C#"/>
    JavaScript<form:radiobutton path="favouriteLanguage" value ="JavaScript"/>
    PHP<form:radiobutton path="favouriteLanguage" value ="PHP"/>
    Ruby<form:radiobutton path="favouriteLanguage" value ="Ruby"/> --%>
    <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}"/>
    
    <br><br>
    Operating Systems: 
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="MacOS"/>
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
   
    
  
   <br><br>
   <input type= "submit" value = "Submit"/>
      
   
   
   </form:form>
   







</body>
</html>