<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initiaP-scale=1.0">
    <title>리뷰메인</title>
    <link rel="stylesheet" href="../resources/css/mypage(wirte).css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>

    <jsp:include page="/WEB-INF/views/common/header.jsp" />

    <div class="P-pay-main">
        <!-- 사이드바 -->
        <jsp:include page="/WEB-INF/views/common/boardSidebar.jsp" />

        <div class="P-pay-main2">

            <!-- 메인 테이블 -->
            <table class="P-pay-table">
                
                <tr class="P-pay-title">
                    <td colspan="6">리뷰게시판</td>
                </tr>
                
                <tr class="P-pay-tr1">
                    <th>리뷰번호</th>
                    <th>리뷰내용</th>
                    <th>리뷰내용</th>
                    <th>리뷰내용</th>
                    <th>작성자</th>
                    <th>작성일</th>
                </tr>
            

                <c:choose>
                    <c:when test="${empty boardList}">
                        <!-- 게시글 목록 조회 결과가 비어있다면 -->
                        <tr>
                            <th colspan="7">게시글이 존재하지 않습니다.</th>
                        </tr>
                    </c:when>


                    <c:otherwise>
                        <!-- 게시글이 있는 경우 -->
                        <!-- 게시글 리스트 -->
                        <c:forEach var="board" items="${boardList}">
                            <tr class="P-pay-tr">
                                <td>${board.calculateNo}</td>
                                <td>${board.calculateWay}</td>
                                <td>${board.calculatePrice}</td>
                                <td>${board.memberId}</td>
                                <td>${board.calculateSt}</td>
                                <td>${board.checkInDt}</td>
                                <td class="P-pay-btn"> 
                                    <button onclick="AgreePay(${board.calculateNo})">승인</button>
                                </td>
                            </tr>

                            <input type="hidden" name="calNo" value="${board.calculateNo}">
                            <input type="hidden" name="type" value="8">
                        </c:forEach>
                    
                    </c:otherwise>
                </c:choose>
                
                
                
                
            </table>
        
            <div class="P-pagination-area">
                
                <c:set var="url" value="pay?type=8&cp="/>
                <!-- 나중에 링크에 type 설정해주고 el태그로 변경해줘야함  -->
                
                
                <ul class="P-pagination">
                    <li><a href="${url}1">&lt;&lt;</a></li>
                    
                    <li><a href="${url}${LPagination.prevPage}">&lt;</a></li>
                    

                    <c:forEach var="i" begin="${LPagination.startPage}" end="${LPagination.endPage}" step="1">

                        <c:choose>
                            <c:when test="${i == LPagination.currentPage}">
                                <li><a class="P-current">${i}</a></li>
                            </c:when>
                            <c:otherwise>
                                <li><a href="${url}${i}">${i}</a></li>
                            </c:otherwise>
                            
                        </c:choose>
                        
                    </c:forEach>

                    
                    <!-- 뒷페이지 + 1 -->
                    <li><a href="${url}${LPagination.nextPage}">&gt;</a></li>
                    
                    <!-- 맨뒤페이지 -->
                    <li><a href="${url}${LPagination.maxPage}">&gt;&gt;</a></li>
                    
                </ul>
                
            </div>
        
        </div>
        
    </div>
    
    <jsp:include page="/WEB-INF/views/common/footer.jsp" />






        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
</body>

</html>