package com.kh.day07.oop;

public class Circle {		// 클래스 선언(class Circle), 클래스 접근 권한 public
	//써클 클래스에 필드 네임
	//필드
	public int radius;		// 접근 지정자 public//전역 변수 클래스 변수
	public String name;		// 접근 지정자 public
	
	//클래스명과 이름이 같은 메소드
	// -> 생성자
	// 2. 객체 생성해준다
	// 3. 필드 초기화 (초기화는 생성자에서)
	public Circle() {		// -> 생성자(클래스와 같은 이름) // 접근 지정자 public
		this.radius = 1;	// -> 초기화
		this.name = "원";	// -> 초기화
	}
	//반환형이 있는 메소드(반환값이 있음, return)
	public double getArea() { // 접근 지정자 public
		double area = 3.14*radius*radius;
		return area;   //밑의 것과 차이는 변수를 썻는냐 안썻는냐의 차이
//		return 3.14*radius*radius; // return값의 자료형을 double자리에 넣어줘야한다.
	}
}
