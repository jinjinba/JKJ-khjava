package com.kh.day09.overriding;

public class Line extends Shape{
	// �������̵� �ϰڽ��ϴ�!!!!
	@Override		//�������̵� �ϰڴٴ� ǥ��!
	public void draw() { // �������̵� �����Ǵ� ���� Shape���� ������
		System.out.println("Line");
	}
}
