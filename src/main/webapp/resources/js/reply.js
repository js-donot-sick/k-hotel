
// 댓글 목록 조회
function selectReplyList(){

    $.ajax({

        url : contextPath + "/reply/selectReplyList",
        data : {"boardNo" : boardNo},
        type : "GET",
        dataType : "JSON",
        success : function(rList){

            const replyUl = document.getElementById("L-reply-list");
            replyUl.innerHTML = "";

            for(let rp of rList){

                
                // 댓글영역
                const replyRow = document.createElement("li");
                replyRow.classList.add("L-reply-row");
                

                const replyPerson = document.createElement("span");
                replyPerson.classList.add("L-reply-person");
                replyPerson.innerText = rp.memberId;

                const replyDate = document.createElement("span");
                replyDate.classList.add("L-reply-date");
                replyDate.innerText = rp.createDt;

                const replyContent = document.createElement("p");
                replyContent.classList.add("L-reply-content");
                replyContent.innerHTML = rp.replyContent;

                replyRow.append(replyPerson, replyDate, replyContent);

                // 버튼
                if(loginMemberNo == reply.memberNo){

                    const replyBtn = document.createElement("div");
                    replyBtn.classList.add("L-reply-btn");
    
                    const updateBtn = document.createElement("button");
                    updateBtn.innerText = "수정";
    
                    const deleteBtn = document.createElement("button");
                    deleteBtn.innerText = "삭제";
    
                    // 버튼 추가
                    replyBtn.append(updateBtn, deleteBtn);
    
                    // 행에 추가
                    replyRow.append(replyBtn);
                }

                replyUl.append(replyRow);

               



            }



        },

        error : function(){
            console.log("에러 발생");
        }




    });







}