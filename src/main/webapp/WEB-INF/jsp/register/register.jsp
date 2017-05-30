<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/9
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>新用户注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <meta charset utf="8">
    <!--fonts-->
    <link href='http://fonts.useso.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>

    <!--fonts-->
    <!--bootstrap-->
    <link href="/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <!--coustom css-->
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
    <!--shop-kart-js-->
    <script src="/js/tool/simpleCart.min.js"></script>
    <!--default-js-->
    <script src="/js/tool/jquery-2.1.4.min.js"></script>
    <!--bootstrap-js-->
    <script src="/js/tool/bootstrap.min.js"></script>
    <!--script-->
    <!-- FlexSlider -->
    <script src="/js/tool/imagezoom.js"></script>
    <script defer src="/js/tool/jquery.flexslider.js"></script>
    <link rel="stylesheet" href="/css/flexslider.css" type="text/css" media="screen" />
    <script src="/js/register/register.js"></script>

    <script>
        // Can also be used with $(document).ready()
        $(window).load(function() {
            $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
            });
        });
    </script>
    <!-- //FlexSlider-->
</head>
<body>
<%@include file="/WEB-INF/jsp/tool/top/top.jsp"%>
<div class="head-bread">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="/myshopping">Home</a></li>
            <li><a href="/myshopping/login">LOGIN</a></li>
            <li class="active">REGISTER</li>
        </ol>
    </div>
</div>
<!-- reg-form -->
<div class="reg-form">
    <div class="container">
        <div class="reg">
            <h3>新用户注册</h3>
            <p>欢迎到CYP的Nike专营店。</p>
            <p>如果您是新用户请在下方填写相关信息进行注册。如果您已是本店会员，请<a href="/myshopping/login  ">点击这里</a>进行登录</p>
            <form action="/myshopping/registeruser" method="post">
                <ul>
                    <li class="text-info">用户名: </li>
                    <li><input type="text" id="userid" name="userid" value=""><span style="font-weight:bold" id="checkuserid"></span></li>
                </ul>
                <ul>
                    <li class="text-info">密码: </li>
                    <li><input type="password" id="pwd" name="pwd" value=""><span style="font-weight:bold" id="checkpwd"></span></li>
                </ul>
                <ul>
                    <li class="text-info">确认密码:</li>
                    <li><input type="password" id="confirm" name="confirm" value=""><span style="font-weight:bold" id="checkconfirm"></span></li>
                </ul>
                <ul>
                    <li class="text-info">邮箱: </li>
                    <li><input type="text" id="email" name="email" value=""><span style="font-weight:bold" id="checkemail"></span></li>
                </ul>
                <ul>
                    <li class="text-info">手机号码:</li>
                    <li><input type="text" id="phone" name="phone"  value=""><span style="font-weight:bold" id="checkphone"></span></li>
                </ul>
                <ul>
                    <li class="text-info">验证码:<a id="changecaptcha" href="javascript:void(0);"><img  style="margin-left: 10px" id="captcha" src="/myshopping/Captcha"></a></li>
                    <li><input type="text" id="rand" name="rand" value=""><span style="font-weight:bold" id="checkrand"></span></li>
                </ul>
                <input type="submit" id="register"  value="立即注册">
            </form>
        </div>
    </div>
</div>
<%@include file="/WEB-INF/jsp/tool/foot/foot.jsp"%>
</body>
</html>
