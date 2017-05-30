$(function () {
    $(document).on('click','#womenshoessale',function () {
        $.ajax({
            url:'/myshopping/querywomenshoessaletoadmin',
            dataType: 'json',
            data: {
                page: '1',
            },
            success: function (data){
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
                    '<th>本季度销售量</th>' +
                    '</tr>'
                $('table').append(thead);
                for (var i = 0; i < data.womenshoessaleDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td >' + data.womenshoessaleDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoessaleDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td >' + data.womenshoessaleDTOs[i].shoesname + '</td>' +
                        '<td >' + data.womenshoessaleDTOs[i].price + '</td>' +
                        '<td >' + data.womenshoessaleDTOs[i].introduction + '</td>' +
                        '<td >' + data.womenshoessaleDTOs[i].shoeslevel + '</td>' +
                        '<td>&nbsp&nbsp' + data.womenshoessaleDTOs[i].salenumber + '&nbsp&nbsp</td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
                $("#PageNum").append('<li><a class="womenshoessalepagenum" href="#">首页</a></li>'+
                    '<li><a class="womenshoessalepagenum" href="#">Prev</a></li>');
                for (var i = 0; i < parseInt(data.womenshoessalecounts)/10; i++){
                    $("#PageNum").append('<li><a class="womenshoessalepagenum" href="#">' + (i + 1) + '</a></li>');

                }
                $("#PageNum").append('<li><a class="womenshoessalepagenum" href="#">Next</a></li>')
                $("#MainForm").append('<p class="msg">共找到' + data.womenshoessalecounts + '条记录</p>')
                $("#serchbtn").append('<input name="" id="womenshoessalefuzzyserch" type="button" value="查询" >');
                $("#serchtext").append('<input  class="sttl" style="border: hidden" placeholder="查询编号" id="getindex" type="text" />');
            }
        })
    })

    $("#PageNum").on('click', '.womenshoessalepagenum', function () {
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
            url: '/myshopping/querywomenshoessaletoadmin',
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
                for (var i = 0; i < data.womenshoessaleDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td>' + data.womenshoessaleDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoessaleDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td>' + data.womenshoessaleDTOs[i].shoesname + '</td>' +
                        '<td>' + data.womenshoessaleDTOs[i].price + '</td>' +
                        '<td>' + data.womenshoessaleDTOs[i].introduction + '</td>' +
                        '<td>' + data.womenshoessaleDTOs[i].shoeslevel + '</td>' +
                        '<td>&nbsp&nbsp' + data.womenshoessaleDTOs[i].salenumber + '&nbsp&nbsp</td>' +
                        '</tr>';
                    $('table').append(tbody);
                }

            }
        });
    })

    $("#serchbtn").on('click','#womenshoessalefuzzyserch',function () {
        $.ajax({
            url: '/myshopping/fuzzyserchwomenshoessale',
            dataType: 'json',
            data:{
                index : $("#getindex").val()
            },
            success:function (data) {
                $(".itemmes").remove();
                $("#pagenow").val('1');
                $("#PageNum").html("");
                $(".msg").remove("");
                for (var i = 0; i < data.womenshoessaleDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td >' + data.womenshoessaleDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.womenshoessaleDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td >' + data.womenshoessaleDTOs[i].shoesname + '</td>' +
                        '<td >' + data.womenshoessaleDTOs[i].price + '</td>' +
                        '<td >' + data.womenshoessaleDTOs[i].introduction + '</td>' +
                        '<td >' + data.womenshoessaleDTOs[i].shoeslevel + '</td>' +
                        '<td>&nbsp&nbsp' + data.womenshoessaleDTOs[i].salenumber + '&nbsp&nbsp</td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
            }
        })
    })

})