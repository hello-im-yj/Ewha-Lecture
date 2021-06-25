package lec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorRemove {
	
	public static void main(String args[]) {
		

		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c","d"));
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("a")) {
				iter.remove(); //iterator객체를 통해 삭제함. 
			}
		}
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
			
	}
	

}
