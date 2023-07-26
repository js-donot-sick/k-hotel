package kHotel.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.member.model.service.BoardService;
import kHotel.member.model.vo.Board;
import kHotel.member.model.vo.Member;

@WebServlet("/member/mypageQna")
public class MypageQnaServelt extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BoardService service = new BoardService();
		
		try {

			HttpSession session = req.getSession();
			
			Member loginMember = (Member)session.getAttribute("loginMember");
			
			int memberNo = loginMember.getMemberNo();
			
			List<Board> boardList = service.searchQnaList(memberNo);
			
			String path = "/WEB-INF/views/mypage/mypage(QNA).jsp";
			
			req.getRequestDispatcher(path).forward(req, resp);
			
			req.setAttribute("boardList", boardList);			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}


}
