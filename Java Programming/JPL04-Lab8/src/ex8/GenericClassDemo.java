/* 1748022 ������
 * (����8) ���ʸ� Ŭ����
 * */

package ex8;

public class GenericClassDemo {
	
	public static void main (String args[]) {
		MyClass<String> s = new MyClass<String>();
		s.set("hello");
		System.out.println(s.get());
		
		MyClass<Integer> n = new MyClass<Integer>();
		n.set(5);
		System.out.println(n.get());
		
		MyClass<Point> p = new MyClass<Point>(); //()����ٰ� ���� ��ǥ�� �־��� ���� ������?-> ��� myClass�� �����ϴ� ������.
		//point type p�� ��� �����Ǵ���...? default�����ڰ� ���µ�.
		//point�� �����Ǵ� ���� �ƴ϶� point type�� �����ϴ� myClass�� �����Ǵ� ��. 
		Point a = new Point(1,2);
		p.set(a);
		System.out.println(p.get()); // tostring �������̵� �� -> �ּҰ� ȣ���, �� -> ��ǥ�� ���
		//tostring�̶� get�̶� �� ���������� �ϴ���...?? ��ü���� tostring�̶� ���� ������ �ϰ� ��. point��ü�� toString ����
		System.out.println(p.toString()); //��� �� �ּҰ���...ȣ��ɱ�...? ��� myClass�� tostring�� ����� ��!! 
	}

}
