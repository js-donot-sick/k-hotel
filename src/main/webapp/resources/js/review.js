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
        document.getElementById("J-reviewImage3").setAttribute("src", contextPath + "/resources/images/logo_g_2.png");

        document.getElementById("J-reviewImage2").value = "";
    }
})