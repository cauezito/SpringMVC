<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<form action="/casadocodigo/products" method="POST">
		<div>
			<label>Title:</label>
			<input type="text" name="title" required="required">
		</div>
		<div>
			<label>Description:</label>
			<textarea rows="3" cols="4" name="description" required="required"></textarea>
		</div>
		<div>
			<label>Number of pages:</label>
			<input type="number" name="pages" required="required">
		</div>
			<input type="submit" value="Ok!">		
	</form>
	
</body>
</html>