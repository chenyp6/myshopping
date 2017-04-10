$(function () {

    $.ajax({
        url:"/myshopping/querysingle",
        type : "post",
        dataType:"json",
        chche: false,
        data:{
            'shoesid': $("#shoesid").val()
        },
        success:function (data) {
            $("#shoesprice").text(data.shoesprice.toString());
            $("#introduction").text(data.introduction.toString());
            $("#shoesname").text(data.shoesname.toString());
            var shoeslevel=parseInt(data.shoeslevel.toString());
            if(shoeslevel==4){
                $("#shoeslevel4").addClass("active");
            }else{
                $("#shoeslevel4").addClass("active");
                $("#shoeslevel5").addClass("active");
            }
        }
    });


    $("#AddToCart").click(function () {
        $.ajax({
            url:"/myshopping/addtocart",
            type : "post",
            dataType:"json",
            chche: false,
            data:{
                'userid': '123',
                'shoesid': $("#shoesid").val(),
                'imagepath':'/images/'+$("#shoesid").val()+".jsp",
                'size':$("#shoessize option:selected").val(),
                'number':$("#number option:selected").val(),
                'price':$("#shoesprice").text()
            },
            success:function (data) {
                if(data.mes.toString()=="1"){
                    alert("添加成功！");
                }else{
                    alert("添加失败！")
                }
            }
        });
    })
})
