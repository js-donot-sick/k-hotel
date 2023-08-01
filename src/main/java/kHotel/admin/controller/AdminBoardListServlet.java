package kHotel.admin.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kHotel.admin.model.vo.HAdminBoard;
import kHotel.board.model.service.HBoardService;
import kHotel.board.model.vo.Board;

@WebServlet("/admin/AdminBoardList")
public class AdminBoardListServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
         HBoardService service = new HBoardService();
         
         HttpSession session = req.getSession();
         
         
         try {
			
        	 List<HAdminBoard> boardList = service.selectBoardList();
        	 
        	 if(boardList != null) { // 성공
        
        		 session.setAttribute("boardList", boardList);
        		 
        		 String path = "/WEB-INF/views/admin/AdminBoardList.jsp";
        		 
        		 RequestDispatcher dispatcher = req.getRequestDispatcher(path);
        		 
        		 dispatcher.forward(req, resp);
        		 
        		 
        	 }
        	 
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
         		
	}
		

}
