package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.member.model.service.KMemberService;
import kHotel.member.model.vo.Member;

@WebServlet("/member/login")
public final class LoginServlet extends HttpServlet {
	
	// 헤더에서 로그인 버튼 눌렀을 때
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = "/WEB-INF/views/member/login.jsp";
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		dispatcher.forward(req, resp);
		
	}
	
	// 로그인창에서 로그인 버튼 눌렀을 때
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String inputId = req.getParameter("inputId");
		
		String inputPw = req.getParameter("inputPw");
		
		Member mem = new Member();
		
		mem.setMemberId(inputId);
		mem.setMemberPw(inputPw);
		
		try {
			
			KMemberService service = new KMemberService();
			
			Member loginMember = service.login(mem);
			
			HttpSession session = req.getSession();
			
			if(loginMember != null) {
				
				
				session.setAttribute("loginMember", loginMember);
				session.setMaxInactiveInterval(3600);
				
				Cookie c = new Cookie("saveId", inputId);
				
				System.out.println("아이디" +req.getParameter("K-saveId"));
				// 아이디 저장이 체크된 경우
				if(req.getParameter("K-saveId") != null) {
					// 쿠키 파일을 30일 동안 유지
					c.setMaxAge(60*60*24*30);
					
				} else {
					
					c.setMaxAge(0);
				}
				
				c.setPath(req.getContextPath());
				// -> /kHotel로 시작하는 주소에서만 쿠키 적용
				
				resp.addCookie(c); 
				
				//--------------------------------------
				
				// 쿠키는 왜 String만 담을 수 있나요... 객체도 담고 싶은데 껴주세요ㅠㅠ
				
				
				
				
				
				
				if(loginMember.getMemberAdmin() == 'N'){ // 일반 회원일 때
					resp.sendRedirect(req.getContextPath());
				} else {
					String path = "/WEB-INF/views/admin/AdminMember.jsp";
					
					RequestDispatcher dispatcher = req.getRequestDispatcher(path);
					
					dispatcher.forward(req, resp);
				}
				
				
				
			} else {
				session.setAttribute("message", "아이디 또는 비밀번호가 일치하지 않습니다.");
				resp.sendRedirect(req.getContextPath()+"/member/login");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
