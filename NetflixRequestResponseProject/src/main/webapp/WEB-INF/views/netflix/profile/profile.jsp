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
        background: linear-gradient(135deg, #000000, #1f1f1f);
        color: white;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        overflow: hidden;
    }

    /* Fade + Slide Animation */
    @keyframes fadeSlide {
        0% { opacity: 0; transform: translateY(40px); }
        100% { opacity: 1; transform: translateY(0); }
    }

    .box {
        background: rgba(255, 255, 255, 0.08);
        padding: 40px;
        width: 380px;
        border-radius: 15px;
        box-shadow: 0 0 20px rgba(255, 0, 0, 0.3);
        backdrop-filter: blur(10px);
        animation: fadeSlide 0.9s ease-out;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #e50914;
        text-shadow: 0 0 5px rgba(255, 0, 0, 0.6);
    }

    .field {
        margin-bottom: 15px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-size: 14px;
    }

    input {
        width: 94%;
        padding: 10px;
        border-radius: 8px;
        border: none;
        outline: none;
        font-size: 15px;
        transition: 0.3s ease-in-out;
    }

    input:focus {
        box-shadow: 0 0 8px #e50914;
        transform: scale(1.02);
    }

    .btn {
        margin-top: 10px;
        width: 100%;
        padding: 12px;
        background: #e50914;
        border: none;
        border-radius: 8px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        transition: 0.3s ease;
    }

    .btn:hover {
        background: #b20710;
        transform: scale(1.03);
    }
</style>

</head>
<body>

<div class="box">
    <h2>Create Your Netflix Profile</h2>

    <form action="createProfile" method="post">

        <div class="field">
            <label>First Name</label>
            <input type="text" name="firstName">
        </div>

        <div class="field">
            <label>Last Name</label>
            <input type="text" name="lastName">
        </div>

        <div class="field">
            <label>Email</label>
            <input type="text" name="email">
        </div>

        <div class="field">
            <label>Mobile</label>
            <input type="text" name="mobile">
        </div>

        <div class="field">
            <label>Password</label>
            <input type="password" name="password">
        </div>

        <div class="field">
            <label>Confirm Password</label>
            <input type="password" name="confirmPassword">
        </div>

        <button class="btn" type="submit">CREATE PROFILE</button>

    </form>
</div>

</body>
</html>
