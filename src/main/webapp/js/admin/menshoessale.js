$(function () {
    $(document).on('click','#menshoessale',function () {
        $.ajax({
            url:'/myshopping/querymenshoessaletoadmin',
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
                for (var i = 0; i < data.menshoessaleDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td >' + data.menshoessaleDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.menshoessaleDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td >' + data.menshoessaleDTOs[i].shoesname + '</td>' +
                        '<td >' + data.menshoessaleDTOs[i].price + '</td>' +
                        '<td >' + data.menshoessaleDTOs[i].introduction + '</td>' +
                        '<td >' + data.menshoessaleDTOs[i].shoeslevel + '</td>' +
                        '<td>&nbsp&nbsp' + data.menshoessaleDTOs[i].salenumber + '&nbsp&nbsp</td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
                $("#PageNum").append('<li><a class="menshoessalepagenum" href="#">首页</a></li>'+
                    '<li><a class="menshoessalepagenum" href="#">Prev</a></li>');
                for (var i = 0; i < parseInt(data.menshoessalecounts)/10; i++){
                    $("#PageNum").append('<li><a class="menshoessalepagenum" href="#">' + (i + 1) + '</a></li>');

                }
                $("#PageNum").append('<li><a class="menshoessalepagenum" href="#">Next</a></li>')
                $("#MainForm").append('<p class="msg">共找到' + data.menshoessalecounts + '条记录</p>')
                $("#serchbtn").append('<input name="" id="menshoessalefuzzyserch" type="button" value="查询" >');
                $("#serchtext").append('<input  class="sttl" style="border: hidden" placeholder="查询编号" id="getindex" type="text" />');
            }
        })
    })

    $("#PageNum").on('click', '.menshoessalepagenum', function () {
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
            url: '/myshopping/querymenshoessaletoadmin',
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
                for (var i = 0; i < data.menshoessaleDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td>' + data.menshoessaleDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.menshoessaleDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td>' + data.menshoessaleDTOs[i].shoesname + '</td>' +
                        '<td>' + data.menshoessaleDTOs[i].price + '</td>' +
                        '<td>' + data.menshoessaleDTOs[i].introduction + '</td>' +
                        '<td>' + data.menshoessaleDTOs[i].shoeslevel + '</td>' +
                        '<td>&nbsp&nbsp' + data.menshoessaleDTOs[i].salenumber + '&nbsp&nbsp</td>' +
                        '</tr>';
                    $('table').append(tbody);
                }

            }
        });
    })

    $("#serchbtn").on('click','#menshoessalefuzzyserch',function () {
        $.ajax({
            url: '/myshopping/fuzzyserchmenshoessale',
            dataType: 'json',
            data:{
                index : $("#getindex").val()
            },
            success:function (data) {
                $(".itemmes").remove();
                $("#pagenow").val('1');
                $("#PageNum").html("");
                $(".msg").remove("");
                for (var i = 0; i < data.menshoessaleDTOs.length; i++) {
                    var tbody = '<tr class="itemmes">' +
                        '<td >' + data.menshoessaleDTOs[i].shoesid + '</td>' +
                        '<td><img src="/images/' + data.menshoessaleDTOs[i].shoesid + '.jpg" style="width: 135px;"></td>' +
                        '<td >' + data.menshoessaleDTOs[i].shoesname + '</td>' +
                        '<td >' + data.menshoessaleDTOs[i].price + '</td>' +
                        '<td >' + data.menshoessaleDTOs[i].introduction + '</td>' +
                        '<td >' + data.menshoessaleDTOs[i].shoeslevel + '</td>' +
                        '<td>&nbsp&nbsp' + data.menshoessaleDTOs[i].salenumber + '&nbsp&nbsp</td>' +
                        '</tr>';
                    $('table').append(tbody);
                }
            }
        })
    })

})
