<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>AJIO Shop</title>
    <style>
        body {
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #0f172a; /* AJIO dark blue */
            font-family: "Segoe UI", Arial, sans-serif;
        }

        .card {
            background-color: #111827;
            padding: 45px 35px;
            border-radius: 14px;
            width: 320px;
            text-align: center;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.6);
        }

        h2 {
            color: #ffffff;
            letter-spacing: 1px;
            margin-bottom: 10px;
        }

        p {
            color: #9ca3af;
            font-size: 14px;
            margin-bottom: 30px;
        }

        a {
            display: block;
            padding: 14px;
            margin: 12px 0;
            text-decoration: none;
            border-radius: 30px;
            font-weight: 600;
            transition: all 0.3s ease;
        }

        .login {
            background: #2563eb;
            color: white;
        }

        .login:hover {
            background: #1d4ed8;
            transform: translateY(-2px);
        }

        .logout {
            border: 2px solid #ef4444;
            color: #ef4444;
            background: transparent;
        }

        .logout:hover {
            background: #ef4444;
            color: white;
        }
    </style>
</head>
<body>

    <div class="card">
        <h2>AJIO SHOP</h2>
        <p>Trendy fashion. Premium brands.</p>

        <a href="login" class="login">LOGIN</a>
        <a href="logout" class="logout">LOGOUT</a>
    </div>

</body>
</html>
