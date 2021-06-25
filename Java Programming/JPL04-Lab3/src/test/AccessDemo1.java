/* 1748022 김유진
 * 접근 지정자의 사용(1/2) (2/2)
 * */

package test;

public class AccessDemo1 {
	public static void main (String args[]) {
		Sample aClass = new Sample();
		aClass.a=10;
		//aClass.b=10; //private은 다른 클래스에서 직접 접근 불가.
		aClass.setB(10);
		aClass.c = 10;
	}

}
