/* 1748022 ������
 * �޼��� �����ε�
 * */

package test;

public class Calculation {
	public int sum(int a, int b) {
		System.out.println("call sum(int,int)");
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		System.out.println("Call sum(int,int,int)");
		return a+b+c;
	}
	
	//�Ű����� Ÿ�� �����ϸ鼭 ����Ÿ�Ը� �ٸ� �����ε��� ����. 
	public double sum(double a,double b) {
		System.out.println("Call sum(double, double)");
		return a+b;
	}

}
