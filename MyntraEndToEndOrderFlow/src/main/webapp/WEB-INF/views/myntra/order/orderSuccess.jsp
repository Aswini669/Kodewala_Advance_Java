<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Success</title>

<style>

    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: "Poppins", sans-serif;
    }

    body{
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        background: linear-gradient(120deg,#4e54c8,#8f94fb);
        animation: bgMove 7s infinite alternate ease-in-out;
        overflow:hidden;
        color:white;
        text-align:center;
    }

    @keyframes bgMove {
        0% { background: linear-gradient(120deg,#4e54c8,#8f94fb); }
        100% { background: linear-gradient(120deg,#FF6FD8,#3813C2); }
    }

    /* Floating shapes */
    .shape{
        position:absolute;
        width:120px;
        height:120px;
        background:rgba(255,255,255,0.12);
        border-radius:50%;
        animation: float 8s infinite ease-in-out;
    }
    @keyframes float {
        0%{ transform:translateY(0); }
        50%{ transform:translateY(-30px); }
        100%{ transform:translateY(0); }
    }

    .s1{ top:10%; left:12%; }
    .s2{ bottom:10%; right:15%; animation-delay:2s; }
    .s3{ bottom:20%; left:45%; animation-delay:4s; }

    /* Success card */
    .card{
        background:rgba(255,255,255,0.15);
        padding:40px 50px;
        border-radius:20px;
        backdrop-filter:blur(10px);
        box-shadow:0 0 25px rgba(255,255,255,0.3);
        animation: pop 0.8s ease-in-out;
    }

    @keyframes pop {
        0%{ transform:scale(0.5); opacity:0; }
        100%{ transform:scale(1); opacity:1; }
    }

    h1{
        font-size:38px;
        margin-bottom:15px;
    }

    .order-id{
        background:white;
        color:black;
        padding:10px 20px;
        margin-top:15px;
        display:inline-block;
        border-radius:10px;
        font-weight:bold;
        animation: glow 2s infinite alternate;
    }

    @keyframes glow{
        0%{ box-shadow:0 0 10px white; }
        100%{ box-shadow:0 0 20px yellow; }
    }

</style>
</head>
<body>

<!-- Floating Shapes -->
<div class="shape s1"></div>
<div class="shape s2"></div>
<div class="shape s3"></div>

<!-- Success Card -->
<div class="card">
    <h1>🎉 Order Successfully Placed!</h1>
    <p>Your order has been placed successfully.</p>

    <div class="order-id">
        Order ID: ${orderId}
    </div>
</div>

</body>
</html>
