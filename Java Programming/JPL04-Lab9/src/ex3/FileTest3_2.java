/* 1748022 ������
 * (����3) �̹��� ���� ����
 * */

package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3_2 {

	public static void main (String args[]) {
			
			File src = new File("c:\\javalab\\img1.jpg");
			File dest = new File("c:\\javalab\\desert.jpg");
			
			//int c;
	
			try {
				FileInputStream fi = new FileInputStream(src);		
				FileOutputStream fo = new FileOutputStream(dest);
				
				byte[] buf = new byte[1024*10]; //10KB ���� -> 1KB = 1024(2^10)����Ʈ(B)
				
				try {
					while(true) {
						int n = fi.read(buf); //buf �迭�� ũ�⸸ŭ �о��. �о�� ������ �� n���� ����
						fo.write(buf,0,n); //0~n��° �迭ĭ���� buf�迭���� �о�ͼ� ����.
						if (n<buf.length) break; //���۹迭�� ũ�Ⱑ ���Ҵٸ� ���������� ������!
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
