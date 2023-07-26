<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>내가 쓴 글(QnA)</title>
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css"> <!-- 헤더 스타일 -->
    <link rel="stylesheet" href="${contextPath}/resources/css/sidebar.css"> <!-- 사이드바 스타일 -->
    <link rel="stylesheet" href="${contextPath}/resources/css/footer.css"><!-- 풋터 스타일 -->
    <link rel="stylesheet" href="${contextPath}/resources/css/mypage(QNA).css">
    <link rel="stylesheet" href="${contextPath}/resources/css/qnaList.css"><!-- 풋터 스타일 -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>

    <jsp:include page="/WEB-INF/views/common/header.jsp"/>
    
    <div class="P-top" >
        <jsp:include page="/WEB-INF/views/common/sidebar.jsp"/>

            <div class="P-maindisplay">
                <!-- QNA 메인 글자 -->
                <div class="P-main" >
                    <div class="P-blank1">QnA</div>

                     <!-- 드롭박스 -->
                     <!-- <div class="P-dropdown">
                        <select name="" id="" onchange="location.href=this.value">
                            <option value="">선택하세요</option>
                                <option value="mypage(QNA).jsp">QnA</option>
                                <option value="mypage(wirte).jsp">Reivew</option>
                        </select>
                    </div> -->

                    <div class="P-dropdown"></div>

                    <!-- QnA 항목 이동 링크 -->
                    <div class="P-qna-1">
                        <div class="P-qna">
                            <div>번호</div>
                            <div>QnA 제목</div>
                            <div></div>
                            <div>작성시간</div>
                            <div>상세내역</div>
                        </div>

                        <c:forEach var="board" items = "${boardList}">
                            <div class="P-qna">
                                <div>${board.boardNo}</div>
                                <div>${board.boardTitle}</div>
                                <div></div>
                                <div>${board.boardDt}</div>
                                <a href="#"><button class="P-qna-btn">상세내역</button></a>
                            </div>
                        </c:forEach>
                        


                    </div>
                    
                    <!-- 페이지네이션 -->
                 
                    <div class="K-qna-page">
                        <c:set var="url" value="qna?type=2&cp="/>

                        <ul class="K-pagination">
                            <!-- 첫 페이지로 이동 -->
                            <li><a href="${url}1">&lt;&lt;</a></li>
                            <!-- 이전 목록 마지막 번호로 이동 -->
                            <li><a href="${url}${pagination.prevPage}">&lt;</a></li>

                            <!-- 범위가 정해진 일반 for문 사용 -->
                            <c:forEach var="i" begin="${pagination.startPage}" end="${pagination.endPage}">
                                <c:choose>
                                    <c:when test="${i==pagination.currentPage}">
                                        <li><a class="K-current">${i}</a></li>
                                    </c:when>
                                    <c:otherwise>
                                        <li><a href="${url}${i}">${i}</a></li>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>

                            <!-- 다음 목록 시작 번호로 이동 -->
                            <li><a href="${url}${pagination.nextPage}">&gt;</a></li>
                            <!-- 끝 페이지로 이동 -->
                            <li><a href="${url}${pagination.maxPage}">&gt;&gt;</a></li>
                        </ul>

                    </div>

                </div>
            </div>

        </div>

    </div>

    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>






        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
</body>

</html>