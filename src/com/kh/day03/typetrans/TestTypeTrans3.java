package com.kh.day03.typetrans;

public class TestTypeTrans3 {
	public static void main(String [] args) { // ����ȯ
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;  //int�� �����̱� ������ double�� ����.
		//int�� double�� ����ȯ�� �Ͼ
		System.out.println(iNum + dNum);
		System.out.println("���� �� ��ȯ : " + (int)result);
		System.out.println("���� �� ��ȯ2 : " + (char)65);
		
	}
}
