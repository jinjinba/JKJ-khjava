package com.kh.day09.insof;

public class InstanceOfEx {			//���ذ� �ȵȴٸ� StudentŬ�������� Student�� ������
		static void print(Person p) {
//			Person p = new Strdent();
//			if(p instanceof Person)
//				System.out.println("Person�Դϴ�!");
			if(p instanceof Student)
				System.out.println("Student�Դϴ�!");
			if(p instanceof Researcher)
				System.out.println("Researcher�Դϴ�!");
			if(p instanceof Professor) {
				System.out.println("Professor�Դϴ�."); //Researcher�� ��ӹ޾ұ� ������  �������� ���� ���
			}
		}
		
		public static void main(String [] args) {
//			print(new Person());
			print(new Student()); //������ �ȳ��ٸ� upcasting�� �Ȱ���
			print(new Researcher());
			print(new Professor()); 
	}
}
