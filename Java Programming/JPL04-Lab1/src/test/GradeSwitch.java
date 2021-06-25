/* 1748022 김유진
 * 조건문 switch ~ case Test 
 * */


package test;

public class GradeSwitch {
	
	public static void main (String args[]) {
		
/*		int a = 0;
		int b = 1;
		int c = 25;
		
		switch (c%2) {
		case 1 :
			
			break;
			
		case 2 :
			
			break;
		}
		
		char grade = 'A';
		
		switch (grade) {
			case 'A' :
				System.out.println("90~100점 입니다.");
				break;
			case 'B' :
				System.out.println("80~89점 입니다.");
				break;
			case 'C' :
				System.out.println("70~79점 입니다.");
				break;
				
*/
		
		
		String s = "아니요"; //문자열도 가능
		switch (s) {
		case "예" :
			System.out.println("Yes");
			break;
			
		case "아니요" :
			System.out.println("no");
			break;}

			
		char grade = 'A';
		
		switch (grade) {
			case 'A' :
			case 'B' :
				System.out.println("참 잘했습니다.");
				break;
			case 'C' :
			case 'D' :
				System.out.println("좀 더 노력하세요.");
				break;
			case 'F' :
				System.out.println("다음 하기에 다시 수강하세요.");
				break;
				
			default : 
				System.out.println("잘못된 학점입니다.");
		}
	}
	
}
