/* 1748022 김유진
 * (예제3) 멀티스레드를 이용한 1:1 채팅
 * */

package ex3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx3 { //입력과 출력을 분리하여 쓰레드로 작성! (입력은 계속 입력, 출력은 계속 출력.. 동시에 각각 진행!)
	
	public static void main (String args[]) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9005);
			System.out.println("연결을 기다리고 있습니다...");
			socket = serverSocket.accept();
			System.out.println("연결되었습니다!");
			
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

		
	}

}
