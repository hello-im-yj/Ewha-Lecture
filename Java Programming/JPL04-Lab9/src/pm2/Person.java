/* 1748022 ������
 * (�ǽ�2) å�� ����
 * */

package pm2;

import java.io.Serializable;

enum Gender {
	MAN,WOMAN,UNKNOWN
}

public class Person implements Serializable{
	
	private String name;
	private Gender gender;
	
	
	
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	

}
