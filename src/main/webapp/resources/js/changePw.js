document.getElementById("newPw").addEventListener("keyup", function(){

    const LM2= document.getElementById("LM2");
    const newPw2 = document.getElementById("newPw2");
    const LM3 = document.getElementById("LM3");
    

    const regExp = /^([A-Z]|[a-z]|[0-9]|[\~\!\@\$]){8,15}$/;

    if(regExp.test(this.value)){
        LM2.innerText = "올바른 비밀번호 형식입니다.";
        LM2.classList.remove("red");
        LM2.classList.add("green");
    } else{
        LM2.innerText = "올바르지 않은 비밀번호 형식입니다.";
        LM2.classList.remove("green");
        LM2.classList.add("red");
    }

    if(this.value == ""){
        LM2.innerText = "";
    }

    if(this.value == newPw2.value){
        LM3.innerText = "비밀번호가 일치합니다.";
        LM3.classList.remove("red");
        LM3.classList.add("green");
    }else{
        LM3.innerText = "비밀번호가 일치하지 않습니다.";
        LM3.classList.remove("green");
        LM3.classList.add("red");
    }

    if(newPw2.value == ""){
        LM3.innerText = "";
    }
    
    
});


document.getElementById("newPw2").addEventListener("keyup", function(){

    const newPw = document.getElementById("newPw");
    const LM3 = document.getElementById("LM3");

    if(this.value == newPw.value){
        LM3.innerText = "비밀번호가 일치합니다.";
        LM3.classList.remove("red");
        LM3.classList.add("green");
    } else{
        LM3.innerText = "비밀번호가 일치하지 않습니다.";
        LM3.classList.remove("green");
        LM3.classList.add("red");
    }

    if(this.value == ""){
        LM3.innerText = "";
    }

});