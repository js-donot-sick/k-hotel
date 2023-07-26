package kHotel.board.model.service;

import java.sql.Connection;
import java.util.Map;
import static kHotel.common.JDBCTemplate.*;
		

public class ReviewService {


	/**
	 * @param type
	 * @param cp
	 * @return map
	 * @throws Exception
	 */
	public Map<String, Object> boardReview(int type, int cp) throws Exception {
		
		Connection conn = getConnection();
		
		return null;
	}

}
