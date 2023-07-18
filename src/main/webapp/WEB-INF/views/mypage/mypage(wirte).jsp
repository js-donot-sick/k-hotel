<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>내가 쓴 글(게시글)</title>
    <link rel="stylesheet" href="resources/css/mypage(wirte).css">
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
    
    <div class="P-top" >
        <!--  사이드바 -->
        <div class="H-div" style="display: flex;" >
            <div class="H-snb" >
                <ul class="H-side-bar">
                    <li class="">
                        <a href="#" class="H-side-item">내 정보</a>
                        <dl class="H-none">
                            <dd class="H-active"><a href="#">- 프로필 수정</a></dd>
                            <dd class=""><a href="#">- 비밀번호 변경</a></dd>
                            <dd class=""><a href="#">- 문의 내역</a></dd>
                            <dd class=""><a href="#">- 탈퇴 요청</a></dd>
                        </dl>
                    </li>
                    <li>
                        <a href="#" class="H-side-item">예약</a>
                        <dl class="H-none">
                            <dd class=""><a href="#">- 현재 예약 확인</a></dd>
                            <dd class=""><a href="#">- 이전 예약 확인</a></dd>
                        </dl>
                    </li>
                    <li>
                        <a href="#" class="H-side-item">쿠폰</a>
                        <dl class="H-none">
                            <dd class=""><a href="#">- 쿠폰함</a></dd>
                        </dl>
                    </li>
                    <li>
                        <a href="#" class="H-side-item">내가 쓴 글</a>
                        <dl class="H-none">
                            <dd class=""><a href="#">- 내가 쓴 글</a></dd>
                        </dl>
                    </li>
                    <li>
                        <a href="#" class="H-side-item">찜</a>
                        <dl class="H-none">
                            <dd class=""><a href="#">- 찜 목록</a></dd>
                        </dl>
                    </li>
                </ul>

            </div>

            <div class="P-maindisplay">
                <!-- QNA 메인 글자 -->
                <div class="P-main" >
                    <div class="P-blank1">내가 쓴 글</div>

                    <!-- 드롭박스 -->
                    <div class="P-dropdown">
                        <select name="" id="" onchange="location.href=this.value">
                            <option value="">선택하세요</option>
                                <option value="mypage(QNA).html">QnA</option>
                                <option value="mypage(wirte).html">내가 작성한 게시글</option>
                        </select>
                    </div>

                    <!-- QnA 항목 이동 링크 -->
                    <div class="P-wirte-1">
                        <div class="P-wirte">
                            <div>1</div>
                            <div>게시글 제목</div>
                            <div></div>
                            <div>2023-07-10 18:15</div>
                            <a href="#"><button class="P-wirte-btn">상세내역</button></a>
                        </div>

                        <div class="P-wirte">
                            <div>1</div>
                            <div>게시글 제목</div>
                            <div></div>
                            <div>2023-07-10 18:15</div>
                            <a href="#"><button class="P-wirte-btn">상세내역</button></a>
                        </div>

                        <div class="P-wirte">
                            <div>1</div>
                            <div>게시글 제목</div>
                            <div></div>
                            <div>2023-07-10 18:15</div>
                            <a href="#"><button class="P-wirte-btn">상세내역</button></a>
                        </div>

                        <div class="P-wirte">
                            <div>1</div>
                            <div>게시글 제목</div>
                            <div></div>
                            <div>2023-07-10 18:15</div>
                            <a href="#"><button class="P-wirte-btn">상세내역</button></a>
                        </div>

                        <div class="P-wirte">
                            <div>1</div>
                            <div>게시글 제목</div>
                            <div></div>
                            <div>2023-07-10 18:15</div>
                            <a href="#"><button class="P-wirte-btn">상세내역</button></a>
                        </div>
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

    </div>

    <div>풋터</div>






        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
</body>

</html>