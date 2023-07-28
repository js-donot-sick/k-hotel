package kHotel.member.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class ReviewImg {
	
	private int reviewNo;
	private String reviewReName;
	private int imageLevel;
	private int boardNo; 

}
