<!DOCTYPE html>
<html>
<head>
<title>Netflix - Home</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Segoe UI", sans-serif;
        overflow: hidden;
        background: black;
        color: white;
        text-align: center;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        position: relative;
    }

    /* 🔥 Animated Netflix Glow Background */
    .netflix-bg {
        position: absolute;
        width: 200%;
        height: 200%;
        background: radial-gradient(circle at center, rgba(255,0,0,0.4), transparent 60%),
                    radial-gradient(circle at 30% 70%, rgba(255,0,0,0.25), transparent 70%),
                    radial-gradient(circle at 70% 20%, rgba(255,0,0,0.25), transparent 70%);
        animation: moveBg 12s infinite alternate ease-in-out;
        filter: blur(80px);
        z-index: -2;
    }

    @keyframes moveBg {
        0% { transform: translate(-10%, -10%) scale(1); }
        100% { transform: translate(10%, 10%) scale(1.2); }
    }

    /* 🔥 Floating Particles (Like Netflix intro) */
    .particles span {
        position: absolute;
        width: 6px;
        height: 6px;
        background: #e50914;
        border-radius: 50%;
        animation: floatParticle linear infinite;
        opacity: 0.7;
    }

    @keyframes floatParticle {
        0% { transform: translateY(0) scale(1); opacity: 0.9; }
        100% { transform: translateY(-100vh) scale(0.2); opacity: 0; }
    }

    /* Center Container Animation */
    .container {
        animation: fadeIn 1.5s ease-out;
        z-index: 3;
    }

    h2 {
        font-size: 40px;
        letter-spacing: 2px;
        color: #e50914;
        animation: slideDown 1.5s ease-out;
        text-shadow: 0 0 20px rgba(255,0,0,0.6);
    }

    a.button {
        display: inline-block;
        margin-top: 20px;
        padding: 12px 30px;
        background-color: #e50914;
        color: white;
        text-decoration: none;
        border-radius: 30px;
        font-size: 20px;
        font-weight: bold;
        letter-spacing: 1px;
        transition: 0.3s ease-in-out;
        animation: popIn 2s ease-out;
    }

    a.button:hover {
        background-color: #b00610;
        transform: scale(1.08);
        box-shadow: 0 0 25px red;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: scale(0.95); }
        to { opacity: 1; transform: scale(1); }
    }

    @keyframes slideDown {
        from { opacity: 0; transform: translateY(-20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    @keyframes popIn {
        0% { opacity: 0; transform: scale(0.5); }
        100% { opacity: 1; transform: scale(1); }
    }
</style>

</head>
<body>

<!-- 🔥 Netflix Glow Effect -->
<div class="netflix-bg"></div>

<!-- 🔥 Floating Red Particles -->
<div class="particles">
    <!-- generate 20 Netflix particles -->
    <script>
        for(let i=0; i<25; i++){
            const particle = document.createElement("span");
            particle.style.left = Math.random() * 100 + "%";
            particle.style.bottom = Math.random() * -50 + "px";
            particle.style.animationDuration = (4 + Math.random() * 6) + "s";
            particle.style.animationDelay = Math.random() * 3 + "s";
            document.body.appendChild(particle);
        }
    </script>
</div>

<!-- Main Content -->
<div class="container">
    <h2>Welcome To Netflix</h2>
    <a href="profile" class="button">Create Profile</a>
</div>

</body>
</html>
