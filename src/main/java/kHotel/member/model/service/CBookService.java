package kHotel.member.model.service;

import static kHotel.common.JDBCTemplate.commit;
import static kHotel.common.JDBCTemplate.rollback;
import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;

import kHotel.member.model.dao.CBookDAO;
import kHotel.member.model.vo.Book;
import kHotel.member.model.vo.HotelRoom;
import kHotel.member.model.vo.Reservation;

public class CBookService {

	private CBookDAO dao = new CBookDAO();


	/** 객실 조회 Service
	 * @param reservation
	 * @return 
	 * @throws Exception
	 */
	public int searchRoom(Reservation reservation) throws Exception {
		
		Connection conn = getConnection();
		
		int roomNo = dao.searchRoom(conn,reservation);
		
		close(conn);
		
		return roomNo;
		
	}


	/** 객실 가격 정보 Service 
	 * @param reservation
	 * @return roomPrice
	 * @throws Exception
	 */
	public int searchRoomPrice(Reservation reservation) throws Exception{
		
		Connection conn = getConnection();
		
		int roomPrice = dao.searchRoomPrice(conn,reservation);
		
		
		
		return roomPrice;
	}
	

	
}
