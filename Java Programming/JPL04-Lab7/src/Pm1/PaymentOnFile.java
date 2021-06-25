
/* 1748022 김유진
 * (실습1) Employee 클래스 구현
 * */

package Pm1;

public class PaymentOnFile extends PayrollManager {

	@Override
	protected void writePayment(long amount, String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" 직원의 월급 "+amount+"원을 파일에 출력합니다.");
	}
	
	

}
