package com.kh.day06.array;

public class Exam_DimArray {
	public static void main(String [] args) {
		int [][] arrs = new int[5][3];
		int k = 1;
		arrs[0][0] = 1; 
		// 첫번째 세로 배열 첫번째 행의 첫번째 가로배열 첫번째 열에 1이옴
		System.out.println("행(세로)의 크기(앞의 크기) : " + arrs.length);
		System.out.println("열(가로)의 크기(뒤의 크기) : " + arrs[0].length);
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
		for(int i=0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		//출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.print(arrs[i][j] + " ");
				System.out.printf("%2d " ,arrs[i][j]);
			}
			System.out.println();	//개행해주기
		}
	}
}
