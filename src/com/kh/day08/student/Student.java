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
	
	// getter �޼ҵ�
	public String getName() { //void �ٲ�
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}

	// setter �޼ҵ�
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