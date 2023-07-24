const PopupOutBtn = document.getElementById("P-popup-outbtn");  /* x 버튼 */
const PopupDeclar = document.getElementById("P-popup-Declar"); /* 신고하기창 */
const PrsDeclarBtn = document.getElementById("P-rs-Declar-btn"); /* 신고버튼 */


function fn_find() {
  $("#search").show();
}


document.getElementById("P-popup-outbtn").addEventListener("click", function () {

  PopupDeclar.style.display = "block"


})

/* 신고버튼 눌렀을때 창 뜨기 */
document.getElementById("P-rs-Declar-btn").addEventListener("click", function () {

  PopupDeclar.style.display = "block"

})

/* x 눌렀을때 눌렀을때 창 뜨기 */
document.getElementById("P-popup-outbtn").addEventListener("click", function () {

  PopupDeclar.style.display = "none"

})