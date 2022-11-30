package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calulator {
	public static void main(String [] args) {
		// com.kh.day03.exercise;의 if문을 switch로 바꾸어라 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;
		// 연산자 판별 후 연산 수행 그리고 결과 저장
		
		switch(operator) {    //char인 문자가와야 하기 때문에 char인 operator을 넣어줌
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
		System.out.println("걸과 : " + num1 + operator + num2 + " = " + result);
		//삭제 단축기 : ctrl + d
	}

}
