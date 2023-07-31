<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>이벤트 상세 조회</title>

    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="${contextPath}/resources/css/eventShow.css">
</head>
<body>

    <jsp:include page="/WEB-INF/views/common/header.jsp"/>

    <div class="K-all">
        <div>이벤트</div>
        <div>${event.eventTitle}</div>
        <div>
            <div>
                ${event.eventContent}
            </div>

            <!-- <img src="${contextPath}${event.imageList[0].imageRename}" alt="사진"> -->
            <c:set var="start" value="0"/>

            <div>
                <c:forEach var="i" begin="${start}" end="${fn:length(event.imageList)-1}">
                    <div class="boardImg">
                        <img src="${contextPath}${event.imageList[i].imageRename}" alt="사진">
                    </div>
                </c:forEach>
            </div>
        </div>
        
        <a href="${contextPath}/event"><button id="K-list-btn" type="button">목록으로</button></a>
        <c:if test="${loginMember.memberAdmin.toString() eq 'Y'}">
            <a href="#">
                <button>수정</button>
            </a>
        </c:if>
        
    </div>

    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
    

    <script src="resources/js/eventShow.js"></script>
</body>
</html>