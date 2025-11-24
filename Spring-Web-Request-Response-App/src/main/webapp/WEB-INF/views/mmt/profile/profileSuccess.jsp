<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Created</title>

<style>
    body {
        margin: 0;
        padding: 0;
        background: linear-gradient(135deg, #ffffff, #e3edff);
        font-family: "Segoe UI", sans-serif;
        text-align: center;
    }

    .header {
        background: #0b4fc4;
        padding: 18px;
        color: white;
        font-size: 26px;
        font-weight: 700;
        letter-spacing: 1px;
        box-shadow: 0 2px 12px rgba(0,0,0,0.15);
    }

    .box {
        width: 450px;
        margin: 70px auto;
        background: white;
        padding: 35px;
        border-radius: 16px;
        box-shadow: 0 6px 18px rgba(0,0,0,0.15);
        animation: fadeIn 1s ease-in-out;
    }

    h1 {
        color: #0b4fc4;
        font-size: 26px;
        font-weight: 700;
    }

    .userid {
        margin-top: 20px;
        font-size: 20px;
        font-weight:600;
        color: #333;
        line-height: 1.6;
    }

    .userid span {
        color: #0b4fc4;
        font-size: 22px;
        font-weight: bold;
    }

    a.button {
        display: inline-block;
        margin-top: 25px;
        padding: 12px 28px;
        background: #0b4fc4;
        color: white;
        text-decoration: none;
        border-radius: 30px;
        font-size: 17px;
        letter-spacing: 0.5px;
        font-weight: 600;
        transition: 0.3s ease;
    }

    a.button:hover {
        background: #083a93;
        transform: translateY(-2px);
        box-shadow: 0 4px 12px rgba(0,0,0,0.2);
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }
</style>

</head>
<body>

<div class="header">Goibibo</div>

<div class="box">
    <h1>Profile Created Successfully 🎉</h1>

    <div class="userid">
        Your generated User ID is:<br>
        <span>${userId}</span>
    </div>

    <a href="home" class="button">Go to Home</a>
</div>

</body>
</html>
