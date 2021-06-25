/* 1748022 김유진
 * (예제9) 제너릭 메서드 만들기
 * */

package ex9;

public class ClientDemo {
	public static void main (String args[]) {
		Integer iarray[] = {1,2,3,4,5};
		Double darray[] = {11.0,12.9,13.0};
		String sarray[] = {"sun","mon","tue"};
		
		//매개변수 타입별로 오버로딩
		PrintAllClass.PrintAll(iarray);
		PrintAllClass.PrintAll(darray);
		PrintAllClass.PrintAll(sarray);
		
		System.out.println();
		
		//제너릭 메서드로 만듦. 
		PrintAllClass2.printAll(iarray);
		PrintAllClass2.printAll(darray);
		PrintAllClass2.printAll(sarray);
	}

}
