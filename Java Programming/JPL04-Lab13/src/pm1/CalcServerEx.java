/* 1748022 김유진
 * (실습) 수식 계산 서버-클라이언트 
 * */

package pm1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServerEx {
	
	public static String calc(String s) {
		
		StringTokenizer st = new StringTokenizer(s);
		String res ="";
		String tk2;
		int tk1,tk3;
		
		if (st.countTokens() != 3) {
			res = "error"; 
			return res;
		}
		
		tk1 = Integer.parseInt(st.nextToken());
		tk2 = st.nextToken();
		tk3 = Integer.parseInt(st.nextToken());
		
		switch (tk2) {
		case "+": res = Integer.toString(tk1 + tk3);
			break;
		case "-": res = Integer.toString(tk1 - tk3);
			break;
		case "*": res = Integer.toString(tk1 * tk3);
			break;
		default : res = "error"; 
			}
		
		return res;
		
		}//end of calc()
	
	public static void main(String args[]) {
		
		ServerSocket serverSocket=null;
		Socket socket = null;
		String result = "";
		
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다...");
			socket = serverSocket.accept();
			System.out.println("연결되었습니다.");
			
			BufferedReader in = new BufferedReader( new InputStreamReader (socket.getInputStream()));
			BufferedWriter out = new BufferedWriter( new OutputStreamWriter (socket.getOutputStream()));
			
			while (true) {

				String s = in.readLine();
				if(s.contentEquals("bye")) {
					System.out.println("클라이언트에서 연결을 종료하였음");
					break;
				}
				
				System.out.println(s);
				result = calc(s);
				
				out.write(result + '\n');
				out.flush();

			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
