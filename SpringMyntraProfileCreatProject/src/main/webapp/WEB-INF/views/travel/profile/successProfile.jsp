<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Created</title>

<style>
    /* Background Animation */
    body {
        margin: 0;
        font-family: 'Poppins', sans-serif;
        min-height: 100vh;
        background: linear-gradient(-45deg, #ff4b1f, #ff9068, #6a82fb, #fc5c7d);
        background-size: 400% 400%;
        animation: bgAnimation 12s ease infinite;
        padding-bottom: 100px;
    }

    @keyframes bgAnimation {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    /* Center Container */
    .container {
        display: flex;
        justify-content: center;
        margin-top: 40px;
        animation: fadeIn 1.5s ease;
    }

    /* Card Styling */
    .card {
        background: white;
        padding: 35px 50px;
        border-radius: 18px;
        text-align: center;
        box-shadow: 0 8px 25px rgba(0,0,0,0.25);
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h1 {
        color: #4CAF50;
        margin-bottom: 10px;
    }

    .uid {
        font-size: 22px;
        margin-top: 10px;
        padding: 10px 20px;
        background: #f0f0f0;
        border-radius: 8px;
        display: inline-block;
        font-weight: bold;
        animation: pop 0.8s ease;
    }

    @keyframes pop {
        0% { transform: scale(0.5); opacity: 0; }
        100% { transform: scale(1); opacity: 1; }
    }

    a {
        margin-top: 20px;
        display: inline-block;
        padding: 10px 22px;
        background: #4CAF50;
        color: white;
        text-decoration: none;
        border-radius: 8px;
        font-size: 16px;
        transition: 0.3s;
    }

    a:hover {
        background: #45a049;
        transform: scale(1.05);
    }

    /* Product Section */
    .products-title {
        text-align: center;
        font-size: 30px;
        margin-top: 50px;
        color: white;
        font-weight: bold;
        animation: fadeIn 2s ease;
    }

    .product-container {
        display: flex;
        justify-content: center;
        gap: 20px;
        margin-top: 25px;
        flex-wrap: wrap;
        animation: fadeIn 2.5s ease;
    }

    .product-card {
        background: white;
        width: 220px;
        border-radius: 15px;
        padding: 15px;
        text-align: center;
        box-shadow: 0 5px 20px rgba(0,0,0,0.2);
        transition: 0.3s;
        cursor: pointer;
    }

    .product-card:hover {
        transform: scale(1.08);
        box-shadow: 0 10px 30px rgba(0,0,0,0.3);
    }

    .product-card img {
        width: 100%;
        border-radius: 10px;
    }

    .product-name {
        font-size: 18px;
        margin: 10px 0;
        font-weight: bold;
    }

    .product-price {
        color: green;
        font-size: 16px;
        margin-bottom: 10px;
    }
</style>

</head>
<body>

    <!-- Success Message -->
    <div class="container">
        <div class="card">
            <h1>Profile Created Successfully! 🎉</h1>
            <p>Your Generated User ID is:</p>
            <div class="uid">${userID}</div>

            <br><br>
            <a href="home">Go to Home</a>
        </div>
    </div>

    <!-- Demo Products -->
    <div class="products-title">🔥 Recommended Products For You</div>

    <div class="product-container">

        <div class="product-card">
            <img src="https://i.ibb.co/4Z1pL0z/shoe.jpg" alt="Shoe">
            <div class="product-name">Nike Running Shoes</div>
            <div class="product-price">₹2,499</div>
        </div>

        <div class="product-card">
            <img src="https://i.ibb.co/2MtcJ0n/watch.jpg" alt="Watch">
            <div class="product-name">Fastrack Watch</div>
            <div class="product-price">₹1,899</div>
        </div>

        <div class="product-card">
            <img src="https://i.ibb.co/VpPRx24/tshirt.jpg" alt="T-shirt">
            <div class="product-name">Men's Cotton T-Shirt</div>
            <div class="product-price">₹599</div>
        </div>

        <div class="product-card">
            <img src="https://i.ibb.co/6b4b2KC/earphone.jpg" alt="Earphones">
            <div class="product-name">Boat Earphones</div>
            <div class="product-price">₹749</div>
        </div>

    </div>

</body>
</html>
