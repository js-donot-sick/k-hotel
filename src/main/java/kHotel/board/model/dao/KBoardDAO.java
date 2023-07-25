package kHotel.board.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static kHotel.common.JDBCTemplate.*;

import kHotel.board.model.vo.Board;
import kHotel.member.model.dao.MemberDAO;
import kHotel.member.model.vo.LPagination;

public class KBoardDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	// 기본 생성자
	public KBoardDAO() {
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/KBoard-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 특정 게시판 이름 조회 DAO
	 * @param conn
	 * @param type
	 * @return boardName
	 * @throws Exception
	 */
	public String getBoardName(Connection conn, int type) throws Exception {
		
		String boardName = null;
		
		try {
			
			String sql = prop.getProperty("getBoardName");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, type);
			
			rs= pstmt.executeQuery();
			
			if(rs.next()) {
				boardName = rs.getString(1);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return boardName;
	}


	/** 특정 게시판 글 수 조회 DAO
	 * @param conn
	 * @param type
	 * @return listCount
	 * @throws Exception
	 */
	public int getListCount(Connection conn, int type) throws Exception {
		
		int listCount = 0;
		
		try {
			
			String sql = prop.getProperty("getListCount");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, type);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				listCount = rs.getInt(1);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return listCount;
	}

	/** 특정 게시판 글 목록 조회 DAO
	 * @param conn
	 * @param pagination
	 * @param type
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> selectBoardList(Connection conn, LPagination pagination, int type) throws Exception{
		
		List<Board> boardList = new ArrayList<Board>();
		
		try {
			
			String sql = prop.getProperty("selectBoardList");
			
			// sql between에 넣을 숫자
			int start = (pagination.getCurrentPage()-1) * pagination.getLimit() +1;
			
			int end = start + pagination.getLimit() -1;
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, type);
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setMemberName(rs.getString("MEMBER_NM"));
				board.setBoardDate(rs.getString("BOARD_DT"));
				
				boardList.add(board);
			}
			
		} finally {
			
			close(rs);
			close(pstmt);
			
		}
		
		return boardList;
	}

	/** qna 검색 DAO(검색된 글 수 조회)
	 * @param select
	 * @param content
	 * @param conn
	 * @param type
	 * @return listCount
	 * @throws Exception
	 */
	public int getListCount(String select, String content, Connection conn, int type) throws Exception {
		
		int listCount = 0;
		
		try {
			
			// String sql = prop.getProperty("qnaListCount");
			String sql = "SELECT COUNT(*) FROM BOARD "+ "WHERE "+ select +  " LIKE '%" + content + "%'";
			
			//pstmt = conn.prepareStatement(sql);
			
			//pstmt.setString(1, select);
			//pstmt.setString(2, content);
			
			//rs = pstmt.executeQuery();
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				listCount = rs.getInt(1);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return listCount;
	}

	/** qna 검색 조회(검색 조건에 맞는 글 목록 조회)DAO
	 * @param select
	 * @param content
	 * @param conn
	 * @param pagination
	 * @param type
	 * @return searchBoardList
	 * @throws Exception
	 */
	public List<Board> selectBoardList(String select, String content, Connection conn, LPagination pagination,
			int type) throws Exception {
		
		List<Board> searchBoardList = new ArrayList<Board>();
		
		try {
			
			//String sql = prop.getProperty("searchBoardList");
			
			// sql between에 넣을 숫자
			int start = (pagination.getCurrentPage()-1) * pagination.getLimit() +1;
			
			int end = start + pagination.getLimit() -1;
			
			// na ul go si peo . . . . . . . . . . 
			String sql = "SELECT * FROM("
					+ "		    SELECT ROWNUM RNUM, A.* FROM( "
					+ "		        SELECT BOARD_NO, BOARD_TITLE, MEMBER_NM, "
					+ "		                TO_CHAR(BOARD_DT,'YYYY-MM-DD') AS BOARD_DT "
					+ "		        FROM BOARD "
					+ "		        JOIN MEMBER USING (MEMBER_NO) "
					+ "		        WHERE BOARD_CD = " + type
					+ "		        AND BOARD_ST = 'N' "
					+ "                AND " + select + " LIKE '%" + content + "%' "
					+ "		        ORDER BY BOARD_NO DESC "
					+ "		    ) A "
					+ "		) "
					+ "		WHERE RNUM BETWEEN " +  start +  " AND  " +  end;
			
			
			/*
			 * pstmt = conn.prepareStatement(sql);
			 * 
			 * pstmt.setInt(1, type); pstmt.setString(2, select); pstmt.setString(3,
			 * content); pstmt.setInt(4, start); pstmt.setInt(5, end);
			 * 
			 * rs = pstmt.executeQuery();
			 */
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setMemberName(rs.getString("MEMBER_NM"));
				board.setBoardDate(rs.getString("BOARD_DT"));
				
				searchBoardList.add(board);
			}
			
		} finally {
			
			close(rs);
			close(pstmt);
			
		}
		
		return searchBoardList;
		
	}

	
}
