package kHotel.member.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kHotel.member.model.vo.Member;
import kHotel.member.model.vo.Reservation;

public class JMemberDAO {
	
	public JMemberDAO() {
		
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/JHotel-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Properties prop = new Properties();


	/** 회원가입 DAO
	 * @param conn
	 * @param member
	 * @return result
	 * @throws Exception
	 */
	public int signUp(Connection conn, Member member) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("signUp11");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberPno());
			pstmt.setString(5, member.getMemberTel());
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberAddress());
			
			result = pstmt.executeUpdate();
			
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}


	/** 리뷰 이미지 등록 DAO
	 * @param conn
	 * @param reviewImg
	 * @param memberNo
	 * @return reuslt
	 * @throws Exception
	 */
	public int reviewUpdate(Connection conn, String reviewImg, int memberNo) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("");
			
		}finally {
			
			
		}
		return result;
	}


	/** 이전 예약 DAO
	 * @param conn
	 * @param memberNo
	 * @return rv
	 * @throws Exception
	 */
	public List<Reservation> reservation(Connection conn, int memberNo) throws Exception {
		
		List<Reservation> rvList = new ArrayList<Reservation>();
		
		try {
			
			String sql = prop.getProperty("reservation");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			
			rs = pstmt.executeQuery();
			
			while(rs.next() ) {
				
				Reservation rv = new Reservation();
				
				rv.setBookNo( rs.getInt(1));
				rv.setHotelName( rs.getString(2) );
				rv.setRoomName( rs.getString(3));
				rv.setCheckInTime(rs.getString(4));
				rv.setCheckOutTime( rs.getString(5));
				
				rvList.add(rv);
			}
			
			
			
		}finally {
			
			close(rs);
			close(pstmt);
			
		}
		
		
		return rvList;
	}


}
