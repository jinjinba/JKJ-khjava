package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPooint extends Point { // point�� �ٸ� ��Ű���� �ֱ⿡ import���־���� 
	void set() { // �θ��� ��������� �޼ҵ� �ȿ���!
		pub = 1;
//		def = 2;	//�ٸ� ��Ű���̱⿡ ���� (The field Point.def is not visible)
		pro = 3;
//		pri = 4;	//private�� ���� Ŭ���� �������� ����(The field Point.pri is not visible)
	}
}

class Child extends Parent { // child = �ڽ� Ŭ����(sub class)
	void set() {
		pub = 1;		//�θ�Ŭ������ ����ϰ� �ֱ⿡ �ٷ� ����
		def = 2;
		pro = 3;
//		pri = 4;		//private�̱⿡ ������ ��
	}
}

class Parent {				// �θ� Ŭ����(super class)
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
