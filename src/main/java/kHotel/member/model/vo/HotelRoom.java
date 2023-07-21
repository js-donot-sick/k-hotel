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


public class HotelRoom {

	private int roomNo;
	private String HotelName;
	private String roomName;
	private int roomPrice;
	private String roomImage;
	private String roomInfo;
	private String roomStatus;
	private int memberNo;
}
