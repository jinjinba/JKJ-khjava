package com.kh.day11.wrapperex;

public class 연습 {
		public void parserExample() {
			String strNum = "221123";
			String strNum2 = "230502";
			// 두 값을 계산해서 출력하시오
			// 결과 : 9379
			int result = Integer.parseInt(strNum) - Integer.parseInt(strNum2);
			System.out.println(result);
		}
		public  void dataParsingExample() {
			String strData = "13";
			String strData2 = "23.502";
			String strData3	= "SPRING";
			// 1. strData를 byte, short, int, long으로 변환하시오.
			byte bNum = Byte.parseByte(strData);
			short sNum = Short.parseShort(strData);
			int iNum =Integer.parseInt(strData);
			long lNum = Long.parseLong(strData);
			// 2. strData2를 float, double로 변환하시오.
			float fNum = Float.parseFloat(strData2);
			double dNum = Double.parseDouble(strData2);
			// 3. strData3을 char로 변환하시오.
			char word = strData3.charAt(0);
			// Wrapper 클래스 외우자 
		}
}
