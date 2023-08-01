
const inputImage = document.getElementsByName("JreviewImage")[0];
const preview = document.getElementById("J-reviewImage3");
const deleteBtn = document.getElementById("J-delBtn");


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








document.getElementById("J-cancle").addEventListener("click", function(){

    confirm("이전페이지로 돌아가시겠습니까?");
})

document.getElementById("J-update").addEventListener("click", function(){

    confirm("작성을 완료 하시겠습니까?");
})

document.getElementById("J-delBtn").addEventListener("click",function(){

    const del = document.getElementById("J-delete");

    if(del.value == 0){ // 눌러지지 않은 상태

        // 1) 프로필 이미지를 지움
        document.getElementById("J-reviewImage3").setAttribute("src", "" + "");
        
        document.getElementById("J-reviewImage2").value = "";
        document.getElementById("J-reviewImage3").style.display = "none";
    }
})

const star5 = document.getElementById("5-stars");

const star = document.getElementsByClassName("star2");
const star2 = document.getElementsByClassName("star3")[0];


/* for(let i = 0 ; i < star.length ; i++){


        if(star[i].checked = true){

            star[0].value = 1;
            star[1].value = 2;
            star[2].value = 3;
            star[3].value = 4;
            star[4].value = 5;



                
        }

}
 */

    

/* 태그가 선택 되었을때 */
const tag = document.getElementsByClassName("tag");

for(let items of tag){
    
    if(items.checked == true){

        items.value = 'Y';
    }
}

