package kHotel.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.board.model.service.HBoardService;
import kHotel.board.model.vo.Board;

@WebServlet("/admin/AdminBoardList/detail")
public class AdminBoardDetailServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int boardNo = Integer.parseInt(req.getParameter("no"));
		
		Board board = new Board();
		
		HBoardService service = new HBoardService();
		
		try {
			
			board.setBoardNo(boardNo);
	
			System.out.println(boardNo);
			
			board = service.BoardDetail(boardNo);
			
			req.setAttribute("board", board);
			
			
			
			String path = "/WEB-INF/views/admin/AdminBoardDetail.jsp";
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
			
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
