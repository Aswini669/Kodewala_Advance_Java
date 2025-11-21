<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    /* Navigation Bar */
    .navbar {
        background-color: #4CAF50;
        padding: 15px;
        color: white;
        font-size: 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .navbar a {
        color: white;
        text-decoration: none;
        margin-left: 20px;
        font-size: 18px;
        transition: 0.3s;
    }

    .navbar a:hover {
        opacity: 0.8;
    }

    /* Home Content */
    .container {
        margin-top: 60px;
        text-align: center;
    }

    h2 {
        font-size: 32px;
        color: #2e7d32;
    }

    p {
        font-size: 18px;
        color: #555;
        margin-top: 10px;
    }

    .btn {
        margin-top: 25px;
        padding: 12px 25px;
        background: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 18px;
        transition: 0.3s;
        text-decoration: none;
    }

    .btn:hover {
        background: #45a049;
    }
</style>

</head>
<body>

<!-- Top Navigation Bar -->
<div class="navbar">
    <div>KodeHub</div>

    <div>
        <a href="home.jsp">Home</a>
        <a href="profile.jsp">Profile</a>
        <a href="logout">Logout</a>
    </div>
</div>

<!-- Page Content -->
<div class="container">
    <h2>Welcome to Home Page</h2>
    <p>You have successfully logged in using your PAN credentials.</p>

    <a href="dashboard.jsp" class="btn">Go to Dashboard</a>
</div>

</body>
</html>
