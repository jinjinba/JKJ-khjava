package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		// Cannot instantiate the type InputStream
		
		InputStream is = null;
		
		// Ungandled exception type FileNotFoundException -> checjed Exception
		// -> 반드시 try ~ catch 해줘야 하는 Exception
			try {
				is = new FileInputStream("src/iostream/inputStream.txt"); // 불러오고 싶은 파일의 경로를 적어주어야함
				// Unhandled exception type IOException
				int readByte;
				while(true) {
					readByte = is.read();
					// 없으면 그만 읽도록하는 코드를 넣어야해!!
					if(readByte == -1) break;	// 없으면 그만 읽도록 -1값을 넣어줌
					// Unreachable code
					System.out.print((char)readByte);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
