package com.kh.day06.array;

public class Exam_DimArray {
	public static void main(String [] args) {
		int [][] arrs = new int[5][3];
		int k = 1;
		arrs[0][0] = 1; 
		// ù��° ���� �迭 ù��° ���� ù��° ���ι迭 ù��° ���� 1�̿�
		System.out.println("��(����)�� ũ��(���� ũ��) : " + arrs.length);
		System.out.println("��(����)�� ũ��(���� ũ��) : " + arrs[0].length);
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
		//���
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.print(arrs[i][j] + " ");
				System.out.printf("%2d " ,arrs[i][j]);
			}
			System.out.println();	//�������ֱ�
		}
	}
}
