$(function () {
    $("#womenshoes").on('click',function () {
        $.ajax({
            url: '/myshopping/querywomenshoestoadmin',
            dataType: 'json',
            data: {
                page: '1',
            },
            success: function (data) {
                $("#pagenow").val("1");
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
                for (var i = 0; i < data.womenshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="womenshoesid">' + data.womenshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="womenshoesname">' + data.womenshoesDTOs[i].shoesname + '</td>' +
                        '<td class="womenshoesprice">' + data.womenshoesDTOs[i].price + '</td>' +
                        '<td class="womenshoesintroduction">' + data.womenshoesDTOs[i].introduction + '</td>' +
                        '<td class="womenshoeslevel">' + data.womenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#" class="changewomenshoesmsg">修改</a> | <a class="deletewomenshoes" href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
                $("#PageNum").append('<li><a class="womenpagenum" href="#">首页</a></li>'+
                    '<li><a class="womenpagenum" href="#">Prev</a></li>');
                for (var i = 0; i < parseInt(data.womenshoescounts)/10; i++){
                    $("#PageNum").append('<li><a class="womenpagenum" href="#">' + (i + 1) + '</a></li>');

                }
                $("#PageNum").append('<li><a class="womenpagenum" href="#">Next</a></li>')
                $("#MainForm").append('<p class="msg">共找到' + data.womenshoescounts + '条记录</p>')
                $("#serchbtn").append('<input name="" id="womenfuzzyserch" type="button" value="查询" >');
                $("#serchtext").append('<input  class="sttl" style="border: hidden" placeholder="查询编号" id="getindex" type="text" />');
            }
        })
    })

    $("#PageNum").on('click', '.womenpagenum', function () {
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
            url: '/myshopping/querywomenshoestoadmin',
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
                for (var i = 0; i < data.womenshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="womenshoesid">' + data.womenshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="womenshoesname">' + data.womenshoesDTOs[i].shoesname + '</td>' +
                        '<td class="womenshoesprice">' + data.womenshoesDTOs[i].price + '</td>' +
                        '<td class="womenshoesintroduction">' + data.womenshoesDTOs[i].introduction + '</td>' +
                        '<td class="womenshoeslevel">' + data.womenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#" class="changewomenshoesmsg">修改</a> | <a class="deletewomenshoes" href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }

            }
        });
    })

    $("#serchbtn").on('click','#womenfuzzyserch',function () {
        $.ajax({
            url: '/myshopping/fuzzyserchwomenshoes',
            dataType: 'json',
            data:{
                index : $("#getindex").val()
            },
            success:function (data) {
                $(".itemmes").remove();
                $("#pagenow").val('1');
                $("#PageNum").html("");
                $(".msg").remove("");
                for (var i = 0; i < data.womenshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="womenshoesid">' + data.womenshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="womenshoesname">' + data.womenshoesDTOs[i].shoesname + '</td>' +
                        '<td class="womenshoesprice">' + data.womenshoesDTOs[i].price + '</td>' +
                        '<td class="womenshoesintroduction">' + data.womenshoesDTOs[i].introduction + '</td>' +
                        '<td class="womenshoeslevel">' + data.womenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#" class="changewomenshoesmsg">修改</a> | <a class="deletewomenshoes" href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
            }
        })
    })

    $(document).on("click",".changewomenshoesmsg",function () {
        $(this).closest(".itemmes").children(".womenshoesname").html('<input  class="sttl" style="border: hidden;height: 25px;width: 105px; "  value="'+$(this).closest(".itemmes").children(".womenshoesname").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".womenshoesprice").html('<input  class="sttl" style="border: hidden;height: 25px;width: 55px; "  value="'+$(this).closest(".itemmes").children(".womenshoesprice").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".womenshoesintroduction").html('<input  class="sttl" style="border: hidden;height: 25px; "  value="'+$(this).closest(".itemmes").children(".womenshoesintroduction").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".womenshoeslevel").html('<input  class="sttl" style="border: hidden;height: 25px; width: 55px;"  value="'+$(this).closest(".itemmes").children(".womenshoeslevel").text()+'"  type="text" />');
        $(this).removeClass("changewomenshoesmsg");
        $(this).addClass("confirmwomenshoesmsg");
        $(this).text("确认");
    })

    $(document).on("click",".confirmwomenshoesmsg",function () {
        var mythis = $(this);
        $.ajax({
            url:'/myshopping/changewomenshoesmsg',
            dataType:'json',
            data:{
                'shoesid':$(this).closest(".itemmes").children(".womenshoesid").text(),
                'shoesname':$(this).closest(".itemmes").children(".womenshoesname").children('input').val(),
                'price':$(this).closest(".itemmes").children(".womenshoesprice").children('input').val(),
                'introduction':$(this).closest(".itemmes").children(".womenshoesintroduction").children('input').val(),
                'shoeslevel':$(this).closest(".itemmes").children(".womenshoeslevel").children('input').val()
            },
            success:function (data) {
                if(data.msg=="1") {
                    alert("修改成功！")
                    mythis.removeClass("confirmwomenshoesmsg");
                    mythis.addClass("changewomenshoesmsg");
                    mythis.text("修改");
                    mythis.closest(".itemmes").children(".womenshoesname").html(mythis.closest(".itemmes").children(".womenshoesname").children('input').val());
                    mythis.closest(".itemmes").children(".womenshoesprice").html(mythis.closest(".itemmes").children(".womenshoesprice").children('input').val());
                    mythis.closest(".itemmes").children(".womenshoesintroduction").html(mythis.closest(".itemmes").children(".womenshoesintroduction").children('input').val());
                    mythis.closest(".itemmes").children(".womenshoeslevel").html(mythis.closest(".itemmes").children(".womenshoeslevel").children('input').val());
                }else{
                    alert("修改失败！")
                }
            }
        })
    })

    $(document).on('click','.deletewomenshoes',function () {
        $.ajax({
            url:'/myshopping/deletewomenshoes',
            dataType:'json',
            data:{
                'shoesid':$(this).closest(".itemmes").children(".womenshoesid").text(),
                'page':$('#pagenow').val()
            },
            success:function (data) {
                $(".itemmes").remove();
                $(".msg").remove("");
                if(data.msg==1){
                    alert("删除成功！");
                    for (var i = 0; i < data.womenshoesDTOs.length; i++) {
                        var tbody = '<tr class="itemmes">' +
                            '<td class="womenshoesid">' + data.womenshoesDTOs[i].shoesid + '</td>' +
                            '<td><img src="/images/' + data.womenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                            '<td class="womenshoesname">' + data.womenshoesDTOs[i].shoesname + '</td>' +
                            '<td class="womenshoesprice">' + data.womenshoesDTOs[i].price + '</td>' +
                            '<td class="womenshoesintroduction">' + data.womenshoesDTOs[i].introduction + '</td>' +
                            '<td class="womenshoeslevel">' + data.womenshoesDTOs[i].shoeslevel + '</td>' +
                            '<td><a href="#" class="changewomenshoesmsg">修改</a> | <a href="#" class="deletewomenshoes">删除</a></td>' +
                            '</tr>';
                        $('table').append(tbody);
                    }
                }
            }
        })
    })


})
