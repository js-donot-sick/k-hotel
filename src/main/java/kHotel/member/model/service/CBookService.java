package kHotel.member.model.service;

import static kHotel.common.JDBCTemplate.commit;
import static kHotel.common.JDBCTemplate.rollback;
import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;

import kHotel.member.model.dao.CBookDAO;
import kHotel.member.model.vo.Book;

public class CBookService {

	private CBookDAO dao = new CBookDAO();
	
	/** 예약 진행 Service
	 * @param book
	 * @return result
	 * @throws Exception
	 */
	public int reservationFinal(Book book) throws Exception {
			
		Connection conn = getConnection();
		
		int result = dao.reservation(conn,book);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	
}
