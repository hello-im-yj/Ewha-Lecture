/* 1748022 ������
 * (����2) Person Ŭ����
 * */

package ex2;

public class PersonDemo {
	
	public static void main (String args[]) {
		Professor gil = new Professor("Hong,GilDong");
		gil.setPhone("011-1234-5678");
		System.out.println(gil.getPhone());
		
		Person hong = gil; //���ɽ���
		System.out.println(hong.getPhone()); //�������ε�
		
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
