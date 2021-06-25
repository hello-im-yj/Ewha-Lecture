/* 1748022 김유진
 * (예제1) File 클래스 - 디렉토리 검색 및 생성 등
 * */

package ex1;

import java.io.File;

public class FileTest2 {
	
	public static void listDirectory(File dir) {
		System.out.println("-----"+dir.getPath()+"의 서브리스트입니다. -----");
		File[] subFiles = dir.listFiles(); //pathname 배열로 리턴해주는 메소드
		//Returns an array of abstract pathnames 
		//denoting the files in the directory denoted by this abstract pathname. 
		for (int i =0;i<subFiles.length;i++) {
			File f = subFiles[i];
			long t = f.lastModified(); //마지막으로 수정된 시간 리턴
			//Returns the time that the file denoted by this abstract pathname was last modified. 
			System.out.println(f.getName());
			System.out.println("\t파일 크기: "+f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t,t,t,t);
		
		}
		
	}
	
	public static void main(String args[]) {
		File f1 = new File("c:\\windows\\system.ini"); //.ini??? -> 그냥 type의 한 종류
		System.out.println(f1.getPath()+","+f1.getParent()+","+f1.getName());
		//c:\windows\system.ini, # 경로명
		//c:\windows, # 상위디렉토리
		//system.ini # This is just the last name in the pathname's name sequence.
		
		String res = "";
		if(f1.isFile()) res = "파일";
		else if (f1.isDirectory()) res = "디렉토리";
		System.out.println(f1.getPath()+"은 "+res+"입니다.");
		
		File f2 = new File("c:\\Temp\\java_sample");
		if(!f2.exists()) f2.mkdir();
		
		listDirectory(new File("C:\\Temp"));
		f2.renameTo(new File("C:\\Temp\\javasample")); 
		listDirectory(new File("C:\\Temp"));
		
	}

}
