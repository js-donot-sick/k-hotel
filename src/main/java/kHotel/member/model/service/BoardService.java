package kHotel.member.model.service;

import java.sql.Connection;
import java.util.List;
import static kHotel.common.JDBCTemplate.*; 

import kHotel.member.model.dao.BoardDAO;
import kHotel.member.model.vo.Board;

public class BoardService {
	
	private BoardDAO dao = new BoardDAO();


	/** 내가 조회한 글 작성 
	 * @param memberNo
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> searchBoardList(int memberNo) throws Exception{
		
		Connection conn = getConnection();
		
		List<Board> boardList = dao.searchBoardList(conn,memberNo);
		
		close(conn);
 		
		System.out.println(boardList);
		
		return boardList;
		
	}



	
}
