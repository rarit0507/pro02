package com.starbucks.biz;

import java.util.List;

import com.starbucks.domain.Board;

public interface BoardBiz {
	public int getTotalCount();
	public List<Board> getBoardList();
	public Board getBoard(int bno);
	public void insBoard(Board board);
	public void upBoard(Board board);
	public void delBoard(Board board);
	public void vcntCount(int bno);	//조회수 증가
}
