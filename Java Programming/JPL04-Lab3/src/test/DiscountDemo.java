/* 1748022 ������
 * static ���
 * */
package test;

public class DiscountDemo {
	
	public static void main (String args[]) {
		Discount.month = 12;
		Discount.title();
		
		Discount cal1 = new Discount();
		cal1.price = 20000;
		cal1.dcRate = 0.2;
		cal1.doCall();
		
		//static�� ��ü���� ���� class������ ����.(��ü��X)
		
		System.out.println("���ϴ�" + Discount.count +"��° �մ��Դϴ�.\n");
		
		Discount cal2 = new Discount();
		cal2.price = 10000;
		cal2.dcRate = 0.1;
		cal2.doCall();
		
		System.out.println("���ϴ�" + Discount.count +"��° �մ��Դϴ�.\n");
		
		
	}

}
