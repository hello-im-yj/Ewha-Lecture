/* 1748022 김유진
 * (예제3) Collection - ArrayList<E>
 * */

package ex3;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main (String args[]) {
		
		ArrayList<Double> v= new ArrayList<Double>();
		
		for (int i=0; i<10;i++) {
			v.add(i*10.0); //i가 정수이기 때문에 그냥 담을 시 오류, double로 캐스팅해줘야.
		}
		
		double sum =0;
		for(int i=0; i<v.size();i++) {
			sum +=v.get(i);
		}
		
		System.out.println(sum);
	}

}
