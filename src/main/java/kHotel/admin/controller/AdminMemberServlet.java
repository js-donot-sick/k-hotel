package kHotel.admin.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import kHotel.admin.model.service.PAdminService;
import kHotel.member.model.vo.Member;

@WebServlet("/admin/memberAdmin")
public class AdminMemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		try {

			int type = Integer.parseInt(req.getParameter("type"));
			
			int cp = 1;

			if(req.getParameter("cp")!=null) {
				cp = Integer.parseInt(req.getParameter("cp"));
			}
			
		
			PAdminService service = new PAdminService();
			
			Map<String, Object> map = null;
			
			if(req.getParameter("Pid") ==null) {
				map = service.searchAdminMember(type,cp);
			}else {
				String Pid = req.getParameter("Pid");
				map = service.searchId(Pid,type,cp);
			}
			
//			HttpSession session = req.getSession();
//			session.setAttribute("listReportCount", map.get("listReportCount"));

			req.setAttribute("map", map);

			String path = "/WEB-INF/views/admin/AdminMember.jsp";

			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();

		}


	}

}
