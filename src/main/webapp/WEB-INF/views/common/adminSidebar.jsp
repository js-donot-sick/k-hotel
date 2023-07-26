<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>

  <link rel="stylesheet" href="${contextPath}/resources/css/boardSidebar.css">

  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>


<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
</head>

<body>
    
    
 <div class="H-snb">
        <ul class="H-side-bar">
            <li>            <!-- 요청 주소는 본인이 알아서 바꿔 쓰세요 -->
                <a href="${contextPath}/admin/memberAdmin" class="H-side-item H-side-title">회원정보 관리</a> 
            </li>
            <li>
                <a href="${contextPath}/admin/boardAdmin" class="H-side-item">게시글 관리</a>
            </li>
            <li>
                <a href="${contextPath}/admin/eventAdmin" class="H-side-item">이벤트</a>
            </li>
            <li>
                <a href="${contextPath}/admin/bookAdmin" class="H-side-item">예약관리</a>
            </li>
        </ul>
        
    </div>
    


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <script src="/Javascipt/header.js"></script>
</body>
</html>
