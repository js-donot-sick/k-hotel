package kHotel.admin.model.service;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kHotel.admin.model.dao.PAdminDAO;
import kHotel.admin.model.vo.LAdminReport;
import kHotel.admin.model.vo.PAdminMemebr;
import kHotel.member.model.vo.LPagination;

import static kHotel.common.JDBCTemplate.*;

public class PAdminService {
	
	private PAdminDAO dao = new PAdminDAO();


	/** 어드민 멤버조회
	 * @param type
	 * @param cp
	 * @return map
	 * @throws Exception
	 */
	public Map<String, Object> searchAdminMember(int type, int cp) throws Exception{
		
		Connection conn = getConnection();
		
		//  관리자 전체 게시글 수 조회 
		int listCount = dao.getListCount(conn);

		// 관리자 신고된 횟수 조회 
		int listReportCount = dao.getListReportCount(conn,listCount);
		
		//전체 게시글 수 + 현재 페이지를 이용해 페이지네이션 객체 생성 
		LPagination LPagination = new LPagination(cp, listCount);
		
		// 게시글 목록 조회
		List<PAdminMemebr> boardList = dao.selectBoardList(conn, LPagination, type);
		
		
		// map객체에 담아주기
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("listCount", listCount);
		map.put("listReportCount", listReportCount);
		map.put("LPagination", LPagination);
		map.put("boardList", boardList);
		
		return map;
	}

}