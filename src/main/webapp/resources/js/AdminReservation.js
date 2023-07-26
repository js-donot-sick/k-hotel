

function deleteReply(bookNo){


        if (confirm("정말 취소하시겠습니까?")) {

            $.ajax({
                url: contextPath + "/admin/deleteReservation",

                data: { "bookNo": bookNo },

                type: "get",

                success: function (result) {
                    alert("해당 객실의 예약이 취소되었습니다.");

                },
                error: function (result) {
                    alert("에러 발생!!");
                }
            })
        }

}
