<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/footer.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/hotelSidebar.css">

    <link rel="stylesheet" href="${contextPath}/resources/css/hotelinfo2.css">
    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <title>회원 정보 확인 강남</title>
</head>

<body>

    <jsp:include page="/WEB-INF/views/common/header.jsp"/>


    <div class="L-maindisplay">
        <!-- 사이드바 -->
        <!-- <div class="L-side">
            <ul class="L-sidelist">
                <li>K-호텔 소개</li>
                <a href="#">
                    <li>강남점</li>
                </a>
                <a href="#">
                    <li>종로점</li>
                </a>
                <a href="#">
                    <li>당산점</li>
                </a>
            </ul>
        </div> -->

        <jsp:include page="/WEB-INF/views/common/hotelSidebar.jsp"/>

        <!-- 호텔 소개 -->
        <div class="L-main">

            <!-- 지점 소개 -->
            <div class="L-hotelpoint">
                <div>지점 소개</div>
                <div>
                    <img src="${contextPath}/resources/images/hotelyeuksam.jpg" alt="" id="L-hotel1">
                </div>
                <div>
                    <pre>
국내 최고의 럭셔리 비즈니스 호텔인 K호텔은 1,015실 규모를 자랑하며 서울에 자리잡고 있습니다. 
강남, 종로, 당산 등 서울의 중심 관광지들로의 접근성이 뛰어나 서울 관광을 위한 최적의 위치를 자랑합니다.
세계적인 인테리어 회사들이 참가하여 설계한 독창적인 인테리어의 객실은 최신 트렌드를 반영하고 있으며, 
성공적인 비즈니스를 위한 클럽 플로어에서는 품위와 정교함을 느끼실 수 있습니다. 
또한, K호텔에서는 따뜻하고 고급의 가족모임과 럭셔리 웨딩, 
대규모 국제회의 진행 등의 비즈니스 행사를 위한 최상의 시설을 제공하고 있으며, 
최고급 레스토랑 또한 국빈 등 VIP고객을 모시기에 최적의 선택입니다.
                    </pre>
                </div>
            </div>

            <!-- 객실 소개 -->
            <div class="L-roompoint-main">
                <div class="L-roompoint">객실 소개</div>
                <div class="L-roompoint-1">
                    <!-- 로그인회원 번호 -->

                    <!-- 파라미터로 넘겨줄 값 설정 -->
                    <input type="hidden" name="memberNo" value="${loginMember.memberNo}">
                    <!-- 객실명 -->
                    <input type="hidden" name="roomNm1" value="DELUXE">
                    <input type="hidden" name="roomNm2" value="STANDARD">
                    <input type="hidden" name="roomNm3" value="SUITE">
                    <!-- 호텔명 -->
                    <input type="hidden" name="hotelNm1" value="GANGNAM">
                    <!-- 찜하기 -->
                    <input type="hidden" id="Llike1" name="Llike1" value="0">
                    <input type="hidden" id="Llike2" name="Llike2" value="0">
                    <input type="hidden" id="Llike3" name="Llike3" value="0">
                    
                    <!-- 객실1 -->
                    <div class="L-roompoint-border L-roomA" id="LroomG1">
                        <img src="${contextPath}/resources/images/deluxroompoint1.jpg" class="L-roomimg" id="L-room1">
                        <!-- <button type="button" id="L-hbtn">찜하기♡</button> -->
                        <pre>
 <p>디럭스 룸</p> 침대타입 <span>|</span> 더블/트윈/트리플 전망 시티뷰 
 투숙인원 <span>|</span> 2 명 
 객실면적 <span>|</span> 40~46 m²
                        </pre>
                    </div>

                    <!-- 객실2 -->
                    <div class="L-roompoint-border L-roomA1" id="LroomG2">
                        <img src="${contextPath}/resources/images/standard-Room_1.jpg" class="L-roomimg1" id="L-room2">
                        <!-- <button type="button" id="L-hbtn2">찜하기♡</button> -->
                        <pre>
 <p>스탠다드 룸</p> 침대타입 <span>|</span> 더블/트윈 전망 시티뷰 
 투숙인원 <span>|</span> 2 명 
 객실면적 <span>|</span> 26.7 ㎡ ~ 30.7㎡
                        </pre>
                    </div>

                    <!-- 객실3 -->
                    <div class="L-roompoint-border L-roomA" id="LroomG3">
                        <img src="${contextPath}/resources/images/suiteroompoint3.jpg" class="L-roomimg" id="L-room3">
                        <!-- <button type="button" id="L-hbtn3">찜하기♡</button> -->
                        <pre>
 <p>스위트 룸</p> 침대타입 <span>|</span> 더블 전망 시티뷰 
 투숙인원 <span>|</span> 2명 
 객실면적 <span>|</span> 460.8 m²
                        </pre>
                    </div>
                </div>
            </div>

            <!-- 오시는 길 -->
            <div class="L-roadmain">
                <div class="L-road">오시는 길</div>
                <div class="L-map-main">
                    <div class="L-map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d50646.05406777859!2d126.99171026953124!3d37.49899300000002!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357c9ec255555555%3A0x3565475c3365c5bb!2zS0jsoJXrs7TqtZDsnKHsm5A!5e0!3m2!1sko!2skr!4v1689329654673!5m2!1sko!2skr" width="300" height="300" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                    </div>
                    <div class="L-address">
                        <pre>
주소 : 서울특별시 강남구 강남구 테헤란로14길
전화번호 : 1544-9970
                        </pre>
                    </div>
                </div>
            </div>


        </div>
    </div>


    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>






    <script src="${contextPath}/resources/js/hotelinfo2.js"></script>
</body>

</html>