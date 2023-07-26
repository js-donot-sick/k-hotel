
console.log("js 문제야?")

function deleteReservation(bookNo){


        if (confirm("정말 취소하시겠습니까?")) {

            $.ajax({
                url: contextPath+"/admin/delete",
                data: {"bookNo" : bookNo},
                type: "GET",
                success: function(result) {

                    if(result > 0){
                        alert("해당 객실의 예약이 취소되었습니다.");
                    }else{
                        alert("해당 객실의 예약을 취소할 수 없습니다.");
                    }
                },
                error: function (req,status,error) {
                    console.log("예약 취소 실패");
                    console.log(req.responseText);
                }
            })
        }

}
