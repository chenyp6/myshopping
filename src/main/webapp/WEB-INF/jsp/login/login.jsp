<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/9
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>欢迎登陆！</title>
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
    <script src="/js/login/login.js"></script>
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
<div class="header">
    <div class="container">
        <div class="header-top">
            <div class="logo">
                <a href="/myshopping">N-AIR</a>
            </div>
            <div class="login-bars">
                <a class="btn btn-default log-bar" href="/myshopping/register" role="button">注册</a>
                <a class="btn btn-default log-bar" href="/myshopping/login" role="button">登录</a>
                <%--<div class="cart box_1">
                    <a href="checkout.html">
                        <h3>
                            <div class="total">
                                <span class="simpleCart_total"></span>(<span id="simpleCart_quantity" class="simpleCart_quantity"></span>)</div></h3>
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                    <div class="clearfix"> </div>
                </div>--%>
            </div>
            <div class="clearfix"></div>
        </div>
        <!---menu-----bar--->
        <div class="header-botom">
            <div class="content white">
                <nav class="navbar navbar-default nav-menu" role="navigation">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <!--/.navbar-header-->

                    <div class="collapse navbar-collapse collapse-pdng" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav nav-font">
                            <%--<li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Shop<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Shoes</a></li>
                                    <li><a href="#">Tees</a></li>
                                    <li><a href="#">Tops</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Tracks</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Gear</a></li>
                                </ul>
                            </li>--%>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">男子<b class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="row">
                                        <div class="col-sm-4 menu-img-pad">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="/myshopping/menshoes">鞋类</a></li>
                                                <li><a href="#">上衣</a></li>
                                                <li><a href="#">长裤</a></li>
                                                <li class="divider"></li>
                                                <li><a href="#">袜子</a></li>
                                                <li class="divider"></li>
                                                <li><a href="#">配件/装备</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4 menu-img-pad">
                                            <a href="#"><img src="/images/menu1.jpg" alt="/" class="img-rsponsive men-img-wid" /></a>
                                        </div>
                                        <div class="col-sm-4 menu-img-pad">
                                            <a href="#"><img src="/images/menu2.jpg" alt="/" class="img-rsponsive men-img-wid" /></a>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown">女子<b class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-2">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="/myshopping/womenshoes">鞋类</a></li>
                                                <li><a href="#">上衣</a></li>
                                                <li><a href="#">瑜伽</a></li>
                                                <li class="divider"></li>
                                                <li><a href="#">袜子</a></li>
                                                <li class="divider"></li>
                                                <li><a href="#">配件/装备</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-6">
                                            <a href="#"><img src="/images/menu3.jpg" alt="/" class="img-rsponsive men-img-wid" /></a>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">儿童<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="/myshopping/childrenshoes">鞋类</a></li>
                                    <li><a href="#">上衣</a></li>
                                    <li><a href="#">长裤</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">运动套装</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">配件/装备</a></li>
                                </ul>
                            </li>
                            <li><a href="#">专属定制</a></li>
                            <div class="clearfix"></div>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <!--/.navbar-collapse-->
                    <div class="clearfix"></div>
                </nav>
                <!--/.navbar-->
                <div class="clearfix"></div>
            </div>
            <!--/.content--->
        </div>
        <!--header-bottom-->
    </div>
</div>
<div class="head-bread">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="/myshopping">HOME</a></li>
            <li class="active">LOGIN</li>
        </ol>
    </div>
</div>
<!--signup-->
<!-- login-page -->
<div class="login">
    <div class="container">
        <div class="login-grids">
            <div class="col-md-6 log">
                <h3>Login</h3>
                <div class="strip"></div>
                <p>欢迎到CYP的Nike专营店。</p>
                <p>如果您已经是本店的会员，请在下方进行登录</p>
                <form action="/myshopping/checkuser" method="post">
                    <h5>用户名:</h5>
                    <input id="userid" name="userid" type="text" value="${usersDTO.userid}">
                    <h5>密码:</h5>
                    <input id="pwd" name="pwd" type="password" value=""><span style="color: red;">${mes}</span><br>
                    <input type="submit" value="登录">

                </form>
                <a href="#">忘记密码 ?</a>
            </div>
            <div class="col-md-6 login-right">
                <h3>注册成为CYP Nike专营店的会员</h3>
                <div class="strip"></div>
                <p>CYP专营店 随时为你服务，助你选购卓越装备，为你提供专业指导、非凡体验和无限动力。</p>
                <a href="/myshopping/register" class="button">新用户注册点击这里</a>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!-- //login-page -->
<!--signup-->
<%@include file="/WEB-INF/jsp/tool/foot/foot.jsp"%>
</body>
</html>
