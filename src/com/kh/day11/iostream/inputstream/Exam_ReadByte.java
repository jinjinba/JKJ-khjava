package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");  // 업캐스팅
			int readByteNo;
			byte [] readBytes = new byte[3];
			String data = "";
//			while((readByteNo = is.read(readBytes)) != -1) {	// 이렇게도 사용가능
			while(true) {
				readByteNo = is.read(readBytes); // readByteNo는 읽은 갯수 // readBytes에 ABCDE가 있음
				if(readByteNo == -1) break;		// 없을때까지 읽어!!!!!
				data += new String(readBytes, 0, readByteNo); // String로 형변환 해주어 알파벳 출력
			}
			System.out.println(data);	// 출력해서 끝!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
