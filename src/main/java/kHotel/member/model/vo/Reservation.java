
package kHotel.member.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {
	
	private int roomNo;
	private String HotelName;
	private String roomName;
	private int roomPrice;
	private String roomImage;
	private String roomInfo;
	private String roomStatus;
	private int memberNo;
	private int bookNo;
	private String checkInTime;
	private String checkOutTime;
	private int bookPerson;
	private String checkFl;
	private int calculateNo;


}
