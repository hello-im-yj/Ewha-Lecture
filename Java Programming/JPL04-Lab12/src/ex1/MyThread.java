/* 1748022 김유진
 * (예제1) 스레드 만들기
 * */

package ex1;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=1;i<=10;i++) {
			sum += i;
			System.out.println(i+"더하기 결과: "+sum);
		}
		
		System.out.println("-----------------");
		System.out.println("1~10 더하기: "+sum);
	}
	
	

}
