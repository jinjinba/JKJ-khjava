package com.kh.practice.music.run;

import java.util.List;

import com.kh.practice.music.controller.MusicController;
import com.kh.practice.music.model.vo.Music;
import com.kh.practice.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mCon = new MusicController();
		int select = 0;
		String title = ""; //값 초기화
		int index = 0;
		Music music = null;
		do {
			select = view.musicMenu();
			switch(select) {
				case 1 :
					music = view.inputMusicInfo("마지막");
					mCon.addAtLast(music);
					view.displaySuccess("추가 성공!");
					break;
				case 2 : 
					music = view.inputMusicInfo("첫");
					mCon.addAtZero(music);
					view.displaySuccess("추가 성공!");
					break;
				case 3 :
					List<Music> allList = mCon.printMusicList();
					view.showAllMusicList(allList);
					view.displaySuccess("조회 성공!");
					break;
				case 4 : 
					title = view.inputMusicName("검색");
					List<Music> findList = mCon.searchMusicsByName(title);
					view.showAllMusicList(findList);
					view.displaySuccess("조회 성공!");
//					index = mCon.searchOneByName(title);
//					music = mCon.selectOneByIndex(index);
//					view.showOneMusic(music);
					break;
				case 5 :
					title = view.inputMusicName("삭제");
					index = mCon.searchOneByName(title);
					if(index == -1) {
						view.displayError("존재하지 않습니다.");
						break;
					}
					mCon.removeMusic(index);
					view.displaySuccess("삭제 성공!");
					break;
				case 6 : 
					// 이름받기
					title = view.inputMusicName("수정");
					// 이름으로 인덱스 검색, 존재 여부 체크용
					index = mCon.searchOneByName(title);
					if(index == -1) {
						view.displayError("조회 실패!");
						break;
					}
//					// 인덱스로 데이터 가져오기
//					music = mCon.selectOneByIndex(index);  인덱스에서 가져올 필요 없음
					// 가져온 데이터 수정
					music = view.modifyMusicInfo();
					// 저장소에 수정하기
					mCon.updateMusic(index, music);
					break;
				case 7 : 
//					System.out.println("곡명 오름차순 정렬");
					view.printMessage("=== === 곡명 오름차순 정렬 === ===");
					mCon.sortByTitleASC();
					view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
					break;
				case 8 : 
					view.printMessage("=== === 곡명 내림차순 정렬 === ===");
					mCon.sortByTitleDESC();
					view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
					break;
				case 9 : 
					view.printMessage("=== === 가수명 오름차순 정렬 === ===");
					mCon.sortBySingerASC();
					view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
					break;
				case 10 : 
					view.printMessage("=== === 가수명 내림차순 정렬 === ===");
					mCon.sortBySingerDESC();
					view.printMessage("정렬 성공! 3번을 눌러 출력해주세요!");
					break;
			}
		}while(select != 0);
		
	}
}
//=======메인 메뉴======
//1.마지막 위치에 곡 추가
//2.첫 위치에 곡 추가
//3.전체 곡 목록 출력
//4.특정 곡 검색
//5.특정 곡 삭제
//6.특정 곡 정보 수정
//7.곡명 오름차순 정렬
//8.곡명 내림차순 정렬
//9.가수명 오름차순 정렬
//10.가수명 내림차순 정렬
//0.종료
//메뉴 선택 >>
