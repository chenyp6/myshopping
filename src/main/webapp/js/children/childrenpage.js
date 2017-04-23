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
            url:'/myshopping/querychildrenshoes',
            dataType:'json',
            data:{
                page: pagenow+'',
            },
            success:function (data) {
                $("#pagenow").val(pagenow);
                $(".simpleCart_shelfItem").css("display","block");
                if(data.childrenshoesDTOs.length<12){
                    $(".quick-view").each(function (index) {
                        if(index>=data.childrenshoesDTOs.length){
                            $(this).closest(".simpleCart_shelfItem").css("display","none");
                        }
                    })
                }
                $(".img").each(function(index){
                    $(this).children("img").attr("src","/images/"+data.childrenshoesDTOs[index].shoesid.toString()+".jpg");
                });
                $(".quick-view").each(function(index){
                    $(this).children("a").attr("href","/myshopping/single?shoesid="+data.childrenshoesDTOs[index].shoesid.toString());
                });
                $(".item_price").each(function(index){
                    $(this).text(data.childrenshoesDTOs[index].price.toString());
                });
            }
        });
        

    })



})
