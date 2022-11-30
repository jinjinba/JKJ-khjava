package com.kh.day04.Random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 50; i++) {
			// ★★★★★★★nextInt(n) -> 0부터 n-1까지의 랜덤한 수 리턴!★★★★★★★★★
			// 1부터 10까지의 수 중에서 랜덤한 수를 뽑고 시으면
			// nextInt(10)+1, 즉 +1로 범위를 조정한다!!!!!!!!!!!
			System.out.println(rand.nextInt(16)+1); // 0부터 10 미만까지 출력
			// ex) 20부터 35사이의 수 중에서 랜덤한 수를 뽑고 싶다면???
			// nextInt(??)+?? 해야할까요? 
			System.out.println(rand.nextInt(16)+20); 
			// 20부터 35사이 
			// 0부터 15사이 -> next(??), ?? = (n-1 = 15), 
			// nextInt(16) + 20
			// 20부터 35사이 
			// 20부터이기 때문에 뒤에 +20이 오고 35까지 포함하려면 (여기)에 20을 더했을때 36이 되게 해야한다
			// ex2.) 10부터 23사이의 수 중에서 랜덤한 수를 뽑고 싶다면???
			// nextInt(??) + ??
			// 0부터 13사이 -> nextInt(14) + 10
			
		}
	}
}
