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
    <link rel="stylesheet" href="${contextPath}/resources/css/boardSidebar.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/footer.css">

    <style>
        .k-arrow-img{
            background-image: url("${contextPath}/resources/images/arrow_down.png");
        }
    </style>
</head>
<body>

    <jsp:include page="/WEB-INF/views/common/header.jsp"/>

    <div id="k-qList-content">

        <jsp:include page="/WEB-INF/views/common/boardSidebar.jsp"/>

        <div class="k-qna">


            <div>FAQ</div>

            <div class="k-faq"> <!-- faq -->
                <div class="k-faq-slide">
                    <span>1</span>
                    <span>첫 번째</span>
                    <div class="k-arrow-img"></div>
                    <!-- <img src="../images/arrow_down.png" class="k-arrow"> -->
                </div>
                <div  class="k-faq-content">
                    <div>
                        안녕하세오 <br>
                        overflow가 안 먹어요
                        <br>
                        그리고 음..pre를 안 넣어도 잘 넘어갈지 모르겠어요
                        <br>
                        관리자 증말 zzㅏ증나 <br><br>sdfkl
                        ssafd
                        <br>
                        dfsa
                    </div>
                </div>
                <div class="k-faq-slide">
                    <span>2</span>
                    <span>두 번째</span>
                    <div class="k-arrow-img"></div>
                    <!-- <img src="../images/arrow_down.png" class="k-arrow"> -->
                </div>
                <div  class="k-faq-content">
                    <div>
                        안녕하세오 <br>
                        overflow가 안 먹어요
                        <br>
                        그리고 음..pre를 안 넣어도 잘 넘어갈지 모르겠어요
                        <br>
                        관리자 증말 zzㅏ증나 <br><br>sdfkl
                        ssafd
                        <br>
                        dfsa
                    </div>
                </div>
                <div class="k-faq-slide">
                    <span>3</span>
                    <span>세 번째</span>
                    <div class="k-arrow-img"></div>
                    <!-- <img src="../images/arrow_down.png" class="k-arrow"> -->
                </div>
                <div  class="k-faq-content">
                    <div>
                        안녕하세오 <br>
                        overflow가 안 먹어요
                        <br>
                        그리고 음..pre를 안 넣어도 잘 넘어갈지 모르겠어요
                        <br>
                        관리자 증말 zzㅏ증나 <br><br>sdfkl
                        ssafd
                        <br>
                        dfsa
                    </div>
                </div>
                <div class="k-faq-slide">
                    <span>4</span>
                    <span>네 번째</span>
                    <div class="k-arrow-img"></div>
                    <!-- <img src="../images/arrow_down.png" class="k-arrow"> -->
                </div>
                <div  class="k-faq-content">
                    <div>
                        안녕하세오 <br>
                        overflow가 안 먹어요
                        <br>
                        그리고 음..pre를 안 넣어도 잘 넘어갈지 모르겠어요
                        <br>
                        관리자 증말 zzㅏ증나 <br><br>sdfkl
                        ssafd
                        <br>
                        dfsa
                    </div>
                </div>
                

            </div>

        
        </div>
    </div>
      
    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
    

      
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <script src="${contextPath}/resources/js/qnaList.js"></script>
</body>
</html>