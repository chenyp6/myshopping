
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
        <script src="/js/top/top.js"></script>
</head>
<body>
<input id="userexits" type="hidden" value="${sessionScope.userid}">
<div class="header">
    <div class="container">
        <div class="header-top">
            <div class="logo">
                <a href="/myshopping">N-AIR</a>
            </div>
            <div class="login-bars">
                <span class="login-bar" id="welcome"  >Hi ${sessionScope.userid}!&nbsp&nbsp</span>
                <a class="btn btn-default log-bar" id="signup" href="/myshopping/register" role="button">注册</a>
                <a class="btn btn-default log-bar" id="login" href="/myshopping/login" role="button">登录</a>
                <div class="cart box_1">
                    <a href="/myshopping/cart">
                        <h3>
                            <div class="total">
                                <span class="glyphicon glyphicon-shopping-cart"></span>&nbsp 购物车
                            </div>
                        </h3>
                    </a>
                    <p><%--<a href="javascript:;" class="simpleCart_empty">Empty Cart</a>--%></p>
                    <div class="clearfix"> </div>
                </div>
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
            <div class="clearfix"></div>
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
</body>
</html>
