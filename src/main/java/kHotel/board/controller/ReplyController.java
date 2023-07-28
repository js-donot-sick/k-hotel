package kHotel.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kHotel.board.model.service.LReplyService;
import kHotel.board.model.vo.Reply;


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
		
		LReplyService service = new LReplyService();
		
		try {

			// 댓글 목록 조회
			if (command.equals("selectReplyList")) {

				int boardNo = Integer.parseInt(req.getParameter("no"));

				List<Reply> rList = service.selectReplyList(boardNo);

				new Gson().toJson(rList, resp.getWriter());
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		
	
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
}

