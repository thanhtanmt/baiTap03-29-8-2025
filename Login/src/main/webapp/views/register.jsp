<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng ký tài khoản</title>
</head>
<body>
    <h2>Tạo tài khoản mới</h2>

    <c:if test="${alert != null}">
        <h3 style="color:red;">${alert}</h3>
    </c:if>

    <form action="register" method="post">
        <label>Email:</label>
        <input type="text" name="email" required><br><br>

        <label>Tài khoản:</label>
        <input type="text" name="username" required><br><br>

        <label>Mật khẩu:</label>
        <input type="password" name="password" required><br><br>

        <label>Họ và tên:</label>
        <input type="text" name="fullname" required><br><br>

        <label>Số điện thoại:</label>
        <input type="text" name="phone" required><br><br>

        <button type="submit">Đăng ký</button>
    </form>

    <p>Đã có tài khoản? <a href="${pageContext.request.contextPath }/login">Đăng nhập</a></p>
</body>
</html>
