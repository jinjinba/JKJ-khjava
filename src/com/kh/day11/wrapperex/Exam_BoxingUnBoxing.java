package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {

	public static void main(String[] args) {
		Integer num = Integer.valueOf(0);
		// Boxing(�ڵ� �ڽ�)
		Integer su = 100; // �̰� �ڵ����� ���ִ°� �ڽ��̶����
		
		int soo = num.intValue(); //  �������� integer�� �ڷ��� int�� �ٲپ���
		// UnBoxing(�ڵ� ��ڽ�)
		soo = num;
		
		int n = 10;
		Integer intObject = n; // Boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10;    // ��ڽ�
		//      integer -> int
		System.out.println("m = " + m);
	}

}
