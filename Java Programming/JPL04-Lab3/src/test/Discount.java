/* 1748022 ������
 * static ���
 * */
package test;

public class Discount {
	public static int month;
	public static int count;
	
	public int price;
	public double dcRate;
	public int dcPrice;
	
	public static void title() {
		System.out.println("***"+ month+"�� �� ���� ���� ���***\n");
	}
	
	public void doCall() {
		dcPrice = (int)(price-price*dcRate);
		System.out.println("������ "+price+"�� �Դϴ�.");
		System.out.println("���ΰ���" + dcPrice+"�� �Դϴ�.");
		
		count++;
	}

}
