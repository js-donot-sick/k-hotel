const idPopup = document.getElementById("k-popup-id");
const pwPopup = document.getElementById("k-popup-pw");
const nmInput = document.getElementsByName("k-inputNm-id")[0];
const pnoInput = document.getElementsByName("k-inputPno-id")[0]; /* 아이디 찾기 용 변수 */

const id = document.querySelector("#k-id-result span");
const pw = document.querySelector("#k-pw-result span");

const pInputNm = document.getElementsByName("k-inputNm-pw")[0];
const pInputPno = document.getElementsByName("k-inputPno-pw")[0];
const pInputId = document.getElementsByName("k-inputId-pw")[0];


document.getElementsByClassName("k-popup-out")[0].addEventListener("click", function(){
    idPopup.style.display="none";
    id.innerText="";
    nmInput.value="";
    pnoInput.value="";
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

    id.innerText="";

    $.ajax({
        url : "idSearch",
        data : {
                "nmInput":nmInput.value,
                "pnoInput":pnoInput.value
            },
        type : "POST",
        dataType : "JSON",

        success : function(result){
            if(result!=null){
                id.innerHTML="아이디 : " + result;
            } else {
                id.innerText="일치하는 회원이 없습니다.";
            }
        },
        error : function(){
            console.log("오류발생");

            console.log("상태코드 : " + request.status); // 404, 500

            console.log(request.responseText); // 에러 메세지

            console.log(error); // 에러 객체 출력

        }
    })
})


document.getElementById("k-pw-search-btn").addEventListener("click", function(){

    id.innerText="";

    $.ajax({
        url : "tempPw",
        data : {
                "pInputNm":pInputNm.value,
                "pInputPno":pInputPno.value,
                "pInputId":pInputId.value
            },
        type : "POST",

        success : function(pw){
            if(result!=null){
                id.innerHTML=" 비밀번호 : " + pw;
            } else {
                id.innerText="일치하는 회원이 없습니다.";
            }
        },
        error : function(){
            console.log("오류발생");

            console.log("상태코드 : " + request.status); // 404, 500

            console.log(request.responseText); // 에러 메세지

            console.log(error); // 에러 객체 출력

        }
    })
})