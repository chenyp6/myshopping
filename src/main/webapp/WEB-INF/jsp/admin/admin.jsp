<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/26
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>管理员登录</title>
    <link rel="stylesheet" type="text/css" href="/css/adminloginstyles.css">
    <script type="text/javascript" src="/js/tool/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="/js/admin/adminlogin.js"></script>

</head>
<body>


<div class="wrapper">

    <div class="container">
        <h1>Welcome</h1>
        <form class="form" action="/myshopping/checkadmin" method="post">
            <input type="text" name="userid" placeholder="用户名" value="${userid}">
            <input type="password" name="pwd" placeholder="密码">
            <button type="submit" id="login-button">登录</button>
        </form>
    </div>

    <ul class="bg-bubbles">
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>

</div>
</body>
</html>