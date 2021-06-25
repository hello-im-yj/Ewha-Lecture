/* 1748022 김유진
 * 오버라이딩 메소드 호출
 * */

package test;

class A1 {
	public String x() {
		return "A.x";
	}
}

class B1 extends A1 {

	public String x() {
		return "B.x";
	}

	public String y() {
		return "B.y";
	}

}

class B2 extends A1 {
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo {
	
	public static void main (String[] args) {
		
		A1 obj = new B1();	// 업캐스팅 ppt -> p.24의 Student s = new Student(); Person p = s;와 같음!
		A1 obj2 = new B2(); //업캐스팅
		
		System.out.println("1 >>" + obj.x());
		System.out.println("2 >>" + obj2.x());
		// System.out.println("3 >>" + obj.y()); -> 업캐스탱돼서 A에 있는 멤버만 접근 가능
		
		System.out.println("4 >>" + ((B1)obj).x());
		// System.out.println("5 >>" + ((B1)obj2).x()); ->Test.B2 cannot be cast to Test.B1
		System.out.println("6 >>" + ((B1)obj).y());
		System.out.println("7 >>" + ((B2)obj2).x());
		
		B1 obj3 = new B1();
		System.out.println("8 >>" + obj3.x());
		
		B2 obj4 = new B2();
		System.out.println("9 >>"+obj4.x());
				
	}
	
}


