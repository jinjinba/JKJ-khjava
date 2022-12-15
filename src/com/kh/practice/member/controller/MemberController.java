package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;
	
	public MemberController() {
		mList = new ArrayList<Member>();
	}
	
	public void registerMember(Member member) { // ()�� �Ű������� �� ���־���� �ƴϸ� �ҷ� �� ���� ����.
		// c[i] = new Circle();
		mList.add(member);
	}
	
	public List<Member> printAllMember() {
		return mList;
		
	}
	// ���� ���� ���� �� �ε����� ����
//	public int findMemberId(String memberId) { // String�� ���°͸� �˸� ��
//		for(int i = 0; i < mList.size(); i++) {
//			// memberId�� ���� �����Ͱ�
//			// mList�� �ִ��� ã�ƺ���!
//			Member mOne = mList.get(i);
//			// �Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��
//			if(memberId.equals(mOne.getMemberId())) {
//				return i;
//			}
//		}
//		return -1;
//	}  
	
	/////////////���� �ε��� ���� �ϴ¹�/////////////
	// ���� ���� ���� �� �ش� ��ü ����
	public Member findMemberId(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return mOne;
			}
		}
		return null;
	}
	///////////////���� �ε��� ���� �ϴ¹�//////////////
	public List<Member> findMemberId() {
		return mList;
		
	}
	
	// ���ϵ� �ε��� ���� �̿��Ͽ� ������ ã��
//	public Member printOneByIndex(int index) {
//		Member member = mList.get(index);
//		return member;
//	}
	
	

}
