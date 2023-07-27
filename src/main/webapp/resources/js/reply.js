
function updateReply(){

    $.ajax({

        url : contextPath + "/reply/selectReplyList",
        data : {"boardNo" : boardNo},
        type : "GET",
        dataType : "JSON",
        success : function(replyList){


        },

        error : function(){
            console.log("에러 발생");
        }




    });







}