/* 1748022 ������
 * (����2) 1:1 ä�� ���α׷�
 * */

package ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx2 {//Thread�� �������� ������ �����ư��鼭 �ѹ��� �����ϴ� �� ������ ������...������ ������ ���� �� ����! 

	public static void main(String args[]) {
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Socket socket = null;
		Scanner scanner= new Scanner(System.in);
		
		try {
			socket = new Socket("localhost",9999);
			
			//input,output steam ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
			
			while(true) {
				System.out.println("������>> ");
				String outputMessage = scanner.nextLine();
				
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + '\n');
					out.flush();
					break;
				}
				out.write(outputMessage + '\n');
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("����: " +inputMessage);
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
				System.out.println("�������� ä�� �� ������ �߻��߽��ϴ�. ");
			}
		}

	}
}

