<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Stock</title>

<style>

    body {
        font-family: "Arial", sans-serif;
        background: linear-gradient(135deg, #ff9a9e, #fecfef);
        margin: 0;
        padding: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 1s ease-in-out;
    }

    .box {
        background: #fff;
        padding: 30px 40px;
        border-radius: 20px;
        width: 420px;
        box-shadow: 0px 10px 25px rgba(0,0,0,0.2);
        text-align: center;
        animation: popUp 1.2s ease;
    }

    h2 {
        color: #333;
        margin-bottom: 15px;
        font-size: 22px;
    }

    .warning {
        color: #ff3b3b;
        font-size: 18px;
        margin-bottom: 20px;
        font-weight: bold;
    }

    a.btn {
        display: inline-block;
        margin: 10px;
        padding: 12px 25px;
        text-decoration: none;
        border-radius: 10px;
        font-size: 15px;
        transition: 0.3s ease;
    }

    .delete-btn {
        background: #ff4d4d;
        color: white;
    }

    .delete-btn:hover {
        background: #d90000;
        transform: scale(1.07);
    }

    .back-btn {
        background: #444;
        color: white;
    }

    .back-btn:hover {
        background: #000;
        transform: scale(1.07);
    }

    /* Animations */
    @keyframes fadeIn {
        0% { opacity: 0; }
        100% { opacity: 1; }
    }

    @keyframes popUp {
        0% { transform: scale(0.8); opacity: 0; }
        100% { transform: scale(1); opacity: 1; }
    }

</style>

</head>
<body>

<div class="box">
    <h2>Current Stock: <strong>${currStock}</strong></h2>

    <div class="warning">
        Are you sure you want to delete this stock?
    </div>

    <a href="deleteNewStock" class="btn delete-btn">Yes, Delete</a>
    <a href="home" class="btn back-btn">Go Back</a>
</div>

</body>
</html>
