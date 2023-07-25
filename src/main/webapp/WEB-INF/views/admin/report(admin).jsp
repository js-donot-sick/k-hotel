<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자페이지 신고목록</title>

    <link rel="stylesheet" href="${contextPath}/resources/css/AdminHeader.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/report(admin).css">

</head>
<body>

    <jsp:include page ="/WEB-INF/views/admin/AdminHeader.jsp"/>

    <div class="L-report-main">
        <div style="width: 25%;">사이드바</div>

        <div class="L-report-main2">
            <!-- 메인 테이블 -->
            <table class="L-report-table">

                <tr class="L-report-title">
                    <td colspan="6">리뷰신고목록</td>
                </tr>

                <tr class="L-report-tr">
                    <th>게시글 번호</th>
                    <th>신고내용</th>
                    <th>작성자</th>
                    <th>작성날짜</th>
                    <th>신고자</th>
                    <th>버튼</th>
                </tr>

                <tr class="L-report-tr">
                    <td>1</td>
                    <td>
                        <textarea>신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다</textarea>
                    </td>
                    <td>홍길동</td>
                    <td>2023-07-13</td>
                    <td>김길동</td>
                    <td>
                        <button>리뷰확인</button>
                    </td>
                </tr>

                <tr class="L-report-tr">
                    <td>2</td>
                    <td>
                        <textarea>신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다</textarea>
                    </td>
                    <td>이길동</td>
                    <td>2023-07-13</td>
                    <td>박길동</td>
                    <td>
                        <button>리뷰확인</button>
                    </td>
                </tr>
            </table>

            
            <div>페이지네이션</div>
        </div>
        
    </div>
    


    <jsp:include page ="/WEB-INF/views/common/footer.jsp"/>
    
    <script src="${contextPath}/resources/js/report(admin).js"></script>
</body>
</html>