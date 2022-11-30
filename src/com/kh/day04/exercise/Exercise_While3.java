package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {
	public static void main(String [] args) {
//		While문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
//		입력한 수의 합을 출력하시오.
//		정수 하나 입력 : 3
//		정수 하나 입력 : 4
//		정수 하나 입력 : 7		
// 		정수 하나 입력 : -1
// 		입력하신 수의 합은 : 14
		Scanner sc = new Scanner(System.in);
		//System.out.print("정수 하나 입력 : "); // 이 한줄은 꼭 써주어야 시작이 됨.
		//int input = sc.nextInt();
		int input = 0;   //위에 두줄을 사용하려면 int input 지우면 됨.
		int sum = 0;
		while(true) {
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
			// 입력한 값을 더하고,
			// 입력한 값이 -1이면 더하지 않고 무한반복 빠져나오기!
			if(input == -1) break;
			sum = sum + input; // sum += input;
		}
//		while(input != -1) { //num이 -1이 아니면 true -> -1이 입력되기 전까지 반복!
//			System.out.print("정수 하나 입력 : ");
//			input = sc.nextInt();
//			if(input != -1) {
//				sum += input; 
//			}
//		}
		System.out.println("입력하신 수의 합은 : " + sum);
	}
}
