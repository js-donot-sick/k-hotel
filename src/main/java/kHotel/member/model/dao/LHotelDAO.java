package kHotel.member.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import kHotel.member.model.vo.LikeList;

public class LHotelDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	// 기본 생성자
	public LHotelDAO() {
		try {
			prop = new Properties();
			
			String filePath =   LMemberDAO.class.getResource("/kHotel/sql/LHotel-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/** 찜하기 객실 번호 조회 DAO
	 * @param conn 
	 * @param lk
	 * @return roomNo
	 * @throws Exception
	 */
	public int searchRoomNo(Connection conn, LikeList lk) throws Exception{
		
		int roomNo = 0;
		
		try {
			
			String sql = prop.getProperty("searchRoomNo");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, lk.getHotelNm1());
			pstmt.setString(2, lk.getRoomNm1());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				roomNo = rs.getInt("ROOM_NO");
			}
			
			
		}finally {

			close(rs);
			close(pstmt);
			
		}
		
		return roomNo;
	}


	/** 찜목록 추가 DAO
	 * @param conn
	 * @param lk
	 * @param roomNo
	 * @return result
	 * @throws Exception
	 */
	public int insertLikeList(Connection conn, LikeList lk, int roomNo) throws Exception{
		
		int result = 0;
		
		try {
			
			String sql = prop.getProperty("insertLikeList");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, roomNo);
			pstmt.setInt(2, lk.getMemberNo());
			
			result = pstmt.executeUpdate();
			
			
			
			
		}finally {
			close(pstmt);
			
		}
		
		
		return result;
	}


	/** 찜삭제 1번 객실 DAO
	 * @param conn
	 * @param lk
	 * @param roomNo
	 * @return result
	 * @throws Exception
	 */
	public int deleteLikeList(Connection conn, LikeList lk, int roomNo) throws Exception{
		
		int result = 0;
		
		try {
			
			String sql = prop.getProperty("deleteLikeList");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, roomNo);
			pstmt.setInt(2, lk.getMemberNo());
			
			result = pstmt.executeUpdate();
			
		}finally {
			
			close(pstmt);
		}
		
		return result;
	}

}
