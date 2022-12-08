package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;
									
public class Exercise_IOStream {	// �޸��� �ۼ�
	public void  fileCopy() {
		// �̹��� ���� ����
		// c:\\img\\moomeokpan.png -> D:\\moomeok.png  //���� ���� �ٿ��ֱ�
		// ����Ʈ ��� �Է½�Ʈ��
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("c:\\img\\moomeokpan.png"); // c����̺� �ȿ� img���� �ȿ� �������̹���
			os = new FileOutputStream("D:\\moomeok.png");		// d����̺꿡 ������ �̹���
			byte [] readBytes = new  byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) {	//���� �б� ����
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void memoFileMake() {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */
		Scanner sc = new Scanner(System.in);	
		System.out.print("������ ���ϸ� �Է� : ");	//1��
		String fileName = sc.next();
		// ���� ���� -> ���� ����°� ��Ʈ������ ��� ����?
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println("'" + fileName + "'���Ͽ� ����� ���� �Է�"); //2��
			System.out.println("����� exit");
			sc.nextLine();
//			for(int i = 0; i < 10; i++)  //for���� ���Ѱ��� �ֱ⿡ ���� �ȵȴ�.
			int i = 1;
			while(true) {
				System.out.print(i + " : ");
				String input = sc.nextLine() + "\n";
				if("exit\n".equals(input)) break;
//				if("exit".contentEquals(input.trim())) break;
				writer.write(input);
				i++;					// ������ �ݺ��ؾ����� �����ϰ� �־�
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
