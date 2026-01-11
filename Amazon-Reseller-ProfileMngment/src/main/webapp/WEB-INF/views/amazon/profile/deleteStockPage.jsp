<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		Current Stock: <strong>${currStock}</strong>
	</h2>

	<div class="warning">Are you sure you want to delete this stock?
	</div>

	<a href="deleteNewStock" class="btn delete-btn">Yes, Delete</a>
	<a href="home" class="btn back-btn">Go Back</a>
</body>
</html>