package com.starbucks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fileboard {
	private int no;
	private String title;
	private String content;
	private String url;
	private int hits;
	private String regdate;
	private String author;
}
