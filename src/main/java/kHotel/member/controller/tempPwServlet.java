package kHotel.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.member.model.service.KMemberService;

@WebServlet("/tempPw")
public class tempPwServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String inputName = req.getParameter("pInputNm");
		String inputPno = req.getParameter("pInputPno");
		String inputId = req.getParameter("pInputId");
		
		try {
			
			KMemberService service = new KMemberService();
			
			// 우선 입력 정보가 일치하는지 확인(result에는 일치하는 회원번호 담김)
			int memberNo = service.rightInfo(inputName, inputPno, inputId);
			
			if(memberNo != 0) {
				// 일치하는 정보가 있는 경우 임시 비밀번호 발급
				
				String pw = null;
						
				int result = service.tempPw(memberNo, pw);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
