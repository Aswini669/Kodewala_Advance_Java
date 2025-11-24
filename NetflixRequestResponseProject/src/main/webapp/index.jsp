<!DOCTYPE html>
<html>
<head>
<title>Netflix - Home</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", sans-serif;
        background: linear-gradient(180deg, #000000, #1a1a1a, #000000);
        color: white;
        text-align: center;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeBg 6s infinite alternate ease-in-out;
    }

    @keyframes fadeBg {
        0% { background-color: #000; }
        100% { background-color: #111; }
    }

    .container {
        animation: fadeIn 1.5s ease-out;
    }

    h2 {
        font-size: 40px;
        letter-spacing: 2px;
        color: #e50914;   /* Netflix red */
        animation: slideDown 1.5s ease-out;
    }

    a.button {
        display: inline-block;
        margin-top: 20px;
        padding: 12px 30px;
        background-color: #e50914;
        color: white;
        text-decoration: none;
        border-radius: 30px;
        font-size: 20px;
        font-weight: bold;
        letter-spacing: 1px;
        transition: 0.3s ease-in-out;
        animation: popIn 2s ease-out;
    }

    a.button:hover {
        background-color: #b00610;
        transform: scale(1.08);
        box-shadow: 0 0 20px red;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: scale(0.95); }
        to { opacity: 1; transform: scale(1); }
    }

    @keyframes slideDown {
        from { opacity: 0; transform: translateY(-20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    @keyframes popIn {
        0% { opacity: 0; transform: scale(0.5); }
        100% { opacity: 1; transform: scale(1); }
    }
</style>

</head>
<body>

<div class="container">
    <h2>Welcome To Netflix</h2>
    <a href="profile" class="button">Create Profile</a>
</div>

</body>
</html>
