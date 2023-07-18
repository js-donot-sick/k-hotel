document.getElementsByClassName("J-game")[0].addEventListener("click", function(){

    const bingo =  document.getElementById("J-bingo");

    const btn1 = document.getElementById("J-bingo2");
    const btn2 = document.getElementById("J-main");
    
    this.style.display = "none";

    bingo.style.visibility = "visible"; 
    btn1.style.visibility = "visible"; 
    btn2.style.visibility = "visible"; 


    
})

