<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style>
		.error{ color:red}
	</style>
</head>
<body>
	
	<form:form action="testForm" modelAttribute="test">
		
		Name: <form:input path="name"  /> 
				<form:errors path="name" cssClass="error"/><br>
		ID: <form:input path="id"  /> 
				<form:errors path="id" cssClass="error"/><br>
		<input type="submit" />
	
	</form:form>
	
</body>
</html>