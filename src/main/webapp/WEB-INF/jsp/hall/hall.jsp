
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <title>CYP的Nike专营店</title>
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
<%@include file="/WEB-INF/jsp/tool/top/top.jsp"%>
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
                <p>迅捷灵动，为赛场而生<br> 塑就稳定脚感和舒适缓震效果，引爆赛场灵动</p>
                <span class="fel-fal-bar"></span>
            </div>
        </div>
        <div class="pull-right fel-box">
            <div class="feel-right">
                <h3>Feel</h3>
                <img src="/images/f-r.png" alt="/" class="img-responsive fl-img-wid">
                <p>经历漫长赛季考验，传承前11代诸多科技与灵感<br> 只为打造精准杀器，完美延续曼巴精神</p>
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
                <a id="indexshoesqv2" href="/myshopping/single">查看详情</a>
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
                <a id="indexshoesqv4" href="/myshopping/single">查看详情</a>
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
                <a id="indexshoesqv1" href="/myshopping/single">查看详情</a>
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
                <a id="indexshoesqv3" href="/myshopping/single">查看详情</a>
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
                <a id="indexshoesqv5" href="/myshopping/single">查看详情</a>
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
                <a id="indexshoesqv6" href="/myshopping/single">查看详情</a>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<div class="sub-news">
    <div class="container">
        <form>
            <h3>站内搜索</h3>
            <input type="text" class="sub-email" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
            <a class="btn btn-default subs-btn" href="#" role="button">搜索</a>
        </form>
    </div>
</div>
<%@include file="/WEB-INF/jsp/tool/foot/foot.jsp"%>
</body>
</html>