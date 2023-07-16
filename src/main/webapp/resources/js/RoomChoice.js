const hotel_choice = document.getElementById("C-hotel-choice");
const room_choice = document.getElementById("C-room-choice");
const adult = document.getElementById("C-adult");
const child = document.getElementById("C-children");
const checkIn = document.getElementById("C-start");
const checkOut = document.getElementById("C-end");


/* 오늘 날짜로 기본 값 세팅  */
var today = new Date();
var dd = String(today.getDate()).padStart(2, '0');
var mm = String(today.getMonth() + 1).padStart(2, '0'); 
var yyyy = today.getFullYear();

today = yyyy + '-' + mm + '-' + dd;

// input 요소의 값을 설정
document.getElementById("C-start").value = today;
document.getElementById("C-end").value = today;

/* 체크아웃 이벤트 발생 시 몇박인지 계산 */
document.getElementById("C-end").addEventListener("change",function(){
   const day = document.getElementById("C-countdate");
   var date1 = new Date(document.getElementById("C-start").value);
   var date2 = new Date(document.getElementById("C-end").value);
   
   var differenceInTime = date2.getTime() - date1.getTime();
   var differenceInDays = differenceInTime / (1000 * 3600 * 24);

   day.innerHTML = differenceInDays + "박";
})

var i = 0; /* 성인 버튼 카운트 변수 */
var j = 0; /* 어린이 버튼 카운트 변수 */

/* 성인 +버튼 이벤트 발생 시 인원수 출력 */
document.getElementById("C-Aplusbutton").addEventListener("click",function(){
   
   if( i < 6){
       i++
   }
   adult.value = i;
})

/* 성인 -버튼 이벤트 발생 시 인원수 출력 */
document.getElementById("C-Aminusbutton").addEventListener("click",function(){

   if( i < 7 && i > 0){
       i--
   }
   adult.value = i;
})

/* 어린이 +버튼 이벤트 발생 시 인원수 출력 */
document.getElementById("C-Cplusbutton").addEventListener("click",function(){
   
   if( j < 6){
       j++
   }
   child.value = j;
})

/* 어린이 -버튼 이벤트 발생 시 인원수 출력 */
document.getElementById("C-Cminusbutton").addEventListener("click",function(){
   if( j < 7 && j > 0){
       j--
   }
   child.value = j;
})

function reservationValidate() {

   if (hotel_choice.value == "none") {
      alert("호텔을 선택해 주시길 바랍니다.");
      return false;
   }

   else if (room_choice.value == "none") {
      alert("객실을 선택해 주시길 바랍니다.");
      return false;
   }

   else if (checkIn.value == today) {
      alert("당일 예약은 전화 문의로만 가능합니다. 다른 날짜를 선택해 주시길 바랍니다.");
      return false;
   }

   else if (checkOut.value == today) {
      alert("체크아웃 날짜를 선택해 주시길 바랍니다.");
      return false;
   }
   else if (adult.value == 0 && child.value == 0) {
      alert("인원을 선택해 주시길 바랍니다.");
      return false;
   }
   else {
      confirm("예약을 진행하시겠습니까?")
   }


}

/*------------------------------------객실 선택 시작----------------------------------------- */ 

/*------------------------------------객실 선택 끝----------------------------------------- */ 