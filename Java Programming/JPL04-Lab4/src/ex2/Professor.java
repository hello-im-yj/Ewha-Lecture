/* 1748022 ������
 * (����2) Person Ŭ����
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
