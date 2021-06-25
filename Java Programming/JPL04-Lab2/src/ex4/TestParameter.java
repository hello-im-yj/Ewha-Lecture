/* 1748022 김유진
 * 
 * */

package ex4;

public class TestParameter {
	
	public static void main (String args[]) {
		
		int intSize = 50;
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.setName("Happy");
		d1.setSize(25);
		
		d1.tryToChange(intSize);
		System.out.println("\n === tryToChange Retult In main ==="); //call by value 함수
		System.out.println("       intSize value? "+intSize); 
		// 값이 복사되기 때문에 main으로 돌아오면 원래값.
		
		d1.tryToReplace(d2);
		System.out.println("\n === tryToReplace Retult In main ==="); 
		System.out.println("       d1 run() ===> ");
		d1.run();
		System.out.println("       d2 run() ===> ");
		d2.run(); //null 출력. d2도 매소드 안에서만 바뀌고 main에서는 바뀌지 않음 
		//-> 자바는 call by reference가 아닌 객체 자체가 복사된다고 생각하는게 좋음. 
		//매개변수는 stack에 저장되기 때문에 stack이 닫히면 접근 X
	}

}
