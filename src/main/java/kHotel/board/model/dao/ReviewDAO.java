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
import kHotel.member.model.vo.PPagination;

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
	

	/** 리뷰 내용 
	 * @param conn
	 * @param pagination 
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> boardCount(Connection conn, PPagination pagination) throws Exception{
		
		List<Board> boardList = new ArrayList<Board>();
		
		try {
			int start = (pagination.getCurrentPage()-1) * pagination.getLimit() +1;
			
			int end = start + pagination.getLimit() -1;
			
			String sql = prop.getProperty("selectReview1");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Board board = new Board();
				
				board.setMemberId(rs.getString("MEMBER_ID"));
				board.setRoomName(rs.getString("ROOM_NM"));
				board.setHotelTitle(rs.getString("HOTEL_TITLE"));
				board.setBoardDate(rs.getString("BOARD_DT"));
				board.setImageRename(rs.getNString("IMG_REVIEW_RENAME"));
				board.setBoardContent(rs.getString("BOARD_CONTENT"));
				board.setReviewStar(rs.getInt("REVIEW_STAR"));
				board.setTagContent(rs.getString("TAG_CONTENT"));
				board.setBoardNo(rs.getInt("BOARD_NO"));
				
				boardList.add(board);
				
			}
			
			
		} finally {
			close(rs);
			close(stmt);
		}
		
		
		System.out.println(boardList);
		return boardList;
		
	}
	
	/** 페이지네이션 하기 위해서 쿠폰리스트 얻어오기
	 * @param conn
	 * @return listCount
	 * @throws Exception
	 */
	public int selectReview(Connection conn) throws Exception {
		
		int listCount = 0;
		
		try {
			String sql = prop.getProperty("selectReview");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			if( rs.next() ) {
				listCount = rs.getInt(1);
			}
			
			
		} finally {
			close(rs);
			close(stmt);
		}
		
		return listCount;
	}
	
}
