package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void parserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		// 두 값을 계산해서 출력하시오
		// 결과 : 9379
//		The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		// 
		System.out.println("결과 : " + result);
	}
	
	public  void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3	= "SPRING";
		
		// 제 6강 38p 참조!!!!!!!!!
		
		// 1. strData를 byte, short, int, long으로 변환하시오.
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);
		// 2. strData2를 float, double로 변환하시오.
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		// 3. strData3을 char로 변환하시오.
		char word = strData3.charAt(0); 
		// 문자열을 캐릭터로 바꾸는것은 위에 한가지 방법 뿐임
		
		
	}
}
