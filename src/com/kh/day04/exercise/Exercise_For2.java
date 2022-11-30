package com.kh.day04.exercise;

public class Exercise_For2 {
	public static void main(String[] args) {
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
}
