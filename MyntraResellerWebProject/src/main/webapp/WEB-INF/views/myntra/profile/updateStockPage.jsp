<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Stock</title>

<style>

    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #ff9a9e, #fad0c4);
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        animation: fadeIn 1s ease-in-out;
    }

    .container {
        background: white;
        padding: 30px 40px;
        border-radius: 20px;
        width: 400px;
        box-shadow: 0px 10px 25px rgba(0,0,0,0.2);
        text-align: center;
        animation: slideUp 1.2s ease;
    }

    h2 {
        color: #333;
        margin-bottom: 15px;
        animation: fadeInText 1.3s ease;
    }

    h3 {
        margin-top: 5px;
        color: #555;
        animation: fadeInText 1.6s ease;
    }

    input[type="text"] {
        width: 85%;
        padding: 12px;
        border: 2px solid #ff6f61;
        border-radius: 10px;
        margin-top: 15px;
        font-size: 15px;
        outline: none;
        transition: 0.4s;
    }

    input[type="text"]:focus {
        border-color: #ff3b2f;
        transform: scale(1.05);
    }

    input[type="submit"] {
        margin-top: 20px;
        padding: 12px 25px;
        background: #ff6f61;
        color: white;
        border: none;
        border-radius: 10px;
        cursor: pointer;
        font-size: 16px;
        transition: 0.3s;
        animation: fadeInText 1.8s ease;
    }

    input[type="submit"]:hover {
        background: #ff3b2f;
        transform: scale(1.09);
    }

    a {
        display: inline-block;
        margin-top: 20px;
        text-decoration: none;
        color: #ff3b2f;
        font-weight: bold;
        transition: 0.3s;
    }

    a:hover {
        transform: scale(1.1);
        color: #c71610;
    }

    /* Animations */
    @keyframes slideUp {
        0% { transform: translateY(50px); opacity: 0; }
        100% { transform: translateY(0); opacity: 1; }
    }

    @keyframes fadeIn {
        0% { opacity: 0; }
        100% { opacity: 1; }
    }

    @keyframes fadeInText {
        0% { opacity: 0; }
        100% { opacity: 1; }
    }

</style>

</head>
<body>

<div class="container">
    <h2>Current Stock: <strong>${currStock}</strong></h2>

    <h3>Enter New Stock</h3>

    <form action="updateNewStock" method="post">
        <input type="text" name="stock" placeholder="New Stock Value">
        <br>
        <input type="submit" value="UPDATE">
    </form>

    <a href="home">⬅ Go Back</a>
</div>

</body>
</html>
