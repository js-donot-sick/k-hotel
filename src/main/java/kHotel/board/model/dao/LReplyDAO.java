package kHotel.board.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kHotel.board.model.vo.Reply;
import kHotel.member.model.dao.MemberDAO;

public class LReplyDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	// 기본 생성자
	public LReplyDAO() {
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/LReply-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 댓글 목록 조회 DAO
	 * @param conn
	 * @param boardNo
	 * @return rList
	 * @throws Exception
	 */
	public List<Reply> selectReplyList(Connection conn, int boardNo) throws Exception{
		
		List<Reply> rList = new ArrayList<Reply>();
		
		try {
			
			String sql = prop.getProperty("selectReplyList");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, boardNo);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Reply reply = new Reply();
				
				reply.setMemberId( rs.getString("MEMBER_ID"));
				reply.setCreateDt(rs.getString("CREATE_DT"));
				reply.setReplyContent(rs.getString("REPLY_CONTENT"));
				
				rList.add(reply);
				
			}
			
			
		}finally {
			close(rs);
			close(pstmt);
			
		}
		
		
		
		return rList;
	}
	
	
	
	
	

}
