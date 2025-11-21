<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAN Card Login</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .login-container {
        background: white;
        padding: 25px 30px;
        border-radius: 8px;
        box-shadow: 0px 0px 10px #ccc;
        width: 320px;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
    }

    input {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
        font-size: 16px;
        border: 1px solid #aaa;
        border-radius: 5px;
    }

    .btn {
        width: 100%;
        padding: 12px;
        background: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 18px;
        margin-top: 10px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #45a049;
    }
</style>

</head>
<body>

<div class="login-container">
    <h2>PAN Login</h2>

    <form action="panLogin" method="post">
        <label>PAN Number</label>
        <input type="text" name="userName" placeholder="Enter PAN Number" required pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}" title="Enter valid PAN (ABCDE1234F)">

        <label>Password</label>
        <input type="password" name="password" placeholder="Enter Password" required>

        <button class="btn" type="submit">Login</button>
    </form>
</div>

</body>
</html>
