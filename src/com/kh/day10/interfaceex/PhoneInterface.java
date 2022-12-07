package com.kh.day10.interfaceex;

public interface PhoneInterface {
//	1. Illegal modifier for the interface field phoneInterface.name; 
//	 only public, static & final are permitted
	public String NAME = ""; // 기울어져 있으면 스태틱 파이널이라는 뜻 스태틱이 생략
//	name = "Hello world";	// X, 상수값이라서 바뀌지 않음.
	public static final int TIME_OUT = 10000; // 스태틱의 영향으로 타임아웃이 기울여져있음
	public abstract void sendCall();
	public abstract void receiveCall(); // public abstract 둘 다 써도 되고
//	2. Abstract methods do not specify a body
	abstract void printLogo(); //public만 써도되고 abstract 만써도되고
	void displayNumber();	//아예 안써도 됨
	public default void showLogo() {	// 디폴트 메소드
		// 하위 호환성을 위해서 작성한다.
		// 즉, 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성!!!!
		System.out.println("** LG **");
	}
}
