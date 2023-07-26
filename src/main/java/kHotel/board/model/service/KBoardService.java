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
		String boardName = dao.getBoardName(conn, type);
		
		// 2-1. 특정 게시판 전체 게시글 수 조회 DAO 호출
		int listCount = dao.getListCount(conn, type);
		
		// 2-2. 전체 게시글 수 + 현재 페이지(cp)를 이용해 페이지네이션 객체 생성
		LPagination pagination = new LPagination(cp, listCount);
		
		// 3. 게시글 목록 조회
		List<Board> boardList = dao.selectBoardList(conn, pagination, type);
		
		// 4. Map 객체를 생성하여 1,2,3 결과 객체를 모두 저장
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("boardName", boardName);
		map.put("pagination", pagination);
		map.put("boardList", boardList);
		
		close(conn);
		
		return map;
	}

	/** qna 검색 service
	 * @param select
	 * @param content
	 * @param type
	 * @param cp
	 * @return searchMap
	 * @throws Exception
	 */
	public Map<String, Object> qnaSearch(String select, String content, int type, int cp) throws Exception {
		
		Connection conn = getConnection();
		
		int listCount = 0;
		
		// 1. 검색 조건에 맞는 전체 글 수 조회
		if(select.equals("1")) {
			listCount = dao.AgetgetListCount(content, conn, type);
		} else {
			listCount = dao.getListCount(select, content, conn, type);
		}
		
		System.out.println("글 수 제발 제발 : " + listCount);
		
		// 2. 전체 글 수 + 페이지네이션...?
		LPagination pagination = new LPagination(cp, listCount); // 오류나면 여기부터 확인해바..
		
		// 3. 게시글 목록 조회
		List<Board> boardList = null;
		if(select.equals("1")) {
			boardList = dao.selectBoardList(content, conn, pagination, type);
		} else {
			boardList = dao.selectBoardList(select, content, conn, pagination, type);
		}
		
		// 4. map에 모든 결과 저장
		Map<String, Object> searchMap = new HashMap<String, Object>();
		
		searchMap.put("pagination", pagination);
		searchMap.put("boardList", boardList);
		
		close(conn);
		
		
		return searchMap;
	}

}