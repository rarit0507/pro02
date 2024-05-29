package com.starbucks.biz;

import java.util.List;

import com.starbucks.domain.Fileboard;

public interface FileboardBiz {
	// getPostList() : 페이지 번호가 없을 때는 default 1 page
	List<Fileboard> getPostList();

	// getPostList(String pageNo) 오버로딩
	List<Fileboard> getPostList(String pageNo);

	// write(PostVO postVO) : 글쓰기
	void write(Fileboard fileboard);

	// getPostDetailNoHits : 게시판 상세 정보 조회 시, 조회수 증가 X
	Fileboard getPostDetailNoHits(int no);

	// getPostDetailNoHits : 게시판 상세 정보 조회 시, 조회수 증가 O	
	public Fileboard getPostDetailHasHits(int no);
	
	// updateHits : 조회 수 증가
	void updateHits(int no);

	// deletePost : 게시글 삭제
	void deletePost(int no);

	// updatePost : 게시글 수정
	void updatePost(Fileboard fileboard);
	
	int getTotalCount();
}