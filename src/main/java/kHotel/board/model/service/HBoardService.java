package kHotel.board.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import kHotel.board.model.dao.HBoardDAO;
import kHotel.board.model.vo.Board;

public class HBoardService {
	
	private HBoardDAO dao = new HBoardDAO();

	/** 게시글 이름 조회
	 * @param type
	 * @param cp
	 * @return map
	 * @throws Exception
	 */
	public Map<String, Object> selectBoardList(int type, int cp) throws Exception{
		
		Connection conn = getConnection();
		
		String boardName = dao.selectBoardName(conn, type);
		
		int listCount = dao.getListCount(conn, type);
		
		Pagination pagination = new Pagination(cp, listCount);
		
		List<Board>boardList = dao.selectBoardList(conn, pagination, type);
		
		
		return null;
	}

}