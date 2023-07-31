package kHotel.member.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import kHotel.common.MyRenamePolicy;
import kHotel.member.model.service.JMemberService;
import kHotel.member.model.vo.Member;
import kHotel.member.model.vo.Reservation;
import kHotel.member.model.vo.Review;
import kHotel.member.model.vo.ReviewImg;

@WebServlet("/member/mypage/review4")
public class ReviewUpdateServlet extends HttpServlet{
	


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			HttpSession session = req.getSession();
			
			Member loginMember = (Member)session.getAttribute("loginMember");
			
			JMemberService service = new JMemberService();
			
			String path = null;
			
			
			// 리뷰 등록
			String content = req.getParameter("reviewContent");
			int star = Integer.parseInt(req.getParameter("rating"));
			
			System.out.println(content + "작성 영역");
			String userId = loginMember.getMemberId();
		
			
			Review rv = new Review();
			
			rv.setContent(content);
			rv.setUserId(userId);
			rv.setStar(star);
			
			int memberNo = loginMember.getMemberNo();
			
			rv.setMemberNo(memberNo);
			
			System.out.println("왜그러냐?");
			
			int result = service.reviewUpdate(rv);
			
			String message = null;
			
			if(result > 0) {
				
				message = "작성 성공";
				
				path = "/reviewMain.jsp";
				
			}else {
				message = "작성 실패";
				
			}
			
			System.out.println("안녕");
			session.setAttribute("message", message);
			resp.sendRedirect(path);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
