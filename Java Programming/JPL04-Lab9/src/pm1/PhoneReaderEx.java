/* 1748022 ������
 * (�ǽ�1) ��ȭ��ȣ�� ����
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
			System.out.println(numberBook.getPath() + "�� ����մϴ�.");
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
