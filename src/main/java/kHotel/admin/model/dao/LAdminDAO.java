package kHotel.admin.model.dao;

import static kHotel.common.JDBCTemplate.*;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kHotel.admin.model.dao.LAdminDAO;
import kHotel.admin.model.vo.LAdminPagination;
import kHotel.admin.model.vo.LAdminReport;

public class LAdminDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	public LAdminDAO() {
		
		try {
			
			prop = new Properties();
			
			String filePath = LAdminDAO.class.getResource("/kHotel/sql/LAdmin-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/** 게시판 이름 조회 DAO
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

	/** 신고 게시판 게시글 수 조회 DAO
	 * @param conn
	 * @return listCount
	 * @throws Exception
	 */
	public int getListCount(Connection conn) throws Exception {
		
		int listCount = 0;
		
		try {
			String sql = prop.getProperty("getListCount");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				listCount = rs.getInt(1);
			}
			
			
		}finally {
			close(rs);
			close(stmt);
			
		}
		
		
		return listCount;
	}

	/** 게시글 목록 조회 DAO
	 * @param conn
	 * @param lAdminPagination
	 * @param type
	 * @return boardList
	 * @throws Exception
	 */
	public List<LAdminReport> selectBoardList(Connection conn, LAdminPagination lAdminPagination, int type) throws Exception{
		
		List<LAdminReport> boardList = new ArrayList<LAdminReport>();
		
		try {
			
			String sql = prop.getProperty("selectBoardList");
			
			int start = (lAdminPagination.getCurrentPage() - 1) * lAdminPagination.getLimit() + 1;
			
			int end = start + lAdminPagination.getLimit() - 1;
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				LAdminReport ar = new LAdminReport();
				
				ar.setBoardNo( rs.getInt("BOARD_NO"));
				ar.setReportContent(rs.getString("REPORT_CONTENT"));
				ar.setReportPerson(rs.getString("MEMBER_ID"));
				ar.setReportDt(rs.getString("BOARD_DT"));
				
				
				boardList.add(ar);
				
			}
			
			
		}finally {
			
			close(rs);
			close(pstmt);
			
		}
		
		
		
		return boardList;
	}

	

}
