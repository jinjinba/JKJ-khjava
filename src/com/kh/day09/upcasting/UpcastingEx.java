package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String [] args) {
		Person p;
		Student s = new Student("�Ͽ���");
//		p = new Person("");
		p = s; // ��ĳ����
		
		System.out.println(p.name); // p.�ϸ� �θ�Ŭ����, ����Ŭ������ ���� ���������� Student ��, �ڽ� Ŭ������ ����.
		
//		System.out.println(p.grade);		// Stuent �ڽ�Ŭ������ ��� ����
//		grade cannot be resolved or is not a field
//		System.out.println(p.department);	// Stuent �ڽ�Ŭ������ ��� ����
//		department cannot be resolved or is not a field
		
		// �ٿ�ĳ����
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
	}
}
