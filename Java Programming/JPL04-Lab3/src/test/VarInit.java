/* 1748022 ������
 * ��������� �ʱ�ȭ �� Ȯ��
 * */

package test;

public class VarInit {
	
	boolean b;
	char c;
	byte bVal;
	short sVal;
	int nVal;
	long lVal;
	float fVal;
	double dVal;
	String s;
	
	//������ ��ü�����ϸ� default������ �ʱ�ȭ.
	void printVal() {
		System.out.println("boolean b: " +b );
		System.out.println("char init: "+c + " char init(code): "+(int)c);
		System.out.println("byte init: "+bVal);
		System.out.println("shor init: "+ sVal);
		System.out.println("int init: "+nVal);
		System.out.println("long init: "+lVal);
		System.out.println("float init: "+fVal);
		System.out.println("double init : "+dVal);
		System.out.println("String init : "+s);
		
	}
	

}
