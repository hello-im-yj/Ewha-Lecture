/* 1748022 ±Ë¿Ø¡¯
 * (øπ¡¶6) User∞¥√º ¿˙¿Â
 * */

package ex6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectStreamTest2 {
	
	
	public static void writeData() throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		User[] arrUser = new User[5];
		FileOutputStream fileos = new FileOutputStream("userInfo.dat");
		ObjectOutputStream objectos = new ObjectOutputStream(fileos);
		
		for (int i=0;i<5;i++) {
			String id = sc.next();
			String name = sc.next();
			int age = sc.nextInt();
			arrUser[i] = new User(id,name,age);
		}
		
		objectos.writeObject(arrUser);
		
		fileos.close();
		objectos.close();
		
	}
	
	public static void readData() throws IOException, ClassNotFoundException {
		
		FileInputStream fileis = new FileInputStream("userInfo.dat");
		ObjectInputStream objectis = new ObjectInputStream(fileis);
		
		User[] arrUser = (User[]) (objectis.readObject());
		for (int i=0;i<5;i++) {
			System.out.println(arrUser[i]);
		}
		objectis.close();
	}
	
	public static void main(String args[]) {
		
		try {
			writeData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readData();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
