/* 1748022 김유진
 * (예제5) 열거(enum) 타입
 * */

package Ex5;

public class EnumDemo {
	
	public static void main (String args[]) {
		
		for (Currency c : Currency.values()) {
			System.out.println(c.ordinal()+" "+c.toString());
		}
	}

}
