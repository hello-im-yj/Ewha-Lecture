/* 1748022 김유진
 * (예제2) Person 클래스
 * */

package ex2;

public class Student extends Person {
	
	public Student (String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Student " + super.getPhone();
	}

}
