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

import kHotel.admin.model.service.KAdminService;
import kHotel.board.model.vo.Event;
import kHotel.board.model.vo.EventImage;
import kHotel.common.MyRenamePolicy;
import kHotel.member.model.vo.Member;

@WebServlet("/admin/eventWrite")
public class AdminEventWriteServlet extends HttpServlet {

	// 사이드바에서 이벤트 선택할 시
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			
			 String mode = req.getParameter("mode");
			 
			 System.out.println("사이드바에서 눌렀을 때: " + mode); 
			 
			 if(mode.equals("update")) {
			 
			 
			 }

			String path = "/WEB-INF/views/admin/AdminEventWrite.jsp";

			req.getRequestDispatcher(path).forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 찐 글 등록
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			// multiPartRequest
			// 최대 용량, 이미지 저장 경로, 파일명, 인코딩 설정
			int maxSize = 1024 * 1024 * 80;

			HttpSession session = req.getSession();
			String root = session.getServletContext().getRealPath("/");
			String folderPath = "/resources/images/event/";
			String filePath = root + folderPath;

			String encoding = "UTF-8";

			MultipartRequest mpReq = new MultipartRequest(req, filePath, maxSize, encoding, new MyRenamePolicy());

			Enumeration<String> files = mpReq.getFileNames();

			List<EventImage> imageList = new ArrayList<>();

			while (files.hasMoreElements()) { // 다음 요소가 있을 때

				String name = files.nextElement();
				
				System.out.println("name : " + name);

				String rename = mpReq.getFilesystemName(folderPath + name);
				String original = mpReq.getOriginalFileName(name);

				if (original != null) { // 실제로 파일이 담겨있는 경우
					EventImage image = new EventImage();

					image.setImageRename(rename);
					image.setImageLevel(Integer.parseInt(name));

					imageList.add(image);
				}

			}

			// 글 제목, 내용, 회원번호(관리자이지만 혹시 몰라서)
			String title = mpReq.getParameter("K-title");
			String content = mpReq.getParameter("K-content");
			String date = mpReq.getParameter("K-date");

			Member loginMember = (Member) session.getAttribute("loginMember");
			int memberNo = loginMember.getMemberNo();

			Event event = new Event();

			event.setEventTitle(title);
			event.setEventContent(content);
			event.setEventDt(date);

			KAdminService service = new KAdminService();

			String mode = mpReq.getParameter("mode");
			
			System.out.println("등록하기 눌렀을 때 mode : " + mode);

			if (mode.equals("insert")) {

				int eventNo = service.insertEvent(event, imageList);

				String path = null;

				if (eventNo > 0) {
					session.setAttribute("message", "게시글이 등록되었습니다.");
					path = "eventWrite?no=" + eventNo;
					
					// System.out.println("가라 제발!!!");
				} else {
					session.setAttribute("message", "게시글 등록 실패");
					path = "eventWrite?mode=insert";
				}

				resp.sendRedirect(path);

			}

			if (mode.equals("update")) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
