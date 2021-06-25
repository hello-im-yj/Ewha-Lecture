/* 1748022 김유진
 * (예제4) 버퍼 스트림을 이용한 출력
 * */

package ex4;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String args[]) {
		// 0101으로 읽어올거 아니니까 문자입출력 사용
		try {
			FileReader fr = new FileReader("C:\\javalab\\test.txt");
			BufferedOutputStream bo = new BufferedOutputStream(System.out, 5); // 왜 문자로 읽어와서 바이트스트림으로 출력?

			int c;
			try {
				while ((c = fr.read()) != -1) {
					bo.write(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//new Scanner(System.in).nextLine(); // 엔터 입력 위하여 -> 버퍼에 남은것 (3개) 출력
			System.out.println();

			try {
				bo.flush(); //남은 문자 강제 출력
				fr.close();
				bo.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
