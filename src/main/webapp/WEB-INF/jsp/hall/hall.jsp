
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <title>Home</title>
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
    <script src="/js/hall/hall.js"></script>
    <!--script-->
</head>
<body>
<input id="userexits" type="hidden" value="${userexits}"/>
<div class="header">
    <div class="container">
        <div class="header-top">
            <div class="logo">
                <a href="index.html">N-AIR</a>
            </div>
            <div class="login-bars">
                <span class="login-bar" id="welcome"  >Hi ${userid}!&nbsp&nbsp</span>
                <a class="btn btn-default log-bar" id="signup" href="/myshopping/register" role="button">Sign up</a>
                <a class="btn btn-default log-bar" id="login" href="/myshopping/login" role="button">Login</a>
                <div class="cart box_1">
                    <a href="checkout.html">
                        <h3>
                            <div class="total">
                                <span class="simpleCart_total"></span>(<span id="simpleCart_quantity" class="simpleCart_quantity"></span>)</div></h3>
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
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
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Shop<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="products.html">Shoes</a></li>
                                    <li><a href="products.html">Tees</a></li>
                                    <li><a href="products.html">Tops</a></li>
                                    <li class="divider"></li>
                                    <li><a href="products.html">Tracks</a></li>
                                    <li class="divider"></li>
                                    <li><a href="products.html">Gear</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Men<b class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="row">
                                        <div class="col-sm-4 menu-img-pad">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="/myshopping/menshoes">Joggers</a></li>
                                                <li><a href="products.html">Foot Ball</a></li>
                                                <li><a href="products.html">Cricket</a></li>
                                                <li class="divider"></li>
                                                <li><a href="products.html">Tennis</a></li>
                                                <li class="divider"></li>
                                                <li><a href="products.html">Casual</a></li>
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
                                <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown">Women<b class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-2">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <ul class="multi-column-dropdown">
                                                <li><a href="/myshopping/womenshoes">Tops</a></li>
                                                <li><a href="products.html">Bottoms</a></li>
                                                <li><a href="products.html">Yoga Pants</a></li>
                                                <li class="divider"></li>
                                                <li><a href="products.html">Sports</a></li>
                                                <li class="divider"></li>
                                                <li><a href="products.html">Gym</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-6">
                                            <a href="#"><img src="/images/menu3.jpg" alt="/" class="img-rsponsive men-img-wid" /></a>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">kids<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="products.html">Tees</a></li>
                                    <li><a href="products.html">Shorts</a></li>
                                    <li><a href="products.html">Gear</a></li>
                                    <li class="divider"></li>
                                    <li><a href="products.html">Watches</a></li>
                                    <li class="divider"></li>
                                    <li><a href="products.html">Shoes</a></li>
                                </ul>
                            </li>
                            <li><a href="contact.html">Catch</a></li>
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
<div class="header-end">
    <div class="container">
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="/images/shoe3.jpg" alt="...">
                    <div class="carousel-caption car-re-posn">
                        <h3>AirMax</h3>
                        <h4>You feel to fall</h4>
                        <span class="color-bar"></span>
                    </div>
                </div>
                <div class="item">
                    <img src="/images/shoe1.jpg" alt="...">
                    <div class="carousel-caption car-re-posn">
                        <h3>AirMax</h3>
                        <h4>You feel to fall</h4>
                        <span class="color-bar"></span>
                    </div>
                </div>
                <div class="item">
                    <img src="/images/shoe2.jpg" alt="...">
                    <div class="carousel-caption car-re-posn">
                        <h3>AirMax</h3>
                        <h4>You feel to fall</h4>
                        <span class="color-bar"></span>
                    </div>
                </div>
            </div>

            <!-- Controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left car-icn" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right car-icn" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<div class="feel-fall">
    <div class="container">
        <div class="pull-left fal-box">
            <div class=" fall-left">
                <h3>Fall</h3>
                <img src="/images/f-l.png" alt="/" class="img-responsive fl-img-wid">
                <p>Inspiration and innovation<br> for every athlete in the world</p>
                <span class="fel-fal-bar"></span>
            </div>
        </div>
        <div class="pull-right fel-box">
            <div class="feel-right">
                <h3>Feel</h3>
                <img src="/images/f-r.png" alt="/" class="img-responsive fl-img-wid">
                <p>Inspiration and innovation<br> for every athlete in the world</p>
                <span class="fel-fal-bar2"></span>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<div class="shop-grid">
    <div class="container">
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img id="indexshoes2" src=""  alt="/" class="img-responsive gri-wid"></div>
                    <div class="info">
                        <div class="pull-left styl-hdn">
                            <h3>style 01</h3>
                        </div>
                        <div class="pull-right styl-price">
                            <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span id="item_price2" class=" item_price">$190</span></a></p>
                        </div>
                        <div class="clearfix"></div>
                    </div></div>
            </div>
            <!-- end normal -->
            <div class="quick-view">
                <a id="indexshoesqv2" href="/myshopping/single">Quick view</a>
            </div>
        </div>
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img id="indexshoes4" src="" alt="/" class="img-responsive gri-wid"></div>
                    <div class="info">
                        <div class="pull-left styl-hdn">
                            <h3>style 01</h3>
                        </div>
                        <div class="pull-right styl-price">
                            <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span id="item_price4" class=" item_price">$190</span></a></p>
                        </div>
                        <div class="clearfix"></div>
                    </div></div>
            </div>
            <!-- end normal -->
            <div class="quick-view">
                <a id="indexshoesqv4" href="/myshopping/single">Quick view</a>
            </div>
        </div>
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img id="indexshoes1" src="" alt="/" class="img-responsive gri-wid"></div>
                    <div class="info">
                        <div class="pull-left styl-hdn">
                            <h3>style 01</h3>
                        </div>
                        <div class="pull-right styl-price">
                            <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span id="item_price1" class=" item_price">$190</span></a></p>
                        </div>
                        <div class="clearfix"></div>
                    </div></div>
            </div>
            <!-- end normal -->
            <div class="quick-view">
                <a id="indexshoesqv1" href="/myshopping/single">Quick view</a>
            </div>
        </div>
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img id="indexshoes3" src="" alt="/" class="img-responsive gri-wid"></div>
                    <div class="info">
                        <div class="pull-left styl-hdn">
                            <h3>style 01</h3>
                        </div>
                        <div class="pull-right styl-price">
                            <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span id="item_price3" class=" item_price">$190</span></a></p>
                        </div>
                        <div class="clearfix"></div>
                    </div></div>
            </div>
            <!-- end normal -->
            <div class="quick-view">
                <a id="indexshoesqv3" href="/myshopping/single">Quick view</a>
            </div>
        </div>
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img id="indexshoes5" src="" alt="/" class="img-responsive gri-wid"></div>
                    <div class="info">
                        <div class="pull-left styl-hdn">
                            <h3>style 01</h3>
                        </div>
                        <div class="pull-right styl-price">
                            <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span id="item_price5" class=" item_price">$190</span></a></p>
                        </div>
                        <div class="clearfix"></div>
                    </div></div>
            </div>
            <!-- end normal -->
            <div class="quick-view">
                <a id="indexshoesqv5" href="/myshopping/single">Quick view</a>
            </div>
        </div>
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img id="indexshoes6" src="" alt="/" class="img-responsive gri-wid"></div>
                    <div class="info">
                        <div class="pull-left styl-hdn">
                            <h3>style 01</h3>
                        </div>
                        <div class="pull-right styl-price">
                            <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span id="item_price6" class=" item_price">$190</span></a></p>
                        </div>
                        <div class="clearfix"></div>
                    </div></div>
            </div>
            <!-- end normal -->
            <div class="quick-view">
                <a id="indexshoesqv6" href="/myshopping/single">Quick view</a>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<div class="sub-news">
    <div class="container">
        <form>
            <h3>NewsLetter</h3>
            <input type="text" class="sub-email" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
            <a class="btn btn-default subs-btn" href="#" role="button">SUBSCRIBE</a>
        </form>
    </div>
