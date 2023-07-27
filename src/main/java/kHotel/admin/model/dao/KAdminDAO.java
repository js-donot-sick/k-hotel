package kHotel.admin.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kHotel.board.model.vo.Board;
import kHotel.member.model.dao.MemberDAO;

public class KAdminDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	// 기본 생성자
	public KAdminDAO() {
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/KAdmin-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** faq 목록 조회(관리자) DAO
	 * @param conn
	 * @param type
	 * @return fList
	 * @throws Exception
	 */
	public List<Board> fList(Connection conn, int type) throws Exception {
		
		List<Board> fList = new ArrayList<Board>();
		
		try {
			
			String sql = prop.getProperty("fList");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, type);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardTitle(rs.getString(1));
				board.setBoardDate(rs.getString(2));
				board.setBoardContent(rs.getString(3));
				board.setBoardNo(rs.getInt(4));
				
				fList.add(board);
			}
			
		} finally {
			
			close(rs);
			close(pstmt);
			
		}
		
		return fList;
	}

}
