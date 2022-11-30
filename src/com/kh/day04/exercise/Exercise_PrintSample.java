package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main(String [] args) {
		// System.out.println에서 정수 + 문자열 -> 문자열
		System.out.println(1+"1"); // ""는 문자열 ''는 문자 계산이 안됨
		// 문자 + 문자 -> 문자
		System.out.println('1' + '1'); //1이라는 문자는 아스키 코드로 인해 49로 인식
		// 정수 + 정수 + 문자열 + 정수 -> 최종적으로는 문자열
		System.out.println(10 + 20 + "Hello" + 10);
		
		//printf에 대하여 알아보자
		//println, print -> 줄바꿈의 차이
		System.out.print("정수 입력 : "); // 바로 옆에 입력받음.
		System.out.println("정수 입력 : ");	 //줄바꾸고 입력받음.
		System.out.printf("정수 출력 : %d \n", 1); // 정수라면 %d로 위치를 선택, \n은 줄 바꿈
		System.out.printf("문자열 출력 : %s", "HelloWorld"); //문자열이면 %s, String 약자 
	}
}
