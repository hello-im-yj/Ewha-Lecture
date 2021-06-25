/* 1748022 ������
 * (����3) ��Ƽ�����带 �̿��� 1:1 ä��
 * */

package ex3;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ReceiverThread extends Thread {

	Socket socket = null;

	public ReceiverThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		// socket�� inputstream���κ��� �Է¹���.
		Scanner in = null;
		try {
			// socket�� ���� �޼��� scanner�� �޾ƿ�.
			in = new Scanner(socket.getInputStream());

			while (true) {
				String str = in.nextLine();
				if (str.equalsIgnoreCase("bye")) {
					if (socket != null) {
						System.out.println("REC > " + str);
						System.out.println("���� ����");
						break;
					}
				}
				System.out.println("REC > " + str);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				in.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
