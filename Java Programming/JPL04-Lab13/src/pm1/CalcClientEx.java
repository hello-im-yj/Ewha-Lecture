/* 1748022 김유진
 * (실습) 수식 계산 서버-클라이언트 
 * */

package pm1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClientEx {

	public static void main(String args[]) {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			
			BufferedReader in = new BufferedReader( new InputStreamReader (socket.getInputStream()));
			BufferedWriter out = new BufferedWriter( new OutputStreamWriter (socket.getOutputStream()));

			while (true) {
				System.out.print("계산식 (빈칸으로 띄어 입력, 예 : 24 + 42 ) >> ");
				String exp = sc.nextLine();
				if (exp.contentEquals("bye")) {
					out.write(exp);
					out.flush();
					break;
				}
				out.write(exp + '\n');
				out.flush();
				
				System.out.println ("계산결과 : "+ in.readLine());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
