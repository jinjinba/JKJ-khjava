package com.kh.day15.listcollection;

public class RList<T> {  // <> : ���׸��̶�� �Ѵ�  �ƹ��ų� �� �� �־���� ǥ��
	private Object [] objects;	// int�� Object�� nums�� objects�� �ٲ���
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		objects[size] = input;
		size++;
	}
	// ���ϰ��� ������ (return)���ϰ��� �ڷ�����
	// �޼ҵ� ��ȯ���� ������.
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
