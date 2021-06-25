/* 1748022 김유진
 * (예제3) 인터페이스
 * */

package Ex3;

public class PartTimeCook implements BuggerCook {

	@Override
	public void makeBugger() {
		// TODO Auto-generated method stub
		System.out.println("알바급 햄버거 요리 중");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("알바급 샐러드 요리 중");
		
	}
	
	

}
