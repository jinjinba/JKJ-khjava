package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
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
	public void exercise2() {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1~9 ������ ���� ����
		// �� ���� �������� ����ϼ���.
		// ��, ������ ���� ������ "1~9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ϳ� �Է����ּ��� : ");
		int num = sc.nextInt();
		if((num >= 1) && (num <= 9)) {
			int i = 1;
			while(i <= 9) {
				System.out.println(num + "*" + i + " = " + num * i);
				i++;   // �١١١١��߿�١١١١�
			}
		}else {
			System.out.println("1~9������ ����� �Է��ϼž� �մϴ�.");
		}
	}
	public void exercise3() {
//		While���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� -1�� �ԷµǸ� 
//		�Է��� ���� ���� ����Ͻÿ�.
//		���� �ϳ� �Է� : 3
//		���� �ϳ� �Է� : 4
//		���� �ϳ� �Է� : 7		
// 		���� �ϳ� �Է� : -1
// 		�Է��Ͻ� ���� ���� : 14
		Scanner sc = new Scanner(System.in);
		//System.out.print("���� �ϳ� �Է� : "); // �� ������ �� ���־�� ������ ��.
		//int input = sc.nextInt();
		int input = 0;   //���� ������ ����Ϸ��� int input ����� ��.
		int sum = 0;
		while(true) {
			System.out.print("���� �ϳ� �Է� : ");
			input = sc.nextInt();
			// �Է��� ���� ���ϰ�,
			// �Է��� ���� -1�̸� ������ �ʰ� ���ѹݺ� ����������!
			if(input == -1) break;
			sum = sum + input; // sum += input;
		}
//		while(input != -1) { //num�� -1�� �ƴϸ� true -> -1�� �ԷµǱ� ������ �ݺ�!
//			System.out.print("���� �ϳ� �Է� : ");
//			input = sc.nextInt();
//			if(input != -1) {
//				sum += input; 
//			}
//		}
		System.out.println("�Է��Ͻ� ���� ���� : " + sum);
	}
	
}
