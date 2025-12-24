<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #0f172a, #1e293b);
        font-family: Arial, sans-serif;
    }

    .card {
        background: #ffffff;
        padding: 35px 40px;
        border-radius: 12px;
        width: 420px;
        text-align: center;
        box-shadow: 0 15px 35px rgba(0, 0, 0, 0.4);
    }

    h2 {
        color: #16a34a;
        margin-bottom: 10px;
    }

    .subtitle {
        color: #555;
        margin-bottom: 25px;
    }

    .info-box {
        background: #f8fafc;
        border-left: 5px solid #2563eb;
        padding: 15px;
        text-align: left;
        border-radius: 8px;
        margin-bottom: 20px;
    }

    .info-box h4 {
        margin: 0 0 8px;
        color: #1e3a8a;
    }

    .info-box ul {
        margin: 0;
        padding-left: 18px;
        color: #374151;
        font-size: 14px;
    }

    .btn {
        display: inline-block;
        margin-top: 10px;
        padding: 10px 22px;
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
    <h2>✅ Login Successful</h2>
    <p class="subtitle">Welcome! You are now authenticated.</p>

    <!-- Login Required Info Box -->
    <div class="info-box">
        <h4>🔒 Login Required</h4>
        <ul>
            <li>Access your dashboard</li>
            <li>View your profile details</li>
            <li>Manage orders and settings</li>
            <li>Logout securely after use</li>
        </ul>
    </div>

    <a href="dashboard" class="btn">Go to Dashboard</a>
</div>

</body>
</html>
