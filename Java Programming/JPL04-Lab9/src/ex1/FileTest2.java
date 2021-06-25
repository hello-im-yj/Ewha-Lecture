/* 1748022 ������
 * (����1) File Ŭ���� - ���丮 �˻� �� ���� ��
 * */

package ex1;

import java.io.File;

public class FileTest2 {
	
	public static void listDirectory(File dir) {
		System.out.println("-----"+dir.getPath()+"�� ���긮��Ʈ�Դϴ�. -----");
		File[] subFiles = dir.listFiles(); //pathname �迭�� �������ִ� �޼ҵ�
		//Returns an array of abstract pathnames 
		//denoting the files in the directory denoted by this abstract pathname. 
		for (int i =0;i<subFiles.length;i++) {
			File f = subFiles[i];
			long t = f.lastModified(); //���������� ������ �ð� ����
			//Returns the time that the file denoted by this abstract pathname was last modified. 
			System.out.println(f.getName());
			System.out.println("\t���� ũ��: "+f.length());
			System.out.printf("\t������ �ð�: %tb %td %ta %tT\n",t,t,t,t);
		
		}
		
	}
	
	public static void main(String args[]) {
		File f1 = new File("c:\\windows\\system.ini"); //.ini??? -> �׳� type�� �� ����
		System.out.println(f1.getPath()+","+f1.getParent()+","+f1.getName());
		//c:\windows\system.ini, # ��θ�
		//c:\windows, # �������丮
		//system.ini # This is just the last name in the pathname's name sequence.
		
		String res = "";
		if(f1.isFile()) res = "����";
		else if (f1.isDirectory()) res = "���丮";
		System.out.println(f1.getPath()+"�� "+res+"�Դϴ�.");
		
		File f2 = new File("c:\\Temp\\java_sample");
		if(!f2.exists()) f2.mkdir();
		
		listDirectory(new File("C:\\Temp"));
		f2.renameTo(new File("C:\\Temp\\javasample")); 
		listDirectory(new File("C:\\Temp"));
		
	}

}
