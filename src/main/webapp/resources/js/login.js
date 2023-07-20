const idPopup = document.getElementById("k-popup-id");
const pwPopup = document.getElementById("k-popup-pw");
const nmInput = document.getElementById("k-inputNm-id");
const pnoInput = document.getElementById("k-inputPno-id");


document.getElementsByClassName("k-popup-out")[0].addEventListener("click", function(){
    idPopup.style.display="none";
})

document.querySelector("#k-login-bottom>a:nth-of-type(1)").addEventListener("click", function(){
    idPopup.style.display="block"
    if(pwPopup.style.display == "block"){
        pwPopup.style.display="none"
    }
})

document.getElementsByClassName("k-popup-out")[1].addEventListener("click", function(){
    pwPopup.style.display="none";
})

document.querySelector("#k-login-bottom>a:nth-of-type(2)").addEventListener("click", function(){
    pwPopup.style.display="block"
    if(idPopup.style.display == "block"){
        idPopup.style.display="none"
    }
})

document.getElementById("k-id-search-btn").addEventListener("click", function(){

    $.ajax({
        url : "idSearch",
        data : {
                "nmInput":nmInput.value,
                "pnoInput":pnoInput.value
            },
        type : "POST",
        dataType : "JSON",

        success : function(idList){

        },
        error : function(){
            console.log("오류발생");
        }
    })
})