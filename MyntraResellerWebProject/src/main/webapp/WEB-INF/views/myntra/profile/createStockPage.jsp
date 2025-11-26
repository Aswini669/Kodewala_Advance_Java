<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Stock</title>

<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: "Poppins", sans-serif;
}

body {
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    background: linear-gradient(45deg, #43cea2, #185a9d, #ff512f, #f09819);
    background-size: 400% 400%;
    animation: bgMove 12s ease infinite;
}

/* Background Animation */
@keyframes bgMove {
    0% { background-position: 0% 50%; }
    50% { background-position: 100% 50%; }
    100% { background-position: 0% 50%; }
}

/* Glass Box */
.form-box {
    background: rgba(255, 255, 255, 0.2);
    padding: 40px 50px;
    border-radius: 20px;
    backdrop-filter: blur(12px);
    box-shadow: 0 0 25px rgba(0,0,0,0.2);
    text-align: center;
    width: 360px;
    animation: fadeIn 1.5s ease;
}

/* Fade in animation */
@keyframes fadeIn {
    0% { opacity: 0; transform: translateY(-20px) scale(0.95); }
    100% { opacity: 1; transform: translateY(0) scale(1); }
}

h1 {
    color: #fff;
    margin-bottom: 25px;
    text-shadow: 2px 2px 4px #000;
}

/* Input Styling */
input[type="text"] {
    width: 100%;
    padding: 12px;
    margin-bottom: 20px;
    border: none;
    border-radius: 10px;
    font-size: 17px;
    outline: none;
    box-shadow: 0 0 10px rgba(255,255,255,0.3);
}

/* Submit Button */
input[type="submit"] {
    width: 100%;
    padding: 12px;
    background: #fff;
    color: #333;
    border: none;
    border-radius: 10px;
    font-size: 18px;
    cursor: pointer;
    font-weight: bold;
    transition: 0.3s ease-in-out;
    box-shadow: 0 4px 12px rgba(255,255,255,0.4);
}

input[type="submit"]:hover {
    background: #111;
    color: #fff;
    transform: scale(1.08);
    box-shadow: 0 4px 18px rgba(0,0,0,0.4);
}

/* Back Button */
a {
    display: inline-block;
    margin-top: 20px;
    padding: 10px 18px;
    background: rgba(255,255,255,0.8);
    color: #333;
    text-decoration: none;
    font-weight: bold;
    border-radius: 10px;
    transition: 0.3s ease;
    box-shadow: 0 4px 10px rgba(255,255,255,0.3);
}

a:hover {
    background: #111;
    color: #fff;
    transform: scale(1.1);
}
</style>

</head>
<body>

<div class="form-box">
    <h1>Add Stock</h1>

    <form action="addStock" method="post">
        <input type="text" name="stock" placeholder="Enter Product Name">
        <input type="submit" value="Add Stock">
    </form>

    <a href="home">⬅ Go Back</a>
</div>

</body>
</html>
