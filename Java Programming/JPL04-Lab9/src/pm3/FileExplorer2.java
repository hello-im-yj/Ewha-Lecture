
/* 1748022 김유진
 * (실습3) 파일 탐색기
 * */

package pm3;

import java.io.File;
import java.util.Scanner;

public class FileExplorer2 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\");
		String[] files = f.list();
		System.out.println("*** 파일 탐색기입니다. ***");
		
		
		while (true) {
			System.out.println("\t"+f.getPath());
			)
			for (String s : files ) {
				File subfile = new File(f,s);
				System.out.println();
			}
			
			String newPath = sc.nextLine();
			if (newPath.equals("그만")) break;
			else //패스다시
		}

		
		
	}

}
