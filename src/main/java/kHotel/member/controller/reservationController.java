package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.member.model.service.CBookService;
import kHotel.member.model.vo.Book;
import kHotel.member.model.vo.HotelRoom;
import kHotel.member.model.vo.Reservation;

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
		
		CBookService service = new CBookService();
		
		if(command.equals("roomChoice")) {
			
			String path = "/WEB-INF/views/book/RoomChoice.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			dispatcher.forward(req, resp);
			
		}
		
		if(command.equals("reservationFinal")) {
			String hotel = req.getParameter("C-hotel-choice");
			String room = req.getParameter("C-room-choice");
			String checkIn = req.getParameter("C-checkInTime");
			String checkOut = req.getParameter("C-checkOutTime");
			int person = Integer.parseInt( req.getParameter("C-adult") );
			person += Integer.parseInt( req.getParameter("C-children") );
				
			Reservation reservation = new Reservation();
			
			reservation.setHotelName(hotel);
			reservation.setRoomName(room);
			reservation.setCheckInTime(checkIn);
			reservation.setCheckOutTime(checkOut);
			reservation.setBookPerson(person);
			
			// 예약가능한 객실인지 확인
			// 객실 번호 먼저 받아오기 
			try {
				int roomNo = service.searchRoom(reservation);
				
				reservation.setRoomNo(roomNo);
				
				int roomPrice =  service.searchRoomPrice(reservation);
				
				// 선택한 날짜에 예약이 되어있는지 확인
				if(roomNo > 0) {
					
				//int result = service.searchCheckInStatus(reservation); 
				
				}
				
				if(roomNo > 0) {
							
				
					
				}else {
					// session.setAttribute("message", "해당 객실은 선택하신 날짜에 예약하실수 없습니다.");
					//        resp.sendRedirect(req.getContextPath()+"/book/roomChoice");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			// if(){} 성공하면 set 객실에 대한 모든 정보를 세팅 
			// 가능하면 set 객실가격 
			
			
			
			
			
			
			req.setAttribute("reservation", reservation);
			
			String path = "/WEB-INF/views/book/reservationFinal.jsp";
				
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
				
			dispatcher.forward(req, resp);
			
		} 
		
		
		

		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
}
