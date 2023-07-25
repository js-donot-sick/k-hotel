package kHotel.board.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
	 * @return
	 */
	public List<Board> selectBoardList(Connection conn, LPagination pagination, int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
