
/* 1748022 ������
 * (�ǽ�3) ���� Ž����
 * */

package pm3;

import java.io.File;
import java.util.Scanner;

public class FileExplorer2 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\");
		String[] files = f.list();
		System.out.println("*** ���� Ž�����Դϴ�. ***");
		
		
		while (true) {
			System.out.println("\t"+f.getPath());
			)
			for (String s : files ) {
				File subfile = new File(f,s);
				System.out.println();
			}
			
			String newPath = sc.nextLine();
			if (newPath.equals("�׸�")) break;
			else //�н��ٽ�
		}

		
		
	}

}
