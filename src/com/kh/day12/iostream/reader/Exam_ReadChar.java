package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/ioStream/filereader.txt");
			int readCharNo;
			char [] cbuf = new char[2];
			String data = "";
			while(true) {
				readCharNo = reader.read(cbuf); // 읽은것은 cbuf에 있고 갯수는 readCharNo로 들어감
				if(readCharNo == -1) break;		// 중간에 읽을게 없으면 그만 나와 라는것!
				data += new String(cbuf, 0, readCharNo);	// 문자열로 바꿔줌 (자바 문자 배열을, 0 첫번재부터, 배열2니까 2개);
				// +=을 해줘야 읽은것들이 누적이 되어 출려됨. =만 할시에는 누적이 안되어 끝 글자만 출력.
			}
			// data cannot be resolved to a variable
			// Unreachable code
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
