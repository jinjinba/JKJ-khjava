package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		String result = "";
		//짝수 판별
		//(input % 2 == 0) ? "짝수" : "홀수";
		if(input % 2 == 0) {
			result = "짝수";
			//System.out.println(input + "은/는 짝수입니다.");
		} else {		// if조건식을 쓸 필요가 없으므로 if조건문 생략.
			result = "홀수";
			//System.out.println(input + "은/는 홀수입니다.");
		}
		
		//판별 후 출력
		System.out.println(input + "은/는 " + result + "입니다.");
		
	}
}
