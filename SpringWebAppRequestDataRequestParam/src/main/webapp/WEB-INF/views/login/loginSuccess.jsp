<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #e8f5e9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .success-container {
        background: white;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0px 0px 10px #aaa;
        width: 350px;
        text-align: center;
    }

    h2 {
        color: #2e7d32;
        margin-bottom: 15px;
        font-size: 28px;
    }

    p {
        font-size: 18px;
        color: #444;
    }

    .btn {
        margin-top: 20px;
        padding: 12px 20px;
        background: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #45a049;
    }
</style>

</head>
<body>

<div class="success-container">
    <h2>Login Successful</h2>
    <p>Welcome! Your PAN Login was successful.</p>

    <form action="home.jsp">
        <button class="btn" type="submit">Go to Home</button>
    </form>
</div>

</body>
</html>
