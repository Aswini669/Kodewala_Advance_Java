<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Created</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
        background: #000;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        color: white;
        overflow: hidden;
    }

    /* --- MOVIE SLIDER BACKGROUND --- */
    .movie-slider {
        position: absolute;
        top: 0;
        left: 0;
        width: 250%;
        height: 100%;
        display: flex;
        animation: slide 18s linear infinite;
        opacity: 0.18;
        filter: blur(3px);
    }

    .movie-slider img {
        width: 250px;
        height: 380px;
        margin: 20px;
        border-radius: 12px;
        object-fit: cover;
        box-shadow: 0 0 10px rgba(255, 0, 0, 0.4);
    }

    @keyframes slide {
        0%   { transform: translateX(0); }
        100% { transform: translateX(-50%); }
    }

    /* Fade + Scale Animation */
    @keyframes popup {
        0%   { opacity: 0; transform: scale(0.7); }
        100% { opacity: 1; transform: scale(1); }
    }

    .box {
        width: 430px;
        padding: 35px;
        background: rgba(255, 255, 255, 0.08);
        border-radius: 15px;
        backdrop-filter: blur(15px);
        text-align: center;
        z-index: 10;
        box-shadow: 0 0 25px rgba(255, 0, 0, 0.45);
        animation: popup 0.7s ease-out;
    }

    h1 {
        color: #e50914;
        text-shadow: 0 0 10px rgba(255, 0, 0, 0.6);
        margin-bottom: 15px;
    }

    .userid {
        font-size: 22px;
        margin-top: 15px;
        font-weight: bold;
        color: #fff;
        text-shadow: 0 0 6px rgba(255, 0, 0, 0.5);
    }

    .userid span {
        color: #e50914;
        font-size: 24px;
    }

    a {
        display: inline-block;
        margin-top: 25px;
        padding: 12px 20px;
        background: #e50914;
        color: white;
        text-decoration: none;
        border-radius: 8px;
        font-size: 16px;
        transition: 0.3s ease-in-out;
    }

    a:hover {
        background: #b20710;
        transform: scale(1.05);
    }
</style>

</head>
<body>

<!-- 🎥 MOVIE SLIDER BACKGROUND -->
<div class="movie-slider">
    <img src="https://m.media-amazon.com/images/I/81p5CXV6SPL._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/71niXI3lxlL._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/71c05lTE03L._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/81j2Vx5gJ-L._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/61OUGpUfAyL._AC_UF894,1000_QL80_.jpg">

    <!-- Duplicate for infinite loop -->
    <img src="https://m.media-amazon.com/images/I/81p5CXV6SPL._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/71niXI3lxlL._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/71c05lTE03L._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/81j2Vx5gJ-L._AC_UF894,1000_QL80_.jpg">
    <img src="https://m.media-amazon.com/images/I/61OUGpUfAyL._AC_UF894,1000_QL80_.jpg">
</div>

<!-- SUCCESS BOX -->
<div class="box">
    <h1>Profile Created Successfully 🎉</h1>

    <div class="userid">
        Your Generated User ID:<br>
        <span>${userID}</span>
    </div>

    <a href="home">Go to Home</a>
</div>

</body>
</html>
