<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 결제 확인페이지</title>

    <link rel="stylesheet" href="${contextPath}/resources/css/AdminPay.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/AdminHeader.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/footer.css">
</head>
<body>
    
    <jsp:include page="/WEB-INF/views/admin/AdminHeader.jsp"/>



    <div class="L-pay-main">
        <div style="width: 25%;" >사이드바</div>

        <!-- 메인 테이블 -->
        <table class="L-pay-table">

            <tr class="L-pay-title">
                <td colspan="6">결제확인</td>
            </tr>

            <tr class="L-pay-tr">
                <th>결제번호</th>
                <th>결제수단</th>
                <th>결제금액</th>
                <th>결제자</th>
                <th>예약자</th>
                <td class="L-pay-btn">
                    <button>승인</button>
                    <button>취소</button>
                </td>
            </tr>

            <tr class="L-pay-tr">
                <td>결제번호</td>
                <td>결제수단</td>
                <td>결제금액</td>
                <td>결제자</td>
                <td>예약자</td>
                <td class="L-pay-btn"> 
                    <button>승인</button>
                    <button>취소</button>
                </td>
            </tr>

            <tr class="L-pay-tr">
                <td>결제번호</td>
                <td>결제수단</td>
                <td>결제금액</td>
                <td>결제자</td>
                <td>예약자</td>
                <td class="L-pay-btn"> 
                    <button>승인</button>
                    <button>취소</button>
                </td>
            </tr>
        </table>

        
        
    </div>
    
    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
    
</body>
</html>