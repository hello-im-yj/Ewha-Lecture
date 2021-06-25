/* 1748022 김유진
 * (예제6) User객체 저장
 * */

package ex6;

import java.io.Serializable;

public class User implements Serializable {
	public String id;
	public String name;
	public int age;
	
	public User(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "아이디 = " + id+ ", 이름 = "+name +", 나이 = "+age ;
	}

	
}
