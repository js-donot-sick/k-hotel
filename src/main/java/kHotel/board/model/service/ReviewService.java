package kHotel.board.model.service;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import kHotel.board.model.dao.ReviewDAO;
import kHotel.board.model.vo.Board;

import static kHotel.common.JDBCTemplate.*;
		

public class ReviewService {
	
	ReviewDAO dao = new ReviewDAO(); 


	/**
	 * @return map
	 * @throws Exception
	 */
	public List<Board> boardReview() throws Exception {
		
		Connection conn = getConnection();
		
		// 리뷰 내용 
		List<Board> boardList = dao.boardCount(conn);
		
		close(conn);
	
		
		return boardList;
	}

}
