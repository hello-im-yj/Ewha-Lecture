package pm1;

import java.util.Stack;
import java.util.StringTokenizer;

public class Parlindrome2 {
	
	public static void main(String arg[]) {
		String s = "a b a a a b # b a a a b a";
		//String s = "#";
		StringTokenizer st = new StringTokenizer(s);
		Stack<String> z = new Stack<String>();
		
		boolean result = true;
		int type =0;
		
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			if(a.contentEquals("#")) {
				type = 1; continue;
			}
			//#����
			if(type ==0) {
				z.push(a);				
			}
			
			//#����
			else if (type ==1) {
				if(z.empty()) { //������ ���� 
					result = false;
					break;
				}
				
				String b = z.pop();
				if(! b.contentEquals(a)) { //�������� -> ¦ �ȸ���
					result = false;
					break;
				}
			}
		}//end of while
		
		if (!z.empty() || s.contentEquals("#")) result = false; //�������� ���� or emptyString
		
		if(!result) System.out.println("Not Parlindrome");
		else System.out.println("Parlindrome");

	}
}
