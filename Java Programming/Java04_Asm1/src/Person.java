/* 1748022 김유진 */

import java.io.Serializable;
import java.util.Calendar;

public class Person implements Serializable {
	//enum type 으로 성별 정의
	enum Gender{ MAN, WOMAN, UNKNOWN }
	
	//필드 (캡슐화)
	private String name; //이름
	private String birth; //생년월일
	private Gender gender; //성별
	
	//생성자 
	//매개변수 3개를 입력받아 객체의 각 필드에 입력한다.
	public Person(String name, String birth, Gender gender) {
		super();
		this.name = name;
		this.birth = birth;
		this.gender = gender;
	}
	
	//생성자 오버로딩
	//아무것도 매개변수로 입력되지 않을 경우에는 익명, 1900-1-1, unknown을 매개변수로 위의 생성자로 전달하여 객체를 생성한다. 
	public Person() {
		this("익명","1900-1-1",Gender.UNKNOWN); } 

	//메소드
	
	//getter & setter 메소드
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
		/* 형식체크 : 
		 * 만약 사용자가 생년월일을 (4자리 숫자) - (1~2자리 숫자) - (1~2자리 숫자)의 형식으로 입력하지 않았다면
		 * 객체의 생년월일을 1900-1-1의 기본 값으로 입력*/
		
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
	
	//getAge()메소드 : 생년월일의 년도를 기준으로 나이를 계산하여 반환
	public int getAge() {
		int Birthyear = Integer.parseInt((birth.substring(0,4))); 
		//String 객체의 substring 메소드를 이용하여 사용자의 생년월일에서 년도만 추출
		int year = Calendar.getInstance().get(Calendar.YEAR);
		//calendar 객체를 이용하여 현재 년도를 받아옴
		
		return year - Birthyear; //나이 계산하여 반환
	}
	
	//showInfo() 메소드 : 객체의 이름,나이,성별 정보 출력
	public void showInfo() {
		int age = getAge();
		System.out.println("<정보 출력>");
		System.out.println("이름 :" + name); 
		System.out.println("나이 :" + age);
		System.out.println("성별 :" + gender);
	}

}
