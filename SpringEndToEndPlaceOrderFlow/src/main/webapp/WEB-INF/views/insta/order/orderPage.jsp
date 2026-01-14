<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Place Order | Instamart</title>

<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #e8f5e9, #f1f8e9);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    /* Card */
    .order-card {
        background: #ffffff;
        width: 420px;
        padding: 35px;
        border-radius: 18px;
        box-shadow: 0 15px 40px rgba(0,0,0,0.15);
        animation: slideUp 0.9s ease;
    }

    @keyframes slideUp {
        from {
            opacity: 0;
            transform: translateY(60px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }

    .order-card h2 {
        text-align: center;
        color: #2e7d32;
        margin-bottom: 25px;
    }

    .form-group {
        margin-bottom: 15px;
    }

    .form-group label {
        display: block;
        font-weight: 600;
        margin-bottom: 6px;
        color: #444;
    }

    .form-group input {
        width: 100%;
        padding: 10px 12px;
        border-radius: 8px;
        border: 1px solid #ccc;
        font-size: 14px;
        transition: all 0.3s ease;
    }

    .form-group input:focus {
        outline: none;
        border-color: #2e7d32;
        box-shadow: 0 0 6px rgba(46, 125, 50, 0.4);
    }

    /* Button */
    .btn {
        width: 100%;
        padding: 14px;
        background: linear-gradient(135deg, #2e7d32, #66bb6a);
        color: white;
        font-size: 16px;
        font-weight: bold;
        border: none;
        border-radius: 30px;
        cursor: pointer;
        transition: transform 0.3s ease, box-shadow 0.3s ease;
    }

    .btn:hover {
        transform: translateY(-3px);
        box-shadow: 0 10px 20px rgba(46, 125, 50, 0.4);
    }

    /* Small animation */
    .btn:active {
        transform: scale(0.96);
    }

    .note {
        text-align: center;
        font-size: 13px;
        margin-top: 15px;
        color: #777;
    }
</style>
</head>

<body>

<div class="order-card">
    <h2>🛒 Place Your Order</h2>

    <form action="placeOrder" method="post">

        <div class="form-group">
            <label>Item Name</label>
            <input type="text" name="itemName" placeholder="Enter item name" required>
        </div>

        <div class="form-group">
            <label>Quantity</label>
            <input type="number" name="qty" placeholder="Enter quantity" required>
        </div>

        <div class="form-group">
            <label>Price</label>
            <input type="number" name="price" placeholder="Enter price" required>
        </div>

        <div class="form-group">
            <label>Delivery Address</label>
            <input type="text" name="address" placeholder="Enter delivery address" required>
        </div>

        <input type="submit" value="Place Order" class="btn">

    </form>

    <div class="note">
        Fast • Fresh • Reliable 🚀
    </div>
</div>

</body>
</html>
