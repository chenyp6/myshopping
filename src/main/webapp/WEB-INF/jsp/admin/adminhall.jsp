<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <%@include file="/WEB-INF/jsp/tool/admintool/admintool.jsp"%>
</head>
<body>
<input type="hidden" id="pagenow" value="1">
<div class="wrap_left" id="frmTitle" name="fmTitle">
    <div id="Logo"><span>人单合一</span></div>
    <div class="menu_list">
        <dl>
            <dt><span>男子商品管理</span></dt>
            <dd><a id="menshoes" href="javascript:void(0);" >男子鞋类</a>
                <a id="menshoessale" href="javascript:void(0);" >销售情况</a>
                <%--<a href=""  >二级分类</a>
                <a href="" >二级分类</a>--%></dd>

            <dt><span>女子商品管理</span></dt>
            <dd><a id="womenshoes" href="javascript:void(0);">女子鞋类</a>
                <a id="womenshoessale" href="javascript:void(0);" >销售情况</a>
                <%--<a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a>--%></dd>

            <dt><span>儿童商品管理</span></dt>
            <dd><a id="childrenshoes" href="javascript:void(0);">儿童鞋类</a>
                <a id="childrenshoessale" href="javascript:void(0);" >销售情况</a>
                <%--<a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a>--%></dd>

            <dt><span>新增商品</span></dt>
            <dd><a id="addnewshoes" href="javascript:void(0);" title="二级分类">新增商品</a>
                <%--<a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a>
                <a href="" title="二级分类">二级分类</a>--%></dd>
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
                <div class="user"><a href="javascript:showmenu(UserList)">${adminid}</a>
                    <div id="UserList"><a href="/myshopping/admin">退出</a>
                        </div>
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
