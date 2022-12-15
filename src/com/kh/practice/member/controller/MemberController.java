package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;
	
	public MemberController() {
		mList = new ArrayList<Member>();
	}
	
	public void registerMember(Member member) { // ()의 매개변수를 꼭 써주어야함 아니면 불러 올 수가 없음.
		// c[i] = new Circle();
		mList.add(member);
	}
	
	public List<Member> printAllMember() {
		return mList;
		
	}
	// 같은 값이 있을 때 인덱스를 리턴
//	public int findMemberId(String memberId) { // String가 오는것만 알면 됨
//		for(int i = 0; i < mList.size(); i++) {
//			// memberId와 같은 데이터가
//			// mList에 있는지 찾아보기!
//			Member mOne = mList.get(i);
//			// 넘겨받은 memberId가 mOne에 있는지 확인
//			if(memberId.equals(mOne.getMemberId())) {
//				return i;
//			}
//		}
//		return -1;
//	}  
	
	/////////////부터 인덱스 없이 하는법/////////////
	// 같은 값이 있을 때 해당 객체 리턴
	public Member findMemberId(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return mOne;
			}
		}
		return null;
	}
	///////////////까지 인덱스 없이 하는법//////////////
	public List<Member> findMemberId() {
		return mList;
		
	}
	
	// 리턴된 인덱스 값을 이용하여 데이터 찾기
//	public Member printOneByIndex(int index) {
//		Member member = mList.get(index);
//		return member;
//	}
	
	

}
