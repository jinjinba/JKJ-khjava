package com.kh.day04.loop;

public class Exam_ForDouble2 {
	public static void main(String [] args) {
		/*
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 */
		// for (int i =0; i < 5; i++) {
		//		System.out.println("*****");
		//	}	
		for(int i = 0; i < 4; i++) { //0~3(0,1,2) 까지 세로로 4개의 별
			for(int j = 0; j < 3; j++) { // 0~2 까지 가로로 3개의 별
				System.out.print("*");
			}
			System.out.println();    //중첩 for문
		}
	}
}
