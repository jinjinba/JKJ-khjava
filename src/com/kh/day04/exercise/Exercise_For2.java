package com.kh.day04.exercise;

public class Exercise_For2 {
	public static void main(String[] args) {
		// 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�.
		// 1+2+3+4+5+6+7+8+9+10=55
		// 3�� 7�� ���������̼�
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {  //1~10���� �ݺ�
			sum = sum+ i;
			System.out.print(i); 
			
			if(i<=9)
				System.out.print("+"); // 1~9������ '+'���
			else {
				System.out.print("="); // '='����ϰ�
			}
		}
		System.out.print(sum); // ���� ��� ���
	}
}
