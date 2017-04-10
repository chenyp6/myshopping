$(function () {
        $.ajax({
            url:"/myshopping/queryindex",
            type : "post",
            dataType:"json",
            chche: false,
            success:function (data) {
                $("#indexshoes1").attr("src","/images/"+data.indexshoes1.toString()+".jpg");
                $("#indexshoes2").attr("src","/images/"+data.indexshoes2.toString()+".jpg");
                $("#indexshoes3").attr("src","/images/"+data.indexshoes3.toString()+".jpg");
                $("#indexshoes4").attr("src","/images/"+data.indexshoes4.toString()+".jpg");
                $("#indexshoes5").attr("src","/images/"+data.indexshoes5.toString()+".jpg");
                $("#indexshoes6").attr("src","/images/"+data.indexshoes6.toString()+".jpg");
                $("#indexshoesqv1").attr("href","/myshopping/single?shoesid="+data.indexshoes1.toString());
                $("#indexshoesqv2").attr("href","/myshopping/single?shoesid="+data.indexshoes2.toString());
                $("#indexshoesqv3").attr("href","/myshopping/single?shoesid="+data.indexshoes3.toString());
                $("#indexshoesqv4").attr("href","/myshopping/single?shoesid="+data.indexshoes4.toString());
                $("#indexshoesqv5").attr("href","/myshopping/single?shoesid="+data.indexshoes5.toString());
                $("#indexshoesqv6").attr("href","/myshopping/single?shoesid="+data.indexshoes6.toString());

            }
        })
})
