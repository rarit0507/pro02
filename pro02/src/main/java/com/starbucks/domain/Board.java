package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	private int bno;			//게시글번호
	private String title;		//제목
	private String content;		//내용
	private String author;		//글쓴이
	private int vcnt;			//방문횟수
	private String regdate;		//등록일
}
