$(function () {
    $("#menshoes").on('click',function () {
        $.ajax({
            url: '/myshopping/querymenshoestoadmin',
            dataType: 'json',
            data: {
                page: '1',
            },
            success: function (data) {
                $("#pagenow").val(1);
                $("table").html("");
                $("#PageNum").html("");
                $(".msg").remove("");
                $("#serchbtn").html("");
                $("#serchtext").html("");
                var thead = '<tr class="tablehead">' +
                    '<th>id</th>' +
                    '<th>样图</th>' +
                    '<th>名称</th>' +
                    '<th>价格</th>' +
                    '<th>介绍</th>' +
                    '<th>等级</th>' +
                    '<th>操作</th>' +
                    '</tr>'
                $('table').append(thead);
                for (var i = 0; i < data.menshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="menshoesid">' + data.menshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.menshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="menshoesname">' + data.menshoesDTOs[i].shoesname + '</td>' +
                        '<td class="menshoesprice">' + data.menshoesDTOs[i].price + '</td>' +
                        '<td class="menshoesintroduction">' + data.menshoesDTOs[i].introduction + '</td>' +
                        '<td class="menshoeslevel">' + data.menshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#" class="changemenshoesmsg">修改</a> | <a href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
                $("#PageNum").append('<li><a class="menpagenum" href="#">首页</a></li>'+
                    '<li><a class="menpagenum" href="#">Prev</a></li>');
                for (var i = 0; i < parseInt(data.menshoescounts)/10; i++){
                    $("#PageNum").append('<li><a class="menpagenum" href="#">' + (i + 1) + '</a></li>');

                }
                $("#PageNum").append('<li><a class="menpagenum" href="#">Next</a></li>')
                $("#MainForm").append('<p class="msg">共找到' + data.menshoescounts + '条记录</p>')
                $("#serchbtn").append('<input name="" id="menfuzzyserch" type="button" value="查询" >');
                $("#serchtext").append('<input  class="sttl" style="border: hidden" placeholder="查询编号" id="getindex" type="text" />');
            }
        })
    })

    $("#PageNum").on('click', '.menpagenum', function () {
        var pagenow;
        var pagepre;
        pagepre = parseInt($("#pagenow").val());
        if($(this).text() == "首页"){
            pagenow = 1;
        }else if ($(this).text() == "Prev") {
            if ($("#pagenow").val() == "1") {
                pagenow = 1;
            } else {
                pagenow = parseInt($("#pagenow").val()) - 1;
            }
        } else if ($(this).text() == "Next") {
            pagenow = parseInt($("#pagenow").val()) + 1;
        } else {
            pagenow = parseInt($(this).text());
        }
        $.ajax({
            url: '/myshopping/querymenshoestoadmin',
            dataType: 'json',
            data: {
                page: pagenow+"",
            },
            success: function (data) {
                $('html,body').animate({
                    scrollTop:0
                },800);
                $(".itemmes").remove();
                $("#pagenow").val(pagenow);
                for (var i = 0; i < data.menshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="menshoesid">' + data.menshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.menshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="menshoesname">' + data.menshoesDTOs[i].shoesname + '</td>' +
                        '<td class="menshoesprice">' + data.menshoesDTOs[i].price + '</td>' +
                        '<td class="menshoesintroduction">' + data.menshoesDTOs[i].introduction + '</td>' +
                        '<td class="menshoeslevel">' + data.menshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#" class="changemenshoesmsg">修改</a> | <a href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }

            }
        });
    })
    
    $("#serchbtn").on('click','#menfuzzyserch',function () {
        $.ajax({
            url: '/myshopping/fuzzyserchmenshoes',
            dataType: 'json',
            data:{
                index : $("#getindex").val()
            },
            success:function (data) {
                $(".itemmes").remove();
                $("#pagenow").val('1');
                $("#PageNum").html("");
                $(".msg").remove("");
                for (var i = 0; i < data.menshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="menshoesid">' + data.menshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.menshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="menshoesname">' + data.menshoesDTOs[i].shoesname + '</td>' +
                        '<td class="menshoesprice">' + data.menshoesDTOs[i].price + '</td>' +
                        '<td class="menshoesintroduction">' + data.menshoesDTOs[i].introduction + '</td>' +
                        '<td class="menshoeslevel">' + data.menshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#" class="changemenshoesmsg">修改</a> | <a href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
            }
        })
    })

    $(document).on("click",".changemenshoesmsg",function () {
        $(this).closest(".itemmes").children(".menshoesname").html('<input  class="sttl" style="border: hidden;height: 25px;width: 105px; "  value="'+$(this).closest(".itemmes").children(".menshoesname").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".menshoesprice").html('<input  class="sttl" style="border: hidden;height: 25px;width: 55px; "  value="'+$(this).closest(".itemmes").children(".menshoesprice").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".menshoesintroduction").html('<input  class="sttl" style="border: hidden;height: 25px; "  value="'+$(this).closest(".itemmes").children(".menshoesintroduction").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".menshoeslevel").html('<input  class="sttl" style="border: hidden;height: 25px; width: 55px;"  value="'+$(this).closest(".itemmes").children(".menshoeslevel").text()+'"  type="text" />');
        $(this).removeClass("changemenshoesmsg");
        $(this).addClass("confirmmenshoesmsg");
        $(this).text("确认");
    })

    $(document).on("click",".confirmmenshoesmsg",function () {
        var mythis = $(this);
        $.ajax({
            url:'/myshopping/changemenshoesmsg',
            dataType:'json',
            data:{
                'shoesid':$(this).closest(".itemmes").children(".menshoesid").text(),
                'shoesname':$(this).closest(".itemmes").children(".menshoesname").children('input').val(),
                'price':$(this).closest(".itemmes").children(".menshoesprice").children('input').val(),
                'introduction':$(this).closest(".itemmes").children(".menshoesintroduction").children('input').val(),
                'shoeslevel':$(this).closest(".itemmes").children(".menshoeslevel").children('input').val()
            },
            success:function (data) {
                if(data.msg=="1") {
                    alert("修改成功！")
                    mythis.removeClass("confirmmenshoesmsg");
                    mythis.addClass("changemenshoesmsg");
                    mythis.text("修改");
                    mythis.closest(".itemmes").children(".menshoesname").html(mythis.closest(".itemmes").children(".menshoesname").children('input').val());
                    mythis.closest(".itemmes").children(".menshoesprice").html(mythis.closest(".itemmes").children(".menshoesprice").children('input').val());
                    mythis.closest(".itemmes").children(".menshoesintroduction").html(mythis.closest(".itemmes").children(".menshoesintroduction").children('input').val());
                    mythis.closest(".itemmes").children(".menshoeslevel").html(mythis.closest(".itemmes").children(".menshoeslevel").children('input').val());
                }else{
                    alert("修改失败！")
                }
            }
        })
    })
    
})
