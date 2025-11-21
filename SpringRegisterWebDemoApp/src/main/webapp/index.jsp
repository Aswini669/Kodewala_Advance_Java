<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Sign-Off Form</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f0f2f5;
        padding: 30px;
    }

    .container {
        max-width: 450px;
        background: #fff;
        padding: 20px;
        margin: auto;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.2);
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }

    label {
        font-weight: bold;
        display: block;
        margin-bottom: 5px;
        color: #444;
    }

    input, textarea {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        margin-bottom: 15px;
        font-size: 16px;
    }

    input:focus, textarea:focus {
        border-color: #007bff;
        outline: none;
    }

    button {
        width: 100%;
        padding: 12px;
        background: #007bff;
        color: white;
        border: none;
        font-size: 17px;
        border-radius: 6px;
        cursor: pointer;
    }

    button:hover {
        background: #0056b3;
    }
</style>

</head>
<body>

<div class="container">

    <h2>Sign-Off Form</h2>

    <form action="signoff">

        <label>Employee Name:</label>
        <input type="text" name="employeeName" required>

        <label>Department:</label>
        <input type="text" name="department" required>

        <label>Date of Sign-Off:</label>
        <input type="date" name="date" required>

        <label>Reason for Sign-Off:</label>
        <textarea name="reason" rows="4" required></textarea>

        <button type="submit">Submit Sign-Off</button>
    </form>

</div>

</body>
</html>
