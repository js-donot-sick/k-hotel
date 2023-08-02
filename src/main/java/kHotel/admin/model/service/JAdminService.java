package kHotel.admin.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;

import kHotel.admin.model.dao.JAdminDAO;
import kHotel.admin.model.vo.HAdminBoard;
import kHotel.admin.model.vo.PAdminMemebr;
import kHotel.member.model.vo.Member;

public class JAdminService {

	JAdminDAO dao = new JAdminDAO();
	
	/** FAQ 작성
	 * @param loginMember
	 * @param board
	 * @return result
	 * @throws Exception
	 */
	public int FAQUpdate(Member loginMember, HAdminBoard board) throws Exception {
		
		Connection conn = getConnection();
		
		// memberNo 가져오기
		int memberNo = dao.getMemberNo(conn ,loginMember);
		
		// FAQ 작성
		int result = dao.FAQUpdate(conn, memberNo, board);
		
		if(result > 0) commit(conn);
		else		   rollback(conn);
		
		
		return result;
	}

}
