/* 1748022 김유진
 * 
 * */

package test;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "abcdef";
		String str4 = new String ("abcdef");
		
		int n = 3;
		
		/* 
		String type은 str3처럼 선언해도 되고, str4처럼 선언해도 됨. 둘 다 똑같은 process로 객체생성하게 됨. 
		str은 자주 사용되는 클래스기 때문에 new로 선언하지 않아도 자동으로 만들어줌!
		*/
		
		if (str1.equals(str2))
			System.out.println("str1 문자열과 str2 문자열은 같다.");
		else 
			System.out.println("str1 문자열과 str2 문자열은 다르다.");
		
		if (str1.equals(str3))
			System.out.println("str1 문자열과 str3 문자열은 같다. ");
		else
			System.out.println("str1 문자열과 str3 문자열은 다르다. ");
		
		if (str3.contains(str1))
			System.out.println("str3 문자열은 str1 문자열을 포함한다. ");
		else 
			System.out.println("str3 문자열은 str1 문자열을 포함하지 않는다. ");
		
		if (str4.contains(str1))
			System.out.println("str4 문자열은 str1 문자열을 포함한다.");
		else 
			System.out.println("str4 문자열은 str1 문자열을 포함하지 않는다. ");
		
		if (str1 == str2)
			System.out.println("두 주소가 같음");
		else
			System.out.println("두 주소가 다름");
		
		if (str3 == str4)
			System.out.println("두 주소가 같음");
		else
			System.out.println("두 주소가 다름");
		// str1,2,3의 경우 리터럴이어서 힙이 아닌 다른 공간에 저장되기 때문에 다르다고 나온다! 
		
		String str5 = str1;
		if (str1 == str5) 
			System.out.println("두 주소가 같음");
		else 
			System.out.println("두 주소가 다름");
		
	}

}
