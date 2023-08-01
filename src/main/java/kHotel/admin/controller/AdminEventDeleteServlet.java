package kHotel.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.admin.model.service.KAdminService;

@WebServlet("/admin/event/delete")
public class AdminEventDeleteServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			int eventNo = Integer.parseInt(req.getParameter("no"));
			
			int result = new KAdminService().deleteEvent(eventNo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
