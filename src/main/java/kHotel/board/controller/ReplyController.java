package kHotel.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reply/*") // 댓글 전체 컨트롤러
public class ReplyController extends HttpServlet{

	// /reply/selectReplyList
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// GET방식 요청 처리
		String uri = req.getRequestURI();
		// /semiProject/reply/selectReplyList
		
		String contextPath = req.getContextPath();
		// /semiProject
		
		String command = uri.substring(  (contextPath + "/reply/").length()  );
		// selectReplyList
	
	

		
		
	
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
}

