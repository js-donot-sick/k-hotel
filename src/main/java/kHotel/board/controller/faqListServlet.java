package kHotel.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/faq")
public class faqListServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			int type = Integer.parseInt(req.getParameter("type"));
			
		} catch (Exception e) {
			
			
		}
		
		String path = "/WEB-INF/views/admin/AdminFaqList.jsp";		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		dispatcher.forward(req, resp);

	}

}
