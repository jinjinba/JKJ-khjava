package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {				//class serverProgram 부터 실행
	public static void main(String[] args) {
		Socket socket = null;
		// 데이터 보낼 때 사용해야하는 스트림은?
		// 1. IO스트림
		// 2. 입력스트림
		// 3. 출력스트림
		InputStream is = null;
		OutputStream os = null;
		
		try {
//		Unhandled exception type IOException, UnknownHostException
			System.out.println("연결 요청");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결성공!!");
			//////////// 데이터 보내기 //////////////
			byte [] buf = null;
			String message = "";
			os = socket.getOutputStream();
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			// 데이터 보내기부터 여기까지는 헬로서버를 보내고 있음
			////////////////////////////////////////  
			
			/////////////// 데이터 받기 /////////////////
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			//////////////////////////////////////////////////
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
