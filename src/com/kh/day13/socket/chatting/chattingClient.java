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
			System.out.println("서버에 연결중입니다...");
			socket = new Socket(address,port);
			System.out.println("채팅서버에 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다.");
			while(true) {
				// 받기
//				byte [] buf = new byte[100];
//				int readNo = is.read(buf);
//				String recvMsg = new String(buf,0,readNo);
				String recvMsg = dis.readUTF();
				System.out.println("서버(상대) : " + recvMsg);
				
				// 보내기
				System.out.println("클라이언트(나) : ");
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
