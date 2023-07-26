function selectFaqList(){

    $.ajax({

        url : contextPath + "/admin/selectFaqList",

        



    })



}


$(".k-faq-slide").on("click", function(){

    /* element.style.transform = "rotate(180deg)"; */

   /*  if($(".k-arrow-img").css("transform")=="rotate(180deg)"){
        $(".k-arrow-img").css("transform", "rotate(360deg)");
        console.log("하.....")
    } else{
        console.log("sfd")
        $(".k-arrow-img").css("transform", "rotate(180deg)");
    } */
    /* $(".k-arrow-img").css("transform", "rotate(180deg)"); */

    var arrowImg = $(this).find(".k-arrow-img");
    var rotation = arrowImg.data("rotation") || 0;

    if (rotation === 0) {
        arrowImg.css("transform", "rotate(180deg)");
        rotation = 180;
    } else {
        arrowImg.css("transform", "rotate(0deg)");
        rotation = 0;
    }

    arrowImg.data("rotation", rotation);
    
    $(this).next().slideToggle(); 
    /* if($(this).next().css("display")=="none"){
        $(this).siblings(".k-faq-content").slideUp();
        $(this).next().slideDown();
        
    } else{
        $(this).next().slideUp(); */
})

function deleteFaq(boardNo , btn){

    var p1 = btn.parentNode.parentNode.parentNode;

    if(confirm("정말 삭제하시겠습니까?")){
        $.ajax({

            url : contextPath + "/admin/faqDelete",

            data : {"boardNo" : boardNo},

            success : function(result){

                if(result>0){
                    alert("삭제되었습니다.");
                } else {
                    alert("삭제 실패")
                }

            } , 

            error : function(req, status, error){
                console.log("faq 삭제 실패");
                console.log(req.responseText);
            }

        })
    } 

}



/* $(".k-del-btn").on("click", function(){


}) */


