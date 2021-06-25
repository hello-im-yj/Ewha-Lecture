
/* 1748022 김유진
 * (예제1) File 클래스 - 디렉토리 검색 및 생성 등
 * */

package ex1;

import java.io.File;

public class FileTest1 {

	public static void main(String args[]) {
		System.out.println("C: 드라이브의 전체 파일 출력");

		File file = new File("C:\\"); // C드라이브에서
		String[] files = file.list(); // 리스트화

		for (String fileName : files) {
			/*
			 * File(File parent, String child) Creates a new File instance from a parent
			 * abstract pathname and a child pathname string.
			 */
			File subFile = new File(file, fileName);
			// C에만든 객체 하위에 있는 file 객체를 생성하여(file, directory 모두 있음) 하위 파일들을 하나씩 객체로 만듦
			/*
			 * Returns : true if and only if the file denoted by this abstract pathname
			 * exists and is a directory; false otherwise
			 */
			if (subFile.isDirectory()) {
				System.out.println("디렉토리 이름: " + fileName); // 폴더면
			} else {// 파일이면
				System.out.println("파일 이름 : " + fileName + ", 파일 크기 : " + subFile.length() + "byte");
			}

		} // end of for loop.

		File makedir = new File("C:\\data");
		if (!makedir.exists())
			System.out.println("makedir이 없음");
		
		makedir.mkdir();
		// true if and only if the directory was created; false otherwise
		if (makedir.exists())
			System.out.println("makedir이 생성됨");

		File renamedir = new File("c:\\newdata"); // 얘는 mkdir안함. 객체만 생성.
		makedir.renameTo(renamedir); // 주소값을 파일객체가 가진 c:\\newdata 값으로로 변경.

		// if (makedir.exists()) System.out.println("makedir의 이름이 변경되지 않음");
		if (renamedir.exists())
			System.out.println("makedir의 이름이 변경됨");
		if (renamedir.delete())
			System.out.println("renamedir이 제거됨");
		// 정상적으로 제거되면 true리턴.

	}

}
