/* 1748022 김유진
 * 접근 지정자의 사용(1/2) (2/2)
 * */

package test;

public class Sample {
	
	public int a;
	private int b;
	int c; //default(package) 접근제어자 = 같은 패키지 안에서는 접근가능.
	
	public int getB() {
		return b;
	}
	
	public void setB(int value) {
		this.b = value;
	}

}
