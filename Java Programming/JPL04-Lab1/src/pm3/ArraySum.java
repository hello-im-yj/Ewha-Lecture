/* 1748022 김유진
 * (실습3) 숫자 저장과 합계 계산
 * */

package pm3;

import java.util.*;

public class ArraySum {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Arr[] = new int[5];

		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sc.nextInt();
		}

		int maxValue=0, sum = 0;
		for (int i = 0; i < Arr.length; i++) { 
			
			int count = 0; 
			boolean minus = false;
			if (Arr[i]>0) {
				maxValue = maxValue<Arr[i]? Arr[i] : maxValue; //이렇게만하면 음수값이 나오면 최소가 0인데?
				count ++;	}
			/*if (count == 0) minus = true; //리스트의 값이 모두 음수이면 max값이 0이 될텐데????
			if (minus == true) { //max값을 초기값으로 지정해놓으면 됨 ^^,,,ㅎ
				
				
			}*/
				
			//엥 두개를 왜 비교해..멍청이야?'ㅁ' sort 하는거 아니라고...
			//if(i<Arr.length-1) {
				/*if (Arr[i] < Arr[i+1]) {maxValue = Arr[i];}
				else {maxValue = Arr[i+1]; }*/
				//maxValue = Arr[i] > Arr[i+1]?Arr[i]:Arr[i+1]; }
			sum += Arr[i];
		}
		System.out.println("최댓값은 "+ maxValue + " 합은"+sum);
	}
}
