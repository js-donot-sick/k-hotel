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

			HttpSession session = req.getSession();

			
			//memberNo받아오기 ! 
			Member loginMember = (Member)session.getAttribute("loginMember");

			int memberNo = loginMember.getMemberNo();

			PAdminService service = new PAdminService();

			Map<String, Object> map = service.searchAdminMember(type,cp,memberNo);
			
			req.setAttribute("map", map);

			String path = "/WEB-INF/views/admin/AdminMember.jsp";

			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();

		}


	}

}
