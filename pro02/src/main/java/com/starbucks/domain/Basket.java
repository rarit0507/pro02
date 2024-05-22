package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Basket {	//장바구니
	private int bno;			//번호
	private int amount;			//주문수량
	private String remark;		//상세설명
	private String regdate;		//
	private Member member;		//id 여기서 가져오나?
	private Product product;	//pno 여기서 가져올듯
}
