<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/15
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>我的购物车</title>
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
    <script src="/js/tool/jquery-form.js"></script>
    <!--script-->
    <!-- FlexSlider -->
    <script src="/js/tool/imagezoom.js"></script>
    <script defer src="/js/tool/jquery.flexslider.js"></script>
    <script src="/js/cart/cart.js"></script>
    <link rel="stylesheet" href="/css/flexslider.css" type="text/css" media="screen" />

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
            <li><a href="/myshopping">Products</a></li>
            <li class="active">CART</li>
        </ol>
    </div>
</div>
<!-- check-out -->
<div class="check">
    <div class="container">
        <div class="col-md-3 cart-total">
            <a class="continue" href="#">总价统计</a>
            <div class="price-details">
                <h3>统计详情</h3>
                <span>原价</span>
                <span id="total" class="total1">6200.00</span>
                <span>折扣</span>
                <span class="total1">0%(官方折扣)</span>
                <span>运费</span>
                <span class="total1">0.00</span>
                <div class="clearfix"></div>
            </div>
            <hr class="featurette-divider">
            <ul class="total_price">
                <li class="last_price"> <h4>最终价格</h4></li>
                <li  class="last_price"><span id="last_price">6150.00</span></li>
                <div class="clearfix"> </div>
            </ul>
            <div class="clearfix"></div>
            <a class="order" id="pay" href="javascript:void(0);">全部购买</a>
        </div>
        <div id="cart"  class="col-md-9 cart-items">
            <h1>我的购物车</h1>
        </div>
</div>
    <%@include file="/WEB-INF/jsp/tool/foot/foot.jsp"%>
</body>
</html>