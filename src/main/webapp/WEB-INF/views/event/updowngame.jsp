<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>업다운게임</title>

    <link href="https://cdn.jsdelivr.net/npm/bootsdivap@5.2.3/dist/css/bootsdivap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/updowngame.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/footer.css">
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
</head>

<body>
    <jsp:include page="/WEB-INF/views/common/header.jsp"/>

    <div class="P-top">
        <form action="${contextPath}/event" method="get" name="C-postWrite-main" onsubmit="return inputcheck()">
            <div class="P-udg-body">
                <div class="P-udg-title">업다운게임</div>
                
                <div class="P-udg"></div>

                <div class="p-input-area">
                    <input type="text" id="p-udg-input2" name="p-udg-input2" placeholder="숫자를 입력하세요." autocomplete="off" required>

                    <button type="button" id="p-udg-btn">입력</button>
                </div> <span class="p-udg-message" id="emailMessage"></span>
                
               
            </div>
        </form>
    </div>

    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>

    <script>

        const contextPath = "${contextPath}";
        
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootsdivap@5.2.3/dist/js/bootsdivap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
    <script src="${contextPath}/resources/js/header.js"></script> <!-- 헤더 js -->
    <script src="${contextPath}/resources/js/updown.js"></script>
</body>

</html>