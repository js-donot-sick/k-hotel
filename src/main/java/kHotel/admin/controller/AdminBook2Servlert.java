package kHotel.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.member.model.service.CBookService;
import kHotel.member.model.vo.Reservation;

public class AdminBook2Servlert extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CBookService service = new CBookService();
		
		try {
			
			List<Reservation> rsvList = service.selectRsvList();
			
			System.out.println(rsvList);
			
			String path = "/WEB-INF/views/admin/AdminReservation.jsp";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
			req.setAttribute("rsvList", rsvList);
			
			dispatcher.forward(req, resp);

		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