</div>
<div class="footer-grid">
    <div class="container">
        <div class="col-md-2 re-ft-grd">
            <h3>Categories</h3>
            <ul class="categories">
                <li><a href="#">Men</a></li>
                <li><a href="#">Women</a></li>
                <li><a href="#">Kids</a></li>
                <li><a href="#">Formal</a></li>
                <li><a href="#">Casuals</a></li>
                <li><a href="#">Sports</a></li>
            </ul>
        </div>
        <div class="col-md-2 re-ft-grd">
            <h3>Short links</h3>
            <ul class="shot-links">
                <li><a href="#">Contact us</a></li>
                <li><a href="#">Support</a></li>
                <li><a href="#">Delivery</a></li>
                <li><a href="#">Return Policy</a></li>
                <li><a href="#">Terms & conditions</a></li>
                <li><a href="contact.html">Sitemap</a></li>
            </ul>
        </div>
        <div class="col-md-6 re-ft-grd">
            <h3>Social</h3>
            <ul class="social">
                <li><a href="#" class="fb">facebook</a></li>
                <li><a href="#" class="twt">twitter</a></li>
                <li><a href="#" class="gpls">g+ plus</a></li>
                <div class="clearfix"></div>
            </ul>
        </div>
        <div class="col-md-2 re-ft-grd">
            <div class="bt-logo">
                <div class="logo">
                    <a href="index.html" class="ft-log">N-AIR</a>
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
    <div class="copy-rt">
        <div class="container">
            <p>Copyright &copy; 2015.Company name All rights reserved. <a target="_blank" href="http://www.mycodes.net/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
        </div>
    </div>
</div>
</body>
</html>