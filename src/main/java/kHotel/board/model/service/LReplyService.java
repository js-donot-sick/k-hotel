package kHotel.board.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import kHotel.board.model.dao.LBoardDAO;
import kHotel.board.model.dao.LReplyDAO;
import kHotel.board.model.vo.Reply;

public class LReplyService {

	LReplyDAO dao = new LReplyDAO();
	
	/** 댓글 목록 조회 Service
	 * @param boardNo
	 * @return rList
	 * @throws Exception
	 */
	public List<Reply> selectReplyList(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		
		List<Reply> rList = dao.selectReplyList(conn, boardNo);
		
		close(conn);
		
		
		
		return rList;
	}

}
