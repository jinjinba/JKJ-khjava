package com.kh.day07.oop;

public class Circle {		// Ŭ���� ����(class Circle), Ŭ���� ���� ���� public
	//��Ŭ Ŭ������ �ʵ� ����
	//�ʵ�
	public int radius;		// ���� ������ public//���� ���� Ŭ���� ����
	public String name;		// ���� ������ public
	
	//Ŭ������� �̸��� ���� �޼ҵ�
	// -> ������
	// 2. ��ü �������ش�
	// 3. �ʵ� �ʱ�ȭ (�ʱ�ȭ�� �����ڿ���)
	public Circle() {		// -> ������(Ŭ������ ���� �̸�) // ���� ������ public
		this.radius = 1;	// -> �ʱ�ȭ
		this.name = "��";	// -> �ʱ�ȭ
	}
	//��ȯ���� �ִ� �޼ҵ�(��ȯ���� ����, return)
	public double getArea() { // ���� ������ public
		double area = 3.14*radius*radius;
		return area;   //���� �Ͱ� ���̴� ������ ���³� �ț��³��� ����
//		return 3.14*radius*radius; // return���� �ڷ����� double�ڸ��� �־�����Ѵ�.
	}
}
