package com.starbucks.per;

import java.util.List;

import com.starbucks.domain.Fileboard;
import com.starbucks.util.PagingBean;

public interface FileboardMapper {
	public int getTotalCount();
	public List<Fileboard> getFileboardListAll();
	public List<Fileboard> getFileboardList(PagingBean pagingBean);
	public Fileboard getFileboard(int no);
	public void insFileboard(Fileboard board);
	public void upFileboard(Fileboard board);
	public void hitCount(int no);
	public void delFileboard(int no);
}