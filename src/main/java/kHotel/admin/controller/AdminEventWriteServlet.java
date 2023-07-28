package kHotel.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import kHotel.board.model.vo.EventImage;
import kHotel.common.MyRenamePolicy;

@WebServlet("/admin/eventWrite")
public class AdminEventWriteServlet extends HttpServlet {
	
	// 사이드바에서 이벤트 선택할 시
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String mode = req.getParameter("mode");
			
			if(mode.equals("update")) {
				
			}
			
			String path = "/WEB-INF/views/admin/AdminEventWrite.jsp";
			
			req.getRequestDispatcher(path).forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 찐 등록
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			// multiPartRequest
			// 최대 용량, 이미지 저장 경로, 파일명, 인코딩 설정
			int maxSize = 1024*1024*80;
			
			HttpSession session = req.getSession();
			String root = session.getServletContext().getRealPath("/");
			String folderPath = "/resources/images/event/";
			String filePath = root + folderPath;
			
			String encoding = "UTF-8";
			
			MultipartRequest mpReq = new MultipartRequest(req, filePath, maxSize, encoding, new MyRenamePolicy());
			// 드디어 객체 생성했다.......
			
			Enumeration<String> files = mpReq.getFileNames();
			
			List<EventImage> imageList = new ArrayList<>();
			
			while(files.hasMoreElements()) { // 다음 요소가 있을 때
				
				String name = files.nextElement();
				
				String rename = mpReq.getFilesystemName(name);
				String original = mpReq.getOriginalFileName(name);
				
				if(original != null) { // 실제로 파일이 담겨있는 경우
					
				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
