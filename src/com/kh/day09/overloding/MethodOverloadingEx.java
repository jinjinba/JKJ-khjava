package com.kh.day09.overloding;

class Weapon {
	//�����ε�
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
	// �����ε�
	// �ڱ� �ڽſ��� ����, �Ű����� Ÿ�� or ������ �޶���.
	protected int fire(int steampack) { // �����ε� Overloading ������ �Ȱ����� �ȉ�
		return steampack*100;		//�����ε� 
	}
	protected int fire(int steampack, int medicine) {
		return steampack + medicine;
	}
	protected int fire(String steampack) { // �ٸ��� �� �Ȱ����� �Ű����� Ÿ�Ը� �ٲ��ִ°��� Overloading��� ��
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon {
	protected int fire() { // �������̵� overriding
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
