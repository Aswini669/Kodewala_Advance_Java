<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Stock</title>

<style>

    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        font-family: "Poppins", Arial, sans-serif;
        background: linear-gradient(135deg, #89f7fe, #66a6ff);
        animation: fadeIn 1.3s ease-in-out;
    }

    .card {
        background: white;
        width: 420px;
        padding: 30px 35px;
        border-radius: 20px;
        box-shadow: 0 12px 30px rgba(0,0,0,0.2);
        text-align: center;
        animation: slideUp 1.3s ease;
    }

    h2 {
        margin: 10px 0;
        font-size: 24px;
        color: #333;
        animation: textGlow 2s infinite alternate;
    }

    .stock-value {
        font-size: 40px;
        font-weight: bold;
        color: #0077ff;
        margin-top: 10px;
        animation: pulse 1.8s infinite ease-in-out;
    }

    a {
        display: inline-block;
        margin-top: 25px;
        padding: 12px 25px;
        background: #333;
        color: white;
        text-decoration: none;
        border-radius: 10px;
        font-size: 16px;
        transition: 0.3s ease;
    }

    a:hover {
        background: #000;
        transform: scale(1.08);
    }

    /* Animations */

    @keyframes fadeIn {
        from { opacity: 0; }
        to { opacity: 1; }
    }

    @keyframes slideUp {
        from { transform: translateY(40px); opacity: 0; }
        to { transform: translateY(0); opacity: 1; }
    }

    @keyframes pulse {
        0% { transform: scale(1); }
        50% { transform: scale(1.1); }
        100% { transform: scale(1); }
    }

    @keyframes textGlow {
        from { color: #333; }
        to { color: #0051ff; }
    }

</style>

</head>
<body>

<div class="card">
    <h2>Your Current Stock</h2>

    <div class="stock-value">
        ${currStock}
    </div>

    <a href="home">Go Back</a>
</div>

</body>
</html>
