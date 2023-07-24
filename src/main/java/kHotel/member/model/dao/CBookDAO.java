package kHotel.member.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import kHotel.member.model.vo.Book;
import kHotel.member.model.vo.HotelRoom;
import kHotel.member.model.vo.Reservation;

import static kHotel.common.JDBCTemplate.*;

public class CBookDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	// 기본 생성자
		public CBookDAO() {
			try {
				prop = new Properties();
				
				String filePath =  CBookDAO.class.getResource("/kHotel/sql/CBook-sql.xml").getPath(); 
				
				prop.loadFromXML(new FileInputStream(filePath));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/** 객실 조회 DAO
		 * @param conn
		 * @param reservation
		 * @throws Exception
		 */
		public int searchRoom(Connection conn, Reservation reservation) throws Exception{
			int roomNo = 0;
			
			try {
				String sql = prop.getProperty("");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, reservation.getHotelName() );
				pstmt.setString(2, reservation.getRoomName() );
				
			} finally {
				
			}
			
			
			
			return roomNo;
			
		}

		public int searchRoomPrice(Connection conn, Reservation reservation) throws Exception {
			int roomPrice = 0;
			
			try {
				String sql = prop.getProperty("");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, reservation.getRoomNo() );
				
				rs = pstmt.executeQuery();
				
				if( rs.next() ) {
					roomPrice = rs.getInt(1) ;
				}
				
				
			} finally {
				close(rs);
				close(pstmt);
			}
			return roomPrice;
		}

		public int searchCheckInStatus(Connection conn, Reservation reservation) throws Exception {
			int result = 0;
			
			try {
				String sql = prop.getProperty("");
				
				 pstmt = conn.prepareStatement(sql);
				 
				 pstmt.setString(1, reservation.getCheckInTime() );
				 pstmt.setString(2, reservation.getCheckOutTime() );
				 
				 rs = pstmt.executeQuery();
				 
				 if( rs.next() ) {
					 result = rs.getInt(1);
				 }
				
			} finally {
				close(rs);
				close(pstmt);
			}
			return result;
		}

		

		
		
		
		
		
		
		
		
		
		
		
}

