/* 1748022 ������
 * (����2) �ؽ�Ʈ ���� ����
 * */


package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	
	public static void main (String args[]) {//���ڵ�,���ڵ��� ANSI��.
		File src = new File("C:\\javalab\\lab9.txt");//����
		File dest = new File("C:\\javalab\\myinfo.txt");//���纻
		
		int c;
		
		try {
			FileReader fr = new FileReader(src); //�Է½�Ʈ��
			FileWriter fw = new FileWriter(dest); //��½�Ʈ��
			
			System.out.println(fr.getEncoding()); //MS949
			System.out.println(fw.getEncoding()); //MS949
			
			while ((c=fr.read())!=-1) { //�ѹ��ھ� ����Ʈ�� �о��. �� ������ -1(int)�� ��ȯ�ϱ� ������... int�� �ϴ� �޾ƾ���.
				fw.write((char)c); //�ٽ� char�� ĳ�����Ͽ� ����!
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
		} 
		
		catch (IOException e) {
			System.out.println("���� ���� ����");
		}
		
	}

}
