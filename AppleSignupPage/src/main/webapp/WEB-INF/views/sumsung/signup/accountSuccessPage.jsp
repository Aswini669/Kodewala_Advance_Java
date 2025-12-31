<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Apple ID Created</title>

<style>
    body {
        margin: 0;
        font-family: -apple-system, BlinkMacSystemFont, "Segoe UI",
                     Roboto, Helvetica, Arial, sans-serif;
        background: #f5f5f7;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        color: #1d1d1f;
    }

    .success-container {
        background: #ffffff;
        width: 420px;
        padding: 40px 35px;
        border-radius: 18px;
        text-align: center;
        box-shadow: 0 20px 40px rgba(0,0,0,0.08);
    }

    .success-icon {
        font-size: 42px;
        color: #34c759; /* Apple green */
        margin-bottom: 12px;
    }

    h2 {
        font-size: 26px;
        font-weight: 600;
        margin-bottom: 8px;
    }

    .success-message {
        font-size: 15px;
        color: #6e6e73;
        margin: 12px 0 18px;
    }

    .user-id {
        background: #f5f5f7;
        padding: 12px;
        border-radius: 12px;
        font-size: 15px;
        margin: 18px 0;
        color: #1d1d1f;
        font-weight: 500;
    }

    a {
        display: inline-block;
        margin-top: 22px;
        text-decoration: none;
        background: #0071e3;
        color: #ffffff;
        padding: 12px 26px;
        border-radius: 12px;
        font-size: 15px;
        font-weight: 500;
        transition: background 0.3s ease;
    }

    a:hover {
        background: #005bb5;
    }

    .footer {
        margin-top: 24px;
        font-size: 12px;
        color: #86868b;
    }
</style>
</head>

<body>

<div class="success-container">

    <div class="success-icon">✓</div>

    <h2>Apple ID Created</h2>

    <p class="success-message">
        Your Apple ID has been successfully created.
    </p>

    <div class="user-id">
        Your Apple ID: ${userId}
    </div>

    <a href="signin">Sign In</a>

    <div class="footer">
        © 2025 Apple Inc. All rights reserved.
    </div>

</div>

</body>
</html>
