/* 1748022 ������
 * (JAVA���α׷��ֹ׽ǽ� ���α׷��� ���� #2) å�� ���� ���α׷� Ȯ��
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
		String authorInfo = String.format("%s\n���: %s", pInfo, career);

		return authorInfo;
	}
}
