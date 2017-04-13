$(function () {
        $.ajax({
            url:"/myshopping/queryhall",
            type : "post",
            dataType:"json",
            chche: false,
            success:function (data) {
                $("#indexshoes1").attr("src","/images/"+data.indexshoes1.shoesid.toString()+".jpg");
                $("#indexshoes2").attr("src","/images/"+data.indexshoes2.shoesid.toString()+".jpg");
                $("#indexshoes3").attr("src","/images/"+data.indexshoes3.shoesid.toString()+".jpg");
                $("#indexshoes4").attr("src","/images/"+data.indexshoes4.shoesid.toString()+".jpg");
                $("#indexshoes5").attr("src","/images/"+data.indexshoes5.shoesid.toString()+".jpg");
                $("#indexshoes6").attr("src","/images/"+data.indexshoes6.shoesid.toString()+".jpg");
                $("#indexshoesqv1").attr("href","/myshopping/single?shoesid="+data.indexshoes1.shoesid.toString());
                $("#indexshoesqv2").attr("href","/myshopping/single?shoesid="+data.indexshoes2.shoesid.toString());
                $("#indexshoesqv3").attr("href","/myshopping/single?shoesid="+data.indexshoes3.shoesid.toString());
                $("#indexshoesqv4").attr("href","/myshopping/single?shoesid="+data.indexshoes4.shoesid.toString());
                $("#indexshoesqv5").attr("href","/myshopping/single?shoesid="+data.indexshoes5.shoesid.toString());
                $("#indexshoesqv6").attr("href","/myshopping/single?shoesid="+data.indexshoes6.shoesid.toString());
                $("#item_price1").text('$'+data.indexshoes1.price.toString());
                $("#item_price2").text('$'+data.indexshoes2.price.toString());
                $("#item_price3").text('$'+data.indexshoes3.price.toString());
                $("#item_price4").text('$'+data.indexshoes4.price.toString());
                $("#item_price5").text('$'+data.indexshoes5.price.toString());
                $("#item_price6").text('$'+data.indexshoes6.price.toString());

            }
        })
    if($("#userexits").val()!="1"){
            $("#welcome").css("display","none");
    }
        if($("#userexits").val()=="1"){
            $("#signup").css("display","none");
            $("#login").text("Logout");
            $("#login").attr("href","/myshopping/logout");
        }
})
