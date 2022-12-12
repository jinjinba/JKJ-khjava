package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {
	public static void main(String [] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8989;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			System.out.println("������ ����Ǿ��ֽ��ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os); 
			while(true) {
				// ����(��ĭ���� ��� �Է�, �� 24 + 42) >> 12 + 1
				// 1. �Է¹ޱ�
				System.out.print("����(��ĭ���� ��� �Է�, �� 24 + 42) >> ");
				String inputVal = sc.nextLine(); // �����Է� �޾ƾ��ϱ� ������ nextLine
				// 2. ������
				dos.writeUTF(inputVal);  // ������ �������ϱ⿡ writeUTF():
				if(inputVal.equalsIgnoreCase("bye")) {
					System.out.println("�����Ͽ����ϴ�.");
					break;
				}
				// ������ ��
				// ����� : 13
				String resultMsg = dis.readUTF();
				if(resultMsg.equalsIgnoreCase("end")) {
					System.out.println("�߸� �Է��Ͽ����ϴ�. ���Ŀ� �°� �Է����ּ���");
					continue;  // �� �κ��� ���� �ٽ� ��������
				}
				System.out.println("����� : " + resultMsg);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
