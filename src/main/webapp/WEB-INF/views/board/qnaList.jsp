<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>qnaList</title>

    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
    crossorigin="anonymous">
    <link rel="stylesheet" href="${contextPath}/resources/css/qnaList.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css">

</head>
<body>

    

    <jsp:include page="/WEB-INF/views/common/header.jsp"/>

    <div id="k-qList-content">

        <jsp:include page="/WEB-INF/views/common/boardSidebar.jsp"/>

        <div class="k-qna">

            <div>질문게시판</div>
            
            <div>
                <button id="q-btn">게시글 작성</button>
            </div>

            <div class="K-qnaList"> <!-- 질문게시판 목록 -->
                <a href="#" style="text-decoration: none;">
                    <div class="k-q-list">
                        <div>1</div>
                        <div>제목</div>
                        <div></div>
                        <div>작성자</div>
                        <div>2023-05-31</div>
                    </div>
                </a>
                <a href="#" style="text-decoration: none;">
                    <div class="k-q-list">
                        <div>2</div>
                        <div>제목</div>
                        <div></div>
                        <div>작성자</div>
                        <div>2023-05-31</div>
                    </div>
                </a>
                <a href="#" style="text-decoration: none;">
                    <div class="k-q-list">
                        <div>3</div>
                        <div>제목</div>
                        <div></div>
                        <div>작성자</div>
                        <div>2023-05-31</div>
                    </div>
                </a>
                <a href="#" style="text-decoration: none;">
                    <div class="k-q-list">
                        <div>4</div>
                        <div>제목</div>
                        <div></div>
                        <div>작성자</div>
                        <div>2023-05-31</div>
                    </div>
                </a>
                <a href="#" style="text-decoration: none;">
                    <div class="k-q-list">
                        <div>5</div>
                        <div>제목</div>
                        <div></div>
                        <div>작성자</div>
                        <div>2023-05-31</div>
                    </div>
                </a>
            </div>

            <form action="#">
                <div class="k-search-div"> <!-- 하단 검색 부분 -->
                    <div>
                        <select name="k-search" id="k-search">
                            <option value="1">제목 + 내용</option>
                            <option value="2">제목</option>
                            <option value="3">내용</option>
                        </select>
                    </div>
                    <div><input type="search" name="k-search" id="k-search"></div>
                    <div><img src="${contextPath}/resources/images/search.png"></div>
                    <div>
                        <button type="button" id="k-search-btn">검색</button>
                    </div>
                </div>
            </form>
        </div>

    </div>

    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
      
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <script src="../resources/js/qnaList.js"></script>
</body>
</html>