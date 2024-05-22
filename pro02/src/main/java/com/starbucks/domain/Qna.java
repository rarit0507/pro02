package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Qna {
	private int no;				//게시글번호
	private String title;		//제목
	private String content;		//내용
	private int lev;			//레벨(1:질문/2:답글)
	private int parno;			//부모글번호
	private int hits;			//방문횟수
	private String regdate;		//등록일
	private Member member;		//id, name
}
