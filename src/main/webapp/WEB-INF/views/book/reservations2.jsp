<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>

                <link rel="stylesheet" href="../resources/css/reservations2.css">

                <script src="https://code.jquery.com/jquery-3.7.0.min.js"
                    integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
                    crossorigin="anonymous">
                <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
                    crossorigin="anonymous">





            </head>

            <body>

                <main>

                    <jsp:include page="/WEB-INF/views/common/header.jsp" />

                    <div class="J-BODY">

                        <div class="J-BODY2"></div>

                        <form action="/review4" method="GET">

                       


                        <div class="J-BODY">

                            <jsp:include page="/WEB-INF/views/common/sidebar.jsp" />

                            <div class="J-BODY3">

                                <div class="J-J">
                                    <div class="J-J1">
                                        이전 예약 내역

                                    </div>

                                    <div class="J-J2">

                                        <c:forEach var="list" items="${rvList}">

                                        <div class="accordion test" id="accordionExample">
                                            <div class="accordion-item">
                                                <h2 class="accordion-header" id="headingOne">
                                                    <button class="accordion-button" type="button"
                                                        data-bs-toggle="collapse" data-bs-target="#collapseOne"
                                                        aria-expanded="true" aria-controls="collapseOne">
                                                        <div>예약 번호 :</div><input type="text" value="${list.bookNo}">
                                                    </button>
                                                </h2>
                                                <div id="collapseOne" class="accordion-collapse collapse"
                                                aria-labelledby="headingOne" data-bs-parent="#accordionExample">
                                                <div class="accordion-body">
                                                    <div class="J-PIC">
                                                        <img src="../resources/images/Deluxe-Room_1.jpg">
                                                    </div>
                                                    <div class="J-text">
                                                                <input type="" placeholder="호텔지ㅈㅁ" value="${list.hotelName}" name="hotelName">
                                                                <input type="" placeholder="객실명" value="${list.roomName}" name="roomName">
                                                                <input type="" placeholder="체크인 날짜" value="${list.checkInTime}" name="checkIn">
                                                                <input type="" placeholder="체크 아웃 날짜" value="${list.checkOutTime}" name="checkOut">
                                                                 <button id="J-btn">별점 / 리뷰작성</button> 
                                                    </div>
                                                    
                                                    
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
                                    </div>
                                </c:forEach>


                                    </div>

                                    <div class="J-J3">
                                        <li><a href="">&lt;&lt;</a></li>
                                        <li><a href="">&lt;</a></li>

                                        <li><a href="">&gt;</a></li>
                                        <li><a href="">&gt;&gt;</a></li>
                                    </div>




                                </div>


                            </div>



                        </div>




                    </div>
                </form>

                    <jsp:include page="/WEB-INF/views/common/footer.jsp" />





                </main>








                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
                    crossorigin="anonymous"></script>

                <script src="../resources/js/reservations2.js"></script>
            </body>

            </html>