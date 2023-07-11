document.getElementsByClassName("J-H1-1")[0].addEventListener("click", function(){

    const input = document.getElementsByClassName("J-J1-1")[0];

    if(input.value == ""){
        alert("아이디를 입력해주세요.");
    } else {
        alert("아직 구현되지 않은 기능입니다.");
    }
})



document.getElementsByClassName("J-J1-1")[0].addEventListener("keydown", function(){

    const regExp = /^\w{6,12}$/;

    const green = document.getElementsByClassName("J-J1-11")[0];

    if(regExp.test(this.value)) {

        green.innerText = "올바른 형식입니다.";
        green.style.color = "green";
        green.style.font.width = "bold"; 
    } else {
        
        green.innerText = "알맞지 않는 형식입니다.";
        green.style.color = "red";
    }

    if(this.value == ""){
        green.innerText = "";
    }
})


document.getElementsByClassName("J-J1-2")[0].addEventListener("keydown", function(){

    const regExp = /^([A-Z]|[a-z]|[~\!\@\$]){7,14}$/;

    const green = document.getElementById("J-H2-1");

    if(regExp.test(this.value)) {

        green.innerText = "올바른 형식입니다.";
        green.style.color = "green";
        green.style.font.width = "bold"; 
    } else {
        
        green.innerText = "비밀번호 형식이 유효하지 않습니다.";
        green.style.color = "red";
    }

    if(this.value == ""){
        green.innerText = "";
    }

})

document.getElementById("J-H3-1").addEventListener("click", function(){

    const pw1 = document.getElementsByClassName("J-J1-2")[0];
    const pw2 = document.getElementsByClassName("J-J1-3")[0];

    if(pw1.value == "" | pw2.value == ""){
        alert("비밀번호를 입력해주세요.");
    } else if(pw1.value == pw2.value){
        alert("비밀번호가 일치합니다.");
    } else{
        alert("비밀번호가 일치하지 않습니다.");
    }
    
})

document.getElementsByClassName("J-J1-3")[0].addEventListener("keyup", function(){
  
    const pw1 = document.getElementsByClassName("J-J1-2")[0];

    if(this.value == pw1.value){
        this.style.color = "green";
        pw1.style.color = "green";
    } else{
        this.style.color = "black";
        pw1.style.color = "black";
    }
})

document.getElementsByClassName("J-J1-2")[0].addEventListener("keyup", function(){
  
    const pw2 = document.getElementsByClassName("J-J1-3")[0];

    if(this.value == pw2.value){
        this.style.color = "green";
        pw2.style.color = "green";
    } else{
        this.style.color = "black";
        pw2.style.color = "black";
    }
})