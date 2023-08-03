document.getElementById("J-cancle").addEventListener("click", function(){

    confirm("이전페이지로 돌아가시겠습니까?");
})

document.getElementById("J-alter").addEventListener("click", function(){

    confirm("수정을 완료 하시겠습니까?");
})

const inputImage = document.getElementsByName("JreviewImage")[0];
const preview = document.getElementById("J-reviewImage3");
inputImage.addEventListener("change", function(){

    if(inputImage.files != undefined){
        const reader = new FileReader(); // 선택된 파일을 읽을 객체 생성
        reader.readAsDataURL(this.files[0]);

        reader.onload = function(e){ //reader가 파일을 다 읽어온 경우

            preview.setAttribute("src", e.target.result);

        } 
        
    }else{ // 파일이 선택되지 않았을 때
        preview.removeAttribute("src");
    }
})
