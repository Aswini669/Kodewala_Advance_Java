<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #8BC34A, #4CAF50);
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: white;
        padding: 40px 50px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0 4px 15px rgba(0,0,0,0.2);
        width: 350px;
        animation: fadeIn 0.7s ease;
    }

    h2 {
        margin-bottom: 25px;
        color: #2e7d32;
        font-size: 28px;
    }

    .login-btn {
        padding: 12px 30px;
        background-color: #4CAF50;
        color: white;
        border: none;
        outline: none;
        font-size: 18px;
        border-radius: 8px;
        cursor: pointer;
        transition: 0.3s;
        width: 100%;
    }

    .login-btn:hover {
        background-color: #388E3C;
        transform: scale(1.05);
        box-shadow: 0px 3px 10px rgba(0,0,0,0.3);
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(-20px); }
        to   { opacity: 1; transform: translateY(0); }
    }
</style>
</head>

<body>

<div class="card">
    <h2>Welcome</h2>
    <form action="showLogin" method="post">
        <button type="submit" class="login-btn">Login</button>
    </form>
</div>

</body>
</html>
