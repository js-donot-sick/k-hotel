package kHotel.board.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.board.model.service.ReviewService;

@WebServlet("/board/review")
public class ReviewShowServelt extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			int type = Integer.parseInt(req.getParameter("type"));

			int cp = 1;

			if (req.getParameter("cp") != null) { // 쿼리스트링에 "cp"가 존재한다면
				cp = Integer.parseInt(req.getParameter("cp"));
			}

			ReviewService service = new ReviewService();
			
			Map<String,Object> map = service.boardReview(type,cp);

			String path = "/WEB-INF/views/board/reviewShow.jsp";

			RequestDispatcher dispatcher = req.getRequestDispatcher(path);

			dispatcher.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
