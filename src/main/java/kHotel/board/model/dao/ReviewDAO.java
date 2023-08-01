package kHotel.board.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import kHotel.board.model.vo.Board;
import kHotel.member.model.dao.MemberDAO;

public class ReviewDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public ReviewDAO() {
		try {
			prop = new Properties();
			
			String filePath =   MemberDAO.class.getResource("/kHotel/sql/PHotel-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * @param conn
	 * @return
	 * @throws Exception
	 */
	public List<Board> boardCount(Connection conn) throws Exception{
		
		List<Board> boardList = new ArrayList<Board>();
		
		try {

			
			String sql = prop.getProperty("selectReview");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				Board board = new Board();
				board.setMemberId(rs.getString(1));
				board.setRoomNo(rs.getInt(2));
				board.setHotelTitle(rs.getString(3));
				board.setBoardDate(rs.getString(4));
				board.setImageRename(rs.getNString(5));
				board.setBoardContent(rs.getString(6));
				board.setReviewStar(rs.getInt(7));
				
				boardList.add(board);
				
			}
			
			
		} finally {
			close(rs);
			close(stmt);
		}
		
		
		return boardList;
	}

}
