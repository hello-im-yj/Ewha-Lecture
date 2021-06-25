/* 1748022 김유진
 * (예제3) 인터페이스
 * */

package Ex3;

public class BuggerClerk {

	public void orderBugger(BuggerCook cook) { 
		System.out.println("햄버거 주문"); //
		cook.makeBugger();	//인터페이스는 클래스 쓰듯이!		
	}
	
	public void orderSalad(BuggerCook cook) {
		System.out.println("샐러드 주문");
		cook.makeSalad();
	}
}
