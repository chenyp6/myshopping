$(function () {
    $("#childrenshoes").on('click',function () {
        $.ajax({
            url: '/myshopping/querychildrenshoestoadmin',
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
                for (var i = 0; i < data.childrenshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="childrenshoesid">' + data.childrenshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.childrenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="childrenshoesname">' + data.childrenshoesDTOs[i].shoesname + '</td>' +
                        '<td class="childrenshoesprice">' + data.childrenshoesDTOs[i].price + '</td>' +
                        '<td class="childrenshoesintroduction">' + data.childrenshoesDTOs[i].introduction + '</td>' +
                        '<td class="childrenshoeslevel">' + data.childrenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#"  class="changechildrenshoesmsg">修改</a> | <a href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
                $("#PageNum").append('<li><a class="childrenpagenum" href="#">首页</a></li>'+
                    '<li><a class="childrenpagenum" href="#">Prev</a></li>');
                for (var i = 0; i < parseInt(data.childrenshoescounts)/10; i++){
                    $("#PageNum").append('<li><a class="childrenpagenum" href="#">' + (i + 1) + '</a></li>');

                }
                $("#PageNum").append('<li><a class="childrenpagenum" href="#">Next</a></li>')
                $("#MainForm").append('<p class="msg">共找到' + data.childrenshoescounts + '条记录</p>')
                $("#serchbtn").append('<input id="childrenfuzzyserch" type="button" value="查询" >');
                $("#serchtext").append('<input   class="sttl" style="border: hidden" placeholder="查询编号" id="getindex" type="text" />');
            }
        })
    })

    $("#PageNum").on('click', '.childrenpagenum', function () {
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
            url: '/myshopping/querychildrenshoestoadmin',
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
                for (var i = 0; i < data.childrenshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="childrenshoesid">' + data.childrenshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.childrenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="childrenshoesname">' + data.childrenshoesDTOs[i].shoesname + '</td>' +
                        '<td class="childrenshoesprice">' + data.childrenshoesDTOs[i].price + '</td>' +
                        '<td class="childrenshoesintroduction">' + data.childrenshoesDTOs[i].introduction + '</td>' +
                        '<td class="childrenshoeslevel">' + data.childrenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#" class="changechildrenshoesmsg">修改</a> | <a href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }

            }
        });
    })

    $("#serchbtn").on('click','#childrenfuzzyserch',function () {
        $.ajax({
            url: '/myshopping/fuzzyserchchildrenshoes',
            dataType: 'json',
            data:{
                index : $("#getindex").val()
            },
            success:function (data) {
                $(".itemmes").remove();
                $("#pagenow").val('1');
                $("#PageNum").html("");
                $(".msg").remove("");
                for (var i = 0; i < data.childrenshoesDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td class="childrenshoesid">' + data.childrenshoesDTOs[i].shoesid + '</td>' +
                        '<td ><img src="/images/' + data.childrenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td class="childrenshoesname">' + data.childrenshoesDTOs[i].shoesname + '</td>' +
                        '<td class="childrenshoesprice">' + data.childrenshoesDTOs[i].price + '</td>' +
                        '<td class="childrenshoesintroduction">' + data.childrenshoesDTOs[i].introduction + '</td>' +
                        '<td class="childrenshoeslevel">' + data.childrenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td ><a href="#" class="changechildrenshoesmsg">修改</a> | <a href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
            }
        })
    })

    $(document).on("click",".changechildrenshoesmsg",function () {
        $(this).closest(".itemmes").children(".childrenshoesname").html('<input  class="sttl" style="border: hidden;height: 25px;width: 105px; "  value="'+$(this).closest(".itemmes").children(".childrenshoesname").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".childrenshoesprice").html('<input  class="sttl" style="border: hidden;height: 25px;width: 55px; "  value="'+$(this).closest(".itemmes").children(".childrenshoesprice").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".childrenshoesintroduction").html('<input  class="sttl" style="border: hidden;height: 25px; "  value="'+$(this).closest(".itemmes").children(".childrenshoesintroduction").text()+'"  type="text" />');
        $(this).closest(".itemmes").children(".childrenshoeslevel").html('<input  class="sttl" style="border: hidden;height: 25px; width: 55px;"  value="'+$(this).closest(".itemmes").children(".childrenshoeslevel").text()+'"  type="text" />');
        $(this).removeClass("changechildrenshoesmsg");
        $(this).addClass("confirmchildrenshoesmsg");
        $(this).text("确认");
    })

    $(document).on("click",".confirmchildrenshoesmsg",function () {
        var mythis = $(this);
        $.ajax({
            url:'/myshopping/changechildrenshoesmsg',
            dataType:'json',
            data:{
                'shoesid':$(this).closest(".itemmes").children(".childrenshoesid").text(),
                'shoesname':$(this).closest(".itemmes").children(".childrenshoesname").children('input').val(),
                'price':$(this).closest(".itemmes").children(".childrenshoesprice").children('input').val(),
                'introduction':$(this).closest(".itemmes").children(".childrenshoesintroduction").children('input').val(),
                'shoeslevel':$(this).closest(".itemmes").children(".childrenshoeslevel").children('input').val()
            },
            success:function (data) {
                if(data.msg=="1") {
                    alert("修改成功！")
                    mythis.removeClass("confirmchildrenshoesmsg");
                    mythis.addClass("changechildrenshoesmsg");
                    mythis.text("修改");
                    mythis.closest(".itemmes").children(".childrenshoesname").html(mythis.closest(".itemmes").children(".childrenshoesname").children('input').val());
                    mythis.closest(".itemmes").children(".childrenshoesprice").html(mythis.closest(".itemmes").children(".childrenshoesprice").children('input').val());
                    mythis.closest(".itemmes").children(".childrenshoesintroduction").html(mythis.closest(".itemmes").children(".childrenshoesintroduction").children('input').val());
                    mythis.closest(".itemmes").children(".childrenshoeslevel").html(mythis.closest(".itemmes").children(".childrenshoeslevel").children('input').val());
                }else{
                    alert("修改失败！")
                }
            }
        })
    })



})
