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
		// -> �ݵ�� try ~ catch ����� �ϴ� Exception
			try {
				is = new FileInputStream("src/iostream/inputStream.txt"); // �ҷ����� ���� ������ ��θ� �����־����
				// Unhandled exception type IOException
				int readByte;
				while(true) {
					readByte = is.read();
					// ������ �׸� �е����ϴ� �ڵ带 �־����!!
					if(readByte == -1) break;	// ������ �׸� �е��� -1���� �־���
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
