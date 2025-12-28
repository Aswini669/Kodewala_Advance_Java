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
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        font-family: 'Segoe UI', Arial, sans-serif;
        background: linear-gradient(135deg, #ff7e5f, #feb47b);
    }

    .login-box {
        width: 360px;
        background: #ffffff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 15px 30px rgba(0,0,0,0.25);
        animation: fadeSlideUp 0.9s ease-out;
    }

    h2 {
        text-align: center;
        margin-bottom: 30px;
        color: #333;
    }

    .form-group {
        margin-bottom: 18px;
    }

    label {
        display: block;
        margin-bottom: 6px;
        font-size: 14px;
        color: #555;
    }

    input {
        width: 100%;
        padding: 10px 12px;
        font-size: 14px;
        border-radius: 6px;
        border: 1px solid #ccc;
        outline: none;
    }

    input:focus {
        border-color: #ff7e5f;
        box-shadow: 0 0 6px rgba(255,126,95,0.5);
    }

    button {
        width: 100%;
        margin-top: 10px;
        padding: 12px;
        background: #ff7e5f;
        color: white;
        border: none;
        border-radius: 25px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.2s ease;
    }

    button:hover {
        transform: translateY(-2px);
        box-shadow: 0 8px 18px rgba(0,0,0,0.3);
    }

    @keyframes fadeSlideUp {
        from {
            opacity: 0;
            transform: translateY(40px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }
</style>
</head>

<body>

<div class="login-box">
    <h2>🔐 Login</h2>

    <form action="login" method="post">
        <div class="form-group">
            <label>Username</label>
            <input type="text" name="username" placeholder="Enter username" required>
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" name="password" placeholder="Enter password" required>
        </div>

        <button type="submit">Login</button>
    </form>
</div>

</body>
</html>
