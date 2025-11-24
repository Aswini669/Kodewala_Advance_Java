<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Profile</title>

<style>

    body {
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
        height: 100vh;
        overflow: hidden;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    /* Gradient animation */
    @keyframes bgMove {
        0%   { background-position: 0% 50%; }
        50%  { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    body::before {
        content: "";
        position: absolute;
        width: 100%;
        height: 100%;
        background: linear-gradient(135deg, #ffe6f2, #ffd6e8, #ffffff);
        background-size: 300% 300%;
        animation: bgMove 8s infinite alternate ease-in-out;
        z-index: -2;
    }

    /* Floating bubble animation */
    .bubble {
        position: absolute;
        border-radius: 50%;
        background: rgba(255, 63, 108, 0.18);
        animation: floatUp 12s infinite ease-in-out;
        filter: blur(3px);
        z-index: -1;
    }

    @keyframes floatUp {
        0%   { transform: translateY(100vh) scale(0.6); opacity: 0.4; }
        50%  { opacity: 0.8; }
        100% { transform: translateY(-20vh) scale(1); opacity: 0; }
    }

    /* Popup form animation */
    @keyframes popIn {
        0%   { opacity: 0; transform: scale(0.6); }
        100% { opacity: 1; transform: scale(1); }
    }

    .form-container {
        width: 450px;
        background: white;
        padding: 35px;
        border-radius: 15px;
        box-shadow: 0px 8px 25px rgba(0,0,0,0.25);
        animation: popIn 0.8s ease-out;
        position: relative;
        z-index: 10;
    }

    h2 {
        text-align: center;
        font-size: 30px;
        color: #ff3f6c;
        margin-bottom: 25px;
        text-shadow: 0 0 10px rgba(255, 63, 108, 0.3);
    }

    label {
        font-weight: 600;
        color: #444;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin: 8px 0 18px 0;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 15px;
        transition: 0.3s;
    }

    input[type="text"]:focus {
        border-color: #ff3f6c;
        box-shadow: 0 0 8px rgba(255, 63, 108, 0.4);
        outline: none;
        transform: scale(1.02);
    }

    .gender-box {
        margin-bottom: 18px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: #ff3f6c;
        color: white;
        border: none;
        font-size: 18px;
        border-radius: 8px;
        cursor: pointer;
        transition: 0.3s ease-in-out;
        box-shadow: 0 6px 14px rgba(255, 63, 108, 0.30);
    }

    input[type="submit"]:hover {
        background: #e1355c;
        transform: scale(1.06);
    }

</style>

</head>
<body>

<!-- Animated bubbles (multiple sizes) -->
<div class="bubble" style="width:80px; height:80px; left:10%; animation-delay:0s;"></div>
<div class="bubble" style="width:120px; height:120px; left:30%; animation-delay:2s;"></div>
<div class="bubble" style="width:70px; height:70px; left:60%; animation-delay:1s;"></div>
<div class="bubble" style="width:100px; height:100px; left:80%; animation-delay:3s;"></div>
<div class="bubble" style="width:50px; height:50px; left:50%; animation-delay:4s;"></div>

<div class="form-container">
    <h2>Create Profile</h2>

    <form action="showProfile" method="post">

        <label>First Name:</label>
        <input type="text" name="firstName">

        <label>Last Name:</label>
        <input type="text" name="lastName">

        <label>Gender:</label>
        <div class="gender-box">
            <input type="radio" name="gender" value="Male"> Male
            <input type="radio" name="gender" value="Female"> Female
            <input type="radio" name="gender" value="Other"> Other
        </div>

        <label>Email:</label>
        <input type="text" name="email">

        <label>Mobile:</label>
        <input type="text" name="mobile">

        <label>Password:</label>
        <input type="text" name="password">

        <label>Confirm Password:</label>
        <input type="text" name="confirmPassword">

        <input type="submit" value="CREATE">

    </form>
</div>

</body>
</html>
