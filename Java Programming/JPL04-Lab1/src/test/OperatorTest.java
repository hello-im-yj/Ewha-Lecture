/* 1748022 ������
 * ���׿���, ��Ʈ��ȯ����, ����Ʈ����, ���ǿ��� Test
 * */

package test;

public class OperatorTest {
	
	public static void main (String args[]) {
		
		//��Ʈ��ȯ������ ~ : 1<->0 ��ȯ, ������ ��� -(��)-1�� ���� ���� ��.
		int a =10;
		System.out.println(~a);
		
		//����Ʈ���� (>>,<<) 2�� n���� ���ϰų� ������ 2������ nĭ �̵���Ŵ.
		int a1 = 8<<2;
		int b1 = 8>>2;
		
		System.out.println(a1);
		System.out.println(b1);
		
		//���ǿ���(?:) , ���Կ��� �ٷ� �Ѵܰ� �� �켱����... �� �� ��� ����� �� t/f ��
		int x = -10;
		int absX = x>=0? x:-x;
		System.out.println(absX);
		
		/*//���׿���
		 
		int a = 0;
		System.out.println(a++);  // a=1, return =0
		int b = 0;
		System.out.println(b--); // b=-1, return =0
		int c = 0;
		System.out.println(++c); //c=1, return = 1
		int d = 0;
		System.out.println(--d); //d=-1, return=-1
		
		
		System.out.println("=======");
		
		int i = 0;
		System.out.println(i++); //i=1, return=0
		System.out.println(i--); //i=0, return=1
		System.out.println(++i); //i=1, return=1
		System.out.println(--i); //i=0, return=0
		System.out.println(i); //i=0
		
		* 
		 */
	}

}
