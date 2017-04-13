$(function () {
    $(".pagination a").click(function () {
        var pagenow;
        var pagepre;
        pagepre=parseInt($("#pagenow").val());
        if($(this).text()=="Prev"){
            if($("#pagenow").val()=="1"){
                pagenow=1;
            }else{
                pagenow=parseInt($("#pagenow").val())-1;
            }
        }else if($(this).text()=="Next"){
            pagenow=parseInt($("#pagenow").val())+1;
        }else{
            pagenow=parseInt($(this).text());
        }
        $.ajax({
            url:'/myshopping/querymenshoes',
            dataType:'json',
            data:{
                page: pagenow+'',
            },
            success:function (data) {
                $("#pagenow").val(pagenow);
                $(".img").each(function(index){
                    $(this).children("img").attr("src","/images/"+data.menshoesDTOs[index].shoesid.toString()+".jpg");
                });
                $(".quick-view").each(function(index){
                    $(this).children("a").attr("href","/myshopping/single?shoesid="+data.menshoesDTOs[index].shoesid.toString());
                });
                $(".item_price").each(function(index){
                    $(this).text(data.menshoesDTOs[index].price.toString());
                });
            }
        });
        

    })



})
