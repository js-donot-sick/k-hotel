package kHotel.member.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import kHotel.member.model.vo.Book;
import kHotel.member.model.vo.HotelRoom;

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

		/** 예약 진행 DAO
		 * @param conn
		 * @param book
		 * @return result
		 * @throws Exception
		 */
		public int reservation(Connection conn, Book book) throws Exception {
			
			int result = 0;
			
			try {
				
				String sql = prop.getProperty("reservationFinal");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, book.getBookHotel());
				pstmt.setString(2, book.getBookRoom());
				pstmt.setString(3, book.getCheckInTime());
				pstmt.setString(4, book.getCheckOutTime());
				pstmt.setInt(5, book.getAdult());
				pstmt.setInt(6, book.getChild());
				
				result = pstmt.executeUpdate();
				
			} finally {
				close(pstmt);
			}
			
			return result;
		}

		public HotelRoom selectRoom(Connection conn, Book book) throws Exception {
			
			HotelRoom room = new HotelRoom();
			
			try {
				
				String sql = prop.getProperty("selectRoom");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, book.getBookHotel());
				pstmt.setString(2, book.getBookRoom());
				
				System.out.println(book.getBookHotel());
				System.out.println(book.getBookRoom());
				
				rs = pstmt.executeQuery();
							
				if( rs.next() ) {
						
					room.setRoomNo(rs.getInt("ROOM_NO"));
					room.setHotelName(rs.getString("ROOM_HOTEL"));
					room.setRoomName(rs.getString("ROOM_NM"));
					room.setRoomInfo(rs.getString("ROOM_INFO"));
					room.setRoomPrice(rs.getInt("ROOM_PRICE"));
					
				}
				
				System.out.println(room);
				
			} finally {
				close(rs);
				close(pstmt);
			}

			return room;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

