package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.member.model.vo.Reservation;

@WebServlet("/member/mypage/review")
public class ReviewWriteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = "/WEB-INF/views/mypage/review.jsp";
		
		
		String[] hotelName = req.getParameterValues("hotelName");
		String[] roomName = req.getParameterValues("roomName");
		
		Reservation rv = new Reservation();
		
		System.out.println(hotelName[1]);
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		req.setAttribute("rv", rv);
		
		dispatcher.forward(req, resp);
	}

}
