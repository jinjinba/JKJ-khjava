package com.kh.day14.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {
	private static String name;
	private static int age;
	private static String address;
	
	public static void main(String[] args) {
		end:
		while(true) {
			int choice = printMenu();
			switch(choice) {
				case 1 : insert(); break;
				case 2 : print(); break;
				case 3 : save(); break;
				case 4 : load(); break;
				case 0 : break end;
				default : System.out.println("1 ~ 4사이의 숫자를 입력해 주세요.");
			}
		}
		
	}
	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장(save 후 입력받은 이름이 파일명)");
		System.out.println("4. 정보불러오기(load 후 2번으로 출력)");
		System.out.println("0. 종료");
		System.out.print("메뉴 입력 : ");
		int select = sc.nextInt();
		return select;
	}
	
	static void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("주소 입력 : ");
		// sc.nextLine()쓸때 주의해야할 점은??
		sc.nextLine();    // 나이 입력 후 엔터를 치면 엔터값이 nextLine값으로 들어감
		address = sc.nextLine();
	}
	
	static void print() {
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("====== ====== ======");
	}
	
	static void save() {
		Writer os = null;
		
		try {
			String result = name + "/" + age + "/" + address;
			os = new FileWriter("src/iostream/" + name + ".txt");
			os.write(result);
			os.flush();
			System.out.println("저장완료되었습니다.");
			System.out.println("=== === === === === ===");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void load() {
		Reader reader = null;
		BufferedReader bfReader = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String fileName = sc.next();
		String result = "";
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
//			reader.read();
			result = bfReader.readLine();
			// result -> 일용자/22/서울시 중구
			// /를 기준으로 자르는 방법 2가지
			// 1. split() 스플릿 메소드, 2. StringTokenizer
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());  // age는 int이고 토큰은 스트링이기에 스트링으로 변환해줌
			address = st.nextToken();
			System.out.println("로드가 완료되었습니다!!");
			System.out.println("정보 출력 가능합니다. 2번을 눌러주세요.");
			System.out.println("=== === === === === ===");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

/* 
1. 정보입력
2. 정보출력
3. 정보저장(save)
4. 정보불러오기(load)
0. 종료
메뉴입력 : 1

이름입력 : 일용자
나이 입력 : 33
주소 입력 : 서울시 종로구

1. 정보입력
2. 정보출력
3. 정보저장(save)
4. 정보불러오기(load)
0. 종료
메뉴 입력 : 2

이름 : 일용자
나이 : 33
주소 : 서울시 종로구

3 선택하여 저장 후 파일을 열어보면
단 파일의 이름은 이름으로 한다.
일용자.txt -> 일용자/33/서울시 종로구
이용자.txt -> 이용자/22/서울시 중구
삼용자.txt -> 삼용자/11/서울시 서대문구

1. 4 선택후 파일의 제목을 입력하여 로드한 후에
2. 선택하면 정보가 출력됨.

이름 : 이용자
나이 : 22
주소 : 서울시 중구
*/