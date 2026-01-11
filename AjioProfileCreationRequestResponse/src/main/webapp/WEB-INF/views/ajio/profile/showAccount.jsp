<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJIO | Create Profile</title>

<style>
    body {
        margin: 0;
        font-family: "Segoe UI", Arial, sans-serif;
        background-color: #f5f5f5;
    }

    /* Header */
    .header {
        background-color: #2c2c2c;
        color: white;
        padding: 15px 40px;
        font-size: 22px;
        font-weight: bold;
        letter-spacing: 2px;
    }

    /* Form Card */
    .container {
        display: flex;
        justify-content: center;
        align-items: center;
        height: calc(100vh - 70px);
    }

    .card {
        background: white;
        width: 420px;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    }

    .card h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    .form-group {
        margin-bottom: 15px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-size: 14px;
        color: #555;
    }

    input {
        width: 100%;
        padding: 10px;
        border-radius: 4px;
        border: 1px solid #ccc;
        font-size: 14px;
    }

    input:focus {
        outline: none;
        border-color: #ff3f6c;
    }

    .btn {
        width: 100%;
        padding: 12px;
        background-color: #ff3f6c;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        margin-top: 10px;
    }

    .btn:hover {
        background-color: #e6365f;
    }

</style>
</head>

<body>

<div class="header">AJIO</div>

<div class="container">
    <div class="card">
        <h2>Create Profile</h2>

        <form action="createProfile" method="post">
            <div class="form-group">
                <label>First Name</label>
                <input type="text" name="firstName" required>
            </div>

            <div class="form-group">
                <label>Last Name</label>
                <input type="text" name="lastName" required>
            </div>

            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email" required>
            </div>

            <div class="form-group">
                <label>Mobile</label>
                <input type="tel" name="mobile" required>
            </div>

            <input type="submit" class="btn" value="CREATE PROFILE">
        </form>
    </div>
</div>

</body>
</html>
