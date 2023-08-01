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
			
			int cp = 1;
			
			if(req.getParameter("cp") != null) { 
				cp = Integer.parseInt(req.getParameter("cp"));
			}
			
			System.out.println(cp);
			
			ReviewService service = new ReviewService();

			Map<String, Object> map = service.boardReview(cp);

			String path = "/WEB-INF/views/board/reviewShow.jsp";
			
			req.setAttribute("map", map);
			
			System.out.println(map);

			RequestDispatcher dispatcher = req.getRequestDispatcher(path);

			dispatcher.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
