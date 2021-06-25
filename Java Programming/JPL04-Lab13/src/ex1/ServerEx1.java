/* 1748022 김유진
 * (예제1) 간단한 인사 메시지 전송
 * */

package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx1 {
	
	public static void main(String args[]) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000); //서버소켓 생성, 포트 등록
			
			System.out.println("1.Waiting...");
			socket = serverSocket.accept();
			System.out.println("3.Accept");
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			String strIn = in.nextLine();
			System.out.println(strIn);
			
			out.println("5.Send from Server : Hello, Client!!!");
			out.flush();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		finally {
			try {
				socket.close();
				serverSocket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	

}
