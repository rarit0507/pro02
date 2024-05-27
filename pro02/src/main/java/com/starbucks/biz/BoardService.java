package com.starbucks.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public Board getBoard(int bno) {
		boardMapper.vcntCount(bno);		//게시글 불러올 때 한 번에 증가하도록 메서드를 서비스에 넣음. @Transactional 추가 필요
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

//	@Override
//	public void vcntCount(int bno) {
//		boardMapper.vcntCount(bno);
//	}


	
}
