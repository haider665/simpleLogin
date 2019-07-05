<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V15</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
<!-- 	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/> -->
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
	<style>
		.error{color:red}
	  </style>
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(images/bg-01.jpg);">
					<span class="login100-form-title-1">
						Sign In
					</span>
				</div>
				<div align= "center">
					<h1> ${message}</h1>
				</div>
				<form:form class="login100-form validate-form" action="processSignUp" method="POST" modelAttribute="user" >
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<form:errors path="name" cssClass="error"/>
						<span class="label-input100">Name</span>
						<form:input class="input100" type="text" name="username" placeholder="Enter username" path="name" />                 
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<form:errors path="address" cssClass="error"/>
						<span class="label-input100">Address</span>
						<form:input class="input100" type="text" name="username" placeholder="Enter address" path="address"/> 
						<span class="focus-input100"></span>
					</div>
		
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<form:errors path="number" cssClass="error"/>
						<span class="label-input100">Phone Number</span>
						<form:input class="input100" type="text" name="username" placeholder="Enter phone number" path="number"/>
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<form:errors path="email" cssClass="error"/>
						<span class="label-input100">Email</span>
						<form:input class="input100" type="email" name="pass" placeholder="Enter email" path="email"/>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<form:errors path="birthday" cssClass="error"/>
						<span class="label-input100">BirthDay</span> <form:errors path="birthday" cssClass="error"/>
						<form:input class="input100" type="date" name="username"  path="birthday"/>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<form:errors path="password" cssClass="error"/>
						<span class="label-input100">Password</span>
						<form:input class="input100" type="password" name="username" placeholder="Enter password" path="password"/>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<form:errors path="confirmPassword" cssClass="error"/>
						<span class="label-input100"> Confirm Password</span>
						<form:input class="input100" type="password" name="pass" placeholder="Confirm password" path="confirmPassword" />
						<span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">
							Login
						</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
	
	

</body>
</html>