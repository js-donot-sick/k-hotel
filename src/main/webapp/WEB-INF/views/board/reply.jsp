<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>


<div>
    <div class="L-reply-title">댓글</div>

    <div id="reply-area">

        <ul id="L-reply-list">

            <c:forEach var="reply" items="${rList}">

                <c:set var="rmi" value="${reply.memberId}"/>
                <c:set var="length" value="${fn:length(rmi)}"/>
                


                <li class="L-reply-row">
                    <span class="L-reply-person">***${fn:substring(rmi,3,length)}</span>
                    <span class="L-reply-date">${reply.createDt}</span>

                    <p class="L-reply-content">${reply.replyContent}</p>
    

                    <c:if test="${loginMember.memberId == reply.memberId}">

                        <div class="L-reply-btn">
                            <button onclick="showUpdateReply(${reply.replyNo}, this)">수정</button>
                            <button onclick="deleteReply(${reply.replyNo})">삭제</button>
                        </div>
                        
                    </c:if>
                </li>

            </c:forEach>

            <!-- <li class="L-reply-row">
                <textarea class="LUpdateReplyContent"></textarea>
                <div class="LUpdateBtn">
                    <button>수정</button>
                    <button>취소</button>
                </div>
            </li> -->


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