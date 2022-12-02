package com.kh.day08.oop;
// �� Ŭ�������� Suit s = new Suit(100) ���� ����
public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size, "Hazzys");		//ù��° ����
		System.out.println("Syit(int) ȣ��!"); //(1) ����°�� ȣ��
	}
	public Suit (int size, String brand) { //ù��°�� �θ�
		this(size, brand, 100000);		//�ι�° ������ �Ǹ� ù��° ������ ����
		System.out.println("Suit(int, String) ȣ��"); //(2) �ι�°�� ȣ��
	}
	public Suit(int size, String brand, int price) { // �ι�°�� �θ�
		this.size = size;
		this.brand = brand;
		this.price = price;		//����° ���� �ǰ� 
		System.out.println("Suit(int,String,int) ȣ��"); //(3) ù��°�� ȣ��
	} 
}
// ������ �Ʒ��� ���� �������� ���