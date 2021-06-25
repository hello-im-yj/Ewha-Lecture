/* 1748022 김유진
 * (예제2) 텍스트 파일 복사
 * */


package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	
	public static void main (String args[]) {//인코딩,디코딩은 ANSI로.
		File src = new File("C:\\javalab\\lab9.txt");//원본
		File dest = new File("C:\\javalab\\myinfo.txt");//복사본
		
		int c;
		
		try {
			FileReader fr = new FileReader(src); //입력스트림
			FileWriter fw = new FileWriter(dest); //출력스트림
			
			System.out.println(fr.getEncoding()); //MS949
			System.out.println(fw.getEncoding()); //MS949
			
			while ((c=fr.read())!=-1) { //한문자씩 바이트로 읽어옴. 다 읽으면 -1(int)를 반환하기 때문에... int로 일단 받아야함.
				fw.write((char)c); //다시 char로 캐스팅하여 쓰기!
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		} 
		
		catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		
	}

}
