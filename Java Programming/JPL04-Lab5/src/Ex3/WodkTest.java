/* 1748022 김유진
 * (예제3) 인터페이스
 * */

package Ex3;

public class WodkTest {
	
	public static void main (String args[]) {
		
		//호텔 hcook, 알바 pcook, 점원bk
		BuggerCook hcook = new HotelCook();
		BuggerCook pcook = new PartTimeCook();
		BuggerClerk bk = new BuggerClerk();
		
		System.out.println("호텔식 햄버거 주문요청 들어옴.");
		bk.orderBugger(hcook);
				
		System.out.println("호텔식 샐러드 주문요청 들어옴.");
		bk.orderSalad(hcook);
		
		System.out.println("알바식 햄버거 주문요청 들어옴.");
		bk.orderBugger(pcook);
		
		System.out.println("알바식 샐러드 주문요청 들어옴.");
		bk.orderSalad(pcook);
		
	}//main

}
