const agree = document.getElementById("C-revAgreeYes");
const coupon = document.getElementById("C-rsv-coupon");
const discount = document.getElementById("C-couponPay");
const displaychanger = document.getElementById("C-display-change");
const displaychanger2 = document.getElementById("C-display-change2");
const payplan = document.getElementById("C-payplan");
const Cbank = document.getElementById("C-bank");
const account = document.getElementById("C-account");


const hotelpay = document.getElementById("C-hotelPay");
const finalpay = document.getElementById("C-finalpay");

$(function () {
            $("#C-kakaopay").click(function () {
                $.ajax({
                    url: '/cls/jp/kakaopay.cls',
                    dataType: 'json',
                    success: function (data) {
                       var box =data.next_redirect_pc_url;
                       window.open(box);
                       
                        return true;
                    },
                    error: function (error) {
                        alert(error);
                        return false;
                    }
                })
            })
        })

coupon.addEventListener("change", function () {

    if (coupon.value == "discountcoupon") {
        discount.value = "30000";

        finalpay.innerHTML = hotelpay.value - discount.value;
    }
})

payplan.addEventListener("change", function () {

    if (payplan.value == "무통장입금") {
        displaychanger.style.display = "contents";
    }
})

account.addEventListener("change", function () {

    if (account.value == "토스뱅크") {
        displaychanger2.style.display = "revert";
    }
    if (account.value == "카카오뱅크"){
        displaychanger2.style.display = "revert";
    }
})

function reservationFinalValidate() {

    if (payplan.value == "none") {
        alert("결제 수단을 선택해주시길 바랍니다.")
        return false;
    }

    else if (!agree.checked) {
        alert("약관 동의 후 예약을 진행해주시기 바랍니다.");
        return false;
        
    } else{

        return confirm("결제를 진행하시겠습니까?");
    }


}
