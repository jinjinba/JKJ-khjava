package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPooint extends Point { // point는 다른 패키지에 있기에 import해주어야함 
	void set() { // 부모의 멤버변수는 메소드 안에서!
		pub = 1;
//		def = 2;	//다른 패키지이기에 오류 (The field Point.def is not visible)
		pro = 3;
//		pri = 4;	//private는 같은 클래스 내에서만 가능(The field Point.pri is not visible)
	}
}

class Child extends Parent { // child = 자식 클래스(sub class)
	void set() {
		pub = 1;		//부모클래스를 상속하고 있기에 바로 가능
		def = 2;
		pro = 3;
//		pri = 4;		//private이기에 오류가 뜸
	}
}

class Parent {				// 부모 클래스(super class)
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int money = 2000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
}

public class Exam_ingeritance {
	public static void main(String [] args) {
		Child child = new Child();
		child.setMoney(3000);
		System.out.println("Parent money : " + child.getMoney());
	}
}
