package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("D:\\Temp\\moomeok.png");
		String fileName	= file.getName(); 		// file.파일의 getName 이름을 불러와
		String path		= file.getPath();		// file.파일의 getPath 경로를 불러와
		String parent 	= file.getParent();		// file.파일의 fetParent 부모파일 경로는 뭐야
		
		System.out.println("파일 이름 : " + fileName);
		System.out.println("파일 경로 : " + path);
		System.out.println("부모 폴더 : " + parent);
		
		try {
			File fileMake = new File("src/iostream/fileOne.txt");
//		Unhandled exception type IOException
//			fileMake.createNewFile(); // 예외 처리
			File folderMake = new File("src/file");
//			folderMake.mkdir();		// 파일 생성
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();
			
			System.out.println("파일이 존재하는가? : " + fileMake.exists());
			System.out.println("fileOne.txt가 파일이 맞는가? : " + fileMake.isFile());
			System.out.println("file폴더가 폴더가 맞는가? : " + folderMake.isDirectory());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
