package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;			// Reader�� ����Ʈ ������ ���ڱ������ ����

public class Exam_Read {

	public static void main(String[] args) {
		// ����Ʈ ��� ��Ʈ�� 
		InputStream is = null;
		// ���� ��� ��Ʈ��    // ���� �������� ���� ������ �о� InputStream�� �ٸ��� ������ ����.
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
			// finally�� �ݵ�� ����Ǿ�� �ϴ� �ڵ� �ۼ�
			// Unhandled exception type IOException
			try {
				reader.close();   // ��� ������ ��Ʈ���� �ݾ��� �� ����.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
