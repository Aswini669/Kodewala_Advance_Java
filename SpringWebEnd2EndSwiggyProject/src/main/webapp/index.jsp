<!DOCTYPE html>
<html>
<head>
    <title>Order Management</title>

    <style>
        /* -------------------------------------------------------- */
        /*  ANIMATED BACKGROUND (Neon Theme)                       */
        /* -------------------------------------------------------- */
        body {
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: Poppins, Arial, sans-serif;

            background: linear-gradient(-45deg, 
                        #00c6ff, #0072ff, 
                        #42e695, #3bb2b8);
            background-size: 400% 400%;
            animation: gradientBG 10s ease infinite;
        }

        @keyframes gradientBG {
            0% { background-position: 0% 50%; }
            50% { background-position: 100% 50%; }
            100% { background-position: 0% 50%; }
        }


        /* -------------------------------------------------------- */
        /* CARD SECTION WITH ANIMATION                              */
        /* -------------------------------------------------------- */
        .container {
            background: rgba(255, 255, 255, 0.85);
            padding: 45px 70px;
            border-radius: 20px;
            text-align: center;
            box-shadow: 0 10px 25px rgba(0,0,0,0.25);

            /* Fade + Smooth Up Animation */
            animation: floatIn 1.5s ease;
        }

        @keyframes floatIn {
            from { opacity: 0; transform: translateY(30px); }
            to   { opacity: 1; transform: translateY(0); }
        }


        /* -------------------------------------------------------- */
        /* HEADING STYLE                                            */
        /* -------------------------------------------------------- */
        h2 {
            margin-bottom: 25px;
            font-size: 34px;
            color: #003f5c;
            font-weight: 600;
            letter-spacing: 1px;
        }


        /* -------------------------------------------------------- */
        /* BEAUTIFUL ANIMATED BUTTON                                */
        /* -------------------------------------------------------- */
        .btn {
            text-decoration: none;
            padding: 14px 32px;
            font-size: 18px;
            color: white;
            background: #0072ff;
            border-radius: 10px;
            transition: 0.3s;
            box-shadow: 0 0 10px #0072ff,
                        0 0 20px #0072ff;
        }

        .btn:hover {
            background: #0055c4;
            transform: translateY(-4px);
            box-shadow: 0 0 20px #00c6ff,
                        0 0 35px #00c6ff;
        }

    </style>
</head>

<body>

    <div class="container">
        <h2>Order Management</h2>
        <a href="orderPage" class="btn">Show Order Page</a>
    </div>

</body>
</html>
