/* 1748022 ������
 * (����6) User��ü ����
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
		return "���̵� = " + id+ ", �̸� = "+name +", ���� = "+age ;
	}

	
}
