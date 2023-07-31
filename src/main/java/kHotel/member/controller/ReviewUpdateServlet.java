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
import kHotel.member.model.vo.ReviewImg;

@WebServlet("/member/review4")
public class ReviewUpdateServlet extends HttpServlet{
	


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			HttpSession session = req.getSession();
			
			Member loginMember = (Member)session.getAttribute("loginMember");
			
			JMemberService service = new JMemberService();
			
			// 이전 예약
			
			
			
			
			
			
			
			
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
			
			int memberNo = loginMember.getMemberNo();
			
			String reviewImg = folderPath + mpReq.getFilesystemName("JreviewImage");
			
			Enumeration<String> files = mpReq.getFileNames();
			
			String name = files.nextElement();
			
			String rename = mpReq.getFilesystemName(name);
			
			if(rename != null) {
				
				ReviewImg image = new ReviewImg();
				
				image.setReviewReName( folderPath + rename);
				image.setImageLevel( Integer.parseInt(name) );
			}
			
			
			// memberNo 얻어오기
			
			
			
			int delete = Integer.parseInt(mpReq.getParameter("Jdelete"));
			
			if(delete == 0) {
				
				reviewImg = null;
			}
			
			
			int result = service.reviewUpdate(reviewImg,memberNo);
			
			
		}catch(Exception e) {
			
		}
		
	}
}
