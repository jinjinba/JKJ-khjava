package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		// While���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		int i = 1;
		int sum = 0;
		while(i <= 100) {    // for(int i = 1; i <= 100; i++)�� ����
			sum = sum + i;    //������
			// i = i + 2;
			i += 2; // ���մ��� �����ڷ� ǥ��
			// i = i + 4; -> i += 4;
			// i = i * 2; -> i *= 2;
		}
		System.out.println("�հ� : " + sum);
	}
}
