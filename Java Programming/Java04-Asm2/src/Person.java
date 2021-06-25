/* 1748022 ������
 * (JAVA���α׷��ֹ׽ǽ� ���α׷��� ���� #2) å�� ���� ���α׷� Ȯ��
 * */

import java.io.Serializable;
import java.util.Calendar;

enum Gender {
	MAN, WOMAN, UNKNOWN
}

//��ü ������ ������ϱ� ����, Serializable �������̽��� �����Ѵ�. 
public class Person implements Serializable {
	private String name;
	private String birthdate;
	private Gender gender;

	public Person() {
		this("�͸�", "1900-01-01", Gender.UNKNOWN);
	}

	public Person(String name, String birthdate, Gender gender) {
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public Gender getGender() {
		return gender;
	}

	public String showInfo() {
		String infoStr = String.format("�̸�: %s\n����: %d\n����: %s", name, getAge(), gender);
		return infoStr;
	}

	public int getAge() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int birth = Integer.parseInt(birthdate.substring(0, 4));

		return year - birth;
	}
}