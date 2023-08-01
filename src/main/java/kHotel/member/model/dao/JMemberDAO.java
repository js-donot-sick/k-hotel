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
import kHotel.member.model.vo.Review;
import kHotel.member.model.vo.ReviewImg;

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


	/** 리뷰 등록 DAO
	 * @param conn
	 * @param reviewImg
	 * @param rv
	 * @return reuslt
	 * @throws Exception
	 */
	public int reviewUpdate(Connection conn, Review rv) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("reviewUpdate");
			
			pstmt = conn.prepareStatement(sql);
			
			
			 pstmt.setString(1, rv.getContent()); 
			pstmt.setInt(2, rv.getMemberNo());
			 pstmt.setInt(3, rv.getStar()); 
			
			
			result = pstmt.executeUpdate();
		}finally {

			close(pstmt);
			
		}
		return result;
	}

	/** 현재 예약 내역
	 * @param conn
	 * @param memberNo
	 * @return rv
	 * @throws Exception
	 */
	public List<Reservation> reservationUp(Connection conn, int memberNo) throws Exception {
List<Reservation> rvList = new ArrayList<Reservation>();
		
		try {
			
			String sql = prop.getProperty("reservationUp");
			
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


	/** 다음 게시글 번호 얻어오는 DAO
	 * @param conn
	 * @param rv 
	 * @return boardNO
	 * @throws Exception
	 */
	public int nextBoardNo(Connection conn, Review rv) throws Exception {
		int boardNo = 0;
		
		try {
			String sql = prop.getProperty("nextBoardNo");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, rv.getContent());
			
			rs = pstmt.executeQuery();
			
			if(rs.next() ) {
				
				boardNo = rs.getInt(1);
				
			}
			
			
			
		}finally {
			close(pstmt);
			
		}
		return boardNo;
	}


	/** 이미지 등록 DAO
	 * @param conn 
	 * @param image
	 * @param rv
	 * @return result
	 * @throws Exception
	 */
	public int reviewImg(Connection conn, ReviewImg image, Review rv) throws Exception {
		int result = 0;
		
		try {
			String sql = prop.getProperty("reviewImg");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, image.getRename());
			pstmt.setInt(2, rv.getBoardNo());
			
			result = pstmt.executeUpdate();
			
			
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}

 
	

	public int tagUpdate1(Connection conn, Review rv, String tag1) throws Exception {

		int result = 0;
		
		try {
			String sql = prop.getProperty("tagUpdate1");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, rv.getBoardNo());
			pstmt.setString(2, tag1);
			
			result = pstmt.executeUpdate();
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}
	
	public int tagUpdate2(Connection conn, Review rv, String tag2) throws Exception {

		int result = 0;
		
		try {
			String sql = prop.getProperty("tagUpdate2");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, rv.getBoardNo());
			pstmt.setString(2, tag2);
			
			result = pstmt.executeUpdate();
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}
	
	public int tagUpdate3(Connection conn, Review rv, String tag3) throws Exception {

		int result = 0;
		
		try {
			String sql = prop.getProperty("tagUpdate3");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, rv.getBoardNo());
			pstmt.setString(2, tag3);
			
			result = pstmt.executeUpdate();
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}
	
	public int tagUpdate4(Connection conn, Review rv, String tag4) throws Exception {

		int result = 0;
		
		try {
			String sql = prop.getProperty("tagUpdate4");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, rv.getBoardNo());
			pstmt.setString(2, tag4);
			
			result = pstmt.executeUpdate();
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}
	
	public int tagUpdate5(Connection conn, Review rv, String tag5) throws Exception {

		int result = 0;
		
		try {
			String sql = prop.getProperty("tagUpdate5");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, rv.getBoardNo());
			pstmt.setString(2, tag5);
			
			result = pstmt.executeUpdate();
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}
	
	public int tagUpdate6(Connection conn, Review rv, String tag6) throws Exception {

		int result = 0;
		
		try {
			String sql = prop.getProperty("tagUpdate6");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, rv.getBoardNo());
			pstmt.setString(2, tag6);
			
			result = pstmt.executeUpdate();
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}




}
