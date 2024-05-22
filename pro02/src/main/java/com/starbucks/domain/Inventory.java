package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
	private int ino;			//재고번호
	private int iprice;			//입고가격
	private int oprice;			//출고가격
	private int amount;			//출고수량
	private String remark;		//참고사항
	private String regdate;
	private Product product;	//pno 가져올 곳
}
