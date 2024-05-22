package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fileboard {
	private int no;				//게시글번호
	private String title;		//제목
	private String content;		//내용
	private String url;			//파일이름
	private int hits;			//방문횟수
	private String regdate;		//등록일
	private Member member;		//author 여기서 가져올듯
}
