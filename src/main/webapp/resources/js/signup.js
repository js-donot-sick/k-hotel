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
        green.innerHTML = "";
    }
})


document.getElementsByClassName("J-J1-2")[0].addEventListener("input", function(){

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
        alert("비밀번호 혹은 비밀번호 확인을 입력해주세요.");
    } else if(pw1.value == pw2.value){
        alert("비밀번호가 일치합니다.");
    } else{
        alert("비밀번호가 일치하지 않습니다.");
        return false;
    }
    
})


    document.getElementsByClassName("J-J1-3")[0].addEventListener("input", function(){
      
        const pw1 = document.getElementsByClassName("J-J1-2")[0];
        const pw2 = document.getElementById("J-J3-1");
        if(pw1.value.trim().length > 8 | this.value.trim().length > 8 ){
            pw1.style.color = "black";
        }
    
        if(this.value == pw1.value){
            pw2.innerHTML = "비밀번호가 일치 합니다.";
            pw2.style.color = "green";
        } else{
            pw2.innerHTML = "비밀번호가 일치하지 않습니다."; 
            pw2.style.color = "red";
        }

        if(this.value == ""){
            pw2.innerHTML = "";
        }
    
    })
    

    document.getElementsByClassName("J-J1-2")[0].addEventListener("input", function(){
      
        const pw2 = document.getElementById("J-J3-1");
    
        if(this.value.trim().length >= 8){

            
            if(this.value == pw2.value){
                pw2.innerHTML = "비밀번호가 일치 합니다.";
                pw2.style.color = "green";
            } else{
                pw2.innerHTML = "비밀번호가 일치하지 않습니다.";
                pw2.style.color = "red";
            }
        }else{
            pw2.innerHTML = "";
        }
        
    })



/* -------------------------------------------------------------------------- */
function sample6_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var addr = ''; // 주소 변수
            var extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
            if(data.userSelectedType === 'R'){
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraAddr !== ''){
                    extraAddr = ' (' + extraAddr + ')';
                }
            
            } else {
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('J-sample6_postcode').value = data.zonecode;
            document.getElementById("J-sample6_address").value = addr;
            // 커서를 상세주소 필드로 이동한다.
            document.getElementById("J-sample6_detailAddress").focus();
        }
    }).open();
}
/* --------------------------------------------------------------------------- */
const memberTel = document.getElementsByName("memberTel")[0];

memberTel.addEventListener("input", function(){

    const regExp= /^0(1[01679]|2|[3-6][1-5]|70)\d{3,4}\d{4}$/;

    if(!regExp.test(this.value)){
        alert("전화번호 형식이 일치하지 않습니다. 다시 입력해주세요.")
        this.focus();
    }
})



    const input = document.getElementById("J-signUpBtn");

    input.addEventListener("click",function(){

       const input2 = document.getElementsByClassName("J-A");

        for(let item of input){
            
            if(item.value == ""){
        
                alert("빈칸이 존재합니다. 다시 입력해주세요.")
        
                item.focus();
        
                return false;
            }
        }
    })
    




