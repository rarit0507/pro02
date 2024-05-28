package com.starbucks.per;

import java.util.List;

import com.starbucks.domain.Fileboard;

public interface FileboardMapper {
	
	public int getTotalCount();
	public List<Fileboard> getFileboardList();
	public Fileboard getFileboard(int no);
	public void insFileboard(Fileboard fileboard);
	public void upFileboard(Fileboard fileboard);
	public void vcntCount(int no);
	public void delFileboard(int no);
}