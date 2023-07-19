<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>예약페이지</title>
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css"> <!-- 헤더 스타일 -->
    <link rel="stylesheet" href="${contextPath}/resources/css/RoomChoice.css">
    <!-- j쿼리  -->
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
    <!-- 폰트 -->
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <!-- 부트스트랩 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    
</head>

<body>
<!-- 헤더  -->
<jsp:include page="/WEB-INF/views/common/header.jsp"/>

<!-- 예약부분 바디 -->
    <form action="reservationFinal" method="get" onsubmit="return reservationValidate()">
        <div class="C-reservation">
            <div class="C-rsv-main">
                <div class="C-rsv-main-text">지점 / 객실 / 날짜 / 인원 선택</div>
            </div>
            <div class="C-rsv-head">
                <div class="C-choiceHotel">
                    <div>
                        호텔선택
                    </div>
                    <div>
                        <select name="C-hotel-choice" id="C-hotel-choice">
                            <option name="Hotel" value="none" selected>호텔을 선택해주세요</option>
                            <option name="Hotel" id="Gangnam" value="Gangnam">K-호텔 강남점</option>
                            <option name="Hotel" id="jongno" value="jongno">K-호텔 종로점</option>
                            <option name="Hotel" id="dangsan" value="dangsan">K-호텔 당산점</option>
                        </select>
                    </div>
                </div>
                <div class="C-choiceRoom">
                    <div>객실선택</div>
                    <div>
                        <select name="C-room-choice" id="C-room-choice">
                            <option name="Room" value="none" selected>객실을 선택해주세요</option>
                            <option name="Room" id="Deluxe" value="Deluxe">Deluxe Room</option>
                            <option name="Room" id="Standard" value="Standard">Standard Room</option>
                            <option name="Room" id="Suite" value="Suite">suite Room</option>
                        </select>
                    </div>
                </div>
                <div class="C-checkInOut">
                    <div>
                        체크인
                    </div>
                    <div>
                        <input type="date" name="C-checkInTime" class="C-checkIn" id="C-start">
                    </div>
                </div>
                <div class="C-dateView">
                    <div class="C-countdate" id="C-countdate">
                        0박
                    </div>
                </div>
                <div class="C-checkInOut">
                    <div>
                        체크아웃
                    </div>
                    <div>
                        <input type="date" name="C-checkOutTime" class="C-checkOut" id="C-end">
                    </div>
                </div>
                <div class="C-CountPerson">
                    <div>
                        <div>성인</div>
                        <div class="C-person">
                            <button type="button" id="C-Aminusbutton">-</button>
                            <input type="text" name="C-adult" id="C-adult" placeholder="0">
                            <button type="button" id="C-Aplusbutton">+</button>
                        </div>
                    </div>
                    <div>
                        <div>어린이</div>
                        <div class="C-person">
                            <button type="button" id="C-Cminusbutton">-</button>
                            <input type="text" name="C-children" id="C-children" placeholder="0">
                            <button type="button" id="C-Cplusbutton">+</button>
                        </div>
                    </div>
                </div>
                <div class="C-rsv-button">
                    <button type="submit" id="C-reservationBtn">예약</button>
                </div>
            </div>
    </form>
    <div class="accordion test" id="accordionExample" >
        <div class="accordion-item">
            <h2 class="accordion-header" id="headingOne">
                <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne"
                    aria-expanded="true" aria-controls="collapseOne">
                    Deluxe Room
                </button>
            </h2>
            <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne"
                data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <div>
                        <img src="${contextPath}/resources/images/Deluxe-Room_1.jpg">
                    </div>
                    <div class="C-room-text">
                        <pre>

            <strong>객실 서비스</strong>

            - Auto Window 설치 

            - 개인 욕실 및 Miracle Window 설치 
            
            - 자동 냉난방 시설

            - 해외 방송 시청 및 무료 Wi-Fi 이용가능 

            - 초고속 인터넷 

            - 냉장고 겸용 미니바 
                    </pre>
                    </div>
                    <div>
                        <pre>

            <strong>객실 어메니티</strong>
            
            - 49인치 UHD TV 냉장고 전자레인지 

            - 구둣주걱 구두클리너 티포트 
            
            - 금고 미니바

            - 욕실 목욕가운 비데 헤어드라이어

                        </pre>
                    </div>
                </div>
            </div>
        </div>
        <div class="accordion-item">
            <h2 class="accordion-header" id="headingTwo">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                    data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                    Standard Room
                </button>
            </h2>
            <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo"
                data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <div>
                        <img src="${contextPath}/resources/images/standard-Room_1.jpg" >
                    </div>
                    <div class="C-room-text">
                        <pre>

            <strong>객실 서비스</strong>

            - Auto Window 설치 

            - 개인 욕실 및 Miracle Window 설치 
            
            - 자동 냉난방 시설

            - 해외 방송 시청 및 무료 Wi-Fi 이용가능 

            - 초고속 인터넷 

            - 냉장고 겸용 미니바 
                        </pre>
                    </div>
                    <div>
                        <pre>

            <strong>객실 어메니티</strong>
            
            - 49인치 UHD TV 냉장고 전자레인지 

            - 구둣주걱 구두클리너 티포트 
            
            - 금고 미니바

            - 욕실 목욕가운 비데 헤어드라이어

                        </pre>
                    </div>
                </div>
            </div>
        </div>
        <div class="accordion-item">
            <h2 class="accordion-header" id="headingThree">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                    data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                    Suite Room
                </button>
            </h2>
            <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree"
                data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <div>
                        <img src="${contextPath}/resources/images/suite-Room_1.jpg">
                    </div>
                    <div class="C-room-text">
                        <pre>
            <strong>객실 서비스</strong>

            - Auto Window 설치 

            - 개인 욕실 및 Miracle Window 설치 
            
            - 자동 냉난방 시설

            - 해외 방송 시청 및 무료 Wi-Fi 이용가능 

            - 초고속 인터넷 

            - 냉장고 겸용 미니바 
                    </pre>
                    </div>
                    <pre>

            <strong>객실 어메니티</strong>
            
            - 49인치 UHD TV 냉장고 전자레인지 

            - 구둣주걱 구두클리너 티포트 
            
            - 금고 미니바

            - 욕실 목욕가운 비데 헤어드라이어

                    </pre>

                    <div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>

    </div>

    <script src="${contextPath}/resources/js/RoomChoice.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
    <script src="${contextPath}/resources/js/header.js"></script>
</body>

</html>