/* 1748022 ������
 * (�ǽ�5) ��������Ǳ� 
 * */

package pm5;

import java.util.Scanner;

public class MenuOrderTest {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		MenuOrder mo = new MenuOrder();

		String cont;

		System.out.println("Input price for Coke");
		mo.setCokePrice(sc.nextInt());

		System.out.println("Input price for Lenomade");
		mo.setLenomPrice(sc.nextInt());

		System.out.println("Input price for Coffee");
		mo.setCoffeePrice(sc.nextInt());

		do {
			System.out.println("---Input Money---");
			int inmoney = sc.nextInt();
			if (!(inmoney > mo.getCoffeePrice() || inmoney > mo.getLemonPrice() || inmoney > mo.getCoffeePrice()))
				{System.out.println("�Է��� ���� �ּ� �ݾ׺��� �����ϴ�."); break;}

			System.out.println("---Select Drink---");
			mo.showMenu();
			int menu = sc.nextInt();
			mo.drinkCost(menu, inmoney);

			mo.showResult(menu);
			cont = sc.next();
		} while (cont.equals("y"));
		
		System.out.println("���α׷� ����");

	}

}
