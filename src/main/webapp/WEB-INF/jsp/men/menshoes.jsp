<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <title>Products</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <meta charset utf="8">
    <!--fonts-->
    <link href='http://fonts.useso.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>

    <!--fonts-->
    <!--form-css-->
    <link href="/css/form.css" rel="stylesheet" type="text/css" media="all" />
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
    <script src="/js/men/men.js"></script>
    <script src="/js/men/menpage.js"></script>
    <link rel="stylesheet" href="/css/flexslider.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="/css/pagination.css" >

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
<input type="hidden" id="pagenow" value=""/>
<div class="header">
    <div class="container">
        <div class="header-top">
            <div class="logo">
                <a href="/myshopping">N-AIR</a>
            </div>
            <div class="login-bars">
                <a class="btn btn-default log-bar" href="/myshopping/register" role="button">Sign up</a>
                <a class="btn btn-default log-bar" href="/myshopping/login" role="button">Login</a>
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
<div class="head-bread">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="index.html">Home</a></li>
            <li class="active">PRODUCTS</li>
        </ol>
    </div>
</div>
<div class="products-gallery">
    <div class="container">
        <div class="col-md-9 grid-gallery">
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="col-md-4 grid-stn simpleCart_shelfItem">
                <!-- normal -->
                <div class="ih-item square effect3 bottom_to_top">
                    <div class="bottom-2-top">
                        <div class="img"><img src="" alt="/" class="img-responsive gri-wid"></div>
                        <div class="info">
                            <div class="pull-left styl-hdn">
                                <h3>style 01</h3>
                            </div>
                            <div class="pull-right styl-price">
                                <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$190</span></a></p>
                            </div>
                            <div class="clearfix"></div>
                        </div></div>
                </div>
                <!-- end normal -->
                <div class="quick-view">
                    <a href="/myshopping/single">Quick view</a>
                </div>
            </div>
            <div class="clearfix"></div>
            <div>
                <ul class="pagination" style="margin-left: 300px;">
                    <li><a href="#">&laquo;</a></li>
                    <li><a href="#">Prev</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">Next</a></li>
                    <li><a href="#">&raquo;</a></li>
                </ul>
            </div>
        </div>
        <div class="col-md-3 grid-details">
            <div class="grid-addon">
                <section  class="sky-form">
                    <div class="product_right">
                        <h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Categories</h4>
                        <div class="tab1">
                            <ul class="place">
                                <li class="sort">Shoes</li>
                                <li class="by"><img src="/images/do.png" alt=""></li>
                                <div class="clearfix"> </div>
                            </ul>
                            <div class="single-bottom">
                                <a href="#"><p>Running</p></a>
                                <a href="#"><p>Foot ball</p></a>
                                <a href="#"><p>Daily</p></a>
                                <a href="#"><p>Sneakers</p></a>
                            </div>
                        </div>
                        <div class="tab2">
                            <ul class="place">
                                <li class="sort">Clothing</li>
                                <li class="by"><img src="/images/do.png" alt=""></li>
                                <div class="clearfix"> </div>
                            </ul>
                            <div class="single-bottom">
                                <a href="#"><p>Tracks</p></a>
                                <a href="#"><p>Tees</p></a>
                                <a href="#"><p>Hair bands</p></a>
                                <a href="#"><p>Wrist bands</p></a>
                            </div>
                        </div>
                        <div class="tab3">
                            <ul class="place">
                                <li class="sort">Gear</li>
                                <li class="by"><img src="/images/do.png" alt=""></li>
                                <div class="clearfix"> </div>
                            </ul>
                            <div class="single-bottom">
                                <a href="#"><p>Running app</p></a>
                                <a href="#"><p>Training club</p></a>
                                <a href="#"><p>Nike Fuel+Band se</p></a>
                            </div>
                        </div>
                </section>
                <section  class="sky-form">
                    <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>DISCOUNTS</h4>
                    <div class="row row1 scroll-pane">
                        <div class="col col-4">
                            <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Upto - 10% (20)</label>
                        </div>
                        <div class="col col-4">
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>40% - 50% (5)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>30% - 20% (7)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>10% - 5% (2)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Other(50)</label>
                        </div>
                    </div>
                </section>
                <!---->
                <link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
                <script type='text/javascript'>//<![CDATA[
                $(window).load(function(){
                    $( "#slider-range" ).slider({
                        range: true,
                        min: 0,
                        max: 400000,
                        values: [ 2500, 350000 ],
                        slide: function( event, ui ) {  $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
                        }
                    });
                    $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) + " - $" + $( "#slider-range" ).slider( "values", 1 ) );

                });//]]>

                </script>
                <section  class="sky-form">
                    <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Type</h4>
                    <div class="row row1 scroll-pane">
                        <div class="col col-4">
                            <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Air Max (30)</label>
                        </div>
                        <div class="col col-4">
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Armagadon   (30)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Helium (30)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Kyron     (30)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Napolean  (30)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Foot Rock   (30)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Radiated  (30)</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Spiked  (30)</label>
                        </div>
                    </div>
                </section>
                <section  class="sky-form">
                    <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Brand</h4>
                    <div class="row row1 scroll-pane">
                        <div class="col col-4">
                            <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Roadstar</label>
                        </div>
                        <div class="col col-4">
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Tornado</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Kissan</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Oakley</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Manga</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox" ><i></i>Wega</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Kings</label>
                            <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Zumba</label>
                        </div>
                    </div>
                </section>
            </div>
        </div>
        <div class="clearfix"></div>
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
