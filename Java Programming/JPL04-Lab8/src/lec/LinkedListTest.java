package lec;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String args[]) {
		
		LinkedList<String> lnklist = new LinkedList<String> ();
		
		lnklist.add("SM5");
		lnklist.offer("소나타");
		lnklist.offer("아우디");
		lnklist.add("벤츠");
		lnklist.add("알티마");
		System.out.println(lnklist);
		
		
		
		System.out.println("element => " + lnklist.get(0));
		lnklist.element();
		System.out.println(lnklist);
		
		System.out.println("peek=> "+ lnklist.get(0));
		lnklist.peek();
		System.out.println(lnklist);
		
		System.out.println("poll => " + lnklist.get(0));
		lnklist.poll();
		System.out.println(lnklist);
		
		System.out.println("remove=> "+lnklist.get(0));
		lnklist.remove();
		System.out.println(lnklist);
		
		
	}

}
