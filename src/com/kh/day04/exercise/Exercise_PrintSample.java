package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main(String [] args) {
		// System.out.println���� ���� + ���ڿ� -> ���ڿ�
		System.out.println(1+"1"); // ""�� ���ڿ� ''�� ���� ����� �ȵ�
		// ���� + ���� -> ����
		System.out.println('1' + '1'); //1�̶�� ���ڴ� �ƽ�Ű �ڵ�� ���� 49�� �ν�
		// ���� + ���� + ���ڿ� + ���� -> ���������δ� ���ڿ�
		System.out.println(10 + 20 + "Hello" + 10);
		
		//printf�� ���Ͽ� �˾ƺ���
		//println, print -> �ٹٲ��� ����
		System.out.print("���� �Է� : "); // �ٷ� ���� �Է¹���.
		System.out.println("���� �Է� : ");	 //�ٹٲٰ� �Է¹���.
		System.out.printf("���� ��� : %d \n", 1); // ������� %d�� ��ġ�� ����, \n�� �� �ٲ�
		System.out.printf("���ڿ� ��� : %s", "HelloWorld"); //���ڿ��̸� %s, String ���� 
	}
}
