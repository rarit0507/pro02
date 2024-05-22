package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int pno;			//상품번호
	private String cate;		//카테고리
	private String pname;		//상품명
	private String comment;		//상품 설명
	private int price;			//가격
	private String img;			//상품 이미지
	private String img2;			//상품 이미지
	private String img3;			//상품 이미지
}
