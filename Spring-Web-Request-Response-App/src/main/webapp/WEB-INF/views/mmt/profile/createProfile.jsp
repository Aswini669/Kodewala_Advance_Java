<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Profile - Goibibo</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", sans-serif;
        background: linear-gradient(135deg, #ffffff, #e3edff);
        text-align: center;
    }

    .header {
        background: #0b4fc4;
        padding: 18px;
        color: white;
        font-size: 26px;
        font-weight: 700;
        letter-spacing: 1px;
        box-shadow: 0 2px 12px rgba(0,0,0,0.2);
    }

    h2 {
        margin-top: 30px;
        color: #0b4fc4;
        font-size: 26px;
        animation: fadeIn 1s ease;
    }

    .form-box {
        width: 420px;
        margin: 35px auto;
        background: white;
        padding: 30px;
        border-radius: 14px;
        box-shadow: 0 6px 18px rgba(0,0,0,0.12);
        text-align: left;
        animation: slideIn 1s ease-out;
    }

    label {
        font-size: 15px;
        color: #333;
        font-weight: 600;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-top: 6px;
        margin-bottom: 18px;
        border: 1px solid #ccd6e0;
        border-radius: 6px;
        font-size: 15px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: #0b4fc4;
        border: none;
        color: white;
        font-size: 18px;
        font-weight: 600;
        border-radius: 30px;
        cursor: pointer;
        transition: 0.3s ease;
        letter-spacing: 0.5px;
    }

    input[type="submit"]:hover {
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

<h2>Create Your Travel Profile</h2>

<div class="form-box">

<form action="showProfile" method="post">

    <label>First Name</label>
    <input type="text" name="firstName" required>

    <label>Last Name</label>
    <input type="text" name="lastName" required>

    <label>Email</label>
    <input type="text" name="email" required>

    <label>Mobile</label>
    <input type="text" name="mobile" required>

    <input type="submit" value="Create Profile">
</form>

</div>

</body>
</html>
