package kHotel.member.model.service;

import static kHotel.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import kHotel.member.model.dao.JMemberDAO;
import kHotel.member.model.vo.Member;
import kHotel.member.model.vo.Reservation;

public class JMemberService {

	JMemberDAO dao = new JMemberDAO();
	
	/** 회원가입 Service
	 * @param member
	 * @return result
	 * @throws Exception
	 */
	public int signUp(Member member) throws Exception {
		
		Connection conn = getConnection();
		
		
		int result = dao.signUp(conn, member);
		
		if(result > 0) commit(conn);
		else		   rollback(conn);
		
		
		close(conn);
		
		return result;
	}

	/** 리뷰 사진 등록 Service
	 * @param reviewImg
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int reviewUpdate(String reviewImg, int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.reviewUpdate(conn,reviewImg,memberNo );
		
		if(result > 0) commit(conn);
		else		   rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 이전 예약 Service
	 * @param memberNo
	 * @return rv
	 * @throws Exception
	 */
	public List<Reservation> reservation(int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		 List<Reservation> rvList = dao.reservation(conn, memberNo);
		
		close(conn);
				
		return rvList;
	}




}
