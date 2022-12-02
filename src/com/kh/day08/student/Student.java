package com.kh.day08.student;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {
		this(0,0);
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int firstScore, int secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	// getter 메소드
	public String getName() { //void 바뀜
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}

	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

		
	


}
