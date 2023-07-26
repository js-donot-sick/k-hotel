package kHotel.board.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kHotel.board.model.service.KBoardService;


@WebServlet("/board/qna/search")
public class QnaSearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		try {
			
			String select = req.getParameter("k-search-s");
			String content = req.getParameter("k-search-c");
			
			//int type = Integer.parseInt(req.getParameter("type"));
			
			int type = 2;
			
			System.out.println(type);
			
			int cp = 1;
			
			if(req.getParameter("cp") != null) { 
				cp = Integer.parseInt(req.getParameter("cp"));
			}
			
			KBoardService service = new KBoardService();
			
			// 내가 가져와야 하는 게... 선택된 내용들을 바탕으로 한 글 목록
			Map<String, Object> map = service.qnaSearch(select, content, type, cp);
			
			req.setAttribute("map", map);
			
			System.out.println(map);
			
			String path = "/WEB-INF/views/board/qnaList.jsp";		
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
