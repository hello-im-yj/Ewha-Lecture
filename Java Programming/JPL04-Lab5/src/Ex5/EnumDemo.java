/* 1748022 ������
 * (����5) ����(enum) Ÿ��
 * */

package Ex5;

public class EnumDemo {
	
	public static void main (String args[]) {
		
		for (Currency c : Currency.values()) {
			System.out.println(c.ordinal()+" "+c.toString());
		}
	}

}
