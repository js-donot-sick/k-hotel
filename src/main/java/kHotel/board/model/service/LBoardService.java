package kHotel.board.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;

import kHotel.board.model.dao.LBoardDAO;
import kHotel.board.model.vo.Board;

public class LBoardService {
	
	LBoardDAO dao = new LBoardDAO();


	/** 게시글 상세페이지 Service
	 * @param boardNo
	 * @return board
	 * @throws Exception
	 */
	public Board selectBoardDetail(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		
		Board board = dao.selectBoardDetail(conn, boardNo);
		
		close(conn);
		
		return board;
	}

}
