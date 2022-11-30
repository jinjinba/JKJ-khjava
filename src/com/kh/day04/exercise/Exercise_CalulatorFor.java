package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_CalulatorFor {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		for(;;) {
			
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
			count++;	//출력에 성공했을 때 카운트 업!
			if(count == 3) break; //3번째 카운트에서 브레이크 기능 발동
			// break; 적어주면 무한반복 x
		}
		
	}

}
