package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array { //Array 배열 공부 많이 하기!
	public void exercise1() {
//길이가 100인 배열을 선언하고 1부터 100까지의 값을
//순서대로 넣어 그 값을 출력하는 코드를 작성하시오.
		//int [] nums     선언
		int [] nums = new int[100];  //할당
		for(int i = 0; i<nums.length; i++) {
			nums[i] = i;			//i가 i값을 나타내게
			System.out.print(nums[i] + " ");
		}
	}
	public void exercise2() {
// 길이가 5인 String 배열을 선언하고 
// "딸기", "복숭아", "키위", "사과", "바나나"로
// 초기화 한 후, for문을 활용해서 바나나가 있으면 바나나를 출력해보세요!
//		String [] fruits 선언 = new String[5]; 할당
		String [] fruits = new String[5];	//5개의 칸이 생긴거나 마찬가지;
//		핸드메이드
		fruits[0] = "딸기";
		fruits[1] = "복숭아";
		fruits[2] = "키위";
		fruits[3] = "사과";
		fruits[4] = "바나나";
		// 조금 더 편하게 ! -> 할당과 초기화 동시에!!!!!!!
		// 5 배열에 {}중괄호로 바로바로 할당!
		String [] fruitGoods = {"딸기", "복숭아", "키위", "사과", "바나나"};
		for(int i = 0; i < fruits.length; i++) {
			if(fruitGoods[i] == "바나나") {
				System.out.print(fruits[i] + " "); 	// -> [0]~[4]까지 출력; 	
			}
		}
	}
	public void exercise3() {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 입력받은 값들의 평균을 구하는 프로그램을 작성하시오.
		 */
		int [] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의정수 5개를 입력해주세요 : ");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i]; //복합대입연산자, 누적합
		}
		// 평균은 총합 / 데이터의 갯수, 1,2 -> (1+2)/2 = 1.5
		System.out.println("평균은 " + (double)sum / arrs.length + "입니다.");
	}
	public void exercise4() {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 제일 큰 수를 출력하는 프로그램을 작성하시오.
		 */
		int [] nums = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력하세요 : ");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
	public void exercise5() {


/*
 * 사용자에게 주민번호를 입력 받은 후
 * 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
 * 210618-1124600 -> 210618-1******
 * 200518-3233920 -> 200518-3******
 */
		Scanner sc = new Scanner(System.in);
		char [] origin = new char[14];
		System.out.print("주민등록번호 입력 (-포함) : ");
		String memberNum = sc.next();
		// String으로 입력받은 값을 하나씩 잘라서 origin 문자 배열에 넣기!
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i); //하나씩 자를때는 캐릭터(charAt(i);)를 사용
			//System.out.print(origin[i]);
		}
		//char [] copy = origin;     //얕은 복사, 이러면 의도한 것이 아님;
		char [] copy = new char[14]; //깊은 복사의 시작!!!!! new를 이용해 새로운곳에 할당.
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {		//0~7 8개의 숫자이기에 보여짐
				copy[i] = origin[i];
			}else { 		//그 이후에는 *로
				copy[i] = '*';
			}
			System.out.print(copy[i]);    //복사한것 수정
		}
		System.out.println();
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);   // 원본출력
		}
	
	}
	public void exercise6() {
		// forRach문1
		int [] nums = {1, 2, 3, 4, 5};	// 할당과 초기화 동시에 
		// int [] nums = new int[5];로도 되지만 nums[0] = ? 하나하나 설정 해주어야함
		for(int num : nums) {	// nums값을 num에 넣고 반복하는 식으로 출력
			System.out.print(num + " ");
		}
	}
	public void exercise7() {
		// forEach문2
		String [] fruits = {"딸기", "복숭아", "포도", "체리", "망고"};
		for(String fruit : fruits) {	//for(int i=0; i < fruits.length; i++) {
			System.out.print(fruit + " ");
		}
	}
	
}