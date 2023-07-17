const agree = document.getElementById("C-revAgreeYes");
const coupon = document.getElementById("C-rsv-coupon");
const discount = document.getElementById("C-couponPay");
const displaychanger = document.getElementById("C-display-change");
const displaychanger2 =document.getElementById("C-display-change2");
const payplan = document.getElementById("C-payplan");
const Cbank = document.getElementById("C-bank");
const account = document.getElementById("C-account");

document.getElementById("C-rsvClearBtn").addEventListener("click", function(){

    if(payplan.value != Cbank){ /* 결제 수단 선택 */
        alert("결제 수단을 선택해주시길 바랍니다.")
    }

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

    if(payplan.value=="무통장입금"){
        displaychanger.style.display = "contents";
    }
})

account.addEventListener("change", function(){

    if(account.value == "토스뱅크"){
        displaychanger2.style.display = "revert";
    }
})
