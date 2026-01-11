<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJIO – Online Shopping</title>

<style>
    body {
        margin: 0;
        font-family: "Segoe UI", Arial, sans-serif;
        background-color: #f5f5f5;
    }

    /* Header */
    .header {
        background-color: #2c2c2c;
        color: white;
        padding: 15px 40px;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .logo {
        font-size: 26px;
        font-weight: bold;
        letter-spacing: 2px;
    }

    .nav a {
        color: white;
        margin-left: 25px;
        text-decoration: none;
        font-size: 15px;
    }

    .nav a:hover {
        text-decoration: underline;
    }

    /* Banner */
    .banner {
        background: linear-gradient(to right, #000000, #434343);
        color: white;
        padding: 60px;
        text-align: center;
    }

    .banner h1 {
        font-size: 42px;
        margin-bottom: 10px;
    }

    .banner p {
        font-size: 18px;
        margin-bottom: 25px;
    }

    .banner a {
        background-color: #ff3f6c;
        color: white;
        padding: 12px 30px;
        border-radius: 4px;
        text-decoration: none;
        font-weight: bold;
    }

    .banner a:hover {
        background-color: #e6365f;
    }

    /* Categories */
    .categories {
        padding: 40px;
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
        gap: 25px;
    }

    .card {
        background: white;
        padding: 25px;
        text-align: center;
        border-radius: 6px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
        transition: transform 0.2s;
    }

    .card:hover {
        transform: translateY(-5px);
    }

    .card h3 {
        margin-bottom: 10px;
        color: #333;
    }

    .card p {
        color: #777;
        font-size: 14px;
    }

    /* Footer */
    .footer {
        background-color: #2c2c2c;
        color: #bbb;
        text-align: center;
        padding: 20px;
        font-size: 14px;
    }
</style>
</head>

<body>

<!-- Header -->
<div class="header">
    <div class="logo">AJIO</div>
    <div class="nav">
        <a href="#">MEN</a>
        <a href="#">WOMEN</a>
        <a href="#">KIDS</a>
        <a href="showProfile">MY ACCOUNT</a>
    </div>
</div>

<!-- Banner -->
<div class="banner">
    <h1>Big Fashion Sale</h1>
    <p>Up to 70% off on top brands</p>
    <a href="#">SHOP NOW</a>
</div>

<!-- Categories -->
<div class="categories">
    <div class="card">
        <h3>Men's Wear</h3>
        <p>Trendy shirts, jeans & footwear</p>
    </div>

    <div class="card">
        <h3>Women's Wear</h3>
        <p>Ethnic, western & fusion styles</p>
    </div>

    <div class="card">
        <h3>Kids Fashion</h3>
        <p>Fun styles for all age groups</p>
    </div>

    <div class="card">
        <h3>Accessories</h3>
        <p>Bags, watches & more</p>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    © 2026 AJIO.com | All Rights Reserved
</div>

</body>
</html>
