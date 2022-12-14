package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
	public static void main(String[] args) {
		// Collection의 List,Set, Map 저장소의 역할을 한다
		// 임시또는 영구적으로 저장을 함
		// 자료구조의 특성에 따라서 List, Set, Map을 선택하여 쓸 수 있음.
		
		Set<Student> set3 = new HashSet<Student>();
		Student kdw = new Student("강동원", 35, 100);
		set3.add(new Student("정우성", 55, 70));
		set3.add(new Student("소지섭", 60, 80));
		set3.add(kdw); 
		System.out.println("데이터의 크기 : " + set3.size());
		set3.add(kdw);		//해쉬코드 값이 달라 같은 데이터라 생각하지 않음
		System.out.println("데이터 크기 : " + set3.size());
		set3.add(kdw);
		System.out.println("데이터 크기 : " + set3.size());
		
		System.out.println(kdw.getName() + ", " + kdw.getScore1() + ", " + kdw.getScore2());
		System.out.println(new Student("강동원", 35, 100).hashCode());
		System.out.println(new Student("강동원", 35, 100).hashCode());
		System.out.println(new Student("강동원", 35, 100).hashCode());	
		//Student클래스에서 hashCode값을 같게 해줌
	}
	
	public void setExample1() {
		Set<String> set = new HashSet<String>();		// Set 임포트 제네릭
		set.add("one");
		set.add("two");
		set.add("three");
		System.out.println("저장된 데이터의 수 : " + set.size());
		Iterator<String> iterator = set.iterator(); 	// Iterator은 12번줄의 set에 접근해 하나씩 가져옴
		while(iterator.hasNext()) {		
			System.out.println(iterator.next());
		}
		set.add("one");	// 중복을 허용하지 않음.
		System.out.println("=== === === === === ===");
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
	
	public void setExample2() {
		Set<Integer> set2 = new HashSet<Integer>();
//		set2.add(11);
//		set2.add(23);
	}
	
}
