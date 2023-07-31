<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>bookEnd</title>

    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${contextPath}/resources/css/bookEnd.css">
</head>
<body>

    <header>
       <jsp:include page="/WEB-INF/views/common/header.jsp"/>
    </header>

    <div id="k-content"> <!-- 중간 내용 부분 전체 -->

		<%
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = dateFormat.format(today);
		%>

		<div> <!-- 예약 확인 글씨 div -->
            예약확인
        </div>
        <div> <!-- 예약 정보 객실 div -->
            <div>예약 정보 객실</div>
            <div id="k-book-inform">
                <table border="1px">
                    <tr>
                        <th>예약일시</th>
                        <th>호텔지점</th>
                        <th>객실명</th>
                        <th>인원</th>
                        <th>객실요금</th>
                        <th>할인요금</th>
                        <th>총 합계</th>
                    </tr>
                    <tr>
                        <td><%= formattedDate %></td>
                        <td>${hotelName}</td>
                        <td></td>
                        <td></td>
                        <td>sffsdf</td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
            </div>
        </div>
        <div> <!-- 예약 정보 div -->
            <div>예약자 정보</div>
            <div id="k-booker-inform">
                <table border="1">
                    <tr>
                        <th>예약자명</th>
                        <td>fdsf</td>
                    </tr>
                    <tr>
                        <th>연락처</th>
                        <td>sdfsf</td>
                    </tr>
                    <tr>
                        <th>이메일</th>
                        <td></td>
                    </tr>
                    <tr>
                        <th>요청사항</th>
                        <td></td>
                    </tr>
                    <tr>
                        <th>결제방법</th>
                        <td></td>
                    </tr>
                    <tr>
                        <th>결제상태</th>
                        <td></td>
                    </tr>
                </table>
            </div>
        </div>
        <div> <!-- 버튼 div -->
            <button id="k-book-to-main"><a href="#">메인으로</a></button>
        </div>

    </div>

    <footer>
	<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
    </footer>

    <script src="resources/js/bookEnd.js"></script>
    
</body>
</html>