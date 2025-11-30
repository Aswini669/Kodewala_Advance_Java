<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Place Order</title>

<style>

    /* --------------------- Animated Background --------------------- */
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        font-family: Poppins, Arial, sans-serif;

        background: linear-gradient(-45deg,
                    #ff9a9e, #fad0c4, #a1c4fd, #c2e9fb);
        background-size: 400% 400%;
        animation: bgMove 12s ease infinite;
    }

    @keyframes bgMove {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }


    /* --------------------- Form Container -------------------------- */
    .form-box {
        background: rgba(255, 255, 255, 0.9);
        padding: 35px 55px;
        border-radius: 20px;
        width: 350px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);

        animation: fadeIn 1.2s ease;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(30px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .form-box h2 {
        text-align: center;
        margin-bottom: 20px;
        font-size: 28px;
        color: #333;
    }


    /* --------------------- Input Styles ----------------------------- */
    .input-field {
        width: 100%;
        padding: 12px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 10px;
        font-size: 16px;
        outline: none;
        transition: 0.3s;
    }

    .input-field:focus {
        border-color: #6a11cb;
        box-shadow: 0 0 8px #6a11cb;
    }


    /* --------------------- Submit Button ---------------------------- */
    .btn {
        width: 100%;
        padding: 12px;
        background: #6a11cb;
        color: white;
        border: none;
        border-radius: 10px;
        font-size: 18px;
        cursor: pointer;
        transition: 0.3s;
        box-shadow: 0 4px 12px rgba(0,0,0,0.2);
    }

    .btn:hover {
        background: #5211a0;
        transform: translateY(-3px);
        box-shadow: 0 6px 20px rgba(0,0,0,0.25);
    }

</style>
</head>


<body>

    <div class="form-box">
        <h2>Place Order</h2>

        <form action="placeOrder" method="post">
            <input type="text" class="input-field" name="prodName" placeholder="Product Name">

            <input type="text" class="input-field" name="qty" placeholder="Product Quantity">

            <input type="text" class="input-field" name="price" placeholder="Product Price">

            <input type="text" class="input-field" name="address" placeholder="Delivery Address">

            <button type="submit" class="btn">Place Order</button>
        </form>
    </div>

</body>
</html>
