$(function () {
    var userexits=$("#userexits").val();
    if(userexits==''){
        $("#welcome").css("display","none");
    }
    else{
        $("#signup").css("display","none");
        $("#login").text("退出");
        $("#login").attr("href","/myshopping/logout");
    }
})
