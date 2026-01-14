<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Confirmed | Instamart</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #e8f5e9, #f1f8e9);
        display: flex;
        justify-content: center;
        align-items: center;
    }

    /* Success Card */
    .success-card {
        background: #ffffff;
        width: 420px;
        padding: 40px 30px;
        border-radius: 20px;
        text-align: center;
        box-shadow: 0 20px 45px rgba(0,0,0,0.15);
        animation: fadeInScale 0.9s ease;
    }

    @keyframes fadeInScale {
        from {
            opacity: 0;
            transform: scale(0.85);
        }
        to {
            opacity: 1;
            transform: scale(1);
        }
    }

    /* Check icon */
    .check {
        width: 70px;
        height: 70px;
        margin: 0 auto 20px;
        border-radius: 50%;
        background: linear-gradient(135deg, #2e7d32, #66bb6a);
        display: flex;
        justify-content: center;
        align-items: center;
        color: white;
        font-size: 36px;
        animation: pop 0.6s ease;
    }

    @keyframes pop {
        0% { transform: scale(0); }
        80% { transform: scale(1.15); }
        100% { transform: scale(1); }
    }

    h2 {
        color: #2e7d32;
        margin-bottom: 12px;
    }

    p {
        font-size: 16px;
        color: #555;
        margin: 8px 0;
    }

    .order-id {
        font-size: 20px;
        font-weight: bold;
        color: #1b5e20;
        margin-top: 10px;
        background: #e8f5e9;
        display: inline-block;
        padding: 8px 18px;
        border-radius: 20px;
        animation: glow 1.5s infinite alternate;
    }

    @keyframes glow {
        from {
            box-shadow: 0 0 5px rgba(46,125,50,0.4);
        }
        to {
            box-shadow: 0 0 15px rgba(46,125,50,0.7);
        }
    }

    /* Button */
    .btn {
        display: inline-block;
        margin-top: 25px;
        padding: 12px 28px;
        background: linear-gradient(135deg, #2e7d32, #66bb6a);
        color: white;
        text-decoration: none;
        font-size: 15px;
        border-radius: 30px;
        transition: transform 0.3s ease, box-shadow 0.3s ease;
    }

    .btn:hover {
        transform: translateY(-3px);
        box-shadow: 0 10px 20px rgba(46,125,50,0.4);
    }
</style>
</head>

<body>

<div class="success-card">

    <div class="check">✓</div>

    <h2>Order Placed Successfully!</h2>

    <p>Your order has been placed successfully.</p>
    <p>Your Order ID:</p>

    <div class="order-id">
        ${orderId}
    </div>

    <br>

    <a href="/" class="btn">Back to Home</a>

</div>

</body>
</html>
