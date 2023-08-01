document.getElementById("J-btn").addEventListener("click", function(){

    $a.jax({

    })

    confirm("예약을 취소 하시겠습니까?");
})

function cancel(){

    const bookNo = document.getElementsByName("bookNo")[0];
   /*  const bookNo = document.getElementsByName("bookNo")[0]; */

    $.ajax({
        url : contextPath + "/mypage/reviewCancel",
        data: { "bookNo" : bookNo},
        type : "GET",

        success : function(result){
            if(result > 0) {
                alert("예약이 취소 되었습니다.");
            }
        },
        error: function(req, status, error){
            console.log("서버 오류로 취소를 실패했습니다. 다시 시도해 주세요.");
            console.log(req.responseText);
        }
    });
}