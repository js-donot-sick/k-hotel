// 객실1 버튼
const room1 = document.getElementById("Llike1");
const btn = document.getElementById("L-hbtn");
const memberNo = document.getElementsByName("memberNo")[0].value;
const roomNm1 = document.getElementsByName("roomNm1")[0].value;
const hotelNm1 = document.getElementsByName("hotelNm1")[0].value;




btn.addEventListener("click", function(){

    if(memberNo.trim().length != 0){

        console.log(room1.value);

        if(room1.value == 0){
        
            this.style.color = "red";
            this.style.border = "1px solid red";
            this.style.backgroundColor = "white";

            
            

            $.ajax({

                url : "likeplus1",
                data : {"memberNo" : memberNo,
                        "roomNm1" : roomNm1,
                        "hotelNm1" : hotelNm1},
                type : "get",

                success : function(result){

                    if(result > 0){
                        room1.value = 1;
                        alert(roomNm1 + " 객실을 찜목록에 추가하셨습니다.");
                    }else{
                        alert("찜하기 도중 오류 발생");
                        
                    }
                    console.log(room1);
                    
                },

                error : function(req, status, error){
                    console.log("찜하기 실패!");
                    console.log(req.responseText);
                }
                
            });


        }else{
            
            this.style.color = "white";
            this.style.backgroundColor = "rgb(207, 191, 167)";
            this.style.border = 0;
            
            
            
           
            $.ajax({

                url : "likeDel1",
                data : {"memberNo" : memberNo,
                        "roomNm1" : roomNm1,
                        "hotelNm1" : hotelNm1},
                type : "get",

                success : function(result){

                    if(result > 0){
                        room1.value = 0;
                        alert(roomNm1 + " 객실을 찜목록에서 삭제 하셨습니다.");
                    }else{
                        alert("찜삭제 도중 오류 발생");
                        
                    }
                    console.log("왜안됨?");
                    console.log(room1);
                    
                },

                error : function(req, status, error){
                    console.log("찜삭제 실패!");
                    console.log(req.responseText);
                }
                
            });



        }


    }else{
        alert("로그인 후 이용해주세요.");
    }
});













(function(){

    const Lroom1 = document.getElementById("L-room1");






})();






// // 방 1번 찜하기 버튼

// $("#L-room1").on("mouseenter",function(){
//     $("#L-star-1-1").css("display", "block");
//     $("#L-room1").css("filter", "brightness(0.8)");
// })

// $("#L-room1").on("mouseleave",function(){
//     $("#L-star-1-1").css("display", "none");
//     $("#L-room1").css("filter", "brightness(1)");
// })

// $("#L-star-1-1").on("mouseenter",function(){
//     $("#L-star-1-1").css("display", "block");
//     $("#L-room1").css("filter", "brightness(0.8)");
// })

// $("#L-star-1-1").on("mouseleave",function(){
//     $("#L-star-1-1").css("display", "none");
//     $("#L-room1").css("filter", "brightness(1)");
// })


// $("#L-star-1-2").on("mouseenter",function(){
//     $("#L-room1").css("filter", "brightness(0.8)");
// })

// $("#L-star-1-2").on("mouseleave",function(){
//     $("#L-room1").css("filter", "brightness(1)");
// })


// $("#L-star-1").on("change", function(){
    
//     if(this.checked){
//         $("#L-star-1-1").css("display", "none");
//         $("#L-star-1-2").css("display", "block");

//     }else{
//         $("#L-star-1-1").css("display", "block");
//         $("#L-star-1-2").css("display", "none");

//     }
// })

// // 방 2번 찜하기 버튼

// $("#L-room2").on("mouseenter",function(){
//     $("#L-star-2-1").css("display", "block");
//     $("#L-room2").css("filter", "brightness(0.7)");
// })

// $("#L-room2").on("mouseleave",function(){
//     $("#L-star-2-1").css("display", "none");
//     $("#L-room2").css("filter", "brightness(1)");
// })

// $("#L-star-2-1").on("mouseenter",function(){
//     $("#L-star-2-1").css("display", "block");
//     $("#L-room2").css("filter", "brightness(0.7)");
// })

// $("#L-star-2-1").on("mouseleave",function(){
//     $("#L-star-2-1").css("display", "none");
//     $("#L-room2").css("filter", "brightness(1)");
// })

// $("#L-star-2-2").on("mouseenter",function(){
//     $("#L-room2").css("filter", "brightness(0.8)");
// })

// $("#L-star-2-2").on("mouseleave",function(){
//     $("#L-room2").css("filter", "brightness(1)");
// })


// $("#L-star-2").on("change", function(){
    
//     if(this.checked){
//         $("#L-star-2-1").css("display", "none");
//         $("#L-star-2-2").css("display", "block");

//     }else{
//         $("#L-star-2-1").css("display", "block");
//         $("#L-star-2-2").css("display", "none");
//     }
// })

// // 방 3번 찜하기 버튼

// $("#L-room3").on("mouseenter",function(){
//     $("#L-star-3-1").css("display", "block");
//     $("#L-room3").css("filter", "brightness(0.7)");
// })

// $("#L-room3").on("mouseleave",function(){
//     $("#L-star-3-1").css("display", "none");
//     $("#L-room3").css("filter", "brightness(1)");
// })

// $("#L-star-3-1").on("mouseenter",function(){
//     $("#L-star-3-1").css("display", "block");
//     $("#L-room3").css("filter", "brightness(0.7)");
// })

// $("#L-star-3-1").on("mouseleave",function(){
//     $("#L-star-3-1").css("display", "none");
//     $("#L-room3").css("filter", "brightness(1)");
// })

// $("#L-star-3-2").on("mouseenter",function(){
//     $("#L-room3").css("filter", "brightness(0.8)");
// })

// $("#L-star-3-2").on("mouseleave",function(){
//     $("#L-room3").css("filter", "brightness(1)");
// })


// $("#L-star-3").on("change", function(){
    
//     if(this.checked){
//         $("#L-star-3-1").css("display", "none");
//         $("#L-star-3-2").css("display", "block");

//     }else{
//         $("#L-star-3-1").css("display", "block");
//         $("#L-star-3-2").css("display", "none");

//     }
// })