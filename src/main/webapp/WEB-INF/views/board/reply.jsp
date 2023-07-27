<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div class="L-reply-title">댓글</div>

    <div id="reply-area">

        <ul id="L-reply-list">

            <c:forEach var="reply" items="${rList}">


                <li class="L-reply-row">
                    <span class="L-reply-person">${reply.memberId}</span>
                    <span class="L-reply-date">${reply.createDt}</span>
                    <p class="L-reply-content">${reply.replyContent}</p>
    

                    <c:if test="${loginMember.memberId == reply.memberId}">

                        <div class="L-reply-btn">
                            <button onclick="updateReply(${reply.replyNo}), this">수정</button>
                            <button>삭제</button>
                        </div>
                        
                    </c:if>
                </li>

            </c:forEach>

        </ul>

        

        <!-- 댓글 입력 -->
        <div class="L-reply-input">
            <textarea id="L-reply-content2"></textarea>
            <button id="L-reply-add">
                댓글작성
            </button>
        </div>
    
    </div>
</div>