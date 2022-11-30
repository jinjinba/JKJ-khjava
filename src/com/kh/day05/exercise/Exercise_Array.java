package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array { //Array �迭 ���� ���� �ϱ�!
	public void exercise1() {
//���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
//������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		//int [] nums     ����
		int [] nums = new int[100];  //�Ҵ�
		for(int i = 0; i<nums.length; i++) {
			nums[i] = i;			//i�� i���� ��Ÿ����
			System.out.print(nums[i] + " ");
		}
	}
	public void exercise2() {
// ���̰� 5�� String �迭�� �����ϰ� 
// "����", "������", "Ű��", "���", "�ٳ���"��
// �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ����غ�����!
//		String [] fruits ���� = new String[5]; �Ҵ�
		String [] fruits = new String[5];	//5���� ĭ�� ����ų� ��������;
//		�ڵ���̵�
		fruits[0] = "����";
		fruits[1] = "������";
		fruits[2] = "Ű��";
		fruits[3] = "���";
		fruits[4] = "�ٳ���";
		// ���� �� ���ϰ� ! -> �Ҵ�� �ʱ�ȭ ���ÿ�!!!!!!!
		// 5 �迭�� {}�߰�ȣ�� �ٷιٷ� �Ҵ�!
		String [] fruitGoods = {"����", "������", "Ű��", "���", "�ٳ���"};
		for(int i = 0; i < fruits.length; i++) {
			if(fruitGoods[i] == "�ٳ���") {
				System.out.print(fruits[i] + " "); 	// -> [0]~[4]���� ���; 	
			}
		}
	}
	public void exercise3() {
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		 * �Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		int [] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� 5���� �Է����ּ��� : ");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i]; //���մ��Կ�����, ������
		}
		// ����� ���� / �������� ����, 1,2 -> (1+2)/2 = 1.5
		System.out.println("����� " + (double)sum / arrs.length + "�Դϴ�.");
	}
	public void exercise4() {
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		 * ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		int [] nums = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5���� �Է��ϼ��� : ");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
	}
	public void exercise5() {


/*
 * ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
 * ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
 * 210618-1124600 -> 210618-1******
 * 200518-3233920 -> 200518-3******
 */
		Scanner sc = new Scanner(System.in);
		char [] origin = new char[14];
		System.out.print("�ֹε�Ϲ�ȣ �Է� (-����) : ");
		String memberNum = sc.next();
		// String���� �Է¹��� ���� �ϳ��� �߶� origin ���� �迭�� �ֱ�!
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i); //�ϳ��� �ڸ����� ĳ����(charAt(i);)�� ���
			//System.out.print(origin[i]);
		}
		//char [] copy = origin;     //���� ����, �̷��� �ǵ��� ���� �ƴ�;
		char [] copy = new char[14]; //���� ������ ����!!!!! new�� �̿��� ���ο���� �Ҵ�.
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {		//0~7 8���� �����̱⿡ ������
				copy[i] = origin[i];
			}else { 		//�� ���Ŀ��� *��
				copy[i] = '*';
			}
			System.out.print(copy[i]);    //�����Ѱ� ����
		}
		System.out.println();
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);   // �������
		}
	
	}
	public void exercise6() {
		// forRach��1
		int [] nums = {1, 2, 3, 4, 5};	// �Ҵ�� �ʱ�ȭ ���ÿ� 
		// int [] nums = new int[5];�ε� ������ nums[0] = ? �ϳ��ϳ� ���� ���־����
		for(int num : nums) {	// nums���� num�� �ְ� �ݺ��ϴ� ������ ���
			System.out.print(num + " ");
		}
	}
	public void exercise7() {
		// forEach��2
		String [] fruits = {"����", "������", "����", "ü��", "����"};
		for(String fruit : fruits) {	//for(int i=0; i < fruits.length; i++) {
			System.out.print(fruit + " ");
		}
	}
	
}