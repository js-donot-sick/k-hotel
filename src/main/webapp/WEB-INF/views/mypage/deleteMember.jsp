<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 탈퇴</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
</head>

<body>
    <!-- 헤더 -->
    <jsp:include page="/WEB-INF/views/common/header.jsp"/>
    <!-- 헤더 -->
    <!-- 바디 -->
    <form action="#">
        <div class="C-deleteMember-container">
            <div class="C-deleteMember-body">
                <div class="C-deleteMember-sidebar">사이드바</div>
                <div class="C-delete-main">
                    <div class="C-delete-main-div">
                        <div class="C-delete-title">회원탈퇴</div>
                        <div class="C-delete-title2">회원님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 한번 확인합니다.</div>
                        <div class="C-delete-inputpassword-div">
                            <div class="C-deleteMemberpassword-div">
                                <div class="C-deleteMember-table">
                                    <div>비밀번호 입력</div>
                                    <div>
                                        <input type="password">
                                    </div>
                                </div>
                                <div>비밀번호 형식이 올바르지 않습니다.</div>
                            </div>
                        </div>
                        <div class="C-secession-div">
                            
                            <div class="C-secession-title">회원 탈퇴 약관</div>
                            <pre id="secession-terms">
제1조
이 약관은 샘플 약관입니다.

① 약관 내용 1

② 약관 내용 2

③ 약관 내용 3

④ 약관 내용 4


제2조
이 약관은 샘플 약관입니다.

① 약관 내용 1

② 약관 내용 2

③ 약관 내용 3

④ 약관 내용 4                        
                            </pre>
                        </div>
                        <div class="C-deleteMember-checkbox">
                            <input type="checkbox" name="agree" id="agree">
                            <label>위 약관에 동의합니다.</label>
                            <button id="info-update-btn">탈퇴</button>
                        </div>
                        <div class="C-delete-btn">
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </form>
    <!-- 바디 -->
    <!-- 풋터 -->
    <footer>

	<jsp:include page="/WEB-INF/views/common/footer.jsp"/>

    </footer>
    <!-- 풋터 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../webapp/resources/css/deleteMember.css">
</body>

</html>