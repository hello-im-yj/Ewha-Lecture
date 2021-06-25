/* 1748022 김유진
 * (실습2) 학생 정보 저장하고 검색하기
 * */

package pm2;

public class SchoolInfo {
	
	private String dept;
	private String SchoolID;
	
	public SchoolInfo(String dept, String SchoolID) {
		this.dept = dept;
		this.SchoolID = SchoolID;
	}
	public String getDept() {
		return dept;
	}
	public String getSchoolID() {
		return SchoolID;
	}

}
