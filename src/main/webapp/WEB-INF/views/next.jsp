<%--
  Created by IntelliJ IDEA.
  User: dev2
  Date: 2021/05/25
  Time: 5:29 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <input type="text" value="${item.username}">
    <input type="text" value="${item.password}">

    <a href="/login">Click</a>

</body>
</html>
