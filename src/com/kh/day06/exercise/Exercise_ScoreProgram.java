package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args) {
		/*
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 1
		 * 
		 * ====== ���� �Է� =======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * 
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 2
		 * 
		 * ====== ���� ��� ======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * ���� : 120
		 * ��� : 40.00
		 * 
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 3 
		 * 
		 * Good Bye~
		 */

		Scanner sc = new Scanner(System.in);
		//for (;;) {}	or	while(true) {}
		int kor = 0;
		int eng = 0;
		int math = 0;
		ESCAPE :   // �ܾ�� �ƹ��ų� ���� ����
		while(true) {
			System.out.println("===== ���� �޴� =====");
			System.out.println("1. �����Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ����");
			System.out.println("���� : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("===== ���� �Է� =====");
				System.out.print("���� : ");
				kor = sc.nextInt();
				System.out.print("���� : ");
				eng = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				break;
			case 2 :
				System.out.println("===== ���� ��� =====");
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println(" ");
				int total = kor + eng + math;
				double avg = (double)total / 3;
				System.out.println("���� : " + total);
				System.out.printf("��� : %.2f" , avg);
				//printf �Ҽ��ڸ��� .2f ��� +�� �ƴ� , ���
				break;
			case 3 :
				System.out.println("Good Bye~");
				break ESCAPE;
			default :
				System.out.println("1 ~ 3 ������ ���� �Է����ּ���~");
				break;
			}
		}
		
	}
	static void ����Ʈ���() {
		
	}
}
