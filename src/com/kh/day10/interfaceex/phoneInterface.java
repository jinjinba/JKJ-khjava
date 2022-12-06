package com.kh.day10.interfaceex;

public interface PhoneInterface {
//	1. Illegal modifier for the interface field phoneInterface.name; 
//	 only public, static & final are permitted
	public String NAME = ""; // ������ ������ ����ƽ ���̳��̶�� �� ����ƽ�� ����
//	name = "Hello world";	// X, ������̶� �ٲ��� ����.
	public static final int TIME_OUT = 10000; // ����ƽ�� �������� Ÿ�Ӿƿ��� ��￩������
	public abstract void sendCall();
	public abstract void receiveCall(); // public abstract �� �� �ᵵ �ǰ�
//	2. Abstract methods do not specify a body
	abstract void printLogo(); //public�� �ᵵ�ǰ� abstract ���ᵵ�ǰ�
	void displayNumber();	//�ƿ� �Ƚᵵ ��
	public default void showLogo() {	// ����Ʈ �޼ҵ�
		// ���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		// ��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�!!!!
		System.out.println("** LG **");
	}
}
