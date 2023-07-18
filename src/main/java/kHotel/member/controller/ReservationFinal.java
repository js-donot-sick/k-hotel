package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book/reservationFinal")
public class ReservationFinal extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] bookHotel = req.getParameterValues("location");
		String[] bookRoom = req.getParameterValues("Room");
		String checkinTime = req.getParameter("C-checkInTime");
		String checkOutTime = req.getParameter("C-checkOutTime");
		String adult = req.getParameter("C-adult");
		String child = req.getParameter("C-children");
		
		
	}
}
