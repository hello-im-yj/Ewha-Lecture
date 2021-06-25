/* 1748022 김유진
 * (실습4) 사칙연산 클래스 
 * */

package pm4;

import java.util.Scanner;

public class CalcTest {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하시오>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String calc = sc.next();

		switch (calc) {
		case "+" : Add add = new Add();
		add.setValue(a, b);
		System.out.println(add.calculate());
		break;
		case "-" : Sub sub = new Sub();
		sub.setValue(a, b);
		System.out.println(sub.calculate());
		break;
		case "*" : Mul mul = new Mul();
		mul.setValue(a, b);
		System.out.println(mul.calculate());
		break;
		case "/" : if (b==0) {System.out.println("0으로 나눌 수 없습니다."); break;}
		Div div = new Div();
		div.setValue(a, b);
		System.out.println(div.calculate());
		break;
		default : System.out.println("잘못된 연산자입니다.");
		}

	}

}
