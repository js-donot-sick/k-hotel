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
        <!-- 사이드바 -->
        <jsp:include page="/WEB-INF/views/common/adminSidebar.jsp"/>

        <div class="L-pay-main2">

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
                    <th>결제여부</th>
                    <th>
                        승인 / 취소
                    </th>
                </tr>
            
                <tr class="L-pay-tr">
                    <td>결제번호</td>
                    <td>결제수단</td>
                    <td>결제금액</td>
                    <td>결제자</td>
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
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
                    <td>결제여부</td>
                    <td class="L-pay-btn"> 
                        <button>승인</button>
                        <button>취소</button>
                    </td>
                </tr>
            </table>
        
            <div class="L-pagination-area">
                
                <!-- <c:set var="url" value="report?type=6&cp="/> -->
                <!-- 나중에 링크에 type 설정해주고 el태그로 변경해줘야함  -->
                
                
                <ul class="L-pagination">
                    <li><a href="#">&lt;&lt;</a></li>
                    
                    <li><a href="#">&lt;</a></li>
                    
                    
                    <li><a class="L-current">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    
                    <!-- 뒷페이지 + 1 -->
                    <li><a href="#">&gt;</a></li>
                    
                    <!-- 맨뒤페이지 -->
                    <li><a href="#">&gt;&gt;</a></li>
                    
                </ul>
                
            </div>
        
        </div>
        
    </div>
    
    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
    
</body>
</html>