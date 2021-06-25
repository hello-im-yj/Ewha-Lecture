/* 1748022 김유진
 * (실습1) 전화번호부 파일
 * */

package pm1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneWriterEx {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		File numberBook = new File("c:\\javalab\\phone.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(numberBook);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//FileWriter fw = new FileWriter(new File("c:\\javalab\\phone.txt")); 이렇게 쓰면 안되는지? path 출력이 안됨...
		
		System.out.println("전화번호 입력 프로그램입니다.");
		while (true) {
			System.out.print("이름 전화번호 >> ");
			String line = sc.nextLine();
			if (line.equals("그만")) break;
			try {
				fw.write(line+'\n'); //정보 저장 후 한줄 띄어쓰기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end of while

		System.out.println(numberBook.getPath()+"에 저장하였습니다.");
		
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
