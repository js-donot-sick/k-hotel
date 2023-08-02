package kHotel.board.model.service;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kHotel.board.model.dao.ReviewDAO;
import kHotel.board.model.vo.Board;
import kHotel.member.model.vo.PPagination;

import static kHotel.common.JDBCTemplate.*;
		

public class ReviewService {
	
	ReviewDAO dao = new ReviewDAO(); 


	/** 리뷰 내용 전체 조회 
	 * @param cp 
	 * @return map
	 * @throws Exception
	 */
	public Map<String, Object> boardReview(int cp) throws Exception {
		
		Connection conn = getConnection();
		
		// 리뷰 내용 
		int listCount = dao.selectReview(conn);
		
		// 페이지네이션
		PPagination pagination = new PPagination(cp,listCount);
		
		//리뷰 내용 전체 조회 
		List<Board> boardList = dao.boardCount(conn,pagination);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("pagination", pagination);
		map.put("boardList", boardList);
		
		close(conn);
	
		
		return map;
	}

}
