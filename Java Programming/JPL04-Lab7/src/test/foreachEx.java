/* 1748022 ������
 * �迭�� for-each��
 * */

package test;

public class foreachEx {
	//for (type�� var�� : �迭�� ) {}
	public static void main (String[] args) {
		
		int[] nums = {1,2,3,4,5};
		int sum = 0;
		
		for (int k : nums) { //k�� nums[0], nums[1],,,,, ���� �ݺ��� �� ���� ���ʷ� ��!
			sum +=k;
			System.out.println("����"+sum);
		}
	}
}
