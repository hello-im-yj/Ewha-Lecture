/* 1748022 김유진
 * 상속 관계에 있는 클래스간 멤버 접근
 * */

package test;

public class Student extends Person {
	
	void set() {
		age = 30;
		name = "홍길동";
		height = 185;
		setWeight(99);
	}

}
