const agree = document.getElementById("C-revAgreeYes");
const coupon = document.getElementById("C-rsv-coupon");
const discount = document.getElementById("C-couponPay");
const account = document.getElementById("C-display-change");
const payplan = document.getElementById("C-payplan");

document.getElementById("C-rsvClearBtn").addEventListener("click", function(){

    if(!agree.checked){ /* 약관동의 확인하기 */
        alert("약관 동의 후 예약을 진행해주시기 바랍니다.");
    }

})

coupon.addEventListener("change", function(){

    if(coupon.value == "discountcoupon"){
        discount.value = "30000";
    }
})

payplan.addEventListener("change", function(){

    if(payplan.value=="C-bank"){
        account.style.display = "contents";
    }
})
