package kHotel.member.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kHotel.member.model.vo.Event;
import static kHotel.common.JDBCTemplate.*;

public class EventDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Properties prop;


	// 기본 생성자
	public EventDAO() {
		try {
			prop = new Properties();

			String filePath =  CBookDAO.class.getResource("/kHotel/sql/PHotel-sql.xml").getPath(); 

			prop.loadFromXML(new FileInputStream(filePath));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * @param conn
	 * @return eventList
	 * @throws Exception
	 */
	public List<Event> eventList(Connection conn) throws Exception {
		
		List<Event> eventList = new ArrayList<Event>();
		
		try {
		
			String sql = prop.getProperty("eventList");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Event event = new Event();
				event.setEventNo(rs.getInt(1));
				event.setEventTitle(rs.getString(2));
				event.setEventImg(rs.getString(3));
				
				eventList.add(event);
				
				System.out.println(eventList);
				
			}
		} finally {
			close(stmt);
			close(rs);
		
		}
		
		return eventList;
	}



}




