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

import kHotel.admin.model.vo.PAdminMemebr;
import kHotel.member.model.vo.LPagination;

public class PAdminDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Properties prop;

	public PAdminDAO() {

		try {

			prop = new Properties();

			String filePath = LAdminDAO.class.getResource("/kHotel/sql/PHotel-sql.xml").getPath();

			prop.loadFromXML(new FileInputStream(filePath));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 관리자 회원 목록 수 DAO
	 * 
	 * @param conn
	 * @return listCount
	 * @throws Exception
	 */
	public int getListCount(Connection conn) throws Exception {

		int listCount = 0;

		try {

			String sql = prop.getProperty("listCountMember");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				listCount = rs.getInt(1);
			}
			
			System.out.println(listCount);

		} finally {
			close(rs);
			close(stmt);
		}

		return listCount;
	}

	/** 신고 당한 회원 수 조회 
	 * @param conn
	 * @param memberNo 
	 * @return listReportCount
	 * @throws Exception
	 */
	public int getListReportCount(Connection conn, int memberNo) throws Exception{

		int listReportCount = 0;
		
		try {
			
			String sql = prop.getProperty("listReportCount");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memberNo);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				
				listReportCount = rs.getInt(1);
				
			}
			
			System.out.println(listReportCount);
			
		} finally {
			close(pstmt);
			close(rs);
		}
		
		return listReportCount;
	}

	/** 관리자 회원 목록 조회
	 * @param conn
	 * @param lPagination
	 * @param type
	 * @return boardList
	 * @throws Exception
	 */
	public List<PAdminMemebr> selectBoardList(Connection conn, LPagination lPagination, int type) throws Exception{
	
		List<PAdminMemebr> boardList = new ArrayList<PAdminMemebr>();
		
		try {
			String sql = prop.getProperty("selectBoardList");
			
			int start = (lPagination.getCurrentPage() - 1) * lPagination.getLimit() + 1;
			
			int end = start + lPagination.getLimit() - 1;
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				PAdminMemebr am = new PAdminMemebr();
				am.setMemberNo(rs.getInt(1));
				am.setMemberId(rs.getString(2));
				am.setMemberPw(rs.getString(3));
				am.setMemberNm(rs.getString(4));
				am.setMemberPno(rs.getString(5));
				am.setMemebrTel(rs.getString(6));
				am.setMemberEmail(rs.getString(7));
				am.setMemberAdd(rs.getString(8));
				am.setSecessionFl(rs.getString(9));
				am.setReportCount(rs.getInt(10));
				
				boardList.add(am);
				
				System.out.println(boardList);
				
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return boardList;
	}

}
