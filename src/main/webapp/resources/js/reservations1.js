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
        data{ "" : }
    })
}