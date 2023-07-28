package kHotel.member.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.member.model.service.CBookService;
import kHotel.member.model.vo.Member;
import kHotel.member.model.vo.Reservation;

@WebServlet("/member/mypage/coupon")
public class CouponServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 여기다가 db가서 쿠폰 리스트 가져와서 배열에 담고 req.set해서 넘겨주깅		
		CBookService service = new CBookService();
		List<Reservation> couponList = new ArrayList<Reservation>();
		
		HttpSession session = req.getSession();
		
		Member loginMember = (Member)session.getAttribute("loginMember");
		
		int MemberNo = loginMember.getMemberNo();
		
		try {
			
			couponList = service.selectCouponList(MemberNo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
		String path = "/WEB-INF/views/mypage/couponList.jsp";
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		req.setAttribute("couponList", couponList);
		
		dispatcher.forward(req, resp);
	}
}
