<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actor Form</title>
</head>
<body>
	<div>
	<p> Create Actor:: </p>
	<form action="addActor" method="post">
		<p> First Name: <input type="text" name="firstName"> </p>
		<p> Last Name: <input type="text" name="lastName"> </p>
		<p> <input type="submit" title="Submit">
	</form>
	</div>
	<div>
	<p> Search Actor:: </p>
	<form action="searchActor" method="post">
		<p> Actor ID: <input type="text" name="actorId"> </p>
		<p> <input type="submit" title="Submit">
	</form>
	</div>
	<div>
	<p> Search Actor By First Name:: </p>
	<form action="searchActorByFirstName" method="post">
		<p> First Name: <input type="text" name="firstName"> </p>
		<p> <input type="submit" title="Submit">
	</form>
	</div>
	<div>

	<div>
	<p> Actor Search Result:: </p>
	<p> ${actor} </p>
	</div>
</body>
</html>