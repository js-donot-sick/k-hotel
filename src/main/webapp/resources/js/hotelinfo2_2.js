// 방 1번 찜하기 버튼

$("#L-room1").on("mouseenter",function(){
    $("#L-star2-1-1").css("display", "block");
    $("#L-room1").css("filter", "brightness(0.8)");
})

$("#L-room1").on("mouseleave",function(){
    $("#L-star2-1-1").css("display", "none");
    $("#L-room1").css("filter", "brightness(1)");
})

$("#L-star2-1-1").on("mouseenter",function(){
    $("#L-star2-1-1").css("display", "block");
    $("#L-room1").css("filter", "brightness(0.8)");
})

$("#L-star2-1-1").on("mouseleave",function(){
    $("#L-star2-1-1").css("display", "none");
    $("#L-room1").css("filter", "brightness(1)");
})


$("#L-star2-1-2").on("mouseenter",function(){
    $("#L-room1").css("filter", "brightness(0.8)");
})

$("#L-star2-1-2").on("mouseleave",function(){
    $("#L-room1").css("filter", "brightness(1)");
})


$("#L-star2-1").on("change", function(){
    
    if(this.checked){
        $("#L-star2-1-1").css("display", "none");
        $("#L-star2-1-2").css("display", "block");

    }else{
        $("#L-star2-1-1").css("display", "block");
        $("#L-star2-1-2").css("display", "none");

    }
})

// 방 2번 찜하기 버튼

$("#L-room2").on("mouseenter",function(){
    $("#L-star2-2-1").css("display", "block");
    $("#L-room2").css("filter", "brightness(0.7)");
})

$("#L-room2").on("mouseleave",function(){
    $("#L-star2-2-1").css("display", "none");
    $("#L-room2").css("filter", "brightness(1)");
})

$("#L-star2-2-1").on("mouseenter",function(){
    $("#L-star2-2-1").css("display", "block");
    $("#L-room2").css("filter", "brightness(0.7)");
})

$("#L-star2-2-1").on("mouseleave",function(){
    $("#L-star2-2-1").css("display", "none");
    $("#L-room2").css("filter", "brightness(1)");
})

$("#L-star2-2-2").on("mouseenter",function(){
    $("#L-room2").css("filter", "brightness(0.8)");
})

$("#L-star2-2-2").on("mouseleave",function(){
    $("#L-room2").css("filter", "brightness(1)");
})


$("#L-star2-2").on("change", function(){
    
    if(this.checked){
        $("#L-star2-2-1").css("display", "none");
        $("#L-star2-2-2").css("display", "block");

    }else{
        $("#L-star2-2-1").css("display", "block");
        $("#L-star2-2-2").css("display", "none");
    }
})

// 방 3번 찜하기 버튼

$("#L-room3").on("mouseenter",function(){
    $("#L-star2-3-1").css("display", "block");
    $("#L-room3").css("filter", "brightness(0.7)");
})

$("#L-room3").on("mouseleave",function(){
    $("#L-star2-3-1").css("display", "none");
    $("#L-room3").css("filter", "brightness(1)");
})

$("#L-star2-3-1").on("mouseenter",function(){
    $("#L-star2-3-1").css("display", "block");
    $("#L-room3").css("filter", "brightness(0.7)");
})

$("#L-star2-3-1").on("mouseleave",function(){
    $("#L-star2-3-1").css("display", "none");
    $("#L-room3").css("filter", "brightness(1)");
})

$("#L-star2-3-2").on("mouseenter",function(){
    $("#L-room3").css("filter", "brightness(0.8)");
})

$("#L-star2-3-2").on("mouseleave",function(){
    $("#L-room3").css("filter", "brightness(1)");
})


$("#L-star2-3").on("change", function(){
    
    if(this.checked){
        $("#L-star2-3-1").css("display", "none");
        $("#L-star2-3-2").css("display", "block");

    }else{
        $("#L-star2-3-1").css("display", "block");
        $("#L-star2-3-2").css("display", "none");

    }
})