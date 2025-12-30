<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home | Samsung Store</title>

<style>
    body {
        margin: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: #f4f6f8;
    }

    /* Header */
    .header {
        background: #1428a0;
        color: white;
        padding: 15px 40px;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .header h2 {
        margin: 0;
        letter-spacing: 1px;
    }

    .nav a {
        color: white;
        text-decoration: none;
        margin-left: 20px;
        font-weight: bold;
    }

    .nav a:hover {
        text-decoration: underline;
    }

    /* Banner */
    .banner {
        background: linear-gradient(135deg, #000428, #004e92);
        color: white;
        padding: 60px 40px;
        text-align: center;
    }

    .banner h1 {
        margin-bottom: 10px;
        font-size: 36px;
    }

    .banner p {
        font-size: 18px;
        opacity: 0.9;
    }

    /* Products */
    .products {
        padding: 40px;
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
        gap: 25px;
    }

    .card {
        background: white;
        border-radius: 12px;
        padding: 20px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.1);
        text-align: center;
        transition: transform 0.3s ease;
    }

    .card:hover {
        transform: translateY(-6px);
    }

    .card h3 {
        margin-bottom: 10px;
        color: #1428a0;
    }

    .card p {
        font-size: 14px;
        color: #555;
    }

    .card button {
        margin-top: 15px;
        padding: 10px 22px;
        border: none;
        border-radius: 25px;
        background: #1428a0;
        color: white;
        font-weight: bold;
        cursor: pointer;
    }

    .card button:hover {
        background: #0d1b6b;
    }

    /* Footer */
    .footer {
        background: #222;
        color: #aaa;
        text-align: center;
        padding: 15px;
        font-size: 13px;
    }
</style>

</head>
<body>

<!-- Header -->
<div class="header">
    <h2>Samsung Store</h2>
    <div class="nav">
        <a href="#">Home</a>
        <a href="#">Products</a>
        <a href="#">Cart</a>
        <a href="logout">Logout</a>
    </div>
</div>

<!-- Banner -->
<div class="banner">
    <h1>Welcome Back!</h1>
    <p>Discover the latest Samsung products & exclusive offers</p>
</div>

<!-- Product Section -->
<div class="products">

    <div class="card">
        <h3>Galaxy S Series</h3>
        <p>Powerful smartphones with stunning display</p>
        <button>Shop Now</button>
    </div>

    <div class="card">
        <h3>Smart TVs</h3>
        <p>Experience cinematic visuals at home</p>
        <button>Shop Now</button>
    </div>

    <div class="card">
        <h3>Galaxy Watch</h3>
        <p>Smart fitness & lifestyle companion</p>
        <button>Shop Now</button>
    </div>

    <div class="card">
        <h3>Home Appliances</h3>
        <p>Smart solutions for modern living</p>
        <button>Shop Now</button>
    </div>

</div>

<!-- Footer -->
<div class="footer">
    © 2025 Samsung Store | All Rights Reserved
</div>

</body>
</html>
