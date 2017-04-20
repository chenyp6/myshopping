$(function () {
    /*var s=$(this);
    var z=parseInt(s.css("z-index"));
    var dt=$(this).children("dt");
    var dd=$(this).children("dd");
    var _show=function(){dd.slideDown(200);dt.addClass("cur");s.css("z-index",z+1);};
    var _hide=function(){dd.slideUp(200);dt.removeClass("cur");s.css("z-index",z);};
    dt.click(function(){dd.is(":hidden")?_show():_hide();});
    dd.find("a").click(function(){dt.html($(this).html());_hide();});
    $("body").click(function(i){ !$(i.target).parents(".select").first().is(s) ? _hide():"";});*/


    $("#addnewshoes").on('click',function () {
        $("table").html("");
        $("#PageNum").html("");
        $(".msg").remove("");
        $("#serchbtn").html("");
        $("#serchtext").html("");
        var w= '<tr>'+
            '<th width="100">id <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="shoesid" type="text"  placeholder="请输入id"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">名称 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="shoesname" type="text"  placeholder="名称"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">价格 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="price" type="text"  placeholder="请输入价格（美元）"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">介绍 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="introduction" type="text"  placeholder="请输入介绍"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">等级 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="shoeslevel" type="text"  placeholder="请输入等级"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th>类型 <span class="f_cB">*</span></th>'+
            '<td>'+
            '<select class="selectbox" name="shoestype" id="shoeskind" style="width:230px;">'+
            '<option class="select" >menshoes</option>'+
            '<option class="select" >womenshoes</option>'+
            '<option class="select" >childrenshoes</option>'+
            '</select>'+
            '</td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">主图 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="showimage" type="file" size="5" value="11498"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">展示图1 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="showimage" type="file" size="5" value="11498"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">展示图2 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="showimage" type="file" size="5" value="11498"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">展示图3 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="showimage" type="file" size="5" value="11498"></div></td>'+
            '</tr>'+
            '<tr>'+
            '<th width="100">展示图4 <span class="f_cB">*</span></th>'+
            '<td><div class="txtbox floatL" style="width:100px;"><input name="showimage" type="file" size="5" value="11498"></div></td>'+
            '</tr>'+
            '<tr class="btn_box">'+
            '<td><div class="btn_box floatR"><input id="submit" style="margin-left: 30px;" type="button" value="上传" ></div></td>'+
            '</tr>';
        $("table").append(w);
    })

    $(document).on('click','#submit',function () {
        $("#newshoes").ajaxSubmit({
                url:'/myshopping/addnewshoes',
                type: 'post',
                cache:'false',
                success:function(data){
                    if(data.msg=="1"){
                        alert("上传成功！");
                    }
                }
            })
    })

})
