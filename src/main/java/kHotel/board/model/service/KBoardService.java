package kHotel.board.model.service;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kHotel.board.model.dao.KBoardDAO;
import kHotel.board.model.vo.Board;
import kHotel.member.model.dao.KMemberDAO;
import kHotel.member.model.vo.LPagination;
import kHotel.member.model.vo.Member;

import static kHotel.common.JDBCTemplate.*;

public class KBoardService {
	
	KBoardDAO dao = new KBoardDAO();

	/** qna 리스트 service
	 * @param type
	 * @param cp
	 * @return map
	 * @throws Exception
	 */
	public Map<String, Object> qna(int type, int cp) throws Exception {
		
		Connection conn = getConnection();
		
		// 1. 게시판 이름 조회(관리자 헤더 때문)
		
		// 2-1. 특정 게시판 전체 게시글 수 조회 DAO 호출
		int listCount = dao.getListCount(conn, type);
		
		// 2-2. 전체 게시글 수 + 현재 페이지(cp)를 이용해 페이지네이션 객체 생성
		LPagination pagination = new LPagination(cp, listCount);
		
		// 3. 게시글 목록 조회
		List<Board> boardList = dao.selectBoardList(conn, pagination, type);
		
		// 4. Map 객체를 생성하여 1,2,3 결과 객체를 모두 저장
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		return map;
	}

}
