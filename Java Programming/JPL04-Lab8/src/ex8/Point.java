/* 1748022 김유진
 * (예제8) 제너릭 클래스
 * */

package ex8;

public class Point {
	
	//필드
	int a,b;
	
	//생성자
	public Point(int a, int b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Point [a=" + a + ", b=" + b + "]";
	}
	
	

}
