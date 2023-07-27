package kHotel.admin.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import kHotel.admin.model.dao.KAdminDAO;
import kHotel.board.model.vo.Board;

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

}
