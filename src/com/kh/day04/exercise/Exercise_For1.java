package com.kh.day04.exercise;

public class Exercise_For1 {
	public static void main(String[] args) {
		// 누적합(가장기본적이고 자주 사용)
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println(sum);
	}
}
