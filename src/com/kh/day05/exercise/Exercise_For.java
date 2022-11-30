package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// ������(����⺻���̰� ���� ���)
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println(sum);
	}
	
	public void exercise2() {
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
	public void exercise3() {
		// ������ ����ϱ�!
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		for(int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
	}
	public void exercise4() {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1~9 ������ ���� ���� 
		// �� ���� �������� ����ϼ���.
		// ��, ������ ���� ������ "1~9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 ������ ���� �ϳ� �Է� : ");
		int dan = sc.nextInt();
		// 1 < num < 9
		
//				 int num;    // �������� ����
		if((dan > 1) && (dan < 10)) {
			for(int i = 1; i <= 9; i++) {
//						num = 0; // �������� ����
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}else {
			System.out.println("1 ~ 9������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}
}