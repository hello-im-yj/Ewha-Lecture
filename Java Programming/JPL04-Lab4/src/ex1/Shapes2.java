/* 1748022 김유진
 * (예제1) 2차원 도형
 * */


package ex1;
/* 사용자에게 가로, 세로의 길이를 입력 받아 Rectangle 객체를 생성
하고, 그 도형의 가로, 세로의 길이 출력(showDim 호출), 면적 출력
(area 호출해서 반환받은 값을 출력), 정사각형인지를 출력(isSquare
를 호출해서 반환받은 값을 출력)하는 사용 예제 프로그램
*/

import java.util.Scanner;

public class Shapes2 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);		
		while (true) {
						
			Rectangle r1 = new Rectangle();
			System.out.println("가로 길이>>");
			r1.width = sc.nextDouble();
			System.out.println("세로 길이>>");
			r1.height = sc.nextDouble();
			
			if (r1.width <=0 || r1.height <=0) break;
			
			r1.showDim();
			System.out.println("면적은"+r1.area());
			System.out.println("정사각형인가요?" + r1.isSquare());
			
		}
		
		sc.close();
		System.out.println("종료");
	}
	

}
