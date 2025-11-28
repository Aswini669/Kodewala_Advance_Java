<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Order Home</title>

<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: "Poppins", sans-serif;
    }

    body {
        height: 100vh;
        overflow: hidden;
        background: linear-gradient(120deg, #4e54c8, #8f94fb);
        animation: gradientMove 8s infinite alternate ease-in-out;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    @keyframes gradientMove {
        0% { background: linear-gradient(120deg, #4e54c8, #8f94fb); }
        100% { background: linear-gradient(120deg, #FF6FD8, #3813C2); }
    }

    /* Floating Shapes */
    .shape {
        position: absolute;
        width: 120px;
        height: 120px;
        background: rgba(255,255,255,0.15);
        border-radius: 50%;
        animation: float 8s infinite ease-in-out;
    }

    @keyframes float {
        0% { transform: translateY(0); }
        50% { transform: translateY(-30px); }
        100% { transform: translateY(0); }
    }

    .s1 { top: 15%; left: 10%; animation-delay: 0s; }
    .s2 { top: 60%; right: 15%; animation-delay: 2s; }
    .s3 { bottom: 10%; left: 45%; animation-delay: 4s; }

    /* Navbar */
    .navbar {
        position: fixed;
        top: 0;
        width: 100%;
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 15px 50px;
        color: #fff;
        background: rgba(255,255,255,0.10);
        backdrop-filter: blur(10px);
        z-index: 10;
    }

    .logo {
        font-size: 28px;
        font-weight: 700;
        letter-spacing: 1px;
    }

    .nav-links a {
        margin-left: 25px;
        color: white;
        text-decoration: none;
        font-size: 16px;
        transition: 0.3s;
    }

    .nav-links a:hover {
        color: yellow;
    }

    /* Main Container */
    .container {
        text-align: center;
        padding: 40px 50px;
        background: rgba(255, 255, 255, 0.12);
        border-radius: 20px;
        box-shadow: 0 0 20px rgba(255,255,255,0.2);
        backdrop-filter: blur(12px);
    }

    h2 {
        font-size: 36px;
        margin-bottom: 20px;
    }

    a.btn {
        text-decoration: none;
        background: #fff;
        padding: 12px 30px;
        border-radius: 30px;
        color: #333;
        font-weight: bold;
        font-size: 18px;
        transition: 0.3s;
    }

    a.btn:hover {
        background: #000;
        color: #fff;
        transform: scale(1.1);
        box-shadow: 0 0 15px white;
    }
</style>
</head>

<body>

<!-- Floating Shapes -->
<div class="shape s1"></div>
<div class="shape s2"></div>
<div class="shape s3"></div>

<!-- Navbar -->
<div class="navbar">
    <div class="logo">⭐ OrderFlow</div>
    <div class="nav-links">
        <a href="#">Home</a>
        <a href="orderPage">Orders</a>
        <a href="#">Products</a>
        <a href="#">Profile</a>
    </div>
</div>

<!-- Main Content -->
<div class="container">
    <h2>Order Management</h2>
    <a href="orderPage" class="btn">Go to Orders</a>
</div>

</body>
</html>
