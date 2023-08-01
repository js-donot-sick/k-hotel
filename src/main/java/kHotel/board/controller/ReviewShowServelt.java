package kHotel.board.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.board.model.service.ReviewService;
import kHotel.board.model.vo.Board;

@WebServlet("/board/review")
public class ReviewShowServelt extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
	
			ReviewService service = new ReviewService();

			List<Board> boardList = service.boardReview();

			String path = "/WEB-INF/views/board/reviewShow.jsp";
			
			req.setAttribute("boardList", boardList);
			
			System.out.println(boardList);

			RequestDispatcher dispatcher = req.getRequestDispatcher(path);

			dispatcher.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
