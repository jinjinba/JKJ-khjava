package com.kh.day09.overriding;

public class Rect extends Shape {
	@Override // 안써도 되지만 오버라이딩 했다는 표시!!
	public void draw() {
		System.out.println("Rect");
	}
}
