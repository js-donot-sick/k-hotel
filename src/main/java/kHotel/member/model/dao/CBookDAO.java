package kHotel.member.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


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
				String sql = prop.getProperty("selectRoomNo");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, reservation.getHotelName() );
				pstmt.setString(2, reservation.getRoomName() );
				
				rs = pstmt.executeQuery();
				
				if( rs.next() ) {
					roomNo = ( rs.getInt("ROOM_NO") );
				}
				
				
				
			} finally {
				close(rs);
				close(pstmt);
			}
			
			
			
			return roomNo;
			
		}

		/** 객실 가격 조회 DAO
		 * @param conn
		 * @param reservation
		 * @return roomPrice
		 * @throws Exception
		 */
		public int searchRoomPrice(Connection conn, Reservation reservation) throws Exception {
			int roomPrice = 0;
			
			try {
				String sql = prop.getProperty("selectRoomPrice");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, reservation.getRoomName() );
				
				rs = pstmt.executeQuery();
				
				if( rs.next() ) {
					roomPrice = rs.getInt("ROOM_PRICE") ;
				}
				
				
			} finally {
				close(rs);
				close(pstmt);
			}
			return roomPrice;
		}

		/** 예약 가능한 객실인지 확인 DAO
		 * @param conn
		 * @param reservation
		 * @return result
		 * @throws Exception
		 */
		public int searchCheckInStatus(Connection conn, Reservation reservation) throws Exception {
			int result = 0;
			
			try {
				String sql = prop.getProperty("reservationCheck");
				
				 pstmt = conn.prepareStatement(sql);
				 
				 pstmt.setString(1, reservation.getCheckInTime() );
				 pstmt.setString(2, reservation.getCheckOutTime() );
				 pstmt.setInt(3, reservation.getRoomNo() );
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

		/** 관리자 예약 리스트 보여주는 DAO
		 * @param conn
		 * @return rsvList
		 * @throws Exception
		 */
		public List<Reservation> selectRsvList(Connection conn) throws Exception{
			
			List<Reservation> rsvList = new ArrayList<Reservation>();
			
			try {
				String sql = prop.getProperty("selectrsvList");
				
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(sql);
				
				while( rs.next() ) {
					Reservation rsv = new Reservation();
					
					rsv.setBookNo( rs.getInt(1) );
					rsv.setCheckInTime( rs.getString(2) );
					rsv.setCheckOutTime(rs.getString(3) );
					rsv.setRoomName( rs.getString(4) );
					rsv.setMemberName( rs.getString(5) );
					rsv.setHotelName( rs.getString(6));
					
					
					rsvList.add(rsv);
				}
				
			} finally {
				close(rs);
				close(stmt);
			}
			
			
			return rsvList;
		}

		/** 관리자 이전 예약 리스트 보여주는 DAO
		 * @param conn
		 * @return rsvList
		 * @throws Exception
		 */
		public List<Reservation> selectRsvList2(Connection conn) throws Exception {
			
			List<Reservation> rsvList2 = new ArrayList<Reservation>();

			try {
				String sql = prop.getProperty("selectrsvList2");

				stmt = conn.createStatement();

				rs = stmt.executeQuery(sql);

				while (rs.next()) {
					
					Reservation rsv2 = new Reservation();

					rsv2.setBookNo(rs.getInt(1));
					rsv2.setCheckInTime(rs.getString(2));
					rsv2.setCheckOutTime(rs.getString(3));
					rsv2.setRoomName(rs.getString(4));
					rsv2.setMemberName(rs.getString(5));
					rsv2.setHotelName(rs.getString(6));

					rsvList2.add(rsv2);
				}

			} finally {
				close(rs);
				close(stmt);
			}

			return rsvList2;
		}

		/** 예약 취소 DAO
		 * @param bookNo
		 * @return result
		 * @throws Exception
		 */
		
		public int deleteReservation(Connection conn, int bookNo) throws Exception{
			int result = 0;
			
			try {
				String sql = prop.getProperty("deleteReservation");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, bookNo); 
				
				result = pstmt.executeUpdate();
				
			} finally {
				close(pstmt);
			}
			
			return result;
		}
		

		
		
		
		
		
		
		
		
		
		
		
}

