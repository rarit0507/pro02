package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sales {	//출고 테이블
	private int sno;			//재고번호
	private int amount;			//구매수량
	private int tot;			//총 금액
	private String paymethod;	//지불방법
	private String paynum;		//구매번호
	private String addr;		//배송주소
	private String tel;			//연락처
	private String delcom;		//배송사진
	private String deltel;		//배송연락처
	private String delno;		//배송번호(택배사)
	private String delstatus;	//배송상태
	private String st;			//?
	private String regdate;
	private Member member;		//id
	private Product product;	//pno
}
