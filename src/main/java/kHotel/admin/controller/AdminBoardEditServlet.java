package kHotel.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/AdminBoardList/Edit")
public class AdminBoardEditServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int boardNo = Integer.parseInt(req.getParameter("no"));
		
		String boardTitle = req.getParameter("L-input-title");
		
		String path = "/WEB-INF/views/admin/AdminBoardEdit.jsp";
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		dispatcher.forward(req, resp);
		
	}
	
	

}
