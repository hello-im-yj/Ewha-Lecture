/* 1748022 김유진
 * (예제6) 집계판 만들기
 * */

package ex6;

public class SharedBoard {
	
	private int sum =0;
	
	//synchronized 예약어때문에 동시접근 X. 효수와 기태가 동시에 0부터 시작할 일 없음.
	public synchronized void add() {
		int n=sum;
		n+=10;
		sum =n;
		
		System.out.println(Thread.currentThread().getName() + " : "+sum);
	}
	
	public int getSum() {
		return sum;
	}

}
