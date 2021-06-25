/* 1748022 ������
 * (����3) �̹��� ���� ����
 * */

package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3 {
	
	public static void main (String args[]) {
		
		File src = new File("c:\\javalab\\img1.jpg");
		File dest = new File("c:\\javalab\\Spider-Man.jpg");
		
		int c;

		try {
			FileInputStream fi = new FileInputStream(src);		
			FileOutputStream fo = new FileOutputStream(dest);
			
			try {
				while((c=fi.read()) != -1) {
					fo.write(c);
				}
				
				fi.close();
				fo.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
		
		System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
	}

}
