package kHotel.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.board.model.service.LBoardService;


@WebServlet("/board/qna/boardDelete")
public class BoardDeleteServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
		
			int type = Integer.parseInt(req.getParameter("type"));
			int no = Integer.parseInt(req.getParameter("no"));
			
			LBoardService service = new LBoardService();
			
			int result = service.deleteBoard(no);
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		
		

		
		
	}
}
