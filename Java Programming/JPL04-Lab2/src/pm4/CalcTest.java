/* 1748022 ������
 * (�ǽ�4) ��Ģ���� Ŭ���� 
 * */

package pm4;

import java.util.Scanner;

public class CalcTest {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
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
		case "/" : if (b==0) {System.out.println("0���� ���� �� �����ϴ�."); break;}
		Div div = new Div();
		div.setValue(a, b);
		System.out.println(div.calculate());
		break;
		default : System.out.println("�߸��� �������Դϴ�.");
		}

	}

}
