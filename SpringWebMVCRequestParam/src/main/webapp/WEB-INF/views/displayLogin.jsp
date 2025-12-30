<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login | Samsung Store</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #141e30, #243b55);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .login-card {
        background: #ffffff;
        padding: 40px;
        width: 360px;
        border-radius: 12px;
        box-shadow: 0 12px 30px rgba(0,0,0,0.25);
        text-align: center;
    }

    .login-card h2 {
        margin-bottom: 25px;
        color: #1428a0;
        letter-spacing: 1px;
    }

    .input-group {
        text-align: left;
        margin-bottom: 18px;
    }

    .input-group label {
        font-size: 14px;
        color: #555;
        font-weight: bold;
    }

    .input-group input {
        width: 100%;
        padding: 10px;
        margin-top: 6px;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
        outline: none;
    }

    .input-group input:focus {
        border-color: #1428a0;
        box-shadow: 0 0 6px rgba(20,40,160,0.3);
    }

    .login-btn {
        width: 100%;
        padding: 12px;
        background: #1428a0;
        color: white;
        border: none;
        border-radius: 30px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        margin-top: 10px;
        transition: all 0.3s ease;
    }

    .login-btn:hover {
        background: #0d1b6b;
        box-shadow: 0 8px 18px rgba(20,40,160,0.4);
    }

    .footer-text {
        margin-top: 20px;
        font-size: 13px;
        color: #777;
    }
</style>

</head>
<body>

<div class="login-card">
    <h2>Login</h2>

    <form action="signin" method="post">

        <div class="input-group">
            <label>Username</label>
            <input type="text" name="userName" placeholder="Enter username" required />
        </div>

        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password" placeholder="Enter password" required />
        </div>

        <input type="submit" value="Login" class="login-btn" />

    </form>

    <div class="footer-text">
        Secure Login • Samsung Store
    </div>
</div>

</body>
</html>
