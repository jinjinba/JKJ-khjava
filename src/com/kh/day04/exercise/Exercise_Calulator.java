package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calulator {
	public static void main(String [] args) {
		// com.kh.day03.exercise;�� if���� switch�� �ٲپ�� 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("���� �ϳ� �� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է�(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		// ������ �Ǻ� �� ���� ���� �׸��� ��� ����
		
		switch(operator) {    //char�� ���ڰ��;� �ϱ� ������ char�� operator�� �־���
		case '+' : 
			result = num1 + num2;
			break;
		case '-' : 
			result = num1 - num2;
			break;
		case '*' : 
			result = num1 * num2;
			break;
		case '/' : 
			result = num1 / num2;
			break;
		case '%' : 
			result = num1 % num2;
			break;
		}
		System.out.println("�ɰ� : " + num1 + operator + num2 + " = " + result);
		//���� ����� : ctrl + d
	}

}
