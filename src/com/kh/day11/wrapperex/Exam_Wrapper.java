package com.kh.day11.wrapperex;

//	제6강 37p 참고

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
//		The constructor Integer(int) is deprecated since version 9
//		Integer soo = new Integer(0); // 
		Integer su = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A')); // 소문자로 변경해줌
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) { // 누어있는건 새팅 메소드?
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}

}
