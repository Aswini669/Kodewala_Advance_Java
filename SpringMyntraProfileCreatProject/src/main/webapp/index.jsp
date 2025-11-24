<!DOCTYPE html>
<html>
<head>
<title>Myntra - Home</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #ffe6f2, #ffffff);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        text-align: center;
    }

    /* Header animation */
    @keyframes slideDown {
        from { opacity: 0; transform: translateY(-40px); }
        to   { opacity: 1; transform: translateY(0); }
    }

    /* Button animation */
    @keyframes popUp {
        0%   { opacity: 0; transform: scale(0.6); }
        100% { opacity: 1; transform: scale(1); }
    }

    .container {
        background: white;
        padding: 40px;
        width: 420px;
        border-radius: 15px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.15);
        animation: popUp 0.9s ease-out;
    }

    h2 {
        font-size: 32px;
        color: #ff3f6c;
        margin-bottom: 20px;
        font-weight: bold;
        animation: slideDown 0.9s;
        text-shadow: 0 0 10px rgba(255, 63, 108, 0.3);
    }

    p {
        color: #444;
        font-size: 17px;
        margin-bottom: 25px;
    }

    a.button {
        display: inline-block;
        padding: 12px 25px;
        background: #ff3f6c;
        color: white;
        text-decoration: none;
        font-size: 18px;
        border-radius: 8px;
        transition: 0.3s ease-in-out;
        box-shadow: 0 6px 14px rgba(255, 63, 108, 0.30);
    }

    a.button:hover {
        background: #e1355c;
        transform: scale(1.08);
        box-shadow: 0 10px 18px rgba(255, 63, 108, 0.40);
    }
</style>

</head>
<body>

<div class="container">
    <h2>Welcome to Myntra</h2>
    <p>Your fashion destination for men, women & kids ✨</p>

    <a href="prof" class="button">Create Profile</a>
</div>

</body>
</html>
