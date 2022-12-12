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
			System.out.println("서버와 연결되어있습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os); 
			while(true) {
				// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 12 + 1
				// 1. 입력받기
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String inputVal = sc.nextLine(); // 공백입력 받아야하기 때문에 nextLine
				// 2. 보내기
				dos.writeUTF(inputVal);  // 쓴것을 보내야하기에 writeUTF():
				if(inputVal.equalsIgnoreCase("bye")) {
					System.out.println("종료하였습니다.");
					break;
				}
				// 보내기 끝
				// 계산결과 : 13
				String resultMsg = dis.readUTF();
				if(resultMsg.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하였습니다. 형식에 맞게 입력해주세요");
					continue;  // 밑 부분은 빼고 다시 위에부터
				}
				System.out.println("계산결과 : " + resultMsg);
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
