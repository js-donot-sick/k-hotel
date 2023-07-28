// 미리보기 관련 요소
const preview = document.getElementsByClassName("k-preview");
const inputImg = document.getElementsByClassName("k-inputImg");
const deleteImg = document.getElementsByClassName("k-deleteImg");

// 파일 읽어서 미리보기 세팅
for (let i = 0; i < inputImg.length; i++) {

    inputImg[i].addEventListener("change", function () {

        if (this.files[0] != undefined) {

            const reader = new FileReader(); // 파일 읽는 객체 생성

            reader.readAsDataURL(this.files[0]); // 파일 읽고 result에 저장 -> url 통해서 이미지 볼 수 있음

            reader.onload = function (e) {

                preview[i].setAttribute("src", e.target.result); // 미리보기 img 태그 src 세팅

            }


        } else { // 파일이 선택되지 않음 == 파일 선택했다가 확인이 아닌 취소가 눌렸을 때
            preview[i].removeAttribute("src");
        }



    });

    deleteImg[i].addEventListener("click", function(){

        if(preview[i].getAttribute != null) { // 미리보기가 원래 있다가 삭제한 경우에만 실행해라

            preview[i].removeAttribute("src"); // 미리보기 삭제

            inputImg[i].value=""; // 파일에 있는 value값 삭제
        }

    });
}

// 게시글 유효성 검사
function eventValidate(){

    const eventTitle = document.getElementsByClassName("K-title")[0];
    const eventContent = document.getElementsByClassName("K-content")[0];

    if(eventTitle.value.trim().length == 0) {
        alert("제목을 입력해주세요");
        eventTitle.value = "";
        eventTitle.focus();
        return false;
    }
    
    if(eventContent.value.trim().length == 0) {
        alert("내용을 입력해주세요");
        eventContent.value = "";
        eventContent.focus();
        return false;
    }


    return true;

}
