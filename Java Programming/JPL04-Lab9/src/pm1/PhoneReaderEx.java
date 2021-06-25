/* 1748022 김유진
 * (실습1) 전화번호부 파일
 * */

package pm1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneReaderEx {

	public static void main(String args[]) {
		File numberBook = new File("c:\\javalab\\phone.txt");
		String s;
		try {

			BufferedReader br = new BufferedReader(new FileReader(numberBook));
			System.out.println(numberBook.getPath() + "를 출력합니다.");
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
