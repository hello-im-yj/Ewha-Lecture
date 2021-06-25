/* 1748022 김유진
 * (예제6) User객체 저장
 * */

package ex6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
	
	public static void writeData() throws IOException {
		
		User obj = new User ("160001", "나이화", 22);
		FileOutputStream fileos = new FileOutputStream("userInfo.dat");
		ObjectOutputStream objectos = new ObjectOutputStream(fileos);
		objectos.writeObject(obj);
		
		fileos.close();
		objectos.close();
		
	}
	
	public static void readData() throws IOException, ClassNotFoundException {
		
		FileInputStream fileis = new FileInputStream("userInfo.dat");
		ObjectInputStream objectis = new ObjectInputStream(fileis);
		
		User obj = (User) (objectis.readObject());
		System.out.println(obj);
		
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
