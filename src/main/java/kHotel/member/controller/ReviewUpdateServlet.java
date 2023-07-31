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

			// -------------------------------------------------------------------
			
			// 저장되는 이미지 크기
			int maxSize = 1024 * 1024 * 100;

			// 최상위 경로
			String root = session.getServletContext().getRealPath("/");

			// 파일이 저장되는 경로
			String folderPath = "/resources/images/reviewImg";

			// reviewImg 폴더 까지의 경로
			String filePath = root + folderPath;

			String encoding = "UTF-8";
			MultipartRequest mpReq = new MultipartRequest(req, filePath, maxSize, encoding, new MyRenamePolicy());
			
			Enumeration<String> files = mpReq.getFileNames();

			// 지정된 파일명 변경 정책에 맞게 이름이 바뀐 파일이 저장됨
			String name = files.nextElement();
			
			
			/* String reviewImg = folderPath + mpReq.getFilesystemName("JreviewImage"); */

			
			String rename = mpReq.getFilesystemName(name);

			ReviewImg image = new ReviewImg();
			
			if (rename != null) {


				image.setRename(folderPath + rename);
				image.setImageLevel(Integer.parseInt(name));
			}

			
			int delete = Integer.parseInt(mpReq.getParameter("Jdelete"));

			if (delete == 0) {

				/* reviewImg = null; */
			}
			
			// 게시글 번호 얻어오기
			
			
			
		    // --------------------------------------------------------------------
			
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
