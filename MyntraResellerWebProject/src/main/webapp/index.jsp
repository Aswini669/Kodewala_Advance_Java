<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Myntra - Home</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Poppins", Arial, sans-serif;
        background: linear-gradient(45deg, #ff4e50, #f9d423, #24c6dc, #abecd6);
        background-size: 400% 400%;
        animation: bgAnimation 12s ease infinite;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    @keyframes bgAnimation {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    .container {
        background: rgba(255, 255, 255, 0.15);
        padding: 40px 60px;
        border-radius: 18px;
        text-align: center;
        backdrop-filter: blur(10px);
        box-shadow: 0 0 20px rgba(0,0,0,0.2);
    }

    h2 {
        color: #fff;
        font-size: 32px;
        margin-bottom: 25px;
        text-shadow: 1px 1px 2px #000;
    }

    a {
        display: block;
        margin: 15px 0;
        padding: 12px 20px;
        font-size: 18px;
        background: #ffffff;
        color: #333;
        text-decoration: none;
        border-radius: 8px;
        transition: 0.3s;
        font-weight: 600;
    }

    a:hover {
        background: #333;
        color: #fff;
        transform: scale(1.05);
    }
</style>

</head>
<body>

<div class="container">
    <h2>Myntra — Home</h2>

    <a href="profileCreate">Create Profile</a>
    <a href="profileLogin">Login</a>
</div>

</body>
</html>
