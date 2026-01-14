<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Instamart Home</title>

    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f6fff8, #e9f5ee);
        }

        /* Navbar */
        .navbar {
            background-color: #2e7d32;
            padding: 15px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            color: white;
        }

        .navbar h2 {
            margin: 0;
            font-size: 26px;
            letter-spacing: 1px;
        }

        .navbar a {
            text-decoration: none;
            color: white;
            font-weight: 500;
            margin-left: 25px;
        }

        .navbar a:hover {
            text-decoration: underline;
        }

        /* Hero Section */
        .hero {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 60px 80px;
        }

        .hero-text {
            max-width: 500px;
        }

        .hero-text h1 {
            font-size: 42px;
            color: #1b5e20;
            margin-bottom: 15px;
        }

        .hero-text p {
            font-size: 18px;
            color: #4f4f4f;
            line-height: 1.6;
        }

        .hero-text a {
            display: inline-block;
            margin-top: 25px;
            padding: 14px 30px;
            background-color: #2e7d32;
            color: white;
            text-decoration: none;
            font-size: 16px;
            border-radius: 30px;
            transition: background 0.3s ease;
        }

        .hero-text a:hover {
            background-color: #1b5e20;
        }

        /* Image */
        .hero img {
            width: 420px;
            border-radius: 20px;
            box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.15);
        }

        /* Footer */
        footer {
            text-align: center;
            padding: 15px;
            background-color: #2e7d32;
            color: white;
            margin-top: 40px;
        }
    </style>
</head>

<body>

    <!-- Navbar -->
    <div class="navbar">
        <h2>Instamart</h2>
        <div>
            <a href="#">Home</a>
            <a href="showOrder">Orders</a>
            <a href="#">Profile</a>
            <a href="#">Logout</a>
        </div>
    </div>

    <!-- Hero Section -->
    <div class="hero">
        <div class="hero-text">
            <h1>Groceries Delivered in Minutes</h1>
            <p>
                Fresh fruits, vegetables, daily essentials, and more – delivered to your
                doorstep at lightning speed. Shop smarter with Instamart.
            </p>
            <a href="showOrder">Show Order Page</a>
        </div>

        <img src="https://images.unsplash.com/photo-1542838132-92c53300491e"
             alt="Groceries">
    </div>

    <!-- Footer -->
    <footer>
        © 2026 Instamart | Fast • Fresh • Reliable
    </footer>

</body>
</html>
