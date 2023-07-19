<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>header</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="resources/CSS/header.css">
    

</head>

<body>



  <div class="P-container">
    <div class="P-header">

        <div class="P-header_left">
            <div class="P-blank">
                
            </div>

            <div class="P-btn1">
                    <a href="${contextPath}/mypage/mypage(QNA)" >호텔찾기 <i class="fa-solid fa-magnifying-glass"></i></a>
       
                    <a href="${contextPath}/book/roomChoice">예약 <i class="fa-solid fa-calendar-days"></i></a>
            </div>
        </div>

        <!-- 로고 클릭 시 메인페이지로 이동 -->
        <div>
            <a href="${contextPath}" class="P-header_middle">
                <img src="resources/images/logo_b_2.png" alt="">
            </a>
        </div>
        
        <div class="P-header_right">
            <!-- 로그인 -->
      
                <div class="P-btn2">
                    <ul>
                        <a href="${contextPath}/member/login">로그인</a>
                        <span> | </span>
                        <a href="${contextPath}/member/logout">로그아웃</a>
                        <span> | </span>
                        <a href="${contextPath}/member/mypage">마이페이지</a>
                        <span> | </span>
                        <a href="${contextPath}/member/signUp">회원가입</a>
                    </ul>
                </div>

      
                <div class="P-btn3">
                        <a href="${contextPath}/board">커뮤니티</a>
                       <a href="${contextPath}/event" >이벤트</a>
                    
                </div>
 

        </div>
        
    </div>
</div>

   

    


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <script src="resources/js/header.js"></script>
</body>

</html>