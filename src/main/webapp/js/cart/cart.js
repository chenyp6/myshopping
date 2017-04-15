$(function (){
    $.ajax({
        url:'/myshopping/querycart',
        dataType:'json',
        success:function (data) {
            var total=0;
            for(var i=0;i<data.cartDTOs.length;i++) {
                var w = '<div class="cart-header">' +
                    '<div class="close"><span  class="glyphicon glyphicon-remove" aria-hidden="true"></span></div>' +
                    '<div class="cart-sec simpleCart_shelfItem">' +
                    '<div class="cart-item cyc">' +
                    '<img src="' + data.cartDTOs[i].imagepath + '" class="img-responsive" alt=""/>' +
                    '</div>' +
                    '<div class="cart-item-info">' +
                    '<ul class="qty">' +
                    '<li><p>Size : ' + data.cartDTOs[i].size + '</p></li>' +
                    '<li><p>Qty : <span class="number">' + data.cartDTOs[i].number + '</span></p></li>' +
                    '<li><p>Price each :<span class="price">' + data.cartDTOs[i].price + '</span></p></li>' +
                    '</ul>' +
                    '<div class="delivery">' +
                    '<p>Service Charges : Rs.190.00</p>' +
                    '<span>Delivered in 2-3 bussiness days</span>' +
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
        });
})
