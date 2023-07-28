package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.member.model.service.JMemberService;
import kHotel.member.model.vo.Member;

@WebServlet("/member/reservations2")
public class Reservations2Servlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = "/WEB-INF/views/book/reservations2.jsp";
		
		HttpSession session = req.getSession();
		
		Member loginMember = (Member)session.getAttribute("loginMember");
		
		JMemberService service = new JMemberService();
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		
		
		dispatcher.forward(req, resp);
	}
	
	

}
