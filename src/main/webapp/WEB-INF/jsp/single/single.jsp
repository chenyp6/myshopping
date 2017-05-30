
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <title>商品详情</title>
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
    <script src="/js/single/single.js"></script>
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
<input type="hidden" id="shoesid" value="${shoesid}">
<%@include file="/WEB-INF/jsp/tool/top/top.jsp"%>
<div class="head-bread">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="#">Home</a></li>
            <li><a href="#">Shoes</a></li>
            <li class="active">Detail</li>
        </ol>
    </div>
</div>
<div class="showcase-grid">
    <div class="container">
        <div class="col-md-8 showcase">
            <div class="flexslider">
                <ul class="slides">
                    <li id="data-thumb" data-thumb="${mshow}">
                        <div class="thumb-image"> <img src="${mshow}" id="show" data-imagezoom="true" class="img-responsive"> </div>
                    </li>
                    <li id="data-thumb1" data-thumb="${mshow1}">
                        <div class="thumb-image"> <img src="${mshow1}" id="show1" data-imagezoom="true" class="img-responsive"> </div>
                    </li>
                    <li id="data-thumb2" data-thumb="${mshow2}">
                        <div class="thumb-image"> <img src="${mshow2}" id="show2" data-imagezoom="true" class="img-responsive"> </div>
                    </li>
                    <li id="data-thumb3" data-thumb="${mshow3}">
                        <div class="thumb-image"> <img src="${mshow3}" id="show3" data-imagezoom="true" class="img-responsive"> </div>
                    </li>
                </ul>
                <div class="clearfix"></div>
            </div>
        </div>
        <div class="col-md-4 showcase">
            <div class="showcase-rt-top">
                <div class="pull-left shoe-name">
                    <h3 id="shoesname"></h3>
                    <p id="introduction"></p>
                    <h4>&#36;<span id="shoesprice"></span></h4>
                </div>
                <div class="pull-left rating-stars">
                    <ul>
                        <li><a href="#" class="active"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#" class="active"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#" class="active"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#" id="shoeslevel4" ><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#" id="shoeslevel5"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                    </ul>
                </div>
                <div class="clearfix"></div>
            </div>
            <hr class="featurette-divider">
            <div class="shocase-rt-bot">
                <div class="float-qty-chart">
                    <ul>
                        <li class="qty">
                            <h3>选择尺码</h3>
                            <select id="shoessize" class="form-control siz-chrt">
                                <option>38</option>
                                <option>39</option>
                                <option>40</option>
                                <option>41</option>
                                <option>42</option>
                                <option>43</option>
                            </select>
                        </li>
                        <li class="qty">
                            <h4>购买数量</h4>
                            <select id="number" class="form-control qnty-chrt">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                            </select>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <ul>
                    <li class="ad-2-crt simpleCart_shelfItem">
                        <a class="btn item_add" id="addtocart"  href="javascript:void(0);" role="button">添加至购物车</a>
                        <a class="btn" id="buynow" href="javascript:void(0);" role="button">立即购买</a>
                    </li>
                </ul>
            </div>
            <div class="showcase-last">
                <h3>商品详情介绍</h3>
                <ul>
                    <li>Air Jordan 5 Retro PREM 复刻运动鞋采用皮革鞋面妙搭内嵌式 Air 配置，缔造舒适耐用的穿着效果和轻盈缓震体验。</li>
                    <li>牛剖层革、牛头层革与合成革组合鞋面，营造出众舒适感</li>
                    <li>Air-Sole 气垫，轻盈缓震</li>
                    <li>皮革鞋面，舒适耐穿</li>
                    <li>橡胶外底经久耐磨，抓地力非凡</li>
                    <li>泡棉中底，舒适耐磨</li>
                </ul>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>

<div class="specifications">
    <div class="container">
        <h3>详细信息</h3>
        <div class="detai-tabs">
            <!-- Nav tabs -->
            <ul class="nav nav-pills tab-nike" role="tablist">
                <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">服务保证</a></li>
                <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">品牌简介</a></li>
                <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">用户评价</a></li>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="home">
                    <p>如买家认为该商品为假冒品牌，买家可在指定期间内发起针对商家的维权，如商品的鉴定结果为假冒品牌</p>
                    <p>则由店主CYP进行赔偿，金额为买家实际支付商品价款的四倍。</p>
                </div>
                <div role="tabpanel" class="tab-pane" id="profile">
                    <p>耐克是体育设备，鞋类和服装的领先制造商和供应商之一。耐克是一个全球品牌，它不断创造出使用高科技和设计创新的产品。耐克在Snapdeal拥有大量男士运动鞋。您可以探索我们的篮球鞋，足球鞋，板球鞋，网球鞋，跑步鞋，日常鞋子或生活鞋。从一系列运动鞋中挑选出红色，黄色，绿色，蓝色，棕色，黑色，灰色，橄榄色，粉红色，米色和白色的鲜艳色彩。这些鞋子专为最佳表现而设计，与您的运行方式相匹配。可用于皮革，帆布，麂皮皮革，人造革，网眼等材料，这些鞋子重量轻，舒适，坚固，运动性强。所有Nike鞋的唯一设计是提供更多的舒适度，并且材料足够好以提供改进的配合。这些鞋子很容易维护，并持续了很长一段时间，因为它们的耐用性。购买耐克鞋男士在线与我们在一些令人难以置信的折扣和巨大的价格。因此，您的耐克鞋可以更新得更快，您可以玩得更久。</p>
                </div>
                <div role="tabpanel" class="tab-pane" id="messages">

                </div>
            </div>
        </div>
    </div>
</div>

<%--<div class="you-might-like">
    <div class="container">
        <h3 class="you-might">Products You May Like</h3>
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img src="/images/grid4.jpg" alt="/" class="img-responsive gri-wid"></div>
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
                    <div class="img"><img src="/images/grid6.jpg" alt="/" class="img-responsive gri-wid"></div>
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
                    <div class="img"><img src="/images/grid3.jpg" alt="/" class="img-responsive gri-wid"></div>
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
    </div>
</div>--%>
<%@include file="/WEB-INF/jsp/tool/foot/foot.jsp"%>
</body>
</html>
