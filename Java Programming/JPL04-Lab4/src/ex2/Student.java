/* 1748022 ������
 * (����2) Person Ŭ����
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
