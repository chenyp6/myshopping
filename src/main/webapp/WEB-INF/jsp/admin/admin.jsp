<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="generator" content="" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
    <link href="/css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
    <link href="/css/print.css" rel="stylesheet" type="text/css"  media="print" />
    <link href="/css/adminstyle.css" rel="stylesheet" type="text/css"  media="print" />
    <script src="/js/tool/jquery-2.1.4.min.js"></script>
    <script src="/js/admin/side.js" type="text/javascript"></script>
    <script src="/js/admin/admin.js"></script>
    <script src="/js/admin/menshoes.js"></script>
    <script src="/js/admin/womenshoes.js"></script>
    <script src="/js/admin/childrenshoes.js"></script>
    <script src="/js/admin/addnewshoes.js"></script>
    <script src="/js/tool/jquery-form.js"></script>
    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
    <![endif]-->
</head>
<body>
<input type="hidden" id="pagenow" value="1">
<div class="wrap_left" id="frmTitle" name="fmTitle">
    <div id="Logo"><span>人单合一</span></div>
    <div class="menu_list">
        <dl>
            <dt><span>男子商品管理</span></dt>
            <dd><a id="menshoes" href="javascript:void(0);" >男子鞋类</a>
                <a href="" >二级分类</a>
                <a href=""  >二级分类</a>
                <a href="" >二级分类</a></dd>

            <dt><span>女子商品管理</span></dt>
            <dd><a id="womenshoes" href="javascript:void(0);">女子鞋类</a>
                <a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a></dd>

            <dt><span>儿童商品管理</span></dt>
            <dd><a id="childrenshoes" href="javascript:void(0);">儿童鞋类</a>
                <a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a></dd>

            <dt><span>新增商品</span></dt>
            <dd><a id="addnewshoes" href="javascript:void(0);" title="二级分类">新增商品</a>
                <a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a></dd>
        </dl>
    </div>
</div>
<div class="picBox" onclick="switchSysBar()" id="switchPoint"></div>
<div class="wrap_right">
    <header>
        <div id="Header">
            <div id="Head">
                <h1 title="Myshopping系统管理后台"><img src="/images/common/pci.jpg" width="398" height="26" ></h1>
                <script language="javascript">
                    function showmenu(id){id.style.visibility = "visible";}
                    function hidmenu(){UserList.style.visibility = "hidden";}
                    document.onclick = hidmenu;
                </script>
                <div class="user"><a href="javascript:showmenu(UserList)">admin</a>
                    <div id="UserList"><a href="">修改</a>
                        <a href="">注销</a>
                        <a href="">退出</a></div>
                </div>
            </div>
        </div>
    </header>
    <div id="Contents">
        <div id="TopMain">
            <div id="serchtext" class="selectbox floatL mag_r20">
            </div>
            <div id="serchbtn" class="btn_box floatL "></div>
        </div>
        <div id="MainForm">
            <div class="form_boxA">
                <form role="form" id="newshoes" method="post" enctype="multipart/form-data">
                <table cellpadding="0" cellspacing="0">
                </table>
                </form>
            </div>
        </div>
        <ul id="PageNum">
        </ul>
    </div>


</div>
</body>
</html>
