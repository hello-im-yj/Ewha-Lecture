/* 1748022 김유진
 * (예제1) 스레드 만들기
 * */

package ex1;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int multiply =1;
		for (int i=1;i<=10;i++) {
			multiply *= i;
			System.out.println(i+"곱하기 결과: "+multiply);
		}
		
		System.out.println("-----------------");
		System.out.println("1~10 곱하기: "+multiply);
	}
	
	

}
