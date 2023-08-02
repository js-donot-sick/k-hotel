package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.member.model.vo.Review;

@WebServlet("/board/review/update")
public class ReviewAlterServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String memberId = req.getParameter("memberId");
		String hotelName = req.getParameter("hotelName");
		String roomName = req.getParameter("roomName");
		String pic = req.getParameter("pic");
		/* String tag = req.getParameter(); */
		
		Review rvUpdate = new Review();
		
		rvUpdate.setUserId(memberId);
		rvUpdate.setHotelName(hotelName);
		rvUpdate.setRoomName(roomName);
		rvUpdate.setReviewImg(pic);
		
		String path = "/WEB-INF/views/mypage/review2.jsp";
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		req.setAttribute("rvUpdate", rvUpdate);
		
		dispatcher.forward(req, resp);
		
	}

}
