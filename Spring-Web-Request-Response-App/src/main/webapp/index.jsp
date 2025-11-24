<!DOCTYPE html>
<html>
<head>
<title>Goibibo - Travel Made Easy</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", sans-serif;
        background: linear-gradient(135deg, #ffffff, #e3edff);
    }

    .header {
        background: #0b4fc4;
        padding: 18px;
        text-align: center;
        color: white;
        font-size: 28px;
        font-weight: 700;
        letter-spacing: 1px;
        position: sticky;
        top: 0;
        z-index: 1000;
        box-shadow: 0 2px 12px rgba(0,0,0,0.15);
    }

    .hero-section {
        margin-top: 50px;
        text-align: center;
        animation: fadeIn 1.3s ease-in-out;
    }

    .hero-section img {
        width: 120px;
        opacity: 0.95;
    }

    .card {
        width: 450px;
        margin: 25px auto;
        background: white;
        padding: 35px;
        border-radius: 14px;
        box-shadow: 0 6px 18px rgba(0,0,0,0.12);
        animation: slideIn 1s ease-out;
    }

    h2 {
        color: #0b4fc4;
        font-size: 26px;
        margin-bottom: 12px;
    }

    p {
        color: #444;
        font-size: 17px;
        margin-bottom: 25px;
    }

    a.button {
        background: #0b4fc4;
        color: white;
        padding: 14px 30px;
        font-size: 18px;
        border-radius: 30px;
        text-decoration: none;
        display: inline-block;
        transition: 0.3s ease;
        font-weight: 600;
        letter-spacing: 0.5px;
    }

    a.button:hover {
        background: #083a93;
        transform: translateY(-3px);
        box-shadow: 0 4px 12px rgba(0,0,0,0.2);
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    @keyframes slideIn {
        from { opacity: 0; transform: translateY(25px); }
        to { opacity: 1; transform: translateY(0); }
    }
</style>
</head>

<body>

<div class="header">Goibibo</div>

<div class="hero-section">
    <img src="https://cdn-icons-png.flaticon.com/512/69/69906.png" alt="Travel Icon">
</div>

<div class="card">
    <h2>Plan Your Travel Smoothly</h2>
    <p>Discover flights, hotels, and exclusive deals crafted for your perfect trip!</p>

    <a href="profile" class="button">Get Started</a>
</div>

</body>
</html>
