/* 1748022 김유진
 * 메서드 오버로딩
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
	
	//매개변수 타입 동일하면서 리턴타입만 다른 오버로딩은 못함. 
	public double sum(double a,double b) {
		System.out.println("Call sum(double, double)");
		return a+b;
	}

}
