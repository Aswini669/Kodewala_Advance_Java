<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(45deg, #ff4e50, #f9d423, #24c6dc, #abecd6);
        background-size: 400% 400%;
        animation: bgAnimation 12s ease infinite;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    @keyframes bgAnimation {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    .login-container {
        background: rgba(255, 255, 255, 0.15);
        padding: 40px 50px;
        border-radius: 16px;
        width: 320px;
        text-align: center;
        backdrop-filter: blur(10px);
        box-shadow: 0 0 20px rgba(0,0,0,0.2);
        color: white;
    }

    h2 {
        margin-bottom: 25px;
        font-size: 26px;
        text-shadow: 1px 1px 2px #000;
    }

    label {
        font-size: 14px;
        font-weight: 600;
        float: left;
        margin-top: 10px;
    }

    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 8px 0 14px 0;
        border-radius: 8px;
        border: none;
        outline: none;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        background: #fff;
        color: #333;
        padding: 12px;
        font-size: 16px;
        border: none;
        border-radius: 8px;
        cursor: pointer;
        font-weight: bold;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #333;
        color: #fff;
        transform: scale(1.05);
    }
</style>

</head>
<body>

<div class="login-container">
    <h2>Login</h2>

    <form action="loginSuccess" method="post">
        <label>Email:</label>
        <input type="text" name="email">

        <label>Password:</label>
        <input type="text" name="password">

        <input type="submit" value="LOGIN">
    </form>
</div>

</body>
</html>
