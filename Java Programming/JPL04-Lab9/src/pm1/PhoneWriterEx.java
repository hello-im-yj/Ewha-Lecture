/* 1748022 ������
 * (�ǽ�1) ��ȭ��ȣ�� ����
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
		//FileWriter fw = new FileWriter(new File("c:\\javalab\\phone.txt")); �̷��� ���� �ȵǴ���? path ����� �ȵ�...
		
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�̸� ��ȭ��ȣ >> ");
			String line = sc.nextLine();
			if (line.equals("�׸�")) break;
			try {
				fw.write(line+'\n'); //���� ���� �� ���� ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end of while

		System.out.println(numberBook.getPath()+"�� �����Ͽ����ϴ�.");
		
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
