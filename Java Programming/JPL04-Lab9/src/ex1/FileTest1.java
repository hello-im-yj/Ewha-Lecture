
/* 1748022 ������
 * (����1) File Ŭ���� - ���丮 �˻� �� ���� ��
 * */

package ex1;

import java.io.File;

public class FileTest1 {

	public static void main(String args[]) {
		System.out.println("C: ����̺��� ��ü ���� ���");

		File file = new File("C:\\"); // C����̺꿡��
		String[] files = file.list(); // ����Ʈȭ

		for (String fileName : files) {
			/*
			 * File(File parent, String child) Creates a new File instance from a parent
			 * abstract pathname and a child pathname string.
			 */
			File subFile = new File(file, fileName);
			// C������ ��ü ������ �ִ� file ��ü�� �����Ͽ�(file, directory ��� ����) ���� ���ϵ��� �ϳ��� ��ü�� ����
			/*
			 * Returns : true if and only if the file denoted by this abstract pathname
			 * exists and is a directory; false otherwise
			 */
			if (subFile.isDirectory()) {
				System.out.println("���丮 �̸�: " + fileName); // ������
			} else {// �����̸�
				System.out.println("���� �̸� : " + fileName + ", ���� ũ�� : " + subFile.length() + "byte");
			}

		} // end of for loop.

		File makedir = new File("C:\\data");
		if (!makedir.exists())
			System.out.println("makedir�� ����");
		
		makedir.mkdir();
		// true if and only if the directory was created; false otherwise
		if (makedir.exists())
			System.out.println("makedir�� ������");

		File renamedir = new File("c:\\newdata"); // ��� mkdir����. ��ü�� ����.
		makedir.renameTo(renamedir); // �ּҰ��� ���ϰ�ü�� ���� c:\\newdata �����η� ����.

		// if (makedir.exists()) System.out.println("makedir�� �̸��� ������� ����");
		if (renamedir.exists())
			System.out.println("makedir�� �̸��� �����");
		if (renamedir.delete())
			System.out.println("renamedir�� ���ŵ�");
		// ���������� ���ŵǸ� true����.

	}

}
