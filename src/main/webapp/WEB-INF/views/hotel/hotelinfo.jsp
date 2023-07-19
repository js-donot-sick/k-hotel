<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="${contextPath}/resources/css/hotelinfo.css">
    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
    <title>회원 정보 확인</title>
</head>
<body>
    
    <jsp:include page="/WEB-INF/views/common/header.jsp"/>

    <div class="L-maindisplay">
        <!-- <div class="L-side">
            <ul class="L-sidelist">
                <li>K-호텔 소개</li>
                <a href="#"><li>강남점</li></a>
                <a href="#"><li>종로점</li></a>
                <a href="#"><li>당산점</li></a>
            </ul>
        </div> -->
        
        <jsp:include page="/WEB-INF/views/common/hotelSidebar.jsp"/>
        

        <div class="L-main">
            <div>소개</div>
            <img src="resources/images/hotelInfo1.jpg" alt="">
            <p>
                롯데호텔앤리조트(LOTTE HOTELS & RESORTS)는 대한민국 최대 규모 호텔그룹입니다.
                이제 아시아를 넘어 세계로 뻗어가는 글로벌 호텔로서 전세계 어디에서나 한결같이 품격있는 서비스와 시설로 고객에게 깊은 감동을 주는 브랜드를 지향하고 있습니다.

                균형 있는 라이프스타일을 추구하며 품격의 가치를 아는 고객을 위해 세련되고 모던한 감각을 지닌 안락한 객실과 세심한 배려가 묻어나는 서비스를 준비합니다.
                또한 롯데호텔만의 감각적인 오트 퀴진과 다양한 경험을 제공하는 호텔시설은 감동을 더해드립니다.

                롯데호텔에서 품격 있는 휴식으로 삶의 균형을 완성해가시길 바랍니다.
            </p>
        </div>
    </div>

    
    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>






    <script src="resources/js/hotelinfo.js"></script>
</body>
</html>