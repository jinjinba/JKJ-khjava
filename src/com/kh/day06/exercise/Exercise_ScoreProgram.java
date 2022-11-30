package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args) {
		/*
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 1
		 * 
		 * ====== 성적 입력 =======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * 
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 2
		 * 
		 * ====== 성적 출력 ======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * 총점 : 120
		 * 평균 : 40.00
		 * 
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 3 
		 * 
		 * Good Bye~
		 */

		Scanner sc = new Scanner(System.in);
		//for (;;) {}	or	while(true) {}
		int kor = 0;
		int eng = 0;
		int math = 0;
		ESCAPE :   // 단어는 아무거나 선택 가능
		while(true) {
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.println("선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("===== 성적 입력 =====");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2 :
				System.out.println("===== 성적 출력 =====");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println(" ");
				int total = kor + eng + math;
				double avg = (double)total / 3;
				System.out.println("총점 : " + total);
				System.out.printf("평균 : %.2f" , avg);
				//printf 소수자리는 .2f 사용 +가 아닌 , 사용
				break;
			case 3 :
				System.out.println("Good Bye~");
				break ESCAPE;
			default :
				System.out.println("1 ~ 3 사이의 수를 입력해주세요~");
				break;
			}
		}
		
	}
	static void 프린트기능() {
		
	}
}
