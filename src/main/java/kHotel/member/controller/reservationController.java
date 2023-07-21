package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book/*")
public class reservationController extends HttpServlet{

	// /book/roomChoice // 메인페이지에서 예약화면으로 forward 하는 요청
	// /book/reservationFinal // 결제 페이지 에서 조회하는 구문
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// GET방식 요청 처리
		String uri = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = uri.substring(  (contextPath + "/book/").length()  );
		
		if(command.equals("roomChoice")) {
			
			String path = "/WEB-INF/views/book/RoomChoice.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
			
		}
		
		if(command.equals("reservationFinal")) {
			
			
			
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
}
