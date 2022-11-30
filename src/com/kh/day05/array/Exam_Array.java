package com.kh.day05.array;

public class Exam_Array {
	public static void main(String [] args) {
		int num; 
		// 선언, 할당, 초기화
		int [] nums = new int[10];
		//선언     =  [10]으로 할당
		// 밑에는 초기화
		System.out.println(nums[0]);
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println("첫번째 값 : " + nums[0]);
		System.out.println("두번째 값 : " + nums[1]);
		System.out.println("세번째 값 : " + nums[2]);
		System.out.println("배열의 크기 : " + nums.length);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = 100;  	        // 배열의 값을 모두 100으로
			System.out.println(nums[i]);
		}
//		System.out.println();
//		for(int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i]);
		
		}

}
