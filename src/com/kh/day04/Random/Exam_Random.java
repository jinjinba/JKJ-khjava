package com.kh.day04.Random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 50; i++) {
			// �ڡڡڡڡڡڡ�nextInt(n) -> 0���� n-1������ ������ �� ����!�ڡڡڡڡڡڡڡڡ�
			// 1���� 10������ �� �߿��� ������ ���� �̰� ������
			// nextInt(10)+1, �� +1�� ������ �����Ѵ�!!!!!!!!!!!
			System.out.println(rand.nextInt(16)+1); // 0���� 10 �̸����� ���
			// ex) 20���� 35������ �� �߿��� ������ ���� �̰� �ʹٸ�???
			// nextInt(??)+?? �ؾ��ұ��? 
			System.out.println(rand.nextInt(16)+20); 
			// 20���� 35���� 
			// 0���� 15���� -> next(??), ?? = (n-1 = 15), 
			// nextInt(16) + 20
			// 20���� 35���� 
			// 20�����̱� ������ �ڿ� +20�� ���� 35���� �����Ϸ��� (����)�� 20�� �������� 36�� �ǰ� �ؾ��Ѵ�
			// ex2.) 10���� 23������ �� �߿��� ������ ���� �̰� �ʹٸ�???
			// nextInt(??) + ??
			// 0���� 13���� -> nextInt(14) + 10
			
		}
	}
}
