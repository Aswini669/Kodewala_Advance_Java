<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Create Apple ID</title>

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

    .signup-container {
        background: #ffffff;
        width: 420px;
        padding: 40px 35px;
        border-radius: 18px;
        box-shadow: 0 20px 40px rgba(0,0,0,0.08);
    }

    h2 {
        text-align: center;
        font-size: 28px;
        font-weight: 600;
        margin-bottom: 10px;
    }

    .subtitle {
        text-align: center;
        font-size: 14px;
        color: #6e6e73;
        margin-bottom: 30px;
    }

    label {
        display: block;
        margin-top: 16px;
        font-size: 13px;
        font-weight: 500;
        color: #1d1d1f;
    }

    input {
        width: 100%;
        padding: 11px;
        margin-top: 6px;
        border: 1px solid #d2d2d7;
        border-radius: 12px;
        font-size: 14px;
        background: #ffffff;
    }

    input:focus {
        outline: none;
        border-color: #0071e3;
    }

    .btn {
        width: 100%;
        margin-top: 26px;
        padding: 12px;
        background: #0071e3;
        color: #ffffff;
        border: none;
        border-radius: 12px;
        font-size: 16px;
        font-weight: 500;
        cursor: pointer;
    }

    .btn:hover {
        background: #005bb5;
    }

    .footer {
        margin-top: 22px;
        text-align: center;
        font-size: 12px;
        color: #86868b;
    }
</style>
</head>

<body>

<div class="signup-container">
    <h2>Create Apple ID</h2>
    <div class="subtitle">
        One account for everything Apple
    </div>

    <form action="createProfile" method="post">

        <label>First Name</label>
        <input type="text" name="firstName" required>

        <label>Last Name</label>
        <input type="text" name="lastName" required>

        <label>Email</label>
        <input type="email" name="email" required>

        <label>Mobile Number</label>
        <input type="text" name="mobile" required>

        <label>Password</label>
        <input type="password" name="password" required>

        <label>Confirm Password</label>
        <input type="password" name="confirmPassword" required>

        <button type="submit" class="btn">Create Apple ID</button>

    </form>

    <div class="footer">
        © 2025 Apple Inc. All rights reserved.
    </div>
</div>

</body>
</html>
