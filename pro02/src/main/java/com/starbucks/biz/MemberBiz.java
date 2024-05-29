package com.starbucks.biz;

import java.util.List;

import com.starbucks.domain.Member;

public interface MemberBiz {
	public List<Member> getMemberList();
	public Member getMember(String id);
	public int memberCount();
	public void insMember(Member member);
	public void changePw(Member member);
	public void changeInfo(Member member);
	public void changePoint(Member member);
	public void delMember(String id);
}