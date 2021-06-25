/* 1748022 김유진
 * (예제3) 인터페이스
 * */

package Ex3;

public class HotelCook implements BuggerCook {

	@Override
	public void makeBugger() {
		// TODO Auto-generated method stub
		System.out.println("호텔급 햄버거 요리 중");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("호텔급 셀러드 요리 중");
		
	} 
	
	

}
