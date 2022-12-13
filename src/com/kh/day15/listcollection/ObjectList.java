package com.kh.day15.listcollection;

public class ObjectList {
	private Object [] objects;	// int�� Object�� nums�� objects�� �ٲ���
	private int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	// ���ϰ��� ������ (return)���ϰ��� �ڷ�����
	// �޼ҵ� ��ȯ���� ������.
	public Object get(int index) {
		return objects[index]; // nums[0] -> 1
	}
	
	public Object size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}