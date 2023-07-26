package kHotel.member.model.service;

import static kHotel.common.JDBCTemplate.commit;
import static kHotel.common.JDBCTemplate.rollback;
import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import kHotel.member.model.dao.CBookDAO;
import kHotel.member.model.vo.Reservation;

public class CBookService {

	private CBookDAO dao = new CBookDAO();


	/** 객실 조회 Service
	 * @param reservation
	 * @return roomNo
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


	/** 관리자 예약 리스트 보여주는 Service
	 * @return rsvList
	 * @throws Exception
	 */
	public List<Reservation> selectRsvList() throws Exception {
		
		Connection conn = getConnection();
		
		List<Reservation> rsvList = dao.selectRsvList(conn);
		
		close(conn);
		
		return rsvList;
	}


	/** 관리자 이전 예약 리스트 보여주는 Service
	 * @return rsvList2
	 * @throws Exception
	 */
	public List<Reservation> selectRsvList2() throws Exception{
		
		Connection conn = getConnection();
		
		List<Reservation> rsvList2 = dao.selectRsvList2(conn);
		
		close(conn);
		
		return rsvList2;
	}
	

	
}
