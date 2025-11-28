<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Info</title>

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
        background: linear-gradient(120deg, #4e54c8, #8f94fb);
        animation: gradientMove 7s infinite alternate ease-in-out;
        overflow: hidden;
    }

    @keyframes gradientMove {
        0% { background: linear-gradient(120deg, #4e54c8, #8f94fb); }
        100% { background: linear-gradient(120deg, #ff6fd8, #3813c2); }
    }

    /* Floating circles */
    .circle {
        position: absolute;
        width: 120px;
        height: 120px;
        background: rgba(255, 255, 255, 0.15);
        border-radius: 50%;
        animation: float 8s infinite ease-in-out;
    }

    @keyframes float {
        0% { transform: translateY(0); }
        50% { transform: translateY(-30px); }
        100% { transform: translateY(0); }
    }

    .c1 { top: 18%; left: 12%; animation-delay: 0s; }
    .c2 { bottom: 15%; right: 10%; animation-delay: 2s; }
    .c3 { bottom: 20%; left: 45%; animation-delay: 4s; }

    /* Form container */
    .form-container {
        background: rgba(255,255,255,0.15);
        padding: 35px 40px;
        border-radius: 20px;
        width: 400px;
        backdrop-filter: blur(10px);
        box-shadow: 0 0 25px rgba(255,255,255,0.3);
        text-align: center;
        color: white;
    }

    h2 {
        margin-bottom: 20px;
        font-size: 30px;
        letter-spacing: 1px;
    }

    input[type="text"] {
        width: 100%;
        padding: 12px;
        margin: 10px 0;
        border-radius: 10px;
        border: none;
        font-size: 16px;
        outline: none;
    }

    input[type="submit"] {
        background: #fff;
        color: #000;
        padding: 12px 20px;
        width: 100%;
        border-radius: 25px;
        margin-top: 15px;
        font-size: 18px;
        font-weight: bold;
        border: none;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: black;
        color: white;
        transform: scale(1.05);
        box-shadow: 0 0 12px white;
    }

</style>

</head>
<body>

<!-- Animated Background Circles -->
<div class="circle c1"></div>
<div class="circle c2"></div>
<div class="circle c3"></div>

<div class="form-container">
   <h2>Order Info</h2>
   <form action="placeOrder" method="post">

      <input type="text" name="itemName" placeholder="Enter Item Name">

      <input type="text" name="qty" placeholder="Enter Quantity">

      <input type="text" name="price" placeholder="Enter Price">

      <input type="text" name="address" placeholder="Enter Address">

      <input type="submit" value="Place Order">

   </form>
</div>

</body>
</html>
