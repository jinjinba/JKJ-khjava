package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		// 2�� ���� 3��, 3�� ���� 4��, 4�� ���� 5���� �ǵ��� �ۼ��Ͻÿ�.
		// 1. 2 * 1 = 2, 2 * 2 = 4, 2 * 3 = 6, ...
		
		// 2. 2 * 1 = 2, 3 * 1 = 3, 4 * 1 = 4, ...
		
		// 3. 2 * 1 = 2, 3 * 1 = 3, 4 * 1 = 4, ...
		//    2 * 2 = 4, 3 * 2 = 6, 4 * 2 = 8, ...     
		for(int i =1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j +" * " + i + " = " + j * i + "\t"); 
				//i�� j ������ �տ� �����Ŀ� ���� ������ �ٲ�.
				// \t�� ��Ű�� ����, \t�� ����Ͽ� ���� ����.
			}
			System.out.println(); // <-���� ���� (�ٹٲ�)
		}
		
	}
}
