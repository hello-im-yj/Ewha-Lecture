/* 1748022 ������
 * (�ǽ�3) ���� ����� �հ� ���
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
				maxValue = maxValue<Arr[i]? Arr[i] : maxValue; //�̷��Ը��ϸ� �������� ������ �ּҰ� 0�ε�?
				count ++;	}
			/*if (count == 0) minus = true; //����Ʈ�� ���� ��� �����̸� max���� 0�� ���ٵ�????
			if (minus == true) { //max���� �ʱⰪ���� �����س����� �� ^^,,,��
				
				
			}*/
				
			//�� �ΰ��� �� ����..��û�̾�?'��' sort �ϴ°� �ƴ϶��...
			//if(i<Arr.length-1) {
				/*if (Arr[i] < Arr[i+1]) {maxValue = Arr[i];}
				else {maxValue = Arr[i+1]; }*/
				//maxValue = Arr[i] > Arr[i+1]?Arr[i]:Arr[i+1]; }
			sum += Arr[i];
		}
		System.out.println("�ִ��� "+ maxValue + " ����"+sum);
	}
}
