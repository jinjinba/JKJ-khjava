package com.kh.day03.typetrans;

public class TestTypeTrans3 {
	public static void main(String [] args) { // 형변환
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;  //int는 정수이기 때문에 double로 변경.
		//int가 double로 형변환이 일어남
		System.out.println(iNum + dNum);
		System.out.println("강제 형 변환 : " + (int)result);
		System.out.println("강제 형 변환2 : " + (char)65);
		
	}
}
