package kHotel.member.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import kHotel.member.model.vo.Member;

public class JMemberDAO {
	
	public JMemberDAO() {
		
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/JHotel-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Properties prop = new Properties();


	/** 회원가입 DAO
	 * @param conn
	 * @param member
	 * @return result
	 * @throws Exception
	 */
	public int signUp(Connection conn, Member member) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("signUp11");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberPno());
			pstmt.setString(5, member.getMemberTel());
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberAddress());
			
			result = pstmt.executeUpdate();
			
		}finally {
			
			close(pstmt);
			
		}
		return result;
	}


	/** 리뷰 등록 DAO
	 * @param conn
	 * @param reviewImg
	 * @param memberNo
	 * @return reuslt
	 * @throws Exception
	 */
	public int reviewUpdate(Connection conn, String reviewImg, int memberNo) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("");
			
		}finally {
			
			
		}
		return result;
	}


}
