package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		// While문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int i = 1;
		int sum = 0;
		while(i <= 100) {    // for(int i = 1; i <= 100; i++)와 같음
			sum = sum + i;    //누적합
			// i = i + 2;
			i += 2; // 복합대입 연산자로 표현
			// i = i + 4; -> i += 4;
			// i = i * 2; -> i *= 2;
		}
		System.out.println("합계 : " + sum);
	}
}
