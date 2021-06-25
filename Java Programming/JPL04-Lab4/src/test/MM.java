/* 1748022 김유진
 * 상속 관계에 있는 클래스간 멤버 접근
 * */

package test;

public class MM {
	
	public static void main (String[] args) {
		Student s = new Student();
		s.set();
		System.out.println(s.getWeight());
		
	}

}
