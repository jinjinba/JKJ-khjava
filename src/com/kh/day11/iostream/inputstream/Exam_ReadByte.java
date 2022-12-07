package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");  // ��ĳ����
			int readByteNo;
			byte [] readBytes = new byte[3];
			String data = "";
//			while((readByteNo = is.read(readBytes)) != -1) {	// �̷��Ե� ��밡��
			while(true) {
				readByteNo = is.read(readBytes); // readByteNo�� ���� ���� // readBytes�� ABCDE�� ����
				if(readByteNo == -1) break;		// ���������� �о�!!!!!
				data += new String(readBytes, 0, readByteNo); // String�� ����ȯ ���־� ���ĺ� ���
			}
			System.out.println(data);	// ����ؼ� ��!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
