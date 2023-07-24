package kHotel.member.model.service;

import static kHotel.common.JDBCTemplate.commit;
import static kHotel.common.JDBCTemplate.rollback;
import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;

import kHotel.member.model.dao.CBookDAO;
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
		
		close(conn);
		
		return roomPrice;
	}


	/** 예약 가능한 객실인지 확인하는 Service
	 * @param reservation
	 * @return result
	 * @throws Exception
	 */
	public int searchCheckInStatus(Reservation reservation) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.searchCheckInStatus(conn, reservation);
		
		close(conn);
		
		return result;
	}
	

	
}
