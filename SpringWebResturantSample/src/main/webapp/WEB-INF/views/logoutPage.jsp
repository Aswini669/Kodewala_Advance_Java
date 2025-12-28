<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        font-family: 'Segoe UI', Arial, sans-serif;
        background: linear-gradient(135deg, #607d8b, #455a64);
    }

    .logout-box {
        background: #ffffff;
        padding: 45px 55px;
        border-radius: 14px;
        box-shadow: 0 15px 30px rgba(0,0,0,0.3);
        text-align: center;

        /* 🎬 Fade + Slide-Up */
        animation: fadeSlideUp 0.9s ease-out;
    }

    h2 {
        margin-bottom: 15px;
        color: #333;
        font-size: 28px;
    }

    p {
        margin-bottom: 25px;
        color: #666;
        font-size: 15px;
    }

    a {
        display: inline-block;
        padding: 12px 32px;
        background: #607d8b;
        color: #fff;
        text-decoration: none;
        border-radius: 25px;
        font-weight: bold;
        transition: 0.2s ease;
    }

    a:hover {
        transform: translateY(-2px);
        box-shadow: 0 8px 18px rgba(0,0,0,0.3);
    }

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

<div class="logout-box">
    <h2>👋 Logout Successful</h2>
    <p>You have been logged out safely.</p>
    <a href="login">Login Again</a>
</div>

</body>
</html>
