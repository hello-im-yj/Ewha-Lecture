/* 1748022 김유진
 * (예제3) 멀티스레드를 이용한 1:1 채팅
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
		// socket의 inputstream으로부터 입력받음.
		Scanner in = null;
		try {
			// socket에 들어온 메세지 scanner에 받아옴.
			in = new Scanner(socket.getInputStream());

			while (true) {
				String str = in.nextLine();
				if (str.equalsIgnoreCase("bye")) {
					if (socket != null) {
						System.out.println("REC > " + str);
						System.out.println("연결 종료");
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
