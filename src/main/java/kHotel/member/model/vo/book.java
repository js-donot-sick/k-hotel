package kHotel.member.model.vo;

import java.util.Date;

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

public class book {

	private int bookNo;
	private String bookRoom;
	private Date checkInTime;
	private Date checkOutTime;
	private int adult;
	private int child;
	private String checkFl;
	
}
