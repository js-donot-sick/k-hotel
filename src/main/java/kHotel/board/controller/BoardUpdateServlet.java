package kHotel.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.board.model.vo.Board;
import kHotel.member.model.service.CBookService;

@WebServlet("/board/qna/update")
public class BoardUpdateServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 상세게시글로 다시 넘길떄 필요한 아이
		int type = Integer.parseInt(req.getParameter("type"));
		int cp = Integer.parseInt(req.getParameter("cp"));
		
		// update시 필요한 놈들
		int boardNo = Integer.parseInt(req.getParameter("no"));
		String boardTitle = req.getParameter("boardTitle");
		String boardContent = req.getParameter("boardContent");
		String boardDate = req.getParameter("boardDate");
		// String memberNo = req.getParameter("memberNo");
		
		// 주소 저장 
		String path = null;
		
		// 서비스 
		CBookService service = new CBookService();
		
		// 객체 생성
		Board board = new Board();
		
		// 세션 부여
		HttpSession session = req.getSession();
		
		board.setBoardNo(boardNo);
		board.setBoardTitle(boardTitle);
		board.setBoardContent(boardContent);
		board.setBoardDate(boardDate);
		board.setMemberNo(boardNo);
		
		try {
			
			int result = service.updateBoard(board,type);
			
			if(result > 0) {
				session.setAttribute("message", "게시글이 수정되었습니다.");
				
				path ="qna?type="+ type + "&cp=" + cp;
				
			}else {
				session.setAttribute("message", "게시글 수정 실패");
				
				path ="boardDetail?type="+ type + "&cp=" + cp + "&no=" + boardNo;
			}
			
			resp.sendRedirect(path); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
