package com.kh.day09.insof;

public class InstanceOfEx {			//이해가 안된다면 Student클레스에서 Student를 뺴보셈
		static void print(Person p) {
//			Person p = new Strdent();
//			if(p instanceof Person)
//				System.out.println("Person입니다!");
			if(p instanceof Student)
				System.out.println("Student입니다!");
			if(p instanceof Researcher)
				System.out.println("Researcher입니다!");
			if(p instanceof Professor) {
				System.out.println("Professor입니다."); //Researcher를 상속받았기 때문에  위에껏도 같이 출력
			}
		}
		
		public static void main(String [] args) {
//			print(new Person());
			print(new Student()); //오류가 안난다면 upcasting이 된거임
			print(new Researcher());
			print(new Professor()); 
	}
}
