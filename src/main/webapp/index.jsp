<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="resources/css/header.css">
    <link rel="stylesheet" href="resources/css/index.css">
    <link rel="stylesheet" href="resources/css/reservation.css">
    <link rel="stylesheet" href="resources/css/banner.css">
    <link rel="stylesheet" href="resources/css/footer.css">
    <link rel="stylesheet" href="resources/css/jhj1.css">
    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/slick-carousel/slick/slick.min.js"></script>

    <!-- body2 -->
    <link rel="stylesheet" href="resources/css/body2.css">
    
    <title>메인화면</title>
</head>
<body>
    <div>
        <!-- 헤더 -->
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
                    <a href="#" class="P-header_middle">
                        <img src="resources/images/logo_b_2.png" alt="">
                    </a>
                </div>
                
                <div class="P-header_right">
                    <!-- 로그인 -->
              
                        <div class="P-btn2">
                            <ul>
                                <a href="#">로그인</a>
                                <span> | </span>
                                <a href="#">로그아웃</a>
                                <span> | </span>
                                <a href="#">마이페이지</a>
                                <span> | </span>
                                <a href="#">회원가입</a>
                            </ul>
                        </div>
        
              
                        <div class="P-btn3">
                                <a href="#">커뮤니티</a>
                               <a href="#" >이벤트</a>
                            
                        </div>
         
    
                </div>
                
            </div>
        </div>

        <!-- 배너 사진 -->
        <div>
            <div class="L-banner">
                <ul class="L-slide">
                    <li><img src="resources/images/main1.jpg" class="L-slideImg" alt=""></li>
                    <li><img src="resources/images/main2.jpg" class="L-slideImg" alt=""></li>
                    <li><img src="resources/images/main3.jpg" class="L-slideImg" alt=""></li>
                </ul>
                <div class="L-controller">
                    <span class="L-prev">&lang;</span>
                    <span class="L-next">&rang;</span>
        
                </div>
            </div>
        </div>

        <!-- 호텔 예약 -->
        <form action="#" method="get">
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
                                <option name="location" value="none" selected>호텔을 선택해주세요</option>
                                <option name="location" id="Gangnam" value="Gangnam">K-호텔 강남점</option>
                                <option name="location" id="jongno" value="jongno">K-호텔 종로점</option>
                                <option name="location" id="dangsan" value="dangsan">K-호텔 당산점</option>
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
                        <button id="C-reservationBtn">예약</button>
                    </div>
                </div>
        </form>
        

        <!-- body2 -->
        <article class="H-royal">

            <h2>일상을 더 품격있게</h2>
         
            <div class="H-royal_inner">
         
              <section>
                <div>
                  <img class="H-img" src="https://eshop.lottehotel.com/uploads/banner/6b2686c6b8133b8e2a29844f15c42c23.png" alt="해온 프리미엄 배딩">
                </div>
                <div>
                  <div>
                    <h3>해온 프리미엄베딩</h3>
                    <p>국내최고 롯데호텔에서만 느낄 수 있는 고품격<br>
                      he:on Bedding Package를 집에서 편안하게 느껴보세요.</p>
                    <button>자세히보기</button>
                  </div>
                </div>
              </section>
         
              <section>
                <div>
                  <img class="H-img" src="https://eshop.lottehotel.com/uploads/banner/b2bbeedfa09e1040cb5901d0aca57325.jpg" alt="시그니엘 드립백 커피">
                </div>
                <div>
                  <div>
                    <h3>시그니엘 드립백 커피</h3>
                    <p>시그니엘의 전문 바리스타가 직접 개발한<br>
                    프리미엄 원두 세트로 하루를 향기롭게 시작해보세요.</p>
                  <button>자세히보기</button>
                  </div>
                </div>
              </section>
         
            </div>
         
          </article>

          <!-- 바디 중간 -->
        <div class="J-1">
            <!-- J-1 넓이 100% -->
    
            <div class="J-2">
                <!-- J-2 넓이 1200px  -->
    
                <div class="J-3">
    
                    <div class="J-5">
                        <div id="J5-1">
                            <img class="fade-in" src="https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/76Cz/image/D-oNM9gJGbRPFYohIDcYPlyobzs.jpg" style="height: 95%; width: 95%;">
                        </div>
    
                        <div id="J5-2">
                            
                            뷰 봐라;
                            
    
                        </div>
                    </div>
    
    
                    <div class="J-6">
    
                        <div id="J6-1">
                            저희 호텔에 K호수는 정말 아름답네요? 아 ㅋㅋ 수영장이었네
                        </div>
    
                        <div id="J6-2">
                            <img class="fade-in" src="https://www.ssyenc.co.kr/file/record/57/DF2A8772_6(0).png" style="height: 95%; width: 95%; ">
                        </div>
                    </div>
    
                </div>
    
                <div class="J-7">
    
                    <div class="JJ-7">
    
                         <img src="resources/images/리뷰1.png">
                         <img src="resources/images/리뷰2.png">
                    </div>
    
                </div>
    
                 <div  class="J-4">
    
                    <div id="J4-1">
    
                       이용객분들의 편안한 여행이 되실 수 있도록 늘 K-호텔이 함께하겠습니다.
                    </div>
                </div> 
    
            </div>
    
        </div>

        <!-- footer -->
        <footer>

            <div class="k-first-div">
                <div class="k-f-container">
                    <div class="k-f-container1">
                        <img src="resources/images/logo_w_2.png" class="k-logo">
                    </div>
                    <div class="k-f-container2">
                        <span class="k-f-container2-1">호텔소식</span>
                        <span> | </span>
                        <span class="k-f-container2-1">갤러리</span>
                        <span> | </span>
                        <span class="k-f-container2-1">고객문의</span>
                    </div>
                    <div id="k-sns">
                        <div>
                            <a href="#">
                                <img src="https://www.lottehotel.com/content/dam/lotte-hotel/common/footer/footer-sns-blog.png" class="k-sns-img">
                            </a>
                        </div>
                        <div id="k-sns1">
                            <a href="#">
                                <img src="https://www.lottehotel.com/content/dam/lotte-hotel/common/footer/footer-sns-instagram.png" class="k-sns-img">
                            </a>
                        </div>
                        <div>
                            <a href="#">
                                <img src="https://www.lottehotel.com/content/dam/lotte-hotel/common/footer/footer-sns-youtube.png" class="k-sns-img">
                            </a>
                        </div>
                        <div>
                            <a href="#">
                                <img src="https://www.lottehotel.com/content/dam/lotte-hotel/common/footer/footer-sns-facebook.png" class="k-sns-img">
                            </a>
                        </div>
                        
                    </div>
                </div>
            </div>
    
            <div class="k-second-div">
                <div class="k-second-div1">
                    <div class="k-second-div11">
                        <span class="k-second-div1-1">케이호텔 소개</span>
                        <span> | </span>
                        <span class="k-second-div1-1">사이트맵</span>
                        <span> | </span>
                        <span class="k-second-div1-1">개인정보처리방침</span>
                        <span> | </span>
                        <span class="k-second-div1-1">이메일무단수집금지</span>
                        <span> | </span>
                        <span class="k-second-div1-1">윤리경영(부정제보)</span>
                    </div>
                </div>
            </div>
    
            <div class="k-third-div">
                <div class="k-third-div1">
                    <div>케이호텔(주) 서울특별시 강남구 테헤란로 14길 6</div>
                    <div>TEL 1544-9970</div>
                    <div>Copyright © 2023 khotel.co.,Ltd. All rights reserved.</div>
                </div>
                <div class="k-third-div2">
                    <img src="resources/images/copyright.png" class="k-third-div2-1">
                </div>
            </div>
    
    
        </footer>
    </div>
    

    <script src="resources/js/reservation.js"></script>
    <script src="resources/js/banner.js"></script>
    <script src="resources/js/jhj2.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <script src="resources/js/header.js"></script>
</body>
</html>