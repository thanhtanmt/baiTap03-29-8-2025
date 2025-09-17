<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Quên mật khẩu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f7f7f7;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .forgot-container {
            background: #fff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.2);
            width: 350px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        input[type="email"], button {
            width: 100%;
            padding: 10px;
            margin-top: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        button {
            background: #007bff;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            border: none;
        }
        button:hover {
            background: #0056b3;
        }
        .alert {
            color: red;
            margin-top: 10px;
            text-align: center;
        }
        .success {
            color: green;
            margin-top: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="forgot-container">
        <h2>Quên mật khẩu</h2>
        
        <!-- Hiển thị thông báo nếu có -->
        <c:if test="${not empty alert}">
            <p class="${alertType}">${alert}</p>
        </c:if>

        <!-- Form nhập email -->
        <form action="${pageContext.request.contextPath}/forgotpassword" method="post">
            <label for="email">Nhập email của bạn:</label>
            <input type="email" id="email" name="email" placeholder="Email..." required>
            <button type="submit">Xác nhận</button>
        </form>
    </div>
</body>
</html>
