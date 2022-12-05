package com.kh.day09.overloding;

class Weapon {
	//오버로딩
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	protected int fire() {
		return 1;
	}
	// 오버로딩
	// 자기 자신에게 복붙, 매개변수 타입 or 갯수가 달라짐.
	protected int fire(int steampack) { // 오버로딩 Overloading 완전히 똑같으면 안됌
		return steampack*100;		//오버로딩 
	}
	protected int fire(int steampack, int medicine) {
		return steampack + medicine;
	}
	protected int fire(String steampack) { // 다른건 다 똑같은데 매개변수 타입만 바꿔주는것을 Overloading라고 함
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon {
	protected int fire() { // 오버라이딩 overriding
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}

}
