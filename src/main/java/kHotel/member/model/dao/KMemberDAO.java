package kHotel.member.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kHotel.member.model.vo.Member;
import kHotel.member.model.vo.Reservation;

public class KMemberDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	// 기본 생성자
	public KMemberDAO() {
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/KMember-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 로그인 DAO
	 * @param conn
	 * @param mem
	 * @return loginMember
	 * @throws Exception
	 */
	public Member login(Connection conn, Member mem) throws Exception {
		
		Member loginMember = null;
		
		try {
			
			String sql = prop.getProperty("login");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mem.getMemberId());
			pstmt.setString(2, mem.getMemberPw());
			
			System.out.println(mem.getMemberId());
			System.out.println(mem.getMemberPw());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				loginMember = new Member();
				
				loginMember.setMemberNo(rs.getInt("MEMBER_NO"));
				loginMember.setMemberId(rs.getString("MEMBER_ID"));
				loginMember.setMemberName(rs.getString("MEMBER_NM"));
				loginMember.setMemberPno(rs.getString("MEMBER_PNO"));
				loginMember.setMemberEmail(rs.getString("MEMBER_EMAIL"));
				loginMember.setMemberTel(rs.getString("MEMBER_TEL"));
				loginMember.setMemberAddress(rs.getString("MEMBER_ADD"));
				loginMember.setMemberAdmin(rs.getString("MEMBER_ADMIN").charAt(0));
				
			}
			
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return loginMember;
	}

	/** 아이디 찾기 DAO
	 * @param conn
	 * @param idInput
	 * @param pwInput
	 * @return result
	 * @throws Exception
	 */
	public String idSearch(Connection conn, String nmInput, String pnoInput) throws Exception {
		
		String result = null;
		
		try {
			
			String sql = prop.getProperty("idSearch");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, nmInput);
			pstmt.setString(2, pnoInput);
			
			rs= pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getString(1);
			}
			
		} finally {
			
			close(rs);
			close(pstmt);
			
		}
		
		
		System.out.println(result);
		return result;
	}

	/** 임시비번 정보 확인 DAO
	 * @param conn
	 * @param inputName
	 * @param inputPno
	 * @param inputId
	 * @return memberNo 
	 * @throws Exception
	 */
	public int rightInfo(Connection conn, String inputName, String inputPno, String inputId) throws Exception {
		
		int memberNo = 0;
		
		try {
			String sql = prop.getProperty("rightInfo");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, inputName);
			pstmt.setString(2, inputPno);
			pstmt.setString(3, inputId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				memberNo = rs.getInt(1);
			}
			
		} finally {
			
		}
		return memberNo;
	}


	/** 비밀번호 변경 전 회원정보 확인 DAO
	 * @param conn
	 * @param mem
	 * @return result
	 * @throws Exception
	 */
	public int rePw(Connection conn, Member mem) throws Exception {
		
		int result = 0;
		
		try {
			
			String sql = prop.getProperty("rePw");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mem.getMemberName());
			pstmt.setString(2, mem.getMemberPno());
			pstmt.setString(3, mem.getMemberId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		
		return result;
	}

	/** 비밀번호 변경(로그인 전)DAO
	 * @param conn
	 * @param newPw
	 * @return result
	 * @throws Exception
	 */
	public int newRePw(Connection conn, String newPw, String memberId) throws Exception {
		
		int result = 0;
		
		try {
			//System.out.println("디에이오에는 잘 갓나요?");
			String sql = prop.getProperty("newRePw");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, newPw);
			
			pstmt.setString(2, memberId);
			
			result = pstmt.executeUpdate();
			
		} finally {
			
			
			close(pstmt);
			
		}
		
		return result;
	}

	/** 예약 끝 -> 예약 값 inset DAO
	 * @param conn
	 * @param reserve
	 * @return result
	 * @throws Exception
	 */
	public int reservationEnd(Connection conn, Reservation reserve) throws Exception {
		
		int result = 0;
		
		try {
			
			String sql = prop.getProperty("reservationEnd");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, reserve.getCheckInTime());
			pstmt.setString(2, reserve.getCheckOutTime());
			pstmt.setInt(3, reserve.getBookPerson());
			
			
		} finally {
			
		}
		
		return result;
	}

	

}
