package kHotel.member.model.service;

import java.sql.Connection;

import kHotel.member.model.dao.KMemberDAO;
import kHotel.member.model.vo.Member;

import static kHotel.common.JDBCTemplate.*;

public class KMemberService {
	
	private KMemberDAO dao = new KMemberDAO();

	/** 로그인 service
	 * @param mem
	 * @return loginMember
	 * @throws Exception
	 */
	public Member login(Member mem) throws Exception {
		
		Connection conn = getConnection();
		
		Member loginMember = dao.login(conn, mem);
		
		close(conn);
		
		return loginMember;
	}

	/** 아이디 찾기 service
	 * @param idInput
	 * @param pwInput
	 * @return result
	 * @throws Exception
	 */
	public String idSearch(String nmInput, String pnoInput) throws Exception {
		
		Connection conn = getConnection();
		
		String result = dao.idSearch(conn, nmInput, pnoInput);
		
		close(conn);
		
		return result;
	}

	/** 임시비번 정보 확인 service
	 * @param inputName
	 * @param inputPno
	 * @param inputId
	 * @return memberNo
	 * @throws Exception
	 */
	public int rightInfo(String inputName, String inputPno, String inputId) throws Exception {
		
		Connection conn = getConnection();
		
		int memberNo = dao.rightInfo(conn, inputName, inputPno, inputId);
		
		close(conn);
		
		return memberNo;
	}

	public int tempPw(int memberNo, String pw) {
		// TODO Auto-generated method stub
		return 0;
	}



}
