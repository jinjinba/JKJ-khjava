package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortSelect {
	public static void main(String [] args) {
		// 알고리즘 정렬
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 선택정렬이란? (a[0]~a[10] a[0]이 전부 검색하고 그다음 a[1]이 전부 검색하는 방식
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 특징 : 데이터 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		// 데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스 값을 n+1번 ~ 마지막 인덱스 까지 비교함.
		// i = 0일때
		// 1. 5. 4. 2. 3 // 첫번째 결과
		// i = 1일때
		// 1, 2, 4, 5, 3 // 두번째 결과
		// i = 2일때 
		// 1, 2, 3, 5, 4 // 세번째 결과
		// i = 3일때
		// 1, 2, 3, 4, 5 // 네번째 결과
		// {2, 5, 4, 1, 3};
		int [] arrs = {2, 5, 4, 1, 3};
		int min; // 인덱스 값 저장
		for(int i = 0; i < arrs.length; i++) {
			min = i; // 가장 작을때 인덱스 값
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;        // j가 3이니 min = 3
				}
				System.out.printf("i = %d, j = %d, min = %d : ", i, j, min);
				System.out.println(Arrays.toString(arrs));

			}
			int temp = arrs[min];   // arrs[3] = 1이기때문에 int temp = 1 
			//  1    = arrs[3] 
			arrs[min] = arrs[i];	// arrs[i(=0)]= 2 = arrs[min(=3)], arrs[3] = 2
			//arrs[3] = 2
			arrs[i] = temp;			// arrs[i(=0)]은 temp가 1이니 1이 됨
			//arrs[0] = 1
			System.out.printf("			");
			System.out.println(Arrays.toString(arrs));
			System.out.println();

			
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
