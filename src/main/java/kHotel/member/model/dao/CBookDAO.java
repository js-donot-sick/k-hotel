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

		public HotelRoom searchRoom(Connection conn, String room, String hotel) throws Exception{
			HotelRoom hotelRoom = new HotelRoom();
			
			try {
				String sql = prop.getProperty("selectRoom");
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, hotel);
				pstmt.setString(2,room);
				
				rs = pstmt.executeQuery();
				
				if( rs.next() ) {
					hotelRoom.setRoomNo(rs.getInt(1));
					hotelRoom.setHotelName(rs.getString(2));
					hotelRoom.setRoomName(rs.getString(3));
				}
				
			} finally {
				close(rs);
				close(pstmt);
				
			}
			

			return hotelRoom;
		}

		
		
		
		
		
		
		
		
		
		
		
}

