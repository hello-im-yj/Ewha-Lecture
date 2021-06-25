/* 1748022 ������
 * (����3) ��Ƽ�����带 �̿��� 1:1 ä��
 * */
package ex3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx3 {
	
	public static void main(String args[]) {
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9005);
			
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
