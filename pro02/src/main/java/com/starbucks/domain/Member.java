package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private String id;			//아이디
	private String pw;			//비밀번호
	private String name;		//이름
	private String email;		//이메일
	private String tel;			//연락처
	private String addr1;		//기본주소
	private String addr2;		//상세주소
	private String postcode;	//우편번호
	private String birth;		//생년월일
	private int point;			//포인트
	private String regdate;		//가입일
}
