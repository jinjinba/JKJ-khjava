package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	static int kor = 0;
	static int eng = 0;
	static int math = 0; //전역변수,클래스변수 : 제일 최상위로 올라온 변수.
	Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					inputScore();
					break;
				case 2 : 
					printScore();
					break;
				case 3 : 
					goodByeMsg();
					break;
				default :
					printException();
					break;
			}
		}
	}
	public static void printMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
	}
	public static void printScore() {
		int total = kor + eng + math;
		double avg = (double)total / 3;
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f" , avg);
	}
	public static void goodByeMsg() {
		System.out.println("Good Bye~");
	}
	public static void printException() {
		System.out.println("1 ~ 3 사이의 수를 입력해주세요~");
	}
}
