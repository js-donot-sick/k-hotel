package kHotel.member.model.dao;

import static kHotel.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class LHotelDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	// 기본 생성자
	public LHotelDAO() {
		try {
			prop = new Properties();
			
			String filePath =   LMemberDAO.class.getResource("/kHotel/sql/LHotel-sql.xml").getPath(); 
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
