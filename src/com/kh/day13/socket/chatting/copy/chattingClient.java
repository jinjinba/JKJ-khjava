package com.kh.day13.socket.chatting.copy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class chattingClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;
		try {
			System.out.println("연결요청");
			socket = new Socket("127.0.0.1", 8502);
			System.out.println("연결성공!!!");
			// 데이터 보내기
			byte[] bytes = null;
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Server");
//			bytes = "Hello Server".getBytes();
//			os.write(bytes);
			System.out.println("데이터 전송 완료");
			// 데이터 보내기 완료
			
			// 데이터 받기
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println("데이터 받기 성공 : " + message);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
