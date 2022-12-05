package com.kh.day09.point;

public class ColorPointEx {
	public static void main(String [] args) {
//		ColorPoint cp = new ColorPoint();
//		colorpoint에 기본생성자가 없으면 (The constructor ColorPoint() is undefined)오류가 뜸
//		cp.set(3,4); // Point의 set() 호출
//		cp.setColor("red");	// ColorPoint의 setColor() 호출
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint(); // 여기서 위의 컬러와 좌표 출력
	}
}
//	5강 7번 ppt 확인