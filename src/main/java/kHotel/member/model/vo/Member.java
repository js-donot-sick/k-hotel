package kHotel.member.model.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Member implements Serializable {
	
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPno;
	private String memberTel;
	private String memberEmail;
	private String memberAddress;
	private char secessionFlag;
	private int coupon;
	private int report;
	private char memberAdmin;

	
}
