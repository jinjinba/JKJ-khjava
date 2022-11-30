package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		// 1. 2 * 1 = 2, 2 * 2 = 4, 2 * 3 = 6, ...
		
		// 2. 2 * 1 = 2, 3 * 1 = 3, 4 * 1 = 4, ...
		
		// 3. 2 * 1 = 2, 3 * 1 = 3, 4 * 1 = 4, ...
		//    2 * 2 = 4, 3 * 2 = 6, 4 * 2 = 8, ...     
		for(int i =1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j +" * " + i + " = " + j * i + "\t"); 
				//i와 j 무엇이 앞에 오느냐에 따라 정열이 바뀜.
				// \t는 탭키와 동일, \t를 사용하여 구분 해줌.
			}
			System.out.println(); // <-으로 계행 (줄바꿈)
		}
		
	}
}
