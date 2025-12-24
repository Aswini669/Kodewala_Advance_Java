<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout Success</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #020617, #0f172a);
        font-family: "Segoe UI", Arial, sans-serif;
    }

    .card {
        background: #ffffff;
        padding: 40px;
        width: 420px;
        border-radius: 14px;
        text-align: center;
        box-shadow: 0 18px 45px rgba(0, 0, 0, 0.5);
    }

    .icon {
        font-size: 48px;
        margin-bottom: 10px;
    }

    h2 {
        color: #dc2626;
        margin-bottom: 10px;
    }

    p {
        color: #4b5563;
        margin-bottom: 25px;
        font-size: 15px;
    }

    .info-box {
        background: #f9fafb;
        border-left: 5px solid #dc2626;
        padding: 14px;
        border-radius: 8px;
        text-align: left;
        margin-bottom: 25px;
        font-size: 14px;
        color: #374151;
    }

    .btn {
        display: inline-block;
        padding: 12px 26px;
        background: #2563eb;
        color: white;
        text-decoration: none;
        border-radius: 25px;
        font-weight: bold;
        transition: 0.3s;
    }

    .btn:hover {
        background: #1d4ed8;
    }
</style>
</head>

<body>

<div class="card">
    <div class="icon">👋</div>
    <h2>Logout Successful</h2>
    <p>You have been safely logged out.</p>

    <div class="info-box">
        For your security, please close the browser or login again to continue using the application.
    </div>

    <a href="login" class="btn">Login Again</a>
</div>

</body>
</html>
