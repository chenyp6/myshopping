$(function () {
    $("#womenshoes").on('click',function () {
        $.ajax({
            url: 'querywomenshoestoadmin',
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
                        '<td>' + data.womenshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td>' + data.womenshoesDTOs[i].shoesname + '</td>' +
                        '<td>' + data.womenshoesDTOs[i].price + '</td>' +
                        '<td>' + data.womenshoesDTOs[i].introduction + '</td>' +
                        '<td>' + data.womenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#">修改</a> | <a href="#">删除</a></td>' +
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
                $("#serchbtn").append('<input name="" type="button" value="查询" >');
                $("#serchtext").append('<input  class="sttl" style="border: hidden" placeholder="查询编号" id="getshoesid" type="text" />');
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
                        '<td>' + data.womenshoesDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoesDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td>' + data.womenshoesDTOs[i].shoesname + '</td>' +
                        '<td>' + data.womenshoesDTOs[i].price + '</td>' +
                        '<td>' + data.womenshoesDTOs[i].introduction + '</td>' +
                        '<td>' + data.womenshoesDTOs[i].shoeslevel + '</td>' +
                        '<td><a href="#">修改</a> | <a href="#">删除</a></td>' +
                        '</tr>';
                    $('table').append(tbody);
                }

            }
        });
    })
})
