package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortSelect {
	public static void main(String [] args) {
		// �˰��� ����
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���������̶�? (a[0]~a[10] a[0]�� ���� �˻��ϰ� �״��� a[1]�� ���� �˻��ϴ� ���
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����������
		// ������ ���� ���� �� �ް��� ���� ���ϸ� ����.
		// �迭�� n�� �ε��� ���� n+1�� ~ ������ �ε��� ���� ����.
		// i = 0�϶�
		// 1. 5. 4. 2. 3 // ù��° ���
		// i = 1�϶�
		// 1, 2, 4, 5, 3 // �ι�° ���
		// i = 2�϶� 
		// 1, 2, 3, 5, 4 // ����° ���
		// i = 3�϶�
		// 1, 2, 3, 4, 5 // �׹�° ���
		// {2, 5, 4, 1, 3};
		int [] arrs = {2, 5, 4, 1, 3};
		int min; // �ε��� �� ����
		for(int i = 0; i < arrs.length; i++) {
			min = i; // ���� ������ �ε��� ��
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;        // j�� 3�̴� min = 3
				}
				System.out.printf("i = %d, j = %d, min = %d : ", i, j, min);
				System.out.println(Arrays.toString(arrs));

			}
			int temp = arrs[min];   // arrs[3] = 1�̱⶧���� int temp = 1 
			//  1    = arrs[3] 
			arrs[min] = arrs[i];	// arrs[i(=0)]= 2 = arrs[min(=3)], arrs[3] = 2
			//arrs[3] = 2
			arrs[i] = temp;			// arrs[i(=0)]�� temp�� 1�̴� 1�� ��
			//arrs[0] = 1
			System.out.printf("			");
			System.out.println(Arrays.toString(arrs));
			System.out.println();

			
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
