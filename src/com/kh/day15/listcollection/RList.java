package com.kh.day15.listcollection;

public class RList<T> {  // <> : 제네릭이라고 한다  아무거나 들어갈 수 있어요라는 표시
	private Object [] objects;	// int는 Object로 nums는 objects로 바꿔줌
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		objects[size] = input;
		size++;
	}
	// 리턴값이 있으면 (return)리턴값의 자료형을
	// 메소드 반환형에 적어줌.
	public T get(int index) {
		return (T)objects[index]; // nums[0] -> 1
	}
	
	public Object size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
