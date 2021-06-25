/* 1748022 ������ */

import java.io.Serializable;
import java.util.Calendar;

public class Person implements Serializable {
	//enum type ���� ���� ����
	enum Gender{ MAN, WOMAN, UNKNOWN }
	
	//�ʵ� (ĸ��ȭ)
	private String name; //�̸�
	private String birth; //�������
	private Gender gender; //����
	
	//������ 
	//�Ű����� 3���� �Է¹޾� ��ü�� �� �ʵ忡 �Է��Ѵ�.
	public Person(String name, String birth, Gender gender) {
		super();
		this.name = name;
		this.birth = birth;
		this.gender = gender;
	}
	
	//������ �����ε�
	//�ƹ��͵� �Ű������� �Էµ��� ���� ��쿡�� �͸�, 1900-1-1, unknown�� �Ű������� ���� �����ڷ� �����Ͽ� ��ü�� �����Ѵ�. 
	public Person() {
		this("�͸�","1900-1-1",Gender.UNKNOWN); } 

	//�޼ҵ�
	
	//getter & setter �޼ҵ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		/* ����üũ : 
		 * ���� ����ڰ� ��������� (4�ڸ� ����) - (1~2�ڸ� ����) - (1~2�ڸ� ����)�� �������� �Է����� �ʾҴٸ�
		 * ��ü�� ��������� 1900-1-1�� �⺻ ������ �Է�*/
		
		if (birth.matches("\\d{4}-\\d{1,2}-\\d{1,2}")) {
			this.birth = birth;
		} 
		else {this.birth = "1900-1-1";}

	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	//getAge()�޼ҵ� : ��������� �⵵�� �������� ���̸� ����Ͽ� ��ȯ
	public int getAge() {
		int Birthyear = Integer.parseInt((birth.substring(0,4))); 
		//String ��ü�� substring �޼ҵ带 �̿��Ͽ� ������� ������Ͽ��� �⵵�� ����
		int year = Calendar.getInstance().get(Calendar.YEAR);
		//calendar ��ü�� �̿��Ͽ� ���� �⵵�� �޾ƿ�
		
		return year - Birthyear; //���� ����Ͽ� ��ȯ
	}
	
	//showInfo() �޼ҵ� : ��ü�� �̸�,����,���� ���� ���
	public void showInfo() {
		int age = getAge();
		System.out.println("<���� ���>");
		System.out.println("�̸� :" + name); 
		System.out.println("���� :" + age);
		System.out.println("���� :" + gender);
	}

}
