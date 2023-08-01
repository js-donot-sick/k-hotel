<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <!--   <c:set var="boardList" value ="${boardList}"/> -->

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>리뷰/별점 작성</title>

            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
                crossorigin="anonymous">
            <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="${contextPath}/resources/css/reviewShow.css">
            <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
            <link rel="stylesheet" href="${contextPath}/resources/css/footer.css">
            
            <script src="https://code.jquery.com/jquery-3.7.0.min.js"
                integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
        
        </head>

        <body>

            <jsp:include page="/WEB-INF/views/common/header.jsp"/>

            <!-- 전체 큰 페이지  -->
            <div class="P-top">
   
            <jsp:include page ="/WEB-INF/views/common/boardSidebar.jsp"/>

                <!-- 리뷰/별점 전체 페이지  -->
                <div class="P-maindisplay">
                    <!-- 안에 목록  -->
                    <div class="P-main">
                        <div class="P-reviewTitle">리뷰/별점</div>
                        <div class="P-dropdown">

                            <!-- 방 선택 -->
                            <select name="P-pd-rs1" id="P-pd-rs1">
                                <option value="">전체보기</option>
                                <a href="">
                                    <option value="">방1</option>
                                </a>
                                <a href="">
                                    <option value="">방2</option>
                                </a>
                            </select>

                            <!-- 정렬 -->
                            <select name="P-pd-rs2" id="P-pd-rs2">
                                <option value="">정렬</option>
                                <a href="">
                                    <option value="">최신 순</option>
                                </a>
                                <a href="">
                                    <option value="">오래된 순</option>
                                </a>
                                <a href="">
                                    <option value="">별점 순 </option>
                                </a>
                            </select>
                        </div>

                        <c:forEach var="board" items="${boardList}">
                            <div class="P-reviewBox">
                                <div class="P-profile_area">
                                    <div class="P-id" id="P-id">작성자 : <span>${board.memberId}</span></div>
                                    <div>
                                        <div class="P-room1" id="P-room1"> 지점: <span>${board.hotelTitle}</span> </div>
                                        <div class="P-room2" id="P-room2"> 객실명 : <span>${board.roomName}</span> </div>
                                        <div class="P-room3">작성날짜 : <span>${board.boardDate}</span></div>
                                    </div>
                                </div>
                                <div class="P-img"><a href="#"><img src="${contextPath}${board.imageRename}" class="PreviewImg"></a></div>
                                <div id="P-rs-content">${board.boardContent}</div>
                                <div>
                                    <div class="P-star">

                                        <c:if test = "${board.reviewStar == 1}">

                                        <form name="P-myform" id="P-myform" method="post" action="./save">
                                            <fieldset>
                                                <input type="radio" id="5-stars" name="rating" value="5" class="P-myformYellow" v-model="ratings" />
                                                <label for="5-stars" class="star P-myformYellow" >⭐</label>

                                                <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings" />
                                                <label for="4-stars" class="star P-myformYellow" >⭐</label>

                                                <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings" />
                                                <label for="3-stars" class="star P-myformYellow">⭐</label>

                                                <input type="radio" id="2-stars" name="rating" value="2"v-model="ratings" />
                                                <label for="2-stars" class="star P-myformYellow">⭐</label>

                                                <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                                                <label for="1-star" class="star pyellow">⭐</label>
                                            </fieldset>
                                        </form>    
                                        
                                        </c:if>

                                     
                                        <c:if test = "${board.reviewStar == 2}">

                                        <form name="P-myform" id="P-myform" method="post" action="./save">
                                            <fieldset>
                                                <input type="radio" id="5-stars" name="rating" value="5" class="P-myformYellow" v-model="ratings" />
                                                <label for="5-stars" class="star P-myformYellow" >⭐</label>

                                                <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings" />
                                                <label for="4-stars" class="star P-myformYellow" >⭐</label>

                                                <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings" />
                                                <label for="3-stars" class="star P-myformYellow">⭐</label>

                                                <input type="radio" id="2-stars" name="rating" value="2"v-model="ratings" />
                                                <label for="2-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                                                <label for="1-star" class="star pyellow">⭐</label>
                                            </fieldset>
                                        </form>    
                                        
                                        </c:if>

                                        <c:if test = "${board.reviewStar == 3}">

                                        <form name="P-myform" id="P-myform" method="post" action="./save">
                                            <fieldset>
                                                <input type="radio" id="5-stars" name="rating" value="5" class="P-myformYellow" v-model="ratings" />
                                                <label for="5-stars" class="star P-myformYellow" >⭐</label>

                                                <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings" />
                                                <label for="4-stars" class="star P-myformYellow" >⭐</label>

                                                <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings" />
                                                <label for="3-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="2-stars" name="rating" value="2"v-model="ratings" />
                                                <label for="2-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                                                <label for="1-star" class="star pyellow">⭐</label>
                                            </fieldset>
                                        </form>    
                                        
                                        </c:if>

                                        <c:if test = "${board.reviewStar == 4}">

                                        <form name="P-myform" id="P-myform" method="post" action="./save">
                                            <fieldset>
                                                <input type="radio" id="5-stars" name="rating" value="5" class="P-myformYellow" v-model="ratings" />
                                                <label for="5-stars" class="star P-myformYellow" >⭐</label>

                                                <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings" />
                                                <label for="4-stars" class="star pyellow" >⭐</label>

                                                <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings" />
                                                <label for="3-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="2-stars" name="rating" value="2"v-model="ratings" />
                                                <label for="2-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                                                <label for="1-star" class="star pyellow">⭐</label>
                                            </fieldset>
                                        </form>    
                                        
                                        </c:if>

                                        <c:if test = "${board.reviewStar == 5}">

                                        <form name="P-myform" id="P-myform" method="post" action="./save">
                                            <fieldset>
                                                <input type="radio" id="5-stars" name="rating" value="5" class="P-myformYellow" v-model="ratings" />
                                                <label for="5-stars" class="star pyellow" >⭐</label>

                                                <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings" />
                                                <label for="4-stars" class="star pyellow" >⭐</label>

                                                <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings" />
                                                <label for="3-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="2-stars" name="rating" value="2"v-model="ratings" />
                                                <label for="2-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                                                <label for="1-star" class="star pyellow">⭐</label>
                                            </fieldset>
                                        </form>    
                                        
                                        </c:if>

                                         <c:if test = "${board.reviewStar == 5}">

                                        <form name="P-myform" id="P-myform" method="post" action="./save">
                                            <fieldset>
                                                <input type="radio" id="5-stars" name="rating" value="5" class="P-myformYellow" v-model="ratings" />
                                                <label for="5-stars" class="star pyellow" >⭐</label>

                                                <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings" />
                                                <label for="4-stars" class="star pyellow" >⭐</label>

                                                <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings" />
                                                <label for="3-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="2-stars" name="rating" value="2"v-model="ratings" />
                                                <label for="2-stars" class="star pyellow">⭐</label>

                                                <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                                                <label for="1-star" class="star pyellow">⭐</label>
                                            </fieldset>
                                        </form>    
                                        
                                        </c:if>
    
                                        ${board.tagContent}
                                        ${board.tagContent}
                                        <div class="P-tag-area">
                                            <span class="P-tag-top">
                                                <img src="https://em-content.zobj.net/thumbs/120/apple/354/red-heart_2764-fe0f.png"
                                                    alt=""> 커플이랑 가기 좋아요
                                            </span>
                                        </div>
                                        <!-- +클릭 시 span 표출 -->
    
                                        <div onclick="fn_find()" class="P-tag-con">+</div>
                                        <div id="search"><span class="P-tag-top">
                                                <img src="https://em-content.zobj.net/thumbs/120/apple/354/red-heart_2764-fe0f.png"
                                                    alt=""> 커플이랑 가기 좋아요
    
                                            </span></div>
    
                                    </div>
                                </div>
                                <div class="P-rs-btn">
                                    <button id="P-rs-update-btn">수정</button>
                                    <button id="P-rs-delete-btn">삭제</button>
                                    <button id="P-rs-Declar-btn">신고</button>
                                </div>
    
    
    
                            </div>
                        </c:forEach>

                        

                        <div class="P-blank"></div>

                        <div class="P-pagination-area">
                            <ul class="P-pagination">
                                <li><a href="#">&lt;&lt;</a></li>
                                <li><a href="#">&lt;</a></li>
                                <li><a class="P-current">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li><a href="#">6</a></li>
                                <li><a href="#">7</a></li>
                                <li><a href="#">8</a></li>
                                <li><a href="#">9</a></li>
                                <li><a href="#">10</a></li>
                                <li><a href="#">&gt;</a></li>
                                <li><a href="#">&gt;&gt;</a></li>
                            </ul>
                        </div>

                        <!-- 신고하기 창 -->
                        <form action="#">
                            <div id="P-popup-Declar">

                                <div id="P-popup-area">
                                    <div id="P-popup-title">신고하기</div>
                                    
                                        <div id="P-popup-out">
                                            <button id="P-popup-outbtn">X</button>
                                        </div>
                                    
                                </div>


                                <div class="P-popup-writer-area">
                                    <textarea name="" id="P-popup-content"></textarea>
                                </div>
                                <div class="P-declar-btnarea">
                                    <button id="P-declar-btn">신고하기</button>
                                </div>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
                
                <jsp:include page="/WEB-INF/views/common/footer.jsp"/>

                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
                    crossorigin="anonymous">
                    </script>
                <script src="${contextPath}/resources/js/reviewShow.js"></script>

        </body>

        </html>