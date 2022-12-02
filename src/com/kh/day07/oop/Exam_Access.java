package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;			//아무것도 적지 않은것은 default다.
}
public class Exam_Access {
	public static void main(String [] args) {
		Sample aClass = new Sample();
		aClass.a = 10;	//접근 가능하다. public이니까
//		aClass.b = 10; // is not visible, 접근 불가하다 private이니까
		aClass.c = 10; // 접근 가능하다. default니까
	}
}
