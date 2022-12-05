package com.kh.day09.overriding;

public class Line extends Shape{
	// 오버라이딩 하겠습니다!!!!
	@Override		//오버라이딩 하겠다는 표시!
	public void draw() { // 오버라이딩 재정의는 복붙 Shape에서 가져옴
		System.out.println("Line");
	}
}
