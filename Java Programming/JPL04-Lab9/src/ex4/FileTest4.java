/* 1748022 ������
 * (����4) ���� ��Ʈ���� �̿��� ���
 * */

package ex4;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String args[]) {
		// 0101���� �о�ð� �ƴϴϱ� ��������� ���
		try {
			FileReader fr = new FileReader("C:\\javalab\\test.txt");
			BufferedOutputStream bo = new BufferedOutputStream(System.out, 5); // �� ���ڷ� �о�ͼ� ����Ʈ��Ʈ������ ���?

			int c;
			try {
				while ((c = fr.read()) != -1) {
					bo.write(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//new Scanner(System.in).nextLine(); // ���� �Է� ���Ͽ� -> ���ۿ� ������ (3��) ���
			System.out.println();

			try {
				bo.flush(); //���� ���� ���� ���
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
