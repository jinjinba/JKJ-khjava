package com.kh.day10.exercise;

//The type GoodCalc must implement 
//the inherited abstract method Calculator.add(int, int)

public class GoodCalc extends Calculator {
	public static void main(String [] args) {
		GoodCalc calc = new GoodCalc();
		int [] a = {1,2,3,4,7};
//		int [] a = new int [5];
//				a[0] = a[1] = a[2] = a[3] = a[4] = 1;
		System.out.println("ÇÕ : " + calc.add(1, 2));
		System.out.println("Â÷ : " + calc.substract(5, 2));
		System.out.println("Æò±Õ : " + calc.average(a));
	}

	@Override
	public int add(int a, int b) {	// ´õÇØ¶ó
		int result = a + b;
		return result;
	}

	@Override
	public int substract(int a, int b) {	//»©¶ó
		int result = a - b;
		return result;
	}

	@Override
	public double average(int [] a) {	
//		{1, 2, 3} -> {1,2,3,4,5}
		int sum = 0;
		for(int i = 0; i < a.length; i ++) {
			sum += a[i];
		}
		double avg = sum/(double)a.length;
		return avg;
			
	}
}
