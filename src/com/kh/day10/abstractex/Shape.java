package com.kh.day10.abstractex;

	//	4. The type Line must implement 
	//     the inherited abstract method Shape.draw()
abstract class Line extends Shape{ 
	// 오버 라이딩을 하거나 추상클래스로 만들어야 오류가 사라짐.
	
}


	//	3. The type Shape must be an abstract class to define abstract methods
public abstract class Shape { // abstract를 넣어주어 오류 없애줌 
	public Shape() {} // 메소드인데 클래스와 이름이 같음 // 생성자임
	public void paint() {}
	abstract public void draw();
	//	2. The abstract method draw in type Shape can only be defined by an abstract class
	// 	1. Abstract methods do not specify a body (draw()에 {}가 있어서 오류 {}빼고 ; 넣어줘)
}
