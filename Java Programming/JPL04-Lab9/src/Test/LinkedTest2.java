/* 1748022 김유진
 * Collection - - Queue인터페이스
 * */


package Test;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedTest2 {
	
	public static void main (String args[]) {
		Queue<String> queue = new LinkedList<String>();
		
		//FIFO구조. poll메소드 이용하여 강남구부터 출력
		//?? offer과 add 메소드의 차이점? add랑 같음.
		//offer => this method is generally preferable to add, which can fail to insert an element only by throwing an exception.

		queue.offer("강남구");
		queue.offer("노원구");
		queue.offer("은평구");
		queue.offer("도봉구");
		queue.offer("서초구");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
