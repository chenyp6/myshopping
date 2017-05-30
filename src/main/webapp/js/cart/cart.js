$(function (){
    $.ajax({
        url:'/myshopping/querycart',
        dataType:'json',
        success:function (data) {
            var total=0;
            for(var i=0;i<data.cartDTOs.length;i++) {
                var w = '<div class="cart-header">' +
                    '<div class="close"><input type="hidden" value="'+data.cartDTOs[i].shoesid+'"><span  class="glyphicon glyphicon-remove" aria-hidden="true"></span></div>' +
                    '<div class="cart-sec simpleCart_shelfItem">' +
                    '<div class="cart-item cyc">' +
                    '<img src="' + data.cartDTOs[i].imagepath + '" class="img-responsive" alt=""/>' +
                    '</div>' +
                    '<div class="cart-item-info">' +
                    '<ul class="qty">' +
                    '<li><p>尺码 : ' + data.cartDTOs[i].size + '</p></li>' +
                    '<li><p>数量 : <span class="number">' + data.cartDTOs[i].number + '</span></p></li>' +
                    '<li><p>单价 :<span class="price">' + data.cartDTOs[i].price + '</span></p></li>' +
                    '</ul>' +
                    '<div class="delivery">' +
                    '<p>服务费 : Rs.0.00</p>' +
                    '<span>商品将于两到三个工作日送达</span>' +
                    '<div class="clearfix"></div>' +
                    '</div>' +
                    '</div>' +
                    '<div class="clearfix"></div>' +

                    '</div>' +
                    '</div>'
                $("#cart").append(w);
                total+=parseInt(data.cartDTOs[i].price)*data.cartDTOs[i].number;
            }
            $("#total").text(total);
            $("#last_price").text(total);
        }

    });


        $(document).on('click','.close',function(c){
            $(this).fadeOut('slow', function(c){
                $(this).closest('.cart-header').remove();
                var t=parseInt($(this).closest('.cart-header').find(".price").text())*parseInt($(this).closest('.cart-header').find(".number").text());
                $("#total").text(parseInt($("#total").text())-t);
                $("#last_price").text(parseInt($("#last_price").text())-t);
            });
            $.ajax({
                url:'/myshopping/deleteshoes',
                dataType:'json',
                data:{
                    shoesid:$(this).children('input').val()
                },
                success:function (data) {

                }
            })
        });

    $(document).on('click','#pay',function () {
        var shoesarray=[];
        $('.close').each(function(index){
            var shoesid=$(this).children('input').val();
            var salenumber=$(this).closest('.cart-header').find(".number").text();
            var shoestemp={'shoesid':shoesid,'salenumber':salenumber};
            shoesarray.push(shoestemp);
        });
        $.ajax({
            url:'/myshopping/pay',
            type:"POST",
            dataType:'json',
            contentType:"application/json",
            chche:'false',
            data:JSON.stringify(shoesarray),
            success:function (data) {
                alert("购买成功!");
                $('.cart-header').remove();
                $("#total").text(0);
                $("#last_price").text(0);
            }
        })
    })


})
