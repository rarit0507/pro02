package com.starbucks.per;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.starbucks.domain.Board;

@Mapper		//이거 쓰면 클래스 implement 안 해도 됨
public interface BoardMapper {
	public int getTotalCount();
	public List<Board> getBoardList();
	public Board getBoard(int bno);
	public void insBoard(Board board);
	public void upBoard(Board board);
	public void delBoard(Board board);
	public void vcntCount(int bno);	//조회수 증가
}
