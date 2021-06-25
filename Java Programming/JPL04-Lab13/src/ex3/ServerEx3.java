/* 1748022 ������
 * (����3) ��Ƽ�����带 �̿��� 1:1 ä��
 * */

package ex3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx3 { //�Է°� ����� �и��Ͽ� ������� �ۼ�! (�Է��� ��� �Է�, ����� ��� ���.. ���ÿ� ���� ����!)
	
	public static void main (String args[]) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9005);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�...");
			socket = serverSocket.accept();
			System.out.println("����Ǿ����ϴ�!");
			
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
