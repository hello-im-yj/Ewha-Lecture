/* 1748022 김유진
 * (JAVA프로그래밍및실습 프로그래밍 과제 #2) 책장 관리 프로그램 확장
 * */


public class Author extends Person {
	private String career;

	public Author(String name, String birthdate, Gender gender, String career) {
		super(name, birthdate, gender);
		this.career = career;
	}

	public Author() {
		super();
		career = "";
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String showInfo() {
		String pInfo = super.showInfo();
		String authorInfo = String.format("%s\n경력: %s", pInfo, career);

		return authorInfo;
	}
}
