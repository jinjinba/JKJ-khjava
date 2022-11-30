package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// 누적합(가장기본적이고 자주 사용)
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println(sum);
	}
	
	public void exercise2() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		// 3강 7번 프레젠테이션
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {  //1~10까지 반복
			sum = sum+ i;
			System.out.print(i); 
			
			if(i<=9)
				System.out.print("+"); // 1~9까지는 '+'출력
			else {
				System.out.print("="); // '='출력하고
			}
		}
		System.out.print(sum); // 덧셈 결과 출력
	}
	public void exercise3() {
		// 구구단 출력하기!
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
		// 정수를 하나 입력받아서 그 수가 1~9 사이의 수일 때만 
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 사이의 정수 하나 입력 : ");
		int dan = sc.nextInt();
		// 1 < num < 9
		
//				 int num;    // 전역변수 선언
		if((dan > 1) && (dan < 10)) {
			for(int i = 1; i <= 9; i++) {
//						num = 0; // 지역변수 선언
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}
}
