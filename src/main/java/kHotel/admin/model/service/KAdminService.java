package kHotel.admin.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import kHotel.admin.model.dao.KAdminDAO;
import kHotel.board.model.vo.Board;
import kHotel.board.model.vo.Event;
import kHotel.board.model.vo.EventImage;
import kHotel.common.Util;

public class KAdminService {
	
	KAdminDAO dao = new KAdminDAO();

	/** faq 목록 조회(관리자)service
	 * @param type
	 * @return fList
	 * @throws Exception
	 */
	public List<Board> fList(int type) throws Exception {
		
		Connection conn = getConnection();
		
		List<Board> fList = dao.fList(conn, type);
		
		close(conn);
		
		return fList;
	}

	/** 이벤트 작성 service
	 * @param event
	 * @param imageList
	 * @return eventNo
	 * @throws Exception
	 */
	public int insertEvent(Event event, List<EventImage> imageList) throws Exception {
		
		Connection conn= getConnection();
		
		// 1. 게시글 번호 얻어오기
		int eventNo = dao.setEventNo(conn);
		
		event.setEventNo(eventNo);
		
		// 2. XSS
		event.setEventTitle(Util.XSSHanding(event.getEventTitle()));
		event.setEventContent(Util.XSSHanding(event.getEventContent()));
		
		event.setEventContent(Util.newLineHandling(event.getEventContent()));
		
		
		
		// 3. 게시글 삽입
		int result = dao.insertEvent(conn, event);
		
		if(result > 0) {
			// 4. 이미지 삽입
			for(EventImage image : imageList) {
				image.setEventNo(eventNo);
				
				result = dao.insertEventImage(conn, image);
				
				if(result == 0) break;
			}
			
			if(result >0) commit(conn);
			else		  rollback(conn);
			
			close(conn);
			
		}
		
		return eventNo;
	}

}
