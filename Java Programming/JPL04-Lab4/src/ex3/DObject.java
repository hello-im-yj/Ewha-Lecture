/* 1748022 김유진
 * (예제3) 도형 연결
 * */

package ex3;

public class DObject {
	
	public DObject next;
	public DObject () {
		next = null;
	}
	
	public void draw() {
		System.out.println("Dobject draw");
	}

}
