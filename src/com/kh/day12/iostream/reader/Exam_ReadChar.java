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
				readCharNo = reader.read(cbuf); // �������� cbuf�� �ְ� ������ readCharNo�� ��
				if(readCharNo == -1) break;		// �߰��� ������ ������ �׸� ���� ��°�!
				data += new String(cbuf, 0, readCharNo);	// ���ڿ��� �ٲ��� (�ڹ� ���� �迭��, 0 ù�������, �迭2�ϱ� 2��);
				// +=�� ����� �����͵��� ������ �Ǿ� �����. =�� �ҽÿ��� ������ �ȵǾ� �� ���ڸ� ���.
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
