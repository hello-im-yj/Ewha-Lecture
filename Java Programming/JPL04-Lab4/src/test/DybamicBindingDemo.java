/* 1748022 ������
 * super/super()
 * */

package test;

public class DybamicBindingDemo {
	
	public static void main (String[] args) {
		
		SuperObject a = new SubObject(); //"������ SuperObject()" \n "������ SubObject()"
		System.out.println();
		
		a.paint(); //"super" \n "Sub" ���
		System.out.println();
		
		SubObject b = new SubObject(3); // "������ SuperObject" \n "������ SubObject" \n "������ SubObject(int m) >> m is 3"
		System.out.println();
		
		b.paint(); //"super" \n "Sub" ��� //a.paint�� �Ȱ���. -> �Ѵ� b�� draw�� ȣ���ϰ� ��. (�������ε�)
		System.out.println();
		
		System.out.println(a.toString());
		System.out.println(b.toString()); // toString�� �������̵� ����!!
		
	}

}
