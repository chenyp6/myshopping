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
            $("#introduction").text(data.introduction.toString()+' '+$("#shoesid").val());
            $("#shoesname").text(data.shoesname.toString());
            var shoeslevel=parseInt(data.shoeslevel.toString());
            if(shoeslevel==4){
                $("#shoeslevel4").addClass("active");
            }else{
                $("#shoeslevel4").addClass("active");
                $("#shoeslevel5").addClass("active");
            }
            if(data.evaluationDTOs.length==0){
                var w='<p>对不起，该商品暂时没有评论!</p>';
                $("#messages").append(w);
            }else{
            for(var i=0;i<data.evaluationDTOs.length;i++){
                var w= '<p><span class="glyphicon glyphicon-user"></span><span style="color:black"><span style="color:red">'+data.evaluationDTOs[i].userid+'</span>:</br>&nbsp&nbsp&nbsp&nbsp'+data.evaluationDTOs[i].evaluation+'</span></p>';
                $("#messages").append(w);
                $("#messages").append('<hr/>');
            }
            }
        }
    });


    $("#addtocart").click(function () {
        $.ajax({
            url:"/myshopping/addtocart",
            type : "post",
            dataType:"json",
            chche: false,
            data:{
                'shoesid': $("#shoesid").val(),
                'imagepath':'/images/'+$("#shoesid").val()+".jpg",
                'size':$("#shoessize option:selected").val(),
                'number':$("#number option:selected").val(),
                'price':$("#shoesprice").text()
            },
            success:function (data) {
                if(data.mes.toString()=="1"){
                    alert("添加成功！");
                }else{
                    alert("尚未登录，请登录后再进行操作！");
                }
            }
        });
    })

    $(document).on('click','#buynow',function () {
        var shoesarray=[];
            var shoesid=$("#shoesid").val();
            var salenumber=$("#number option:selected").val();
            var shoestemp={'shoesid':shoesid,'salenumber':salenumber};
            shoesarray.push(shoestemp);
        $.ajax({
            url:'/myshopping/buynow',
            type:"POST",
            dataType:'json',
            contentType:"application/json",
            chche:'false',
            data:JSON.stringify(shoesarray),
            success:function (data) {
                if(data.mes=="-1"){
                    alert("尚未登录，请登录后再进行操作！");
                }else{
                    alert("购买成功!");
                }
            }
        })
    })

})
