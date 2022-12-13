package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
//		Run run = new Run();
//		run.intExample();
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
		
		List<Integer> list = null;
		
		list = new ArrayList<Integer>(); // 업캐스팅이 가능 
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);
		
		int size = list.size();
		System.out.println("size : " + size);
		
		System.out.println("1번째 값 : " + list.get(0)); // 0번째 값을 get로 가져옴 
		
		list.add(2023);
		System.out.println("size : " + list.size());
//		list.clear();
//		System.out.println("size : " + list.size());
		System.out.println("~~~ 출력하겠습니다 ~~~");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 값 : " + list.get(i));
		}
		
		list.add(2, 2022);  // 3번째 값으로 들어가고 다른것들의 값이 밀린다.
		
		System.out.println("~~~ Foreach로 출력하겠습니다 ~~~");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		list.set(4, 7); // set으로 5번째 값을 7로 수정하고 했다.
		
		System.out.println("~~~ 다시한번 출력하겠습니다 ~~~");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
	}
	
	public void genericExample() { // 제네릭 
		RList<Integer> list = new RList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		
		int num = list.get(0);
		num = list.get(1);
		
		System.out.println("num : " + num);
	}
	
	public void objectExample() {
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("월");
		list.add(new Student()); // 스튜던트 클래스 만든 후 오류 방지용으로 만듬 
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
		
	}
	
	public void intExample() {
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("첫번째 : " + list.get(0));
		System.out.println("두번째 : " + list.get(1));
		System.out.println("세번째 : " + list.get(2));
		System.out.println("크기 : " + list.size());
		// 삭제하기
		list.clear();
		System.out.println("크기 : " + list.size());
	}
}
