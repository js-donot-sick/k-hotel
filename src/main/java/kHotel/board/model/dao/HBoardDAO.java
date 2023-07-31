package kHotel.board.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kHotel.board.model.vo.Board;
import kHotel.member.model.dao.MemberDAO;

import static kHotel.common.JDBCTemplate.*;

public class HBoardDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public HBoardDAO() {
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/KBoard-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/** 게시글 이름 조회
	 * @param conn
	 * @param type
	 * @return boardName
	 * @throws Exception
	 */
	public String selectBoardName(Connection conn, int type) throws Exception{
		
		String boardName = null;
		
		try {
			
			String sql = prop.getProperty("selectBoardName");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, type);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				boardName = rs.getString(1);
			}
			
		}finally {
			close(rs);
			close(pstmt);
			
		}
		
		return boardName;
	}


	/** 게시글 수 조회
	 * @param conn
	 * @param type
	 * @return ListCount
	 * @throws Exception
	 */
	public int getListCount(Connection conn, int type) throws Exception{
		
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


	/** 글 목록 조회
	 * @param conn
	 * @param pagination
	 * @param type
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> selectBoardList(Connection conn, Pagination pagination, int type) throws Exception{
		
		List<Board> boardList = new ArrayList<Board>();
		
		try {
			
			String sql = prop.getProperty("selectBoardList");
			
			int start = (pagination.getCurrentPage()-1) * pagination.getLimit() +1;
			
			int end = start + pagination.getLimit() -1;
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, type);
			pstmt.setInt(2, start);
			
		}finally {
			
		}
		
		return null;
	}

}
