package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {

	public static void main(String[] args) {
		Integer num = Integer.valueOf(0);
		// Boxing(자동 박싱)
		Integer su = 100; // 이걸 자동으로 해주는걸 박싱이라고함
		
		int soo = num.intValue(); //  참조형의 integer을 자료형 int로 바꾸어줌
		// UnBoxing(자동 언박싱)
		soo = num;
		
		int n = 10;
		Integer intObject = n; // Boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10;    // 언박싱
		//      integer -> int
		System.out.println("m = " + m);
	}

}
