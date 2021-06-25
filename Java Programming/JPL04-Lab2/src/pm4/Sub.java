/* 1748022 김유진
 * (실습4) 사칙연산 클래스 
 * */

package pm4;

public class Sub {
	
	private int a,b;
	
	public void setValue (int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a-b;
	}
	

}
