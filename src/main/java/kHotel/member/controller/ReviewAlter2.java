package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.member.model.service.JMemberService;
import kHotel.member.model.vo.Member;
import kHotel.member.model.vo.Review;

@WebServlet("/board/review/reviewAlter")
public class ReviewAlter2 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		
		// --------- 작성된 리뷰 정보 ----------------
		
		String memberId = req.getParameter("memberId");
		String hotelName = req.getParameter("hotelName");
		String roomName = req.getParameter("roomName");
		String pic = req.getParameter("pic");
		String tag = req.getParameter("tag");
		
		System.out.println(req.getParameter("memberId"));
		System.out.println(hotelName + "t1q");
		System.out.println(roomName + "t1q");
		System.out.println(pic + "t1q");
		System.out.println(tag );
		int star = Integer.parseInt(req.getParameter("star"));
		
		
		
		Review rvUpdate = new Review();
		
		rvUpdate.setUserId(memberId);
		rvUpdate.setHotelName(hotelName);
		rvUpdate.setRoomName(roomName);
		rvUpdate.setReviewImg(pic);
		rvUpdate.setTag(tag);
		rvUpdate.setStar(star);
		// ----------------------------------------------
		
		
		// ------------수정 할 게시글 정보------------------------
		String updateImg = req.getParameter("updateImg");
		String updateContent = req.getParameter("updateContent");
		int updateStar = Integer.parseInt(req.getParameter("updateStar"));
		String[] tag2 = req.getParameterValues("updateTag");
		
		String updateTag = null;
		
		if(!tag2[0].equals("")) {
			updateTag = String.join(",,", tag2);
		}
		
		Review updateReview = new Review();
		
		updateReview.setReviewImg(updateImg);
		updateReview.setContent(updateContent);
		updateReview.setStar(updateStar);
		updateReview.setTag(updateTag);
		// --------------------------------------------
		
		
		
		
		Member loginMember = (Member)session.getAttribute("loginMember");
		
		
		JMemberService service = new JMemberService();
		
		try {
			
			int result = service.reviewAlter(rvUpdate, loginMember ,updateReview);
			
			System.out.println(result +"섭릿");
			if(result > 0) {
				session.setAttribute("message", "리뷰가 수정되었습니다.");
				
				
				
			}else {
				session.setAttribute("message", "리뷰 수정이 실패되었습니다. 다시 시도해 주세요.");
				
				
			}
			
			resp.sendRedirect(req.getContextPath() + "/WEB-INF/views/reviewShow.jsp" );
			
			
		}catch(Exception e) {
			
		}
	}

}
