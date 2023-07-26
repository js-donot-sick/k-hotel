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
    <link rel="stylesheet" href="${contextPath}/resources/css/boardSidebar.css">

</head>
<body>

    <jsp:include page ="/WEB-INF/views/admin/AdminHeader.jsp"/>

    <div class="L-report-main">
        <jsp:include page="/WEB-INF/views/common/adminSidebar.jsp"/>

        <div class="L-report-main2">
            <!-- 메인 테이블 -->
            <table class="L-report-table">

                <tr class="L-report-title">
                    <td colspan="6">리뷰신고목록</td>
                </tr>

                <tr class="L-report-tr">
                    <th>게시글 번호</th>
                    <th>신고내용</th>
                    <th>작성자아이디</th>
                    <th>게시글작성날짜</th>
                    <th>신고자</th>
                    <th>버튼</th>
                </tr>

                <tr class="L-report-tr">
                    <td>1</td>
                    <td>
                        <textarea>신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다</textarea>
                    </td>
                    <td>user01</td>
                    <td>2023-07-13</td>
                    <td>익명</td>
                    <td>
                        <button>리뷰확인</button>
                    </td>
                </tr>

                <tr class="L-report-tr">
                    <td>2</td>
                    <td>
                        <textarea>신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다</textarea>
                    </td>
                    <td>user02</td>
                    <td>2023-07-13</td>
                    <td>익명</td>
                    <td>
                        <button>리뷰확인</button>
                    </td>
                </tr>

                <tr class="L-report-tr">
                    <td>2</td>
                    <td>
                        <textarea>신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다</textarea>
                    </td>
                    <td>user02</td>
                    <td>2023-07-13</td>
                    <td>익명</td>
                    <td>
                        <button>리뷰확인</button>
                    </td>
                </tr>

                <tr class="L-report-tr">
                    <td>2</td>
                    <td>
                        <textarea>신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다</textarea>
                    </td>
                    <td>user01</td>
                    <td>2023-07-13</td>
                    <td>익명</td>
                    <td>
                        <button>리뷰확인</button>
                    </td>
                </tr>

                <tr class="L-report-tr">
                    <td>2</td>
                    <td>
                        <textarea>신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다신고합니다</textarea>
                    </td>
                    <td>user01</td>
                    <td>2023-07-13</td>
                    <td>익명</td>
                    <td>
                        <button>리뷰확인</button>
                    </td>
                </tr>
            </table>


            <div class="L-pagination-area">
                
                <ul class="L-pagination">
                    <li><a href="#">&lt;&lt;</a></li>
                    <li><a href="#">&lt;</a></li>

                    <li><a class="L-current">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>

                    <li><a href="#">&gt;</a></li>
                    <li><a href="#">&gt;&gt;</a></li>

                </ul>



            </div>
        </div>
        
    </div>
    


    <jsp:include page ="/WEB-INF/views/common/footer.jsp"/>
    
    <script src="${contextPath}/resources/js/report(admin).js"></script>
</body>
</html>