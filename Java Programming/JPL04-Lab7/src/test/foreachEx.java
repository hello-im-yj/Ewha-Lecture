/* 1748022 김유진
 * 배열과 for-each문
 * */

package test;

public class foreachEx {
	//for (type명 var명 : 배열명 ) {}
	public static void main (String[] args) {
		
		int[] nums = {1,2,3,4,5};
		int sum = 0;
		
		for (int k : nums) { //k는 nums[0], nums[1],,,,, 값이 반복될 때 마다 차례로 들어감!
			sum +=k;
			System.out.println("합은"+sum);
		}
	}
}
