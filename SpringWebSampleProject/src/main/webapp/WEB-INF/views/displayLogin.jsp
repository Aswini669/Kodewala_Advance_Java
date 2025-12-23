<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>

<style>
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #ff3f6c, #ff905a);
        font-family: Arial, sans-serif;
    }

    .card {
        background: white;
        padding: 40px 50px;
        border-radius: 12px;
        width: 350px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
    }

    h2 {
        color: #28a745;
        margin-bottom: 20px;
    }

    input {
        width: 100%;
        padding: 10px;
        margin: 12px 0;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
    }

    button {
        width: 100%;
        padding: 12px;
        margin-top: 15px;
        background-color: #ff3f6c;
        color: white;
        border: none;
        border-radius: 25px;
        font-size: 16px;
        cursor: pointer;
        transition: 0.3s ease;
    }

    button:hover {
        background-color: #e7335c;
    }
</style>
</head>

<body>

<div class="card">
    <h2>Login Successful 🎉</h2>

    <form action="submitDetails" method="post">
        <input type="text" name="name" placeholder="Enter your name" required />
        <input type="email" name="email" placeholder="Enter your email" required />

        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
