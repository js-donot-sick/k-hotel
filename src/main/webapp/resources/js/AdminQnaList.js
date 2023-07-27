function selectFaqList(){

    $.ajax({

        url : contextPath + "/admin/selectFaqList",

        data : { "type" : type },

        dataType : "JSON",

        success : function(fList){

            console.log(fList);

            const slide = document.getElementsByClassName("k-faq-slide")[0]; // slide(제목_+ 작성일)
            const content = document.getElementsByClassName("k-faq-content")[0]; // content(내용)

            slide.innerHTML="";
            content.innerHTML="";

            for(let f of fList){

                // slide div *큰 거
                const sDiv = document.createElement("div");

                // 제목, 작성자, 화살표
                const tSpan = document.createElement("span");
                const dSpan = document.createElement("span");
                const aDiv  = document.createElement("div");
                aDiv.classList.add("k-arrow-img");



                // content div *큰 거
                const fcDiv = document.createElement("div");

                // 내용
                const cDiv = document.createElement("div");

                // form 태그
                const form = document.createElement("form");

                // input 태그
                const chInpue = document.createElement("input");
                const nhInpue = document.createElement("input");



            }



        },

        error : function(req, status, error){
            console.log("faq 삭제 실패");
            console.log(req.responseText);
        }



    });



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
    
    if($(this).next().css("display")=="none"){
        $(this).siblings(".k-faq-content").slideUp();
        $(this).next().slideDown();
        
    } else{
        $(this).next().slideUp();
    }

    if (rotation === 0) {
        arrowImg.css("transform", "rotate(180deg)");
        rotation = 180;
    } else {
        arrowImg.css("transform", "rotate(0deg)");
        rotation = 0;
    }

    arrowImg.data("rotation", rotation);
    
    //$(this).next().slideToggle(); 
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
                    selectFaqList();
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


