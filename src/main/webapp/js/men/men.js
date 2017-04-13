$(function (){
    $(".tab1 .single-bottom").hide();
    $(".tab2 .single-bottom").hide();
    $(".tab3 .single-bottom").hide();
    $(".tab4 .single-bottom").hide();
    $(".tab5 .single-bottom").hide();

    $(".tab1 ul").click(function(){
        $(".tab1 .single-bottom").slideToggle(300);
        $(".tab2 .single-bottom").hide();
        $(".tab3 .single-bottom").hide();
        $(".tab4 .single-bottom").hide();
        $(".tab5 .single-bottom").hide();
    })
    $(".tab2 ul").click(function(){
        $(".tab2 .single-bottom").slideToggle(300);
        $(".tab1 .single-bottom").hide();
        $(".tab3 .single-bottom").hide();
        $(".tab4 .single-bottom").hide();
        $(".tab5 .single-bottom").hide();
    })
    $(".tab3 ul").click(function(){
        $(".tab3 .single-bottom").slideToggle(300);
        $(".tab4 .single-bottom").hide();
        $(".tab5 .single-bottom").hide();
        $(".tab2 .single-bottom").hide();
        $(".tab1 .single-bottom").hide();
    })
    $(".tab4 ul").click(function(){
        $(".tab4 .single-bottom").slideToggle(300);
        $(".tab5 .single-bottom").hide();
        $(".tab3 .single-bottom").hide();
        $(".tab2 .single-bottom").hide();
        $(".tab1 .single-bottom").hide();
    })
    $(".tab5 ul").click(function(){
        $(".tab5 .single-bottom").slideToggle(300);
        $(".tab4 .single-bottom").hide();
        $(".tab3 .single-bottom").hide();
        $(".tab2 .single-bottom").hide();
        $(".tab1 .single-bottom").hide();
    })

    $.ajax({
        url:'/myshopping/querymenshoes',
        dataType:'json',
        data:{
            page:'1',
        },
        success:function (data) {
            $("#pagenow").val('1');
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


});