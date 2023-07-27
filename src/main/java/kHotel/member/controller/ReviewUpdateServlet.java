package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import kHotel.common.MyRenamePolicy;
import kHotel.member.model.vo.Member;

@WebServlet("/member/review3")
public class ReviewUpdateServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = "/WEB-INF/views/board/review.jsp";
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		dispatcher.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			// 저장되는 이미지 크기
			int maxSize = 1024 * 1024 * 100;
			
			HttpSession session = req.getSession();
			
			// 최상위 경로
			String root = session.getServletContext().getRealPath("/");
			
			// 파일이 저장되는 경로
			String folderPath = "/resources/images/reviewImg";
			
			// reviewImg 폴더 까지의 경로
			String filePath = root + folderPath;
			
			
			String encoding = "UTF-8";
			
			// 지정된 파일명 변경 정책에 맞게 이름이 바뀐 파일이 저장됨
			MultipartRequest mpReq = new MultipartRequest(req,  filePath, maxSize,  encoding , new MyRenamePolicy());
			
			Member loginMember = (Member)session.getAttribute("loginMember");
			int memberNo = loginMember.getMemberNo();
			
			String reviewImg = folderPath + mpReq.getFilesystemName("JreviewImage");
			
			
		}catch(Exception e) {
			
		}
		
	}
}
