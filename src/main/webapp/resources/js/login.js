const idPopup = document.getElementById("k-popup-id")
const pwPopup = document.getElementById("k-popup-pw")



document.getElementsByClassName("k-popup-out")[0].addEventListener("click", function(){
    idPopup.style.display="none";
})

document.querySelector("#k-login-bottom>a:nth-of-type(1)").addEventListener("click", function(){
    idPopup.style.display="block"
})

document.getElementsByClassName("k-popup-out")[1].addEventListener("click", function(){
    pwPopup.style.display="none";
})

document.querySelector("#k-login-bottom>a:nth-of-type(2)").addEventListener("click", function(){
    pwPopup.style.display="block"
})