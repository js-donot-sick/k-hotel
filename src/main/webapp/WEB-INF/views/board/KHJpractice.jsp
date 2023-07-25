<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>공지사항</title>
  
  <link rel="stylesheet" href="${contextPath}/resources/css/Announcement.css">
  <link rel="stylesheet" href="${contextPath}/resources/css/sidebar.css">
  <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  

</head>
<body>
  <jsp:include page="/WEB-INF/views/common/header.jsp"/>
  <jsp:include page="/WEB-INF/views/common/boardSidebar.jsp"/>
  
  
  <section class="content">
    <div class="columns">
      <div class="main">
        
        
        <section class="notice">
          <div class="page-title">
            <div class="container">
              <h3>공지사항</h3>
            </div>
          </div>
          
          <!-- board seach area -->
          <div id="board-search">
            <div class="container">
              <div class="search-window">
                <form action="">
                  <div class="search-wrap">
                    <label for="search" class="blind">공지사항 내용 검색</label>
                    <input id="search" type="search" name="" placeholder="검색어를 입력해주세요." value="">
                    <button type="submit" class="btn btn-dark">검색</button>
                  </div>
                </form>
              </div>
            </div>
          </div>
          
          <!-- board list area -->
          <div id="board-list">
            <div class="container">
              <table class="board-table">
                <thead>
                  <tr>
                      <th scope="col" class="th-num">번호</th>
                      <th scope="col" class="th-title">제목</th>
                      <th scope="col" class="th-date">등록일</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>3</td>
                      <th><a href="#!">[공지사항] 개인정보 처리방침 변경안내처리방침</a></th>
                      <td>2023.07.13</td>
                    </tr>
                    
                    <tr>
                      <td>2</td>
                      <th><a href="#!">공지사항 안내입니다. 이용해주셔서 감사합니다</a></th>
                      <td>2023.06.15</td>
                    </tr>
                    
                    <tr>
                      <td>1</td>
                      <th><a href="#!">공지사항 안내입니다. 이용해주셔서 감사합니다</a></th>
                      <td>2023.06.15</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            
          </section>
        </div>
        
        
      </div>
    </div>
  </section>
  <footer class="footer">Footer: Fixed height</footer>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<script src="Semi.js"></script>
</body>
</html>