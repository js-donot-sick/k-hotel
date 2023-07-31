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
			
			String path = "/WEB-INF/views/board/reviewMain.jsp";
			
			
			// 리뷰 등록
			String content = req.getParameter("reviewContent");
			
			String userId = loginMember.getMemberId();
			
			int star = Integer.parseInt(req.getParameter("rating"));
			
			Review rv = new Review();
			
			rv.setContent(content);
			rv.setUserId(userId);
			rv.setStar(star);
			
			int memberNo = loginMember.getMemberNo();
			
			rv.setMemberNo(memberNo);
			System.out.println("왜그러냐?");
			
			int result = service.reviewUpdate(rv);
			
			System.out.println("여긴 servlet");
			if(result > 0) {
				session.setAttribute("message", "리뷰가 작성되었습니다.");
			}else {
				session.setAttribute("message", "리뷰 작성 실패");
				
				path = req.getHeader("referer");
			}
			resp.sendRedirect(path);
			
			// 저장되는 이미지 크기
			int maxSize = 1024 * 1024 * 100;
			
			// 최상위 경로
			String root = session.getServletContext().getRealPath("/");
			
			// 파일이 저장되는 경로
			String folderPath = "/resources/images/reviewImg";
			
			// reviewImg 폴더 까지의 경로
			String filePath = root + folderPath;
			
			
			String encoding = "UTF-8";
			
			
			// 지정된 파일명 변경 정책에 맞게 이름이 바뀐 파일이 저장됨
			MultipartRequest mpReq = new MultipartRequest(req,  filePath, maxSize,  encoding , new MyRenamePolicy());
			
			
			
			String reviewImg = folderPath + mpReq.getFilesystemName("JreviewImage");
			
			Enumeration<String> files = mpReq.getFileNames();
			
			String name = files.nextElement();
			
			String rename = mpReq.getFilesystemName(name);
			
			
			System.out.println("여기서 걸리나?");
			if(rename != null) {
				
				ReviewImg image = new ReviewImg();
				
				image.setReviewReName( folderPath + rename);
				image.setImageLevel( Integer.parseInt(name) );
			}
			
			
			
			int delete = Integer.parseInt(mpReq.getParameter("Jdelete"));
			
			if(delete == 0) {
				
				reviewImg = null;
			}
			
			// memberNo 가져오기
			
			System.out.println(2222);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
