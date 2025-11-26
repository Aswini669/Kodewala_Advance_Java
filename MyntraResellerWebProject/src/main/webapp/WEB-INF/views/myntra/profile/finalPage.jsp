<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Myntra Re-Seller Dashboard</title>

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
	animation: bgAnimation 12s ease infinite;
	animation: fadeInPage 1.3s ease;
}

/* BACKGROUND ANIMATION */
@keyframes bgAnimation {
	0% { background-position: 0% 50%; }
	50% { background-position: 100% 50%; }
	100% { background-position: 0% 50%; }
}

/* PAGE FADE-IN */
@keyframes fadeInPage {
	0% { opacity: 0; transform: scale(0.95); }
	100% { opacity: 1; transform: scale(1); }
}

/* DASHBOARD BOX */
.dashboard-box {
	background: rgba(255, 255, 255, 0.18);
	padding: 40px;
	width: 420px;
	text-align: center;
	border-radius: 22px;
	backdrop-filter: blur(12px);
	box-shadow: 0 0 35px rgba(0, 0, 0, 0.25);
	animation: boxFade 1.5s ease;
	position: relative;
	overflow: hidden;
}

/* Border Glow Animation */
.dashboard-box::before {
	content: "";
	position: absolute;
	top: -2px;
	left: -2px;
	right: -2px;
	bottom: -2px;
	background: linear-gradient(120deg, #ff00cc, #3333ff, #00e1ff);
	z-index: -1;
	filter: blur(20px);
	animation: glow 4s linear infinite;
}

@keyframes glow {
	0% { transform: rotate(0deg); }
	100% { transform: rotate(360deg); }
}

@keyframes boxFade {
	0% { opacity: 0; transform: translateY(-20px); }
	100% { opacity: 1; transform: translateY(0); }
}

h2 {
	font-size: 35px;
	color: #fff;
	margin-bottom: 25px;
	letter-spacing: 1px;
	text-shadow: 1px 1px 3px #000;
	font-weight: bold;
}

/* BUTTON STYLE */
a {
	display: block;
	text-decoration: none;
	color: #333;
	background: #ffffff;
	padding: 14px;
	margin: 14px 0;
	border-radius: 14px;
	font-size: 18px;
	font-weight: bold;
	transition: 0.3s ease-in-out;
	box-shadow: 0px 4px 14px rgba(255, 255, 255, 0.3);
}

/* Hover Animation */
a:hover {
	background: #111;
	color: #fff;
	transform: scale(1.12);
	box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.4);
	letter-spacing: 1px;
}
</style>

</head>
<body>

	<div class="dashboard-box">

		<h2>Myntra Re-Seller</h2>

		<a href="createStock">➕ Create Stock</a> 
		<a href="updateStock">✏️ Update Stock</a>
		<a href="deleteStock">🗑️ Delete Stock</a>
		<a href="viewStock">📦 View Stock</a>

	</div>

</body>
</html>
