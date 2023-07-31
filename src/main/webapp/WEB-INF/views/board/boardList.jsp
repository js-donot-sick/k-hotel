<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항</title>

    <link rel="stylesheet" href="${contextPath}/resources/css/boardList.css">
    <script src="https://kit.fontawesome.com/8f020b2fa9.js" crossorigin="anonymous"></script>


    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

</head>
<body>
   
     <jsp:include page="/WEB-INF/views/common/header.jsp"/>
   
    
    <main>
        
      <jsp:include page="/WEB-INF/views/common/boardSidebar.jsp"/>
        

         <section class="board-list">
            <h1 class="board-name">공지사항</h1>
            <div class="list-wrapper">
                <table class="list-table">
                    <thead>
                        <tr>
                            <th>글 번호</th>
                            <th>제목</th>
                            <th>작성자</th>
                            <th>작성일</th>
                            <th>조회수</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>.</td>
                            <td><a href="#">.</a></td>
                            <td>.</td>
                            <td>.</td>
                            <td>.</td>
                        </tr>

                        <tr>
                            <td>.</td>
                            <td><a href="#">.</a></td>
                            <td>.</td>
                            <td>.</td>
                            <td>.</td>
                        </tr>
                        
                        <tr>
                            <td>.</td>
                            <td><a href="#">.</a></td>
                            <td>.</td>
                            <td>.</td>
                            <td>.</td>
                        </tr>
                        

                    </tbody>
                </table>
            </div>

            <div class="btn-area">
                <button id="insertBtn">글쓰기</button>
            </div>

            <div class="pagination-area">
                <ul class="pagination">
                    <li><a href="#">&lt;&lt;</a></li>
                    <li><a href="#">&lt;</a></li>

                    <li><a class="current">1</a></li>

                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">6</a></li>
                    <li><a href="#">7</a></li>
                    <li><a href="#">8</a></li>
                    <li><a href="#">9</a></li>
                    <li><a href="#">10</a></li>

                    <li><a href="#">&gt;</a></li>
                    <li><a href="#">&gt;&gt;</a></li>
                </ul>
            </div>

            <form action="#" method="get" id="boardSearch">
                <input type="text" name="query" placeholder="검색어를 입력해주세요">
                <button>검색</button>
            </form>


         </section>
         
        </main>
        
        <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
            
</body>
</html>