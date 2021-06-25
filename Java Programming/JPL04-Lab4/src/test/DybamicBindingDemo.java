/* 1748022 김유진
 * super/super()
 * */

package test;

public class DybamicBindingDemo {
	
	public static void main (String[] args) {
		
		SuperObject a = new SubObject(); //"생성자 SuperObject()" \n "생성자 SubObject()"
		System.out.println();
		
		a.paint(); //"super" \n "Sub" 출력
		System.out.println();
		
		SubObject b = new SubObject(3); // "생성자 SuperObject" \n "생성자 SubObject" \n "생성자 SubObject(int m) >> m is 3"
		System.out.println();
		
		b.paint(); //"super" \n "Sub" 출력 //a.paint랑 똑같음. -> 둘다 b의 draw를 호출하게 됨. (동적바인딩)
		System.out.println();
		
		System.out.println(a.toString());
		System.out.println(b.toString()); // toString도 오버라이딩 가능!!
		
	}

}
