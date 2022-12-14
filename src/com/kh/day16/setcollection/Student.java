package com.kh.day16.setcollection;

public class Student {
	private String name;
	private int score1;
	private int score2;
	
	public Student() {   // 우클릭 generate constructor을 선택하여 다 빼고! 제네레이트
		super();
	}


	public Student(String name, int score1, int score2) {
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;	//우클릭 generate constructor을 선택하여 다 체크! 제네레이트
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore1() {
		return score1;
	}


	public void setScore1(int score1) {
		this.score1 = score1;
	}


	public int getScore2() {
		return score2;
	}


	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	@Override
	public int hashCode() {		//해쉬코드 오버라이드	같게
		// TODO Auto-generated method stub
		return (this.name+this.score1+this.score2).hashCode();
		// SetRun클래스의 해쉬코드 값을 같게 만들어줌.
	}
	
	public String information() {
		return "name : " + this.name + ", score1 : " + this.score1 + ", score2" + this.score2;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score1=" + score1 + ", score2=" + score2 + "]";
	}

	@Override
	public boolean equals(Object obj) {	// 이퀄스 오버라이드	같은지 비교
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.hashCode() == std.hashCode(); 
			// SetRun클래스의 강동원이 똑같은 값으로 맞는지 비교하게 해줌.
		}
		return false;
	}
	
}
