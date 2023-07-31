package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.member.model.vo.Member;
import kHotel.member.model.vo.Reservation;

@WebServlet("/book/bookEnd")
public class ReservationEndServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		try {
			
			String hotelName = req.getParameter("hotelName");
			String roomName = req.getParameter("roomName");
			int bookPerson = Integer.parseInt(req.getParameter("bookPerson"));
			int roomPrice = Integer.parseInt(req.getParameter("roomPrice")); // 할인 전 금액
			int couponSale = Integer.parseInt(req.getParameter("couponSale"));
			int hotelPay = Integer.parseInt(req.getParameter("C-hotelPay")); // 총 합계
			
			HttpSession session = req.getSession();
			
			Member loginMember = (Member)session.getAttribute("loginMember");
			String memberName = loginMember.getMemberName();
			String memberTel = loginMember.getMemberTel();
			String memberEmail = loginMember.getMemberEmail();
			
			String payPlan = req.getParameter("C-payplan");
			
			Reservation reserve = new Reservation();
			
			reserve.setHotelName(hotelName);
			reserve.setRoomName(roomName);
			reserve.setBookPerson(bookPerson);
			reserve.setRoomPrice(bookPerson);
			reserve.setCouponSale(roomPrice);
			reserve.setHotelPay(couponSale);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		String path = "/WEB-INF/views/book/bookEnd.jsp";
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		dispatcher.forward(req, resp);
		
		
	}

}
