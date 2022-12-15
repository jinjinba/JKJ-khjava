package com.kh.practice.member.run;

import java.util.List;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

public class Run {

	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mCon = new MemberController();
		done:
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
				case 1 : 
					List<Member> mList = mCon.printAllMember();
					view.showAllMember(mList);
					break;
				case 2 :
					String memberId = view.inputMemberId();
					//////////부터 인덱스 없이 하는법/////////
					Member mOne = mCon.findMemberId(memberId);
					if(mOne == null) {
						// 없습니다 메시지 출력
					}						
					///////////까지 인덱스 없이 하는법////////
//					int index = mCon.findMemberId(memberId);
//					if(index == -1) {
//						// 없습니다 메시지 출력
//					}
//					Member mOne = mCon.printOneByIndex(index);
					view.printOneById(mOne);
					break;
				case 3 : break;
				case 4 : 
					Member member = view.inputMember();
					mCon.registerMember(member);
					break;
				case 5 : break;
				case 6 : break;
				case 0 : break done;
			}
		}
	}

}
