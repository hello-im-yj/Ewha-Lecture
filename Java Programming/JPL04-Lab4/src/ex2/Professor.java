/* 1748022 김유진
 * (예제2) Person 클래스
 * */

package ex2;

public class Professor extends Person {
	
	public Professor(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Professor " + super.getPhone();
	}

}
