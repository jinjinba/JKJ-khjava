package com.kh.day09.overriding;

public class MeyhodOverridingEx {

	static void paint(Shape p)	{
//		 Shape p = new Shape();
		p.draw();
	}
	
	public static void main(String[] args) {
		 Line line = new Line(); 
//		 line.draw(); // �������̵� ȣ��
		 paint(line);
		 paint(new Rect());
		 paint(new Circle());
	}

}
