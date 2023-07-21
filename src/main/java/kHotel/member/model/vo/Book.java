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

public class Book {

		private int bookNo;
		private String checkInTime;
		private String checkOutTime;
		private int bookPerson;
		private String checkFl;
		private int memberNo;
		private int calculateNo;
		private int roomNo;
	

}
