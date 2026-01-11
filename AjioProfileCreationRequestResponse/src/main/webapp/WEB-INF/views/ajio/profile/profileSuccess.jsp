<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJIO | Profile Created</title>

<style>
    body {
        margin: 0;
        font-family: "Segoe UI", Arial, sans-serif;
        background-color: #f5f5f5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .card {
        background: #ffffff;
        width: 420px;
        padding: 35px;
        border-radius: 10px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.15);
        text-align: center;
    }

    .success-icon {
        font-size: 50px;
        color: #28a745;
        margin-bottom: 10px;
    }

    h2 {
        color: #2c3e50;
        margin-bottom: 15px;
    }

    .success {
        font-size: 16px;
        color: #555;
        margin-bottom: 25px;
    }

    .success strong {
        color: #ff3f6c;
        font-size: 18px;
    }

    .btn {
        display: inline-block;
        padding: 10px 25px;
        background-color: #ff3f6c;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        font-weight: bold;
        font-size: 14px;
    }

    .btn:hover {
        background-color: #e6365f;
    }
</style>
</head>

<body>

<div class="card">
    <div class="success-icon">✔</div>
    <h2>Profile Created Successfully!</h2>

    <p class="success">
        Your User ID is: <strong>${userID}</strong>
    </p>

    <a href="showProfile" class="btn">Go to My Account</a>
</div>

</body>
</html>
