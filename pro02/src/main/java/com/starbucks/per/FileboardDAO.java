package com.starbucks.per;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.starbucks.domain.Fileboard;

@Repository
public class FileboardDAO implements FileboardMapper {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("fileboard.getTotalCount");
	}

	@Override
	public List<Fileboard> getFileboardList() {
		return sqlSession.selectList("fileboard.getFileboardList");
	}	

	@Override
	public Fileboard getFileboard(int no) {
		return sqlSession.selectOne("fileboard.getFileboard", no);
	}

	@Override
	public void insFileboard(Fileboard fileboard) {
		sqlSession.insert("fileboard.insFileboard", fileboard);
	}

	@Override
	public void upFileboard(Fileboard fileboard) {
		sqlSession.update("fileboard.upFileboard", fileboard);
	}

	@Override
	public void vcntCount(int no) {
		sqlSession.update("fileboard.vcntCount", no);
	}

	@Override
	public void delFileboard(int no) {
		sqlSession.delete("fileboard.delFileboard", no);
	}
}