package kHotel.board.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.board.model.service.HBoardService;

@WebServlet("/board")
public class AnnouncementServlet extends HttpServlet  {
	
	@Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	         String path = "/WEB-INF/views/board/boardList.jsp";
	         
	         RequestDispatcher dispatcher = req.getRequestDispatcher(path);
	         dispatcher.forward(req, resp);
	         
	   }
}