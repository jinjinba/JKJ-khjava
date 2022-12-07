package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt"); // outputStream.txt에 출력됨
			byte [] data = "JAVAscript".getBytes(); // JAVAscript자리 입력하면 데이터 발생
			os.write(data, 4, 6);
			os.flush();
			System.out.println("Write 완료!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
