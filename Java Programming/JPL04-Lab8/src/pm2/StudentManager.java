/* 1748022 김유진
 * (실습2) 학생 정보 저장하고 검색하기
 * */

package pm2;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {
	
	public static void main (String args[]) {
		
		HashMap<String,SchoolInfo> student = new HashMap<String,SchoolInfo>();
		Scanner sin = new Scanner(System.in);
		System.out.println("이름 학과 학번순서로 학생 5명의 정보를 입력하세요.");
		
		for (int i=0;i<5;i++) {
			String name = sin.next();
			String dept = sin.next();
			String schoolID = sin.nextLine();
			SchoolInfo si = new SchoolInfo(dept,schoolID);
			student.put(name,si);
		}
		
		while (true) {
			System.out.println("검색할 학생 이름을 입력하시요. 끝내려면 이름을 '끝'이라고 입력하시요.");
			String key = sin.nextLine();
			if (key.equals("끝")) break;
			if (student.containsKey(key)) {
				System.out.println( key +">> "+student.get(key).getDept()+" , "+student.get(key).getSchoolID());
			}
			else {
				System.out.println("학생이 존재하지 않습니다.");
			}
			
		}
		System.out.println("안녕!");
	}

}
