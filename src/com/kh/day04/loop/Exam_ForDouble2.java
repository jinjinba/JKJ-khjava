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
		for(int i = 0; i < 4; i++) { //0~3(0,1,2) ���� ���η� 4���� ��
			for(int j = 0; j < 3; j++) { // 0~2 ���� ���η� 3���� ��
				System.out.print("*");
			}
			System.out.println();    //��ø for��
		}
	}
}
