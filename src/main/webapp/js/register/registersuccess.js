function change(){
        window.clearInterval(mytime);
        window.open("/myshopping/login","_self");
    }
window.setTimeout("change()", 5000);

function test(){
    document.getElementById("myspan").innerText=document.getElementById("myspan").innerText-1;
}
var mytime=window.setInterval("test()", 1000);

