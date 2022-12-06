package com.kh.day10.interfaceex;

//1. The type PhoneInterface cannot be the superclass of SamsungPhone;
// a superclass must be a class
//2. The type SamsungPhone must implement 
// the inherited abstract method PhoneInterface.receiveCall()
public class SamsungPhone implements PhoneInterface { // implements�� �߻�޼ҵ� ����

	@Override
	public void sendCall() { //PhoneInterface�� �ִ� �߻�޼ҵ���� �������̵� �Ѱ�
		System.out.println("�ѷ����");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������� ����");
	}

	@Override
	public void printLogo() {
		System.out.println("====== Samsung ======");
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : xxx-xxxx-xxxx");
	}
	
	public void flash() { //�������̵� ���� �ʰ� ���� ���ؼ� ��� ����
		System.out.println("��¦��¦ ���� �������ϴ�.");
	}
	
	
}
