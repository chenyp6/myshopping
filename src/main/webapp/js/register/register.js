$(function () {

    $("#changecaptcha").click(function () {
        $.ajax({
            url:"/myshopping/changeCaptcha",
            type : "post",
            success:function (data) {
                $("#captcha").attr("src","/myshopping/Captcha?number="+Math.random());
            }
        });
    });

    $("#userid").blur(function () {
        $.ajax({
            url:"/myshopping/checkuserid",
            type : "post",
            dataType:"json",
            chche: false,
            data:{
                'userid': $("#userid").val()
            },
            success:function (data) {
                if(data.mes.toString()=="1"&&$("#userid").val()!=''){
                    $("#checkuserid").css("color","green");
                    $("#checkuserid").text("√");
                }
                else{
                    $("#checkuserid").css("color","red");
                    $("#checkuserid").text("×");
                }
            }
        });
    });

    $("#pwd").blur(function () {
        if ( $("#pwd").val()!='') {
        $("#checkpwd").css("color", "green");
        $("#checkpwd").text("√");
         }
    });

    $("#confirm").blur(function () {
        if( $("#pwd").val()== $("#confirm").val()&&$("#confirm").val()!=''){
            $("#checkconfirm").css("color","green");
            $("#checkconfirm").text("√");
        }
        else{
            $("#checkconfirm").css("color","red");
            $("#checkconfirm").text("×");
        }
    });

    $("#email").blur(function () {
        if($("#email").val()!='') {
            $("#checkemail").css("color", "green");
            $("#checkemail").text("√");
        }
    });

    $("#phone").blur(function () {
        if($("#phone").val()!='') {
            $("#checkphone").css("color", "green");
            $("#checkphone").text("√");
        }
    });

    $("#rand").blur(function () {
        $.ajax({
            url:"/myshopping/checkrand",
            type : "post",
            dataType:"json",
            chche: false,
            data:{
                'rand': $("#rand").val()
            },
            success:function (data) {
                if(data.mes.toString()=="1"){
                    $("#checkrand").css("color","green");
                    $("#checkrand").text("√");
                }
                else{
                    $("#checkrand").css("color","red");
                    $("#checkrand").text("×");
                }
            }
        });
    });


})