/* 1748022 김유진
 * (실습2) 책장 관리
 * */

package pm2;

import java.io.Serializable;

public class Author extends Person implements Serializable {
	
	private String career;

	public Author(String name, Gender gender, String career) {
		super(name, gender);
		this.career = career;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	

}
