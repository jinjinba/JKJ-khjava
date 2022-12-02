package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기!!
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호 6개
		// 로또 번호의 범위 : 1 ~ 45
		int [] lottos = new int[6];
		Random rand = new Random();
		// 번호를 뽑느다. X6 (랜덤번호 생성)
		for(int i = 0; i < lottos.length; i++) { // length는 .앞의 크기
			// 번호를 뽑는다. 1 ~ 45
			lottos[i] = rand.nextInt(45)+1; 
			// 중복 제거
			for(int e = 0; e < i; e++) {
				// 비교를 한다. 횟수 거듭할 수록 점점 많이 비교
				// 비교는 이미 뽑은것과 첫번째 부터
				if(lottos[i] == lottos[e]) {
					// 같으면 i--
					i--;
					break;
				}
			}
		}
		// 정렬
		// 버블정렬
		for(int i = 0; i < lottos.length-1; i++) {
			for(int e=0; e < (lottos.length-1)-i; e++) {
				if(lottos[e] > lottos[e+1]) {
					int temp = lottos[e+1];
					lottos[e+1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}
		// 출력
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
			

	}
}