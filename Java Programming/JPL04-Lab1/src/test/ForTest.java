/* 1748022 김유진
 * 조건문(for문) 변수 선언 Test
 * */

package test;

public class ForTest {
	
	public static void main (String args[]) {
		
		//int i, sum;
		//sum = 0;
		
		//for (i=1; i<=10; i++) sum += i;
		
		for (int i=1, sum = 0; i <=10; i++) sum+=i;
		//System.out.println("sum= " + sum); 
		//오류, sum은 지역변수.( Stack frame 안에서만 유효, block나가면 유효X)
		
		
	
	}

}
