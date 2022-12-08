package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Exam_WriteStr {
	public static void main(String[] args) {
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "����Ŭ�� ���� �������";
			String data1 = "\n";
			String data2 = "����Ŭ�� ���� �������";
			writer.write(data);
			writer.write(data1);
			writer.write(data2);
			writer.flush();
			System.out.println("���� �Ϸ�!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
