<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login Form</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .login-box {
        background: #fff;
        padding: 25px;
        width: 320px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.15);
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }

    input {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    button {
        width: 100%;
        padding: 10px;
        background: #4CAF50;
        border: none;
        color: white;
        margin-top: 10px;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }

    button:hover {
        background: #45a049;
    }

    .logout-btn {
        background: #e53935;
    }
    .logout-btn:hover {
        background: #d32f2f;
    }
</style>
</head>

<body>

<div class="login-box">
    <h2>Login</h2>

    <form action="login" method="post">
        <input type="text" name="username" placeholder="Enter Username" required>
        <input type="password" name="password" placeholder="Enter Password" required>
        <button type="submit">Login</button>
    </form>

    <form action="logout" method="post">
        <button class="logout-btn" type="submit">Logout</button>
    </form>
</div>

</body>
</html>
