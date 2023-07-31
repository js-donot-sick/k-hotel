<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${contextPath}/resources/css/couponList.css">

    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>   

   
</head>

<body>
    <jsp:include page="/WEB-INF/views/common/header.jsp"/>
    <div class="C-body-container">
        <div class="C-body-coupon">
            <jsp:include page="/WEB-INF/views/common/sidebar.jsp"/>
            <div class="C-body-couponlist">
                <div class="C-couponlist-div">
                    <div class="C-couponlist-title">쿠폰리스트</div>
                    <c:forEach var="coupon" items="${couponList}">
	                    <div class="C-couponlist-inner">
	                        <div class="C-inner-img">
	                            <img src="${contextPath}/resources/images/30000만원 할인 쿠폰.png" class="C-coupon-img">
	                        </div>
	                        <div class="C-inner-text">
	                            <ul>
	                            	<li> 쿠폰명 : ${coupon.couponName} </li>
	                                <li> 이벤트 성공 축하 3만원 할인 쿠폰</li>
	                                <li> 사용기한 : ~ ${coupon.couponDate} </li>
	                                <li> 게임 성공 시 3만원 할인쿠폰 자동 지급됩니다.
	                                    <br>
	                                    구매 페이지에서 쿠폰 적용 가능합니다.
	                                </li>
	                            </ul>
	                        </div>
	                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
    
 
       
        
</body>

</html>