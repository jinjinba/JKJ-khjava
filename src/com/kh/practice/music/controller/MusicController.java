package com.kh.practice.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.music.model.vo.Music;

public class MusicController {
	private List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
		
	}
	
	/**
	 * 마지막 위치에 곡 추가
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}
	/**
	 * 첫번째 위치에 곡 추가
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	/**
	 * 곡 삭제
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}
	/**
	 * 곡 수정
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	/**
	 * 이름으로 음악 목록 검색
	 * @param title
	 */
	public List<Music> searchMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for(Music mOne : mList) {
			if(mOne.getTitle().equals(title)) {
				findList.add(mOne);
			}
		}
		return findList;
	}
	
	/**
	 * 이름으로 인덱스 조회
	 * @param musicName
	 * @return
	 */
	public int searchOneByName(String musicName) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(musicName.equals(music.getTitle())) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 인덱스로 리스트에서 조회
	 * @param index
	 * @return
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index); //Music
	}
	
	/**
	 * 전체 데이터 조회
	 * @return
	 */
	
	public List<Music> printMusicList() {
		return mList;
	}
	
	public void sortByTitleASC() {
		// 정렬하기
		int [] nums = {4, 3, 2, 1};
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// String끼리 대소비교 X
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
				
//				if(nums[i] > nums[i+1]) {
//					int temp = nums[i+1];
//					nums[i+1] = nums[i];
//					nums[i] = temp;
//				}
			}
		}
	}
	
	public void sortByTitleDESC() {
		// 정렬하기
		int [] nums = {4, 3, 2, 1};
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// String끼리 대소비교 X
				if(mOne.getTitle().compareTo(mTwo.getTitle()) >= 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
	
	public void sortBySingerASC() {
		int [] nums = {4, 3, 2, 1};
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// String끼리 대소비교 X, compareTo사용으로 비교O
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
	
	public void sortBySingerDESC() {
		int [] nums = {4, 3, 2, 1};
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// String끼리 대소비교 X
				if(mOne.getSinger().compareTo(mTwo.getSinger()) >= 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
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

