/* 1748022 김유진
 * (실습2) 책장 관리
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
