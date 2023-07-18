package kHotel.member.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.member.model.service.CBookService;
import kHotel.member.model.vo.Book;


@WebServlet("/book/reservationFinal")
public class ReservationFinal extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bookHotel = req.getParameter("C-hotel-choice");
		String bookRoom = req.getParameter("C-room-choice");
		String checkinTime = req.getParameter("C-checkInTime");
		String checkOutTime = req.getParameter("C-checkOutTime");
		int adult = Integer.parseInt(req.getParameter("C-adult"));
		int child = Integer.parseInt(req.getParameter("C-children"));
		
		Book book = new Book();
		
		book.setBookHotel(bookHotel);
		book.setBookRoom(bookRoom);
		book.setCheckInTime(checkinTime);
		book.setCheckOutTime(checkOutTime);
		book.setAdult(adult);
		book.setChild(child);
		
		try {
			
			CBookService service = new CBookService();
			
			int result = service.reservationFinal(book);;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
