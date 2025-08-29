<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Trang chủ</title>
</head>
<body>
    <h2>Chào mừng, ${sessionScope.account.fullName}!</h2>
    <p>Bạn đã đăng nhập thành công.</p>
    <a href="${pageContext.request.contextPath}/logout">Đăng xuất</a>
</body>
</html>
