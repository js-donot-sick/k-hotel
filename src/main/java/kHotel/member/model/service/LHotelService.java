package kHotel.member.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;

import kHotel.member.model.dao.LHotelDAO;
import kHotel.member.model.vo.LikeList;

public class LHotelService {
	
	LHotelDAO dao = new LHotelDAO();

	
	/** 찜하기 1번 객실 Service
	 * @param lk
	 * @return result
	 * @throws Exception
	 */
	public int likeplus1(LikeList lk) throws Exception{
		
		Connection conn = getConnection();
		
		// roomNo (객실 번호) 받아오기
		int roomNo = dao.searchRoomNo(conn, lk);
		
		// 받아온 객실번호와 사용자 번호로 찜목록에 추가
		int result = dao.insertLikeList(conn, lk, roomNo);
		
		
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		
		return result;
	}


	/** 찜삭제 1번 객실 Service
	 * @param lk
	 * @return
	 * @throws Exception
	 */
	public int likeDel1(LikeList lk) throws Exception{
		
		Connection conn = getConnection();
		
		// roomNo (객실 번호) 받아오기
		int roomNo = dao.searchRoomNo(conn, lk);

		
		// 받아온 객실번호와 사용자 번호로 찜목록에 추가
		int result = dao.deleteLikeList(conn, lk, roomNo);
		
		
		if(result > 0) commit(conn);
		else			rollback(conn);
		
				
		return result;
	}
	
	

}
