package kHotel.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.admin.model.service.JAdminService;
import kHotel.admin.model.vo.HAdminBoard;
import kHotel.admin.model.vo.PAdminMemebr;

@WebServlet("/board/admin/FAQUpate2")
public class AdminFAQAlter2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
		HttpSession session = req.getSession();
		
		PAdminMemebr loginMember = (PAdminMemebr)session.getAttribute("loginMember");
			
		// 수정 전 게시글 정보
		String title = req.getParameter("faq1");
		String content = req.getParameter("faq2");
		
		HAdminBoard before = new HAdminBoard();
		
		before.setBoardTitle(title);
		before.setBoardContent(content);
		
		// 수정 후 게시글 정보
		String faqTitle = req.getParameter("faqTitle");
		String faqContent = req.getParameter("faqContent");
		
		
		HAdminBoard after = new HAdminBoard();
		
		after.setBoardTitle(faqTitle);
		after.setBoardContent(faqContent);
		
		JAdminService service = new JAdminService();
		
		/* int result = service.FAQAlter(before, after , loginMember); */
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
