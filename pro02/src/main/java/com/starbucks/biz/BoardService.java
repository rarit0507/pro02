package com.starbucks.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starbucks.domain.Board;
import com.starbucks.per.BoardMapper;

@Service
public class BoardService implements BoardBiz {

	@Autowired
	private BoardMapper boardMapper;

	@Override
	public int getTotalCount() {
		return boardMapper.getTotalCount();
	}

	@Override
	public List<Board> getBoardList() {
		return boardMapper.getBoardList();
	}

	@Override
	public Board getBoard(int bno) {
		return boardMapper.getBoard(bno);
	}

	@Override
	public void insBoard(Board board) {
		boardMapper.insBoard(board);		
	}

	@Override
	public void upBoard(Board board) {
		boardMapper.upBoard(board);
	}

	@Override
	public void delBoard(Board board) {
		boardMapper.delBoard(board);
	}

	@Override
	public void vcntCount(int bno) {
		boardMapper.vcntCount(bno);
	}


	
}
