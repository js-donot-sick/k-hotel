<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>리뷰/별점 작성</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../webapp/resources/css/reviewShow.css">
    <link rel="stylesheet" href="../webapp/resources/css/sidebar.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function () {
            $(".H-side-bar .H-side-item").click(function (e) {
                e.preventDefault();
                var $this = $(this);
                var $parent = $this.closest('li');
                var $siblings = $this.siblings('dl');

                if ($siblings.length && !$siblings.is(':visible')) {
                    $parent.addClass('H-active').siblings('li').removeClass('H-active').find('dl').removeClass('H-block').addClass('none');
                    $siblings.removeClass('H-none').addClass('H-block');
                } else {
                    $parent.removeClass('H-active');
                    $siblings.removeClass('H-block').addClass('H-none');
                }
            });
        });
    </script>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>

    <div>헤더</div>

    <!-- 전체 큰 페이지  -->
    <div class="P-top">
        <!-- 사이드바 -->
        <div class="H-div" style="display: flex; width: 25% ; margin-top: 0px;">
            <div class="H-snb" style="width: 100%;">
                <ul class="H-side-bar">
                    <li class="">
                        <a href="#" class="H-side-item">공지사항</a>
                        <a href="#" class="H-side-item">QnA</a>
                        <a href="#" class="H-side-item">별점 후기</a>
                    </li>
                </ul>
            </div>
        </div>

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

                <div class="P-reviewBox">
                    <div class="P-profile_area">
                        <div class="P-id" id="P-id">작성자 : </div>
                        <div>
                            <div class="P-room" id="P-room"> 객실명 : 더블룸 </div>
                            <div class="P-room">작성날짜 : 2023-07-12 </div>
                        </div>
                    </div>
                    <div class="P-img"><a href=""><img src="">이미지보이는 공간</a></div>
                    <div>
                        <div class="P-star">
                            <form name="P-myform" id="P-myform" method="post" action="./save">
                                <fieldset>
                                    <label for="rate1">⭐</label><input type="radio" name="rating" value="5" id="rate1">
                                    <label for="rate2">⭐</label><input type="radio" name="rating" value="4" id="rate2">
                                    <label for="rate3">⭐</label><input type="radio" name="rating" value="3" id="rate3">
                                    <label for="rate4">⭐</label><input type="radio" name="rating" value="2" id="rate4">
                                    <label for="rate5">⭐</label><input type="radio" name="rating" value="1" id="rate5">
                                </fieldset>
                            </form>

                            <span class="P-tag-top">
                                <img src="https://em-content.zobj.net/thumbs/120/apple/354/red-heart_2764-fe0f.png"
                                    alt=""> 커플이랑 가기 좋아요
                            </span>
                            <!-- +클릭 시 span 표출 -->
                            <a href="#" target="_self" role="button" class="P-tag-con">+</a>
                            
                            <div class="P-rs-btn">
                                <button id="P-rs-update-btn">수정</button>
                                <button id="P-rs-delete-btn">삭제</button>
                            </div>
                        
                        </div>
                       </div>
                    <div id="P-rs-content">내용작성</div>
                </div>
                    <div class="P-blank"></div>
                <div class="P-reviewBox">
                    <div class="P-profile_area">
                        <div class="P-id" id="P-id">작성자 : </div>
                        <div>
                            <div class="P-room" id="P-room"> 객실명 : 더블룸 </div>
                            <div class="P-room">작성날짜 : 2023-07-12 </div>
                        </div>
                    </div>
                    <div class="P-img"><a href=""><img src="">이미지보이는 공간</a></div>
                    <div>
                        <div class="P-star">
                            <form name="P-myform" id="P-myform" method="post" action="./save">
                                <fieldset>
                                    <label for="rate1">⭐</label><input type="radio" name="rating" value="5" id="rate1">
                                    <label for="rate2">⭐</label><input type="radio" name="rating" value="4" id="rate2">
                                    <label for="rate3">⭐</label><input type="radio" name="rating" value="3" id="rate3">
                                    <label for="rate4">⭐</label><input type="radio" name="rating" value="2" id="rate4">
                                    <label for="rate5">⭐</label><input type="radio" name="rating" value="1" id="rate5">
                                </fieldset>
                            </form>

                            <span class="P-tag-top">
                                <img src="https://em-content.zobj.net/thumbs/120/apple/354/red-heart_2764-fe0f.png"
                                    alt=""> 커플이랑 가기 좋아요
                            </span>
                            <!-- +클릭 시 span 표출 -->
                            <a href="#" target="_self" role="button" class="P-tag-con">+</a>
                            
                            <div class="P-rs-btn">
                                <button id="P-rs-update-btn">수정</button>
                                <button id="P-rs-delete-btn">삭제</button>
                            </div>
                        
                        </div>
                       </div>
                    <div id="P-rs-content">내용작성</div>
                </div>

                <nav aria-label="Page navigation example" class="P-pg">
                    <ul class="pagination">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous" style="color: black;">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <li class="page-item"><a class="page-link" href="#" style="color: black;">1</a></li>
                        <li class="page-item"><a class="page-link" href="#" style="color: black;">2</a></li>
                        <li class="page-item"><a class="page-link" href="#" style="color: black;">3</a></li>
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Next" style="color: black;">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </ul>
                </nav>

            </div>



        </div>

    </div>

    <div>푸터</div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous">
        </script>

</body>

</html>