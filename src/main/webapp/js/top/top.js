$(function () {
    var userexits=$("#userexits").val();
    if(userexits==''){
        $("#welcome").css("display","none");
    }
    else{
        $("#signup").css("display","none");
        $("#login").text("Logout");
        $("#login").attr("href","/myshopping/logout");
    }
})
