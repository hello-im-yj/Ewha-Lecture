/* 1748022 ������
 * (����2) Person Ŭ����
 * */

package ex2;

public class Person {

	private String name;
	private String phone;
	
	public Person (String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		return "[name=" + name + ",phone=" + phone+"]";
	}


}
