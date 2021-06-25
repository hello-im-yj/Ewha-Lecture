package ch2;

class MyInt {
	 int val;
	 MyInt (int i) {
		 val=i;
	 }
 }

public class CallByValueObject {
	
	public static void main (String args[]) {
		Person p = new Person("ȫ�浿");
		MyInt a = new  MyInt(33);
		
		p.setAge(a);
		System.out.println(a.val);
		System.out.println(p.age);
		
	}
	
}

