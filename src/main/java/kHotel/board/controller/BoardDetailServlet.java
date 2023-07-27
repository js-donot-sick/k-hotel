package kHotel.board.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.board.model.service.LBoardService;
import kHotel.board.model.vo.Board;

@WebServlet("/board/qna/boardDetail")
public class BoardDetailServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			// 게시판 번호(no쿼리스트링으로 받아와서 사용)로 게시판 정보 조회
			int boardNo = Integer.parseInt(req.getParameter("no"));
			
			
			LBoardService service = new LBoardService();
			
			Board board = service.selectBoardDetail(boardNo);
			
			req.setAttribute("board", board);
			
			String path = "/WEB-INF/views/board/boardDetail.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
