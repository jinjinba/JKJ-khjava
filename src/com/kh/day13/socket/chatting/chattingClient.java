package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class chattingClient {

	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
//		String address = "192.168.60.32";
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("������ �������Դϴ�...");
			socket = new Socket(address,port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("�������� ä���� �����մϴ�.");
			while(true) {
				// �ޱ�
//				byte [] buf = new byte[100];
//				int readNo = is.read(buf);
//				String recvMsg = new String(buf,0,readNo);
				String recvMsg = dis.readUTF();
				System.out.println("����(���) : " + recvMsg);
				
				// ������
				System.out.println("Ŭ���̾�Ʈ(��) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
//				buf = sendMsg.getBytes();
//				os.write(buf);
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