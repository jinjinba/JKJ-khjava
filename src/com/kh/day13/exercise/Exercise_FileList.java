package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "의 서브 리스트 입니다.------");
		File [] subFiles = dir.listFiles();  // listFiles 배열스타일을 맞추려 []해줌
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
//			System.out.println(fOne.getName());
			System.out.printf("%30s",fOne.getName());
			//               %30s = 문자열 크기를 30개로 맞추겠다는 뜻
//			System.out.println("\t파일 크기 : " + fOne.length());
			System.out.print("\t파일 크기 : " + fOne.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n",time,time,time,time);
		}//									   월   일 요일 시간
	}
	
	public static void main(String [] args) {
		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
		
	}
}
