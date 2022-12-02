package com.kh.day08.oop;
// 런 클래스에서 Suit s = new Suit(100) 으로 실행
public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size, "Hazzys");		//첫번째 실행
		System.out.println("Syit(int) 호출!"); //(1) 세번째로 호출
	}
	public Suit (int size, String brand) { //첫번째를 부름
		this(size, brand, 100000);		//두번째 실행이 되면 첫번째 실행이 끝남
		System.out.println("Suit(int, String) 호출"); //(2) 두번째로 호출
	}
	public Suit(int size, String brand, int price) { // 두번째를 부름
		this.size = size;
		this.brand = brand;
		this.price = price;		//세번째 실행 되고 
		System.out.println("Suit(int,String,int) 호출"); //(3) 첫번째로 호출
	} 
}
// 위에서 아래로 실행 역순으로 출력