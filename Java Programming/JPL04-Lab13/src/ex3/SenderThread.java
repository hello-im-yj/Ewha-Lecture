/* 1748022 김유진
 * (예제3) 멀티스레드를 이용한 1:1 채팅
 * */

package ex3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SenderThread extends Thread{
	
	Socket socket = null;
	Scanner in=null;
	public SenderThread(Socket socket)  {
		this.socket = socket;
	}
	
	public void run() {
		
		in = new Scanner(System.in);
		PrintWriter out;
		try {
			out = new PrintWriter(socket.getOutputStream());
			
			while (true) {
				String str = in.nextLine();
				if(str.equalsIgnoreCase("bye")) {
					//if(socket != null) {
					out.println(str);
					out.flush();
					//}
					break;
				}
				out.println(str);
				out.flush();				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				in.close();
				socket.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
