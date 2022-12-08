package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;			// Reader을 임포트 함으로 문자기반으로 읽음

public class Exam_Read {

	public static void main(String[] args) {
		// 바이트 기반 스트림 
		InputStream is = null;
		// 문자 기반 스트림    // 문자 기준으로 문자 단위로 읽어 InputStream과 다르게 깨지지 않음.
		Reader reader = null;
		try {
			// Unhandled exception type FileNotFoundException
			reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				// Unhandled exception type IOException
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// finally는 반드시 실행되어야 하는 코드 작성
			// Unhandled exception type IOException
			try {
				reader.close();   // 어디서 끝나든 스트림을 닫아줄 수 있음.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
