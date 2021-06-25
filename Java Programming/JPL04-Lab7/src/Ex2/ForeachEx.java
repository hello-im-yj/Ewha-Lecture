/* 1748022 김유진
 * (예제2) for-each 사용
 * */

package Ex2;


public class ForeachEx {
	//선언 위치 클래스 내부 외부 상관 없음.
	enum Color {Blue, white, Red, Black, Yellow }
	
	public static void main (String[] args) {
		int[] nums = {1,2,3,4,5};
		String[] fruits = {"banana", "pineapple", "apple", "grape", "strawberry"};
		int sum = 0;
		
		for (int k : nums) {
			sum +=k;
		}
		
		System.out.println("Total of nums: " + sum);
		System.out.println();
		
		System.out.println("My favorite fruits: ");
		for (String s : fruits) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Five cardinal colors: ");
		for (Color c : Color.values()) { //values 는 모든 color의 모든 element 가져오는 메서드 (list로 반환됨.)
			System.out.println(c);
		} 
		
	}
	


}
