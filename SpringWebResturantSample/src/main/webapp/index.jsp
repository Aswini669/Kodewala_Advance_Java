<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hey Foodies</title>
    <style>
        body {
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #ff7e5f, #feb47b);
        }

        .container {
            background: #fff;
            padding: 40px 60px;
            border-radius: 12px;
            box-shadow: 0 12px 25px rgba(0,0,0,0.25);
            text-align: center;

            /* 🎬 Fade + Slide-Up */
            animation: fadeSlideUp 1s ease-out forwards;
        }

        h2 {
            margin-bottom: 25px;
            color: #333;
        }

        a {
            display: inline-block;
            margin: 10px;
            padding: 12px 30px;
            text-decoration: none;
            color: white;
            border-radius: 25px;
            font-weight: bold;
        }

        .login { background: #ff5722; }
        .logout { background: #607d8b; }

        @keyframes fadeSlideUp {
            from {
                opacity: 0;
                transform: translateY(40px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>🍔 Hey Foodies 🍕</h2>
        <a href="login" class="login">LOGIN</a>
        <a href="logout" class="logout">LOGOUT</a>
    </div>

</body>
</html>
