/* 1748022 김유진
 * (예제3) 이미지 파일 복사
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
				
				byte[] buf = new byte[1024*10]; //10KB 버퍼 -> 1KB = 1024(2^10)바이트(B)
				
				try {
					while(true) {
						int n = fi.read(buf); //buf 배열의 크기만큼 읽어옴. 읽어온 데이터 수 n으로 리턴
						fo.write(buf,0,n); //0~n번째 배열칸까지 buf배열에서 읽어와서 쓴다.
						if (n<buf.length) break; //버퍼배열의 크기가 남았다면 마지막으로 읽은것!
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
				System.out.println("파일 복사 오류");
			}
			
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
	
	}
}
