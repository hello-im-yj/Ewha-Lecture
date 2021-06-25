/* 1748022 ������
 * (����1) ������ �λ� �޽��� ����
 * */

package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx1 {
	
	public static void main(String args[]) {
		
		Socket socket = null;
		String ipAddr = "localhost";
		
		try {
			socket = new Socket (ipAddr, 9000); //��Ĺ �����Ͽ� ����
			System.out.println("2. request");
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("4.Send from Client : Hello, Server!!!");
			out.flush();
			
			String strIn = in.nextLine();
			System.out.println(strIn);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
