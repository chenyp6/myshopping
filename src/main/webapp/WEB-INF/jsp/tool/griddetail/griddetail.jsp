<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/26
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<div class="col-md-3 grid-details">
    <div class="grid-addon">
        <section  class="sky-form">
            <div class="product_right">
                <h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Categories</h4>
                <div class="tab1">
                    <ul class="place">
                        <li class="sort">鞋类</li>
                        <li class="by"><img src="/images/do.png" alt=""></li>
                        <div class="clearfix"> </div>
                    </ul>
                    <div class="single-bottom">
                        <a href="#"><p>跑步鞋</p></a>
                        <a href="#"><p>足球鞋</p></a>
                        <a href="#"><p>训练鞋</p></a>
                        <a href="#"><p>登山鞋</p></a>
                    </div>
                </div>
                <div class="tab2">
                    <ul class="place">
                        <li class="sort">本机新品</li>
                        <li class="by"><img src="/images/do.png" alt=""></li>
                        <div class="clearfix"> </div>
                    </ul>
                    <div class="single-bottom">
                        <a href="#"><p>运动衫</p></a>
                        <a href="#"><p>运动袜</p></a>
                        <a href="#"><p>外套</p></a>
                        <a href="#"><p>运动背心</p></a>
                    </div>
                </div>
                <div class="tab3">
                    <ul class="place">
                        <li class="sort">运动装备</li>
                        <li class="by"><img src="/images/do.png" alt=""></li>
                        <div class="clearfix"> </div>
                    </ul>
                    <div class="single-bottom">
                        <a href="#"><p>手套</p></a>
                        <a href="#"><p>瑜伽垫</p></a>
                        <a href="#"><p>运动器材</p></a>
                    </div>
                </div>
        </section>
        <section  class="sky-form">
            <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>折扣</h4>
            <div class="row row1 scroll-pane">
                <div class="col col-4">
                    <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>低至 - 10% (20)</label>
                </div>
                <div class="col col-4">
                    <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>40% - 50% (5)</label>
                    <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>30% - 20% (7)</label>
                    <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>10% - 5% (2)</label>
                    <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>其他(50)</label>
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
        <%--<section  class="sky-form">
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
        </section>--%>
    </div>
</div>
</body>
</html>
