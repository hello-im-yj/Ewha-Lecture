/* 1748022 김유진
 * (예제6) Stack 클래스
 * */

package ex6;

import java.util.Stack;
import java.util.StringTokenizer;

public class StackDemo1 {
	
	public static void main (String args[]) {
		Stack<String> s = new Stack<String>();
		String d =  "{ } { ( ( { } ) ) { ( { ( ( ) ( ) ) } }" ;
		//"{1 }1 {2 (3 (4 {5 }5 )4 )3 {6 (7 {8 (9 (10 )10 (11 )11 )9 }8 }6"
		/* Stack이 괄호쌍찾기에 적합한 이유
		 * 1. 먼저 열린게 나중에 닫힘 => ★
		 * 2. 열린게 있어야 닫힘 -> 그래서 일단 if로 먼저 열린거부터 catch해서 쌓음. -> 그 후 비교!
		 * + ({)} 이런식으로 괄호가 서로 교차하는 경우도 없음. 
		 */
		
		StringTokenizer dt = new StringTokenizer(d); //d에는 string 담김
		//StringTokenizer는 공백으로 분리. 다른 것을 기준으로 분리하고 싶으면 (String, "분리하고싶은문자");
		
		int check =0;
		while(dt.hasMoreTokens()) { //hasMoreElement랑 같은 기능. 인터페이스 구현때문에 둘다해놓음.
			String a = dt.nextToken();
			
			// {나 (일때
			if(a.equals("{") || a.equals("(")) {
				s.push(a);
			}
			
			// }나 )일때
			else {
				//왼쪽괄호 짝 없음
				if (s.empty()==true) {
					check =1; break; //while문 빠져나감.
				}
				
				else {
					String b = s.pop();
					if (b.equals("{")&&a.equals("}") || b.equals("(") && b.equals(")")) ;
					else {
						check = 2; break;
					}
					
				}
			}//end of else
		}//end of while
		
		switch (check) {
		case 0: 
			//while이 다 끝났는데 stack이 비어있지 않음 -> {,(가 남음. 오른쪽괄호 부족(짝 안맞음)
			//비어있으면 -> 짝맞음. 
			
			if(!s.empty()) {
				System.out.println("오른쪽 괄호가 부족합니다.");
			}			
			else {
				System.out.println("쌍이 맞습니다.");
			}
			break;
			
		case 1: //왼쪽괄호 부족 (짝 안맞음)
			System.out.println("왼쪽 괄호가 부족합니다.");
			break;
		case 2: //쌍이 맞지 않음(순서 포함)
			System.out.println("쌍이 맞지 않습니다.");
			break;
		
		} //end of switch
		
	}//end of main

}
