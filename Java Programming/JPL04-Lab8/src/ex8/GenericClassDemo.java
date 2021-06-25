/* 1748022 김유진
 * (예제8) 제너릭 클래스
 * */

package ex8;

public class GenericClassDemo {
	
	public static void main (String args[]) {
		MyClass<String> s = new MyClass<String>();
		s.set("hello");
		System.out.println(s.get());
		
		MyClass<Integer> n = new MyClass<Integer>();
		n.set(5);
		System.out.println(n.get());
		
		MyClass<Point> p = new MyClass<Point>(); //()여기다가 직접 좌표를 넣어줄 수는 없는지?-> 얘는 myClass를 생성하는 아이임.
		//point type p가 어떻게 생성되는지...? default생성자가 없는데.
		//point가 생성되는 것이 아니라 point type을 저장하는 myClass가 생성되는 것. 
		Point a = new Point(1,2);
		p.set(a);
		System.out.println(p.get()); // tostring 오버라이딩 전 -> 주소값 호출됨, 후 -> 좌표값 출력
		//tostring이랑 get이랑 왜 같은동작을 하는지...?? 객체명은 tostring이랑 같은 역할을 하게 됨. point객체의 toString 실행
		System.out.println(p.toString()); //얘는 왜 주소값이...호출될까...? 얘는 myClass의 tostring이 실행된 것!! 
	}

}
