package com.starbucks.per;

import java.util.List;

import com.starbucks.domain.Board;

public interface BoardMapper {
	
	public int getTotalCount();
	public List<Board> getBoardList();
	public Board getBoard(int bno);
	public void insBoard(Board board);
	public void upBoard(Board board);
	public void vcntCount(int bno);
	public void delBoard(int bno);
}