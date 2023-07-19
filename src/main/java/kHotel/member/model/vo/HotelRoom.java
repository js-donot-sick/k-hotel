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

	private String roomNo;
	private String roomName;
	private int roomPrice;
	private int maxPerson;
	private String roomImage;
	private String roomInfo;
	private int bookNo;
	private int memberNo;
}
