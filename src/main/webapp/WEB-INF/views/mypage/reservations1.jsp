<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="${contextPath}/resources/css/reservations1.css">

    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">





</head>
<body>

    <main>

        <jsp:include page="/WEB-INF/views/common/header.jsp"/>

        <div class="J-BODY">

                <jsp:include page="/WEB-INF/views/common/sidebar.jsp"/>

            <form action="member/reservations1" method="GET"></form>
            <div class="J-BODY3">

                <div class="J-J">
                    <div class="J-J1">
                        현재 예약 내역

                    </div>

                    <div class="J-J2">

                        <div class="accordion test" id="accordionExample" >
                            <div class="accordion-item">
                                <h2 class="accordion-header" id="headingOne">
                                    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne"
                                        aria-expanded="true" aria-controls="collapseOne">
                                        <input type="text">
                                    </button>
                                </h2>
                                <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne"
                                    data-bs-parent="#accordionExample">
                                    <div class="accordion-body">
                                        <div class="J-PIC">
                                            <img src="${contextPath}/resources/images/Deluxe-Room_1.jpg">
                                        </div>
                                        <div class="J-text">
                                            <input type="" placeholder="">
                                            <input type="">
                                            <input type="">
                                            <input type="">
                                            <button id="J-btn">예약 취소</button>
                                        </div>
                                        

                              
                                    </div>
                                </div>
                            </div>
                            <div class="accordion-item">
                                <h2 class="accordion-header" id="headingTwo">
                                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                        data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo"
                                        >
                                        <input typr="text">
                                    </button>
                                </h2>
                                <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo"
                                    data-bs-parent="#accordionExample">
                                    <div class="accordion-body">
                                        <div  class="J-PIC">
                                            <img src="../resources/images/standard-Room_1.jpg" >
                                        </div>
                                        <div class="J-text">
                                            <input type="">
                                            <input type="">
                                            <input type="">
                                            <input type="">
                                            <button id="J-btn">예약 취소</button>
                                        </div>
                                        
                                    </div>
                                </div>
                            </div>
                            <div class="accordion-item">
                                <h2 class="accordion-header" id="headingThree">
                                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                        data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree"
                                      >
                                        <input typr="text">
                                    </button>
                                </h2>
                                <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree"
                                    data-bs-parent="#accordionExample">
                                    <div class="accordion-body">
                                        <div  class="J-PIC">
                                            <img src="../resources/images/suite-Room_1.jpg">
                                        </div>
                                        <div class="J-text">
                                            <input type="">
                                            <input type="">
                                            <input type="">
                                            <input type="">
                                            <button id="J-btn">예약 취소</button>
                                        </div>
                                       
                    
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                    </div>

                    <div class="J-J3">
                        홈페이지 버튼

                    </div>




                </div>


            </div>


            
        </div>







        <jsp:include page="/WEB-INF/views/common/footer.jsp"/>



        
        
    </main>








    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
    crossorigin="anonymous"></script>

    <script src="../resources/js/reservations1.js"></script>
</body>
</html>