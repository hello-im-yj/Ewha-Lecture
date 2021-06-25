/* 1748022 김유진
 * (예제2) 1:1 채팅 프로그램
 * */

package ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx2 {//Thread로 구현하지 않으면 번갈아가면서 한번씩 전송하는 것 까지만 가능함...보내지 않으면 받을 수 없음! 

	public static void main(String args[]) {
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Socket socket = null;
		Scanner scanner= new Scanner(System.in);
		
		try {
			socket = new Socket("localhost",9999);
			
			//input,output steam 형성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
			
			while(true) {
				System.out.println("보내기>> ");
				String outputMessage = scanner.nextLine();
				
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + '\n');
					out.flush();
					break;
				}
				out.write(outputMessage + '\n');
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("서버: " +inputMessage);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {

			try {
				scanner.close();
				if(socket !=null) socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("서버와의 채팅 중 오류가 발생했습니다. ");
			}
		}

	}
}

