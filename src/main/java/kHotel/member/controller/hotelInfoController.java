package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hotelinfo/*")
public class hotelInfoController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uri = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = uri.substring(  (contextPath + "/hotelinfo/").length()  );
		
		if(command.equals("main")) {
			String path = "/WEB-INF/views/hotel/hotelinfo.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
		}
		// 호텔 강남
		if(command.equals("hotel1")) {
			String path = "/WEB-INF/views/hotel/hotelinfo2_1.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
		}
		// 강남 객실
		if(command.equals("gangnam")) {
			String path = "/WEB-INF/views/hotel/hotelroominfo.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
			
		}
		// 호텔 종로
		if(command.equals("hotel2")) {
			String path = "/WEB-INF/views/hotel/hotelinfo2_2.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
		}
		// 종로 객실
		if(command.equals("jongro")) {
			String path = "/WEB-INF/views/hotel/hotelroominfo2.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
		}
		// 호텔 당산
		if(command.equals("hotel3")) {
			String path = "/WEB-INF/views/hotel/hotelinfo2_3.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
		}
		// 당산 객실
		if(command.equals("dangsan")) {
			String path = "/WEB-INF/views/hotel/hotelroominfo3.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
		}
		
		
		if(command.equals("likeplus1")) {
			
			int memberNo = Integer.parseInt(req.getParameter("memberNo"));
			int roomNo = Integer.parseInt(req.getParameter("roomNo"));
			
			
			
		}
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
