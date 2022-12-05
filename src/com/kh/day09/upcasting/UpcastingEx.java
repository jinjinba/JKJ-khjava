package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String [] args) {
		Person p;
		Student s = new Student("일용자");
//		p = new Person("");
		p = s; // 업캐스팅
		
		System.out.println(p.name); // p.하면 부모클래스, 조상클래스는 접근 가능하지만 Student 즉, 자식 클래스는 없다.
		
//		System.out.println(p.grade);		// Stuent 자식클래스는 사용 못함
//		grade cannot be resolved or is not a field
//		System.out.println(p.department);	// Stuent 자식클래스는 사용 못함
//		department cannot be resolved or is not a field
		
		// 다운캐스팅
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
	}
}
