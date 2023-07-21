package kHotel.member.model.service;

import static kHotel.common.JDBCTemplate.commit;
import static kHotel.common.JDBCTemplate.rollback;
import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;

import kHotel.member.model.dao.CBookDAO;
import kHotel.member.model.vo.Book;
import kHotel.member.model.vo.HotelRoom;

public class CBookService {

	private CBookDAO dao = new CBookDAO();

	/** 객실 조회 Service
	 * @param room
	 * @param hotel
	 * @return hotelRoom
	 * @throws Exception
	 */
	public HotelRoom searchRoom(String room, String hotel) throws Exception{
		
		Connection conn = getConnection();
		
		HotelRoom hotelRoom = dao.searchRoom(conn,room,hotel);
		
		close(conn);
		
		return hotelRoom;
	}
	

	
}
