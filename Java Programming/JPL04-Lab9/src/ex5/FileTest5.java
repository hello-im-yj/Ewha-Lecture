/* 1748022 ������
 * (����5) HashMap ��ü ����
 * */

package ex5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class FileTest5 {

	public static void writeData() throws IOException {

		HashMap<String, String> loginData = new HashMap<String, String>();

		FileOutputStream fout = new FileOutputStream("c:\\javalab\\logdata.dat");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		Scanner scan = new Scanner(System.in);

		while (true) {
			String id = scan.next();
			String name = scan.nextLine();
			if (id.equals("0") || name.equals("0"))
				break;

			loginData.put(id, name);
		}

		out.writeObject(loginData); // Hashmap�� Serializable �������̽��� �����ϰ�����.
		System.out.println("���Ͽ� ���� �Ϸ�!");

		out.close();
		fout.close();

	}// end of writeData()

	public static void readData() throws IOException, ClassNotFoundException {

		HashMap<String, String> loginData;

		FileInputStream fin = new FileInputStream("c:\\javalab\\logdata.dat");
		ObjectInputStream in = new ObjectInputStream(fin);

		loginData = (HashMap<String, String>) (in.readObject());

		for (String key : loginData.keySet()) {
			System.out.println("ID : " + key + ", Name : " + loginData.get(key));
		}

		in.close();
		fin.close();

	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("(1)���Ͽ� ���� \t (2)���Ͽ��� ������ �б�");

		int menu = scan.nextInt();
		try {
			switch (menu) {
			case 1:
				writeData();
				break;
			case 2:
				readData();
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end of try-catch
		
		System.out.println("���α׷� ����");
		
	}//end of main
}
