/* 1748022 김유진
 * (예제2) Person 클래스
 * */

package ex2;

public class PersonDemo {
	
	public static void main (String args[]) {
		Professor gil = new Professor("Hong,GilDong");
		gil.setPhone("011-1234-5678");
		System.out.println(gil.getPhone());
		
		Person hong = gil; //업케스팅
		System.out.println(hong.getPhone()); //동적바인딩
		
		Person na = new Student ("Na, Ewha");
		na.setPhone("010-4321-9876");
		System.out.println(na.getPhone());
		
		System.out.println();
		whoAmI("hong",hong); //professor
		whoAmI("na",na); //Student
		
	}
	
	public static void whoAmI(String instName, Person who) {
		if (who instanceof Professor) {
			System.out.println(instName+" is instatnce of \"Professor\" Class"); }
		if (who instanceof Student) {
			System.out.println(instName+" is instance of \"Student\" Class");
		}
		
	}

}
