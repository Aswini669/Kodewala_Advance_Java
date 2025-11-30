<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Confirmation</title>

<style>

    /* ---------------- Animated Background ---------------- */
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        font-family: Poppins, Arial, sans-serif;

        background: linear-gradient(-45deg, #84fab0, #8fd3f4, #a1c4fd, #c2e9fb);
        background-size: 400% 400%;
        animation: bgAnimation 10s ease infinite;
    }

    @keyframes bgAnimation {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }


    /* ---------------- Confirmation Card ---------------- */
    .card {
        background: rgba(255, 255, 255, 0.9);
        padding: 40px 60px;
        text-align: center;
        border-radius: 20px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.25);
        animation: popIn 1.2s ease;
    }

    @keyframes popIn {
        0% { opacity: 0; transform: scale(0.8); }
        100% { opacity: 1; transform: scale(1); }
    }

    h2 {
        font-size: 32px;
        color: #2e7d32;
        margin-bottom: 15px;
    }

    p {
        font-size: 20px;
        color: #333;
    }

    .order-id {
        font-size: 28px;
        font-weight: bold;
        color: #1565c0;
        margin-top: 10px;
    }

    /* ---------------- Success Icon ---------------- */
    .success-icon {
        font-size: 60px;
        color: #2ecc71;
        margin-bottom: 15px;
    }

</style>
</head>

<body>

    <div class="card">
        <div class="success-icon">✔</div>

        <h2>Order Placed Successfully!</h2>

        <p>Your order has been placed and your order ID is:</p>

        <div class="order-id">${orderId}</div>
    </div>

</body>
</html>
